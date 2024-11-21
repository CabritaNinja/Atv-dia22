import javax.swing.JOptionPane;

public class vetor2 
{
    public static void main(String[] args) {
        int[] num = new int[15];
        int l;

        for (l = 0; l <= 14; l++) {

            num[l] = Integer.parseInt(JOptionPane.showInputDialog("Digite " + (l + 1) + " numero:"));
        }

        JOptionPane.showMessageDialog(null, "Relaçao dos Numeros");

        for (l = 0; l <= 14; l++) {

            JOptionPane.showMessageDialog(null, (l + 1) + " - " + num[l]);

            if (num[l] % 2 == 0) {

                JOptionPane.showMessageDialog(null, "É PAR");
            } else {

                JOptionPane.showMessageDialog(null, "É IMPAR");
            }
        }
    }
}