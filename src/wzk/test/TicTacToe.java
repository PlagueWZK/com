package wzk.test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe extends JFrame implements ActionListener {
    private JButton[][] buttons = new JButton[3][3];
    private char currentPlayer = 'X';

    public TicTacToe() {
        setTitle("Tic Tac Toe");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(new Font("Arial", Font.BOLD, 72));
                buttons[i][j].addActionListener(this);
                add(buttons[i][j]);
            }
        }
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton buttonClicked = (JButton) e.getSource();
        buttonClicked.setText(Character.toString(currentPlayer));
        buttonClicked.setEnabled(false);
        if (checkForWin()) {
            JOptionPane.showMessageDialog(this, "Player " + currentPlayer + " wins!");
            System.exit(0);
        } else if (checkForTie()) {
            JOptionPane.showMessageDialog(this, "It's a tie!");
            System.exit(0);
        } else {
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }

    public boolean checkForWin() {
        return (checkRowForWin(0) || checkRowForWin(1) || checkRowForWin(2) || checkColForWin(0) || checkColForWin(1)
                || checkColForWin(2) || checkDiagonalForWin());
    }

    public boolean checkRowForWin(int row) {
        return (buttons[row][0].getText() == buttons[row][1].getText()
                && buttons[row][1].getText() == buttons[row][2].getText() && buttons[row][0].getText() != "");
    }

    public boolean checkColForWin(int col) {
        return (buttons[0][col].getText() == buttons[1][col].getText()
                && buttons[1][col].getText() == buttons[2][col].getText() && buttons[0][col].getText() != "");
    }

    public boolean checkDiagonalForWin() {
        return ((buttons[0][0].getText() == buttons[1][1].getText()
                && buttons[1][1].getText() == buttons[2][2].getText() && buttons[0][0].getText() != "")
                || (buttons[0][2].getText() == buttons[1][1].getText()
                && buttons[1][1].getText() == buttons[2][0].getText() && buttons[0][2].getText() != ""));
    }

    public boolean checkForTie() {
        boolean full = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j].getText() == "") {
                    full = false;
                }
            }
        }
        return full;
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}
