
package DAOPROVEEDOR;
import CONEXIONSQL.CONECTA;
import com.sun.jndi.cosnaming.CNCtx;
import java.io.*;
import java.sql.*;
import javax.swing.JOptionPane;


public class CLASEDAOPROVEEDOR {
    public ResultSet listar_pais(){
    
        //creando una instancia a la conexion
        CONEXIONSQL.CONECTA cn = new CONEXIONSQL.CONECTA();
        ResultSet rs=null;
        try{
            //invoca al procedimiento almacenado paises
            CallableStatement cstmt = cn.xcon().prepareCall("{call sp_lis_paises_ache}");
            //ejecuta procedimiento almacenado
            rs=cstmt.executeQuery();
        }catch(Exception error1){
            JOptionPane.showMessageDialog(null, error1);
        }
        return rs;
    }
    
    public ResultSet listar_ciudad(String pais){
        //creando una instancia a la conexion
        CONEXIONSQL.CONECTA cn = new CONEXIONSQL.CONECTA();
        
        ResultSet rs = null;
        try{
            CallableStatement cstmt1=cn.xcon().prepareCall("{call sp_lis_ciudad_ache(?)}");
            cstmt1.setString(1, pais);
            rs=cstmt1.executeQuery();
        }catch (Exception error2){
            JOptionPane.showMessageDialog(null, error2);
        }
        
        return rs;
    }
    
    public ResultSet listar_consulta(String pais,String ciudad){
        
        CONEXIONSQL.CONECTA cn = new CONEXIONSQL.CONECTA();
        ResultSet rs=null;
        
        try{
            CallableStatement cstmt2 = cn.xcon().prepareCall("{call sp_lis_paisporciudad_ache(?,?)}");
            cstmt2.setString(1, pais);
            cstmt2.setString(2, ciudad);
            rs = cstmt2.executeQuery();
            
        }catch (Exception error4){
         JOptionPane.showMessageDialog(null, error4);
        }
        
        return rs;
    }
    
}
