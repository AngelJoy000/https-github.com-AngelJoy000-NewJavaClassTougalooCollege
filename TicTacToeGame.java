/**
 * @(#)TicTacToeGame.java
 *
 * TicTacToeGame application
 *
 * @author Angel Patterson
 *April 13, 2017
 * @version 1.00 2017/4/13
 */


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TicTacToeGame extends JFrame
{
  
    JPanel pane;
    JLabel ticLB;
    JLabel tacLB;
    JLabel toeLB;
    JButton resetBT;
    JLabel xoLB;
    JLabel winLB;
    JButton arrBT[][];
    int cnt = 0;
  
    public TicTacToeGame() {
        super("Tic Tac Toe");
        Font f= new Font("sansserif", Font.BOLD, 60);
        ticLB = new JLabel("TIC");
        ticLB.setFont(f);
        tacLB = new JLabel("TAC");
        tacLB.setFont(f);
        toeLB = new JLabel("TOE");
        toeLB.setFont(f);
        arrBT = new JButton[3][3];
        for (int i = 0; i < arrBT.length; i++) {
            for (int j = 0; j < arrBT[i].length; j++) {
                arrBT[i][j] = new JButton("");
                TicTacToeGame.myListener click = new TicTacToeGame.myListener();
                arrBT[i][j].addActionListener(click);
            }
        }
        resetBT = new JButton("New Game");
        TicTacToeGame.myListener2 reset = new TicTacToeGame.myListener2();
        resetBT.addActionListener(reset);
        xoLB = new JLabel();
        winLB = new JLabel();
        pane = new JPanel();
        pane.setLayout(new GridLayout(5, 3));
        pane.add(ticLB);
        pane.add(tacLB);
        pane.add(toeLB);
        for (int i = 0; i < arrBT.length; i++) {
            for (int j = 0; j < arrBT[i].length; j++) {
                pane.add(arrBT[i][j]);
            }
        }
        pane.add(resetBT);
        pane.add(xoLB);
        pane.add(winLB);
        setContentPane(pane);
    }
    public boolean checkWin() {
        Font ab= new Font("sanserrif", Font.BOLD, 30);
        for (int i = 0; i < arrBT.length; i++) {
            if (!arrBT[i][0].getText().equals("") && !arrBT[0][i].getText().equals("")) {
                if (arrBT[i][0].getText().equals(arrBT[i][1].getText()) && arrBT[i][0].getText().equals(arrBT[i][2].getText())) {
                    xoLB.setText(arrBT[i][0].getText());
                    winLB.setText("Wins!");
                    xoLB.setFont(ab);
                    winLB.setFont(ab);
                    return true;
                } else if (arrBT[0][i].getText().equals(arrBT[1][i].getText()) && arrBT[0][i].getText().equals(arrBT[2][i].getText())) {
                    xoLB.setText(arrBT[0][i].getText());
                    winLB.setText("Wins!");
                    xoLB.setFont(ab);
                    winLB.setFont(ab);
                    return true;
                }
            }
        }
        if (!arrBT[1][1].getText().equals("")) {
            if (arrBT[0][0].getText().equals(arrBT[1][1].getText()) && arrBT[0][0].getText().equals(arrBT[2][2].getText())) {
                xoLB.setText(arrBT[0][0].getText());
                winLB.setText("Wins!");
                xoLB.setFont(ab);
                winLB.setFont(ab);
                return true;
            }
            if (arrBT[0][2].getText().equals(arrBT[1][1].getText()) && arrBT[2][0].getText().equals(arrBT[0][2].getText())) {
                xoLB.setText(arrBT[0][2].getText());
                winLB.setText("Wins!");
                xoLB.setFont(ab);
                winLB.setFont(ab);
                return true;
            }
        }
        return false;
    }
    public class myListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            if (button.getText().equals("") && !checkWin()) {
                if (cnt % 2 == 0) {
                    button.setText("X");
                } else if (cnt % 2 != 0) {
                    button.setText("O");
                }
                button.setFont(new Font("sansserif", Font.BOLD, 45));
                cnt++;
                checkWin();
            }
          
        }
    }
    public class myListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < arrBT.length; i++) {
                for (int j = 0; j < arrBT[i].length; j++) {
                    arrBT[i][j].setText("");
                }
            }
            xoLB.setText("");
            winLB.setText("");
        }
    }
    public static void main(String[] args) {
        TicTacToeGame frame = new TicTacToeGame();
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}