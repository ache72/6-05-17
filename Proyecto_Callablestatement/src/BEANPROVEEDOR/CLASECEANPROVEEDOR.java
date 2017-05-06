
package BEANPROVEEDOR;
import java.io.*;
import java.sql.*;

public class CLASECEANPROVEEDOR {
    // creando la instancia a la clasedaoproveedor
    DAOPROVEEDOR.CLASEDAOPROVEEDOR ins = new DAOPROVEEDOR.CLASEDAOPROVEEDOR();
    
    public ResultSet listar_pais(){
        return ins.listar_pais();   
    }
    
    public ResultSet listar_ciudad(String pais){
        return ins.listar_ciudad(pais);
    }
    
    public ResultSet listar_consulta(String pais, String ciudad){
        return ins.listar_consulta(pais, ciudad);
    }
    
}
