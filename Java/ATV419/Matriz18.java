import javax.swing.JOptionPane;

public class Matriz18 {
    public static void main(String[] args) {
        int[][] A = new int[5][5];
        int[][] B = new int[5][5];
        int[][] DIF = new int[5][5];

        for (int L = 0; L < 5; L++) {
            for (int c = 0; c < 5; c++) {
                A[L][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite elemento de A[" + (L + 1) + "][" + (c + 1) + "]:"));
            }
        }

        for (int L = 0; L < 5; L++) {
            for (int c = 0; c < 5; c++) {
                B[L][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite elemento de B[" + (L + 1) + "][" + (c + 1) + "]:"));
                DIF[L][c] = A[L][c] - B[L][c];
            }
        }

        StringBuilder resultado = new StringBuilder("\n\tMATRIZ DIFERENCA\n");
        for (int L = 0; L < 5; L++) {
            for (int c = 0; c < 5; c++) {
                resultado.append("\t").append(DIF[L][c]);
            }
            resultado.append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}