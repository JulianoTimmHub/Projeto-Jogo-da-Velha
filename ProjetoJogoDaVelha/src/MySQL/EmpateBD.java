package MySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import Modelo.Encaps;
import javax.swing.JOptionPane;

public class EmpateBD {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void Empates(Encaps draw) {
        
        String sql = "insert into empates (empate) values (?)";

        conn = new Conexao().conectaBD();

        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, draw.getempatado());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro_empate) {
            JOptionPane.showMessageDialog(null, "Erro empate" + erro_empate);
        }
    }
    
}
