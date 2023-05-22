package MySQL;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexao {

    public Connection conectaBD() {

        Connection conn = null;

        try {
           String url = "jdbc:mysql://localhost:3306/JogoDaVelha?user=root&password=root";
           conn = DriverManager.getConnection(url);
            

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,erro.getMessage());
        }
        
        return conn;
    }
}
