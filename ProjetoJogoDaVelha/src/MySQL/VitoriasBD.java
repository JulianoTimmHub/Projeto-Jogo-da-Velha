package MySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import Modelo.Encaps;
import javax.swing.JOptionPane;

public class VitoriasBD {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void setaVitorias(Encaps win) {
        
        String sql = "insert into vitorias (winX, winO) values (?,?)";

        conn = new Conexao().conectaBD();

        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, win.getvitoriaX());
            pstm.setString(2, win.getvitoriaO());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro_vitoria) {
            JOptionPane.showMessageDialog(null, "Erro Vitoria" + erro_vitoria);
        }
    }
    
}
