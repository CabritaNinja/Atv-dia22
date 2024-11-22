import javax.swing.JOptionPane;

public class Vetor18 {
    public static void main(String[] args) {
        int nv, i;
        int[] voos = new int[1000];
        String[] nome = new String[1000];
        String id, nvd;

        nv = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número de voos:"));

        for (i = 0; i < nv; i++) {
            nome[i] = JOptionPane.showInputDialog("Entre com a identificação do voo " + (i + 1) + ":");
            voos[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de lugares disponíveis no voo " + nome[i] + ":"));
        }

        nvd = JOptionPane.showInputDialog("Entre com o número do voo desejado ou @ para terminar:");

        while (!nvd.equals("@")) {
            i = 0;
            while (!nvd.equals(nome[i]) && i < nv - 1) {
                i++;
            }

            if (nome[i].equals(nvd)) {
                if (voos[i] > 0) {
                    voos[i]--;
                    id = JOptionPane.showInputDialog("Qual o número da identidade do cliente?");
                    JOptionPane.showMessageDialog(null, "Identidade: " + id + " Voo: " + nvd);
                } else {
                    JOptionPane.showMessageDialog(null, "Não existem mais lugares neste voo.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não existe este voo.");
            }

            nvd = JOptionPane.showInputDialog("Entre com o número do voo desejado ou @ para terminar:");
        }

        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }
}
