package projetojogodavelha;

import Modelo.Encaps;
import MySQL.JogadoresBD;
import MySQL.VitoriasBD;
import MySQL.EmpateBD;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Tela extends javax.swing.JFrame {

    public static String getText() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void setText(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // cria e passa os respectivos valores de cada atributo
    public int quantidade;
    public int jogador;
    public int matriz[][] = new int[3][3];
    JButton B[] = new JButton[9];
    public String ganhador;
    public String jogador1;
    public String jogador2;
    
    public int contaX = 0;
    public int contaO = 0;
    public int contaEmpate = 0;

    public int vitoriasJogador1 = 0;
    public int vitoriasJogador2 = 0;

    //Cria as posições de cada botão na tela
    public Tela() {

        initComponents();

        quantidade = 1;
        jogador = 1;
        B[0] = botao1;
        B[1] = botao2;
        B[2] = botao3;
        B[3] = botao4;
        B[4] = botao5;
        B[5] = botao6;
        B[6] = botao7;
        B[7] = botao8;
        B[8] = botao9;

    }

    // Exporta o nome dos jogadores de outro pacote
    public void exportaNomes(Encaps NomePlayer) {
        recebeNome1.setText(NomePlayer.getnome1());
        recebeNome2.setText(NomePlayer.getnome2());
    }

    // Cria e seta o valor das posições na tela, se é X ou O
    public void jogada(JButton B, int x, int y) {

        B.setEnabled(false);

        if (jogador == 1) {
            matriz[x][y] = 1;
            B.setText("X");
            contaX ++;
            jogador = 2;
            checarJogada(1);
        } else {
            matriz[x][y] = 2;
            B.setText("O");
            contaO ++;
            jogador = 1;
            checarJogada(2);
        }
        quantidade++;
    }

    // Checa as jogadas feitas para ver se teve algum vencedor
    public void checarJogada(int x) {

        if (vitoria(x) == true && jogador == 2) {
            JOptionPane.showMessageDialog(null, "O jogador X venceu, Parabéns!!!");
            fimVelha();
            vitoriasJogador1++;
            String vX = Integer.toString(vitoriasJogador1);
            winX.setText(vX);
            contaX = 0;
            contaO = 0;
            limparTela();
        }
        if (vitoria(x) == true && jogador == 1) {
            JOptionPane.showMessageDialog(null, "O jogador O venceu, Parabéns!!!");
            fimVelha();
            vitoriasJogador2++;
            String vO = Integer.toString(vitoriasJogador2);
            winO.setText(vO);
            contaX = 0;
            contaO = 0;
            limparTela();
        } else if (contaX + contaO == 9 || contaO + contaX == 9){
            JOptionPane.showMessageDialog(null, "Deu empate");
            fimVelha();
            contaEmpate++;
            String empaDraw = Integer.toString(contaEmpate);
            Draws.setText(empaDraw);
            contaX = 0;
            contaO = 0;
            limparTela();
        }

    }

    // Faz as comparaçõs das possibilidades de jogadas, se X ganhou ou O ganhou
    public boolean vitoria(int x) {
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] == x && matriz[i][1] == x && matriz[i][2] == x) {
                return true;
            } else if (matriz[0][i] == x && matriz[1][i] == x && matriz[2][i] == x) {
                return true;
            }
        }
        if (matriz[0][0] == x && matriz[1][1] == x && matriz[2][2] == x) {
            return true;
        }
        if (matriz[0][2] == x && matriz[1][1] == x && matriz[2][0] == x) {
            return true;
        }

        return false;
    }

    // Caso tenha algum vencedor, a velha acabara
    public void fimVelha() {
        for (int i = 0; i < 9; i++) {
            B[i].setEnabled(false);
        }
    }

    // limpa a tela caso X ou O ganhe
    public void limparTela() {
        for (int i = 0; i < 9; i++) {
            B[i].setEnabled(true);
            B[i].setText("");
        }
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                matriz[x][y] = 0;
            }
        }
        jogador = 1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        botao1 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botao7 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botao9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        winX = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        winO = new javax.swing.JLabel();
        drawXO = new javax.swing.JLabel();
        Draws = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        recebeNome1 = new javax.swing.JLabel();
        recebeNome2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        corPreto = new javax.swing.JButton();
        corBranco = new javax.swing.JButton();
        corVerde = new javax.swing.JButton();
        x = new javax.swing.JLabel();
        banco_dados = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Opcao = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setLayout(null);

        botao1.setBackground(new java.awt.Color(242, 242, 242));
        botao1.setForeground(new java.awt.Color(102, 0, 102));
        botao1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(102, 0, 102)));
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });
        jPanel1.add(botao1);
        botao1.setBounds(20, 70, 62, 53);

        botao2.setBackground(new java.awt.Color(242, 242, 242));
        botao2.setForeground(new java.awt.Color(102, 0, 102));
        botao2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(102, 0, 102)));
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });
        jPanel1.add(botao2);
        botao2.setBounds(100, 70, 62, 53);

        botao3.setBackground(new java.awt.Color(242, 242, 242));
        botao3.setForeground(new java.awt.Color(102, 0, 102));
        botao3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(102, 0, 102)));
        botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao3ActionPerformed(evt);
            }
        });
        jPanel1.add(botao3);
        botao3.setBounds(180, 70, 62, 53);

        botao4.setBackground(new java.awt.Color(242, 242, 242));
        botao4.setForeground(new java.awt.Color(102, 0, 102));
        botao4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(102, 0, 102)));
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao4ActionPerformed(evt);
            }
        });
        jPanel1.add(botao4);
        botao4.setBounds(20, 140, 62, 53);

        botao5.setBackground(new java.awt.Color(242, 242, 242));
        botao5.setForeground(new java.awt.Color(102, 0, 102));
        botao5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(102, 0, 102)));
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5ActionPerformed(evt);
            }
        });
        jPanel1.add(botao5);
        botao5.setBounds(100, 140, 62, 53);

        botao6.setBackground(new java.awt.Color(242, 242, 242));
        botao6.setForeground(new java.awt.Color(102, 0, 102));
        botao6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(102, 0, 102)));
        botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao6ActionPerformed(evt);
            }
        });
        jPanel1.add(botao6);
        botao6.setBounds(180, 140, 62, 53);

        botao7.setBackground(new java.awt.Color(242, 242, 242));
        botao7.setForeground(new java.awt.Color(102, 0, 102));
        botao7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(102, 0, 102)));
        botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao7ActionPerformed(evt);
            }
        });
        jPanel1.add(botao7);
        botao7.setBounds(20, 210, 62, 53);

        botao8.setBackground(new java.awt.Color(242, 242, 242));
        botao8.setForeground(new java.awt.Color(102, 0, 102));
        botao8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(102, 0, 102)));
        botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao8ActionPerformed(evt);
            }
        });
        jPanel1.add(botao8);
        botao8.setBounds(100, 210, 62, 53);

        botao9.setBackground(new java.awt.Color(242, 242, 242));
        botao9.setForeground(new java.awt.Color(102, 0, 102));
        botao9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(102, 0, 102)));
        botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao9ActionPerformed(evt);
            }
        });
        jPanel1.add(botao9);
        botao9.setBounds(180, 210, 62, 53);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label.setBackground(new java.awt.Color(255, 255, 255));
        label.setText("  VITORIAS PLAYER (X):");
        label.setAlignmentY(0.0F);
        label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        winX.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label3.setBackground(new java.awt.Color(255, 255, 255));
        label3.setText("  VITORIAS PLAYER (O):");
        label3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        winO.setText("    ");
        winO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        drawXO.setBackground(new java.awt.Color(255, 255, 255));
        drawXO.setText("  EMPATES PLAYERS (X)(O):");
        drawXO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Draws.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(label3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(drawXO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(winX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(winO, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(Draws, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(winX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(winO, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drawXO, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(Draws, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(260, 80, 220, 140);

        jLabel1.setText("NOME PLAYER (X):");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 110, 20);

        recebeNome1.setText("      ");
        recebeNome1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(recebeNome1);
        recebeNome1.setBounds(20, 40, 70, 20);

        recebeNome2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(recebeNome2);
        recebeNome2.setBounds(170, 40, 70, 20);

        jLabel3.setText("NOME PLAYER (O):");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(140, 10, 110, 20);

        corPreto.setBackground(new java.awt.Color(0, 0, 0));
        corPreto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corPretoActionPerformed(evt);
            }
        });
        jPanel1.add(corPreto);
        corPreto.setBounds(360, 240, 30, 30);

        corBranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corBrancoActionPerformed(evt);
            }
        });
        jPanel1.add(corBranco);
        corBranco.setBounds(400, 240, 30, 30);

        corVerde.setBackground(new java.awt.Color(0, 153, 0));
        corVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corVerdeActionPerformed(evt);
            }
        });
        jPanel1.add(corVerde);
        corVerde.setBounds(440, 240, 30, 30);

        x.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        x.setText("   X");
        jPanel1.add(x);
        x.setBounds(110, 40, 30, 20);

        banco_dados.setBackground(new java.awt.Color(242, 242, 242));
        banco_dados.setText("GERAR BANCO DE DADOS");
        banco_dados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        banco_dados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banco_dadosActionPerformed(evt);
            }
        });
        jPanel1.add(banco_dados);
        banco_dados.setBounds(260, 30, 210, 30);

        Opcao.setText("Opção");

        jMenuItem3.setText("Novo Jogo com BOT");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Opcao.add(jMenuItem3);

        jMenuItem1.setText("Novo Jogo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Opcao.add(jMenuItem1);

        jMenuBar1.add(Opcao);

        Sair.setText("Sair");

        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Sair.add(jMenuItem2);

        jMenuBar1.add(Sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao6ActionPerformed
        jogada(botao6, 1, 2);
    }//GEN-LAST:event_botao6ActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        jogada(botao1, 0, 0);
    }//GEN-LAST:event_botao1ActionPerformed

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
        jogada(botao2, 0, 1);
    }//GEN-LAST:event_botao2ActionPerformed

    private void botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao3ActionPerformed
        jogada(botao3, 0, 2);
    }//GEN-LAST:event_botao3ActionPerformed

    private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao4ActionPerformed
        jogada(botao4, 1, 0);
    }//GEN-LAST:event_botao4ActionPerformed

    private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5ActionPerformed
        jogada(botao5, 1, 1);
    }//GEN-LAST:event_botao5ActionPerformed

    private void botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao7ActionPerformed
        jogada(botao7, 2, 0);
    }//GEN-LAST:event_botao7ActionPerformed

    private void botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao8ActionPerformed
        jogada(botao8, 2, 1);
    }//GEN-LAST:event_botao8ActionPerformed

    private void botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao9ActionPerformed
        jogada(botao9, 2, 2);
    }//GEN-LAST:event_botao9ActionPerformed

    // Caso o jogador clique em "Sair", o jogo sera fechado
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    // Caso o jogador clique em novo jogo, ele ira zerar todas as posições e os jogadas ganhas
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        limparTela();
        vitoriasJogador1 = 0;
        vitoriasJogador2 = 0;
        String vX = Integer.toString(vitoriasJogador1);
        winX.setText(vX);
        String vO = Integer.toString(vitoriasJogador2);
        winO.setText(vO);
        
        Jogadores Jogador = new Jogadores(); 
        Jogador.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    // Muda o plano de fundo da tela e de todos os botões
    private void corPretoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corPretoActionPerformed
        jPanel1.setBackground(Color.black);
        jPanel1.setVisible(true);
        jPanel2.setBackground(Color.cyan);
        jPanel2.setVisible(true);
        label.setForeground(Color.black);
        label.setBackground(Color.black);
        label.setVisible(true);
        label3.setForeground(Color.black);
        label3.setBackground(Color.black);
        label3.setVisible(true);
        jLabel1.setForeground(Color.white);
        jLabel1.setBackground(Color.cyan);
        jLabel1.setVisible(true);
        jLabel3.setForeground(Color.white);
        jLabel3.setBackground(Color.cyan);
        jLabel3.setVisible(true);
        recebeNome1.setForeground(Color.white);
        recebeNome1.setBackground(Color.cyan);
        recebeNome1.setVisible(true);
        recebeNome2.setForeground(Color.white);
        recebeNome2.setBackground(Color.cyan);
        recebeNome2.setVisible(true);
        winX.setBackground(Color.black);
        winX.setVisible(true);
        winO.setBackground(Color.black);
        winO.setVisible(true);
        Draws.setBackground(Color.black);
        Draws.setVisible(true);
        drawXO.setBackground(Color.black);
        drawXO.setVisible(true);
        banco_dados.setBackground(Color.cyan);
        banco_dados.setForeground(Color.black);
        banco_dados.setVisible(true);
        x.setForeground(Color.white);
        B[0].setBackground(Color.cyan);
        B[1].setBackground(Color.cyan);
        B[2].setBackground(Color.cyan);
        B[3].setBackground(Color.cyan);
        B[4].setBackground(Color.cyan);
        B[5].setBackground(Color.cyan);
        B[6].setBackground(Color.cyan);
        B[7].setBackground(Color.cyan);
        B[8].setBackground(Color.cyan);
    }//GEN-LAST:event_corPretoActionPerformed

    // Muda o plano de fundo da tela e de todos os botões
    private void corBrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corBrancoActionPerformed
        jPanel1.setBackground(Color.white);
        jPanel1.setVisible(true);
        jPanel2.setBackground(Color.blue);
        jPanel2.setVisible(true);
        label.setForeground(Color.black);
        label.setBackground(Color.white);
        label.setVisible(true);
        label3.setForeground(Color.black);
        label3.setBackground(Color.white);
        label3.setVisible(true);
        jLabel1.setForeground(Color.black);
        jLabel1.setBackground(Color.blue);
        jLabel1.setVisible(true);
        jLabel3.setForeground(Color.black);
        jLabel3.setBackground(Color.blue);
        jLabel3.setVisible(true);
        recebeNome1.setForeground(Color.black);
        recebeNome1.setBackground(Color.blue);
        recebeNome1.setVisible(true);
        recebeNome2.setForeground(Color.black);
        recebeNome2.setBackground(Color.blue);
        recebeNome2.setVisible(true);
        winX.setBackground(Color.white);
        winX.setVisible(true);
        winO.setBackground(Color.white);
        winO.setVisible(true);
        Draws.setBackground(Color.white);
        Draws.setVisible(true);
        drawXO.setBackground(Color.white);
        drawXO.setVisible(true);
        banco_dados.setBackground(Color.blue);
        banco_dados.setForeground(Color.black);
        banco_dados.setVisible(true);
        x.setForeground(Color.black);
        B[0].setBackground(Color.blue);
        B[1].setBackground(Color.blue);
        B[2].setBackground(Color.blue);
        B[3].setBackground(Color.blue);
        B[4].setBackground(Color.blue);
        B[5].setBackground(Color.blue);
        B[6].setBackground(Color.blue);
        B[7].setBackground(Color.blue);
        B[8].setBackground(Color.blue);
    }//GEN-LAST:event_corBrancoActionPerformed

    // Muda o plano de fundo da tela e de todos os botões
    private void corVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corVerdeActionPerformed
        jPanel1.setBackground(Color.green);
        jPanel1.setVisible(true);
        jPanel2.setBackground(Color.yellow);
        jPanel2.setVisible(true);
        label.setForeground(Color.black);
        label.setBackground(Color.green);
        label.setVisible(true);
        label3.setForeground(Color.black);
        label3.setBackground(Color.green);
        label3.setVisible(true);
        jLabel1.setForeground(Color.black);
        jLabel1.setBackground(Color.yellow);
        jLabel1.setVisible(true);
        jLabel3.setForeground(Color.black);
        jLabel3.setBackground(Color.yellow);
        jLabel3.setVisible(true);
        recebeNome1.setForeground(Color.black);
        recebeNome1.setBackground(Color.yellow);
        recebeNome1.setVisible(true);
        recebeNome2.setForeground(Color.black);
        recebeNome2.setBackground(Color.yellow);
        recebeNome2.setVisible(true);
        winX.setBackground(Color.green);
        winX.setVisible(true);
        winO.setBackground(Color.green);
        winO.setVisible(true);
        Draws.setBackground(Color.green);
        Draws.setVisible(true);
        drawXO.setBackground(Color.green);
        drawXO.setVisible(true);
        banco_dados.setBackground(Color.yellow);
        banco_dados.setForeground(Color.black);
        banco_dados.setVisible(true);
        x.setForeground(Color.black);
        B[0].setBackground(Color.yellow);
        B[1].setBackground(Color.yellow);
        B[2].setBackground(Color.yellow);
        B[3].setBackground(Color.yellow);
        B[4].setBackground(Color.yellow);
        B[5].setBackground(Color.yellow);
        B[6].setBackground(Color.yellow);
        B[7].setBackground(Color.yellow);
        B[8].setBackground(Color.yellow);
    }//GEN-LAST:event_corVerdeActionPerformed

    private void banco_dadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banco_dadosActionPerformed
        String vitoria1, vitoria2, d;
       
        vitoria1 = winX.getText();
        vitoria2 = winO.getText();
        d = Draws.getText();
        
        Encaps win = new Encaps();
        Encaps draw = new Encaps();
        
        draw.setempatado(d);
        win.setvitoriaX(vitoria1);
        win.setvitoriaO(vitoria2);
        
        VitoriasBD OBwins = new VitoriasBD();
        OBwins.setaVitorias(win);
        
        EmpateBD OBdraw = new EmpateBD(); 
        OBdraw.Empates(draw);
    }//GEN-LAST:event_banco_dadosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Draws;
    private javax.swing.JMenu Opcao;
    private javax.swing.JMenu Sair;
    private javax.swing.JButton banco_dados;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JButton botao8;
    private javax.swing.JButton botao9;
    private javax.swing.JButton corBranco;
    private javax.swing.JButton corPreto;
    private javax.swing.JButton corVerde;
    private javax.swing.JLabel drawXO;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel recebeNome1;
    private javax.swing.JLabel recebeNome2;
    private javax.swing.JLabel winO;
    private javax.swing.JLabel winX;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
