package connect4;


import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;




/**
 *
 * @author David Rosas
 */
public class GameGUI extends javax.swing.JFrame {

    private GameState gameState;

    private javax.swing.JLabel[][] slot = new javax.swing.JLabel[6][7];

    /**
     * Creates new form StartScreen
     */
    public GameGUI() {        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        gameBanner = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        StartGameButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        gamePanel = new javax.swing.JPanel();
        selectionColumnPanel = new javax.swing.JPanel();
        column1 = new javax.swing.JButton();
        column2 = new javax.swing.JButton();
        column3 = new javax.swing.JButton();
        column4 = new javax.swing.JButton();
        column5 = new javax.swing.JButton();
        column6 = new javax.swing.JButton();
        column7 = new javax.swing.JButton();
        gameboardPanel = new javax.swing.JPanel();
        backMainMenuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 800));
        setMinimumSize(new java.awt.Dimension(800, 800));
        setPreferredSize(new java.awt.Dimension(800, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 800));
        getContentPane().setLayout(new java.awt.CardLayout());

        menuPanel.setMaximumSize(new java.awt.Dimension(100, 100));
        menuPanel.setMinimumSize(new java.awt.Dimension(50, 50));

        gameBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/connect4/connect4.png"))); // NOI18N

        jPanel1.setMaximumSize(new java.awt.Dimension(100, 80));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 130));
        jPanel1.setLayout(new java.awt.GridLayout(3, 1, 0, 30));

        StartGameButton.setText("Start Game");
        StartGameButton.setMaximumSize(new java.awt.Dimension(50, 20));
        StartGameButton.setMinimumSize(new java.awt.Dimension(50, 20));
        StartGameButton.setPreferredSize(new java.awt.Dimension(50, 20));
        StartGameButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                StartGameButtonComponentShown(evt);
            }
        });
        StartGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartGameButtonActionPerformed(evt);
            }
        });
        jPanel1.add(StartGameButton);

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ExitButton);

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(gameBanner))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(gameBanner)
                .addGap(49, 49, 49)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
        );

        getContentPane().add(menuPanel, "card3");

        gamePanel.setOpaque(false);

        selectionColumnPanel.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        column1.setText("Column 1");
        column1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                column1ActionPerformed(evt);
            }
        });
        selectionColumnPanel.add(column1);

        column2.setText("Column 2");
        column2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                column2ActionPerformed(evt);
            }
        });
        selectionColumnPanel.add(column2);

        column3.setText("Column 3");
        column3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                column3ActionPerformed(evt);
            }
        });
        selectionColumnPanel.add(column3);

        column4.setText("Column 4");
        column4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                column4ActionPerformed(evt);
            }
        });
        selectionColumnPanel.add(column4);

        column5.setText("Column 5");
        column5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                column5ActionPerformed(evt);
            }
        });
        selectionColumnPanel.add(column5);

        column6.setText("Column 6");
        column6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                column6ActionPerformed(evt);
            }
        });
        selectionColumnPanel.add(column6);

        column7.setText("Column 7");
        column7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                column7ActionPerformed(evt);
            }
        });
        selectionColumnPanel.add(column7);

        gameboardPanel.setLayout(new java.awt.GridLayout(6, 7, 13, 20));

        backMainMenuButton.setText("Main Menu");
        backMainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMainMenuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backMainMenuButton))
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selectionColumnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gameboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        gamePanelLayout.setVerticalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addComponent(selectionColumnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gameboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(backMainMenuButton)
                .addContainerGap())
        );

        getContentPane().add(gamePanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartGameButtonActionPerformed
        // TODO add your handling code here:
        gameState = new GameState();
        menuPanel.setVisible(false);
        gamePanel.setVisible(true);
        
        //add slots for the pieces to be places on the gameboard
        for (int i = 0; i < gameState.newBoard.getRows(); i++){
            for (int j = 0; j < gameState.newBoard.getColumns(); j++){
                slot[i][j] = new javax.swing.JLabel("");
                slot[i][j].setText(null);
                gameboardPanel.add(slot[i][j]);
                slot[i][j].setOpaque(true);
                slot[i][j].repaint();
            }
        }
       
    }//GEN-LAST:event_StartGameButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void StartGameButtonComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_StartGameButtonComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_StartGameButtonComponentShown

    private void column1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_column1ActionPerformed
        // TODO add your handling code here:
        
        placePiece(1);
       
    }//GEN-LAST:event_column1ActionPerformed

    private void column2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_column2ActionPerformed
        // TODO add your handling code here:
       
        placePiece(2);
    }//GEN-LAST:event_column2ActionPerformed

    private void column3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_column3ActionPerformed
        // TODO add your handling code here:

        placePiece(3);
    }//GEN-LAST:event_column3ActionPerformed

    private void column4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_column4ActionPerformed
        // TODO add your handling code here:

        placePiece(4);
    }//GEN-LAST:event_column4ActionPerformed

    private void column5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_column5ActionPerformed
        // TODO add your handling code here:
 
        placePiece(5);
    }//GEN-LAST:event_column5ActionPerformed

    private void column6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_column6ActionPerformed
        // TODO add your handling code here:
 
        placePiece(6);
        checkWin();
    }//GEN-LAST:event_column6ActionPerformed

    private void column7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_column7ActionPerformed
        // TODO add your handling code here:
       
        placePiece(7);
    }//GEN-LAST:event_column7ActionPerformed

    private void backMainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMainMenuButtonActionPerformed
        // TODO add your handling code here:
        menuPanel.setVisible(true);
        gamePanel.setVisible(false);
        
        //removes the buttons for the slots so that they don't persist when starting another game
        for (int i = 0; i < gameState.newBoard.getRows(); i++){
            for (int j = 0; j < gameState.newBoard.getColumns(); j++){
                gameboardPanel.remove(slot[i][j]);
            }
        }
    }//GEN-LAST:event_backMainMenuButtonActionPerformed
    
    public boolean isColumnFull(int col) {
        return (slot[0][col].getText() != null);
    }
    
    private void placePiece(int column){
        int col = column - 1;
        
        gameState.playerTurn(column);
        //System.out.print(gameState.activePlayer.getPlayerColor());
        //System.out.print(gameState.newBoard.checkForWin(gameState.activePlayer.getPlayerColor()));
        gameState.newBoard.getBoardState();
        
        //System.out.print(isColumnFull(col));
        if (!isColumnFull(col)){
            if (slot[0][col].getText() == null) {
                for (int i = gameState.newBoard.getRows() - 1; i >= 0; i--) {
                    if (slot[i][col].getText() == null) {
                        slot[i][col].setIcon(gameState.activePlayer.getPlayerIcon());
                        slot[i][col].setText("");
                        //we can temporarliy comment out break to fill
                        // a column faster for testing
                        gameState.endTurn();
                        break;
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, 
                                          "This Column is full.\nPlease choose a new column.", 
                                          "Whoops!", 
                                          JOptionPane.WARNING_MESSAGE);        
            }
        
        System.out.print(gameState.newBoard.checkForWin(gameState.activePlayer.getPlayerColor()));
        checkWin();
        //System.out.print(gameState.newBoard.checkForWin(gameState.activePlayer.getPlayerColor()));
        
    }
    
    private void checkWin(){
        
        if (gameState.newBoard.checkForWin(gameState.activePlayer.getPlayerColor())){
            JOptionPane.showMessageDialog(null, 
                                          "WINNER!", 
                                          "WINNER!", 
                                          JOptionPane.WARNING_MESSAGE);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameGUI().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton StartGameButton;
    private javax.swing.JButton backMainMenuButton;
    private javax.swing.JButton column1;
    private javax.swing.JButton column2;
    private javax.swing.JButton column3;
    private javax.swing.JButton column4;
    private javax.swing.JButton column5;
    private javax.swing.JButton column6;
    private javax.swing.JButton column7;
    private javax.swing.JLabel gameBanner;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JPanel gameboardPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel selectionColumnPanel;
    // End of variables declaration//GEN-END:variables
}
