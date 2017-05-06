
package CONEXIONSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class CONECTA {
    public Connection xcon(){
        Connection cn=null;
        try{
            Class.forName
         ("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn=DriverManager.getConnection
        ("jdbc:sqlserver://10.60.41.39:1433;"
         + "databaseName=neptuno","idat","123456");
           if(cn!=null){ 
            JOptionPane.showMessageDialog(null,"Conexion Ok");
           }
        }catch(Exception error){
            JOptionPane.showMessageDialog(null,error);
        }
        return cn;
    }
}
