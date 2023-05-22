package MySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import Modelo.Encaps;
import javax.swing.JOptionPane;

public class JogadoresBD {

    Connection conn;
    PreparedStatement pstm;

    public void CadastroJogadores(Encaps NomePlayer) {
        
        String sql = "insert into jogadores (nome_1, nome_2) values (?,?)";

        conn = new Conexao().conectaBD();

        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, NomePlayer.getnome1());
            pstm.setString(2, NomePlayer.getnome2());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro_nomes) {
            JOptionPane.showMessageDialog(null, "Erro Jogador" + erro_nomes);
        }
    }
}