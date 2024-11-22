import javax.swing.JOptionPane; 
public class Matriz12 {
    public static void main(String[] args) {
        int[][] n = new int[5][5];
        int soma = 0;

        for (int L = 0; L < 5; L++) {
            for (int c = 0; c < 5; c++) {
                n[L][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento [" + L + "][" + c + "]:"));
            }
        }

        JOptionPane.showMessageDialog(null, "\nToda a matriz:");
        for (int L = 0; L < 5; L++) {
            String linha = "";
            for (int c = 0; c < 5; c++) {
                linha += n[L][c] + "\t";
            }
            JOptionPane.showMessageDialog(null, linha);
        }

        soma = 0;
        for (int L = 1; L < 5; L++) {
            for (int c = 5 - L; c < 5; c++) {
                if (n[L][c] % 2 == 1) {
                    soma += n[L][c] * n[L][c];
                }
            }
        }

        JOptionPane.showMessageDialog(null, "\nRaiz quadrada da soma dos quadrados dos números ímpares: " + Math.sqrt(soma));
    }
}
