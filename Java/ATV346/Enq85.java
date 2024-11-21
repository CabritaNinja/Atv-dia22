import javax.swing.JOptionPane;

public class Enq85 {
    public static void main(String[] args) {
        String frase = "";
        int op, x, tam;

        do {
            JOptionPane.showMessageDialog(null, "\nMENU\n"
                    + "1 - Imprime o comprimento da frase\n"
                    + "2 - Imprime os dois primeiros e os dois últimos caracteres da frase\n"
                    + "3 - Imprime a frase espelhada\n"
                    + "4 - Termina o algoritmo", "Menu", JOptionPane.INFORMATION_MESSAGE);

            op = Integer.parseInt(JOptionPane.showInputDialog("OPCAO:"));

            if (op == 1) {
                frase = JOptionPane.showInputDialog("Digite uma frase:");
                JOptionPane.showMessageDialog(null, "Número de caracteres da frase: " + frase.length());
            } else {
                if (op == 2) {
                    frase = JOptionPane.showInputDialog("Digite uma frase:");
                    if (frase.length() >= 2) {
                        String primeiros = frase.substring(0, 2);
                        tam = frase.length() - 2;
                        String ultimos = frase.substring(tam);
                        JOptionPane.showMessageDialog(null, "Os dois primeiros caracteres: " + primeiros
                                + "\nOs dois últimos caracteres: " + ultimos);
                    } else {
                        JOptionPane.showMessageDialog(null, "A frase é muito curta para exibir os dois primeiros e dois últimos caracteres.");
                    }
                } else {
                    if (op == 3) {
                        frase = JOptionPane.showInputDialog("Digite uma frase:");
                        StringBuilder espelhada = new StringBuilder();
                        for (x = frase.length() - 1; x >= 0; x--) {
                            espelhada.append(frase.charAt(x));
                        }
                        JOptionPane.showMessageDialog(null, "Frase espelhada: " + espelhada.toString());
                    } else {
                        if (op == 4) {
                            JOptionPane.showMessageDialog(null, "Fim do algoritmo");
                        } else {
                            JOptionPane.showMessageDialog(null, "Opcao nao disponivel");
                        }
                    }
                }
            }

        } while (op != 4);
    }
}
