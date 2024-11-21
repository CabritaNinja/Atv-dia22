import javax.swing.JOptionPane;

public class vetor4{
    public static void main(String[] args) {
        int L, c, t;
        int[] media = new int[15];
        String[] nomes = new String[15];
        String[] sit = new String[15];
        float[] pr1 = new float[15];
        float[] pr2 = new float[15];


        for (L = 0; L <= 14; L++) {
            boolean nomeValido = false;
            while (!nomeValido) {
                nomes[L] = JOptionPane.showInputDialog(null, "Digite o " + (L + 1) + "º nome:");

                if (nomes[L] != null && nomes[L].length() <= 30) {
                    nomeValido = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Nomes devem ter até 30 caracteres.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }

            t = 30 - nomes[L].length();
            for (c = 1; c <= t; c++) {
                nomes[L] += " ";
            }

            pr1[L] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a 1ª nota do(a) " + nomes[L].trim() + ":"));
            pr2[L] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a 2ª nota do(a) " + nomes[L].trim() + ":"));


            media[L] = (int) Math.floor((pr1[L] + pr2[L]) / 2 + 0.0001);

            if (media[L] >= 5) {
                sit[L] = "AP";
            } else {
                sit[L] = "RP";
            }
        }

        StringBuilder relatorioFinal = new StringBuilder("\t\t\tRELACAO FINAL\n\n");
        for (L = 0; L <= 14; L++) {
            relatorioFinal.append(String.format("%d - %s\t%.2f\t%.2f\t%d\t%s\n", 
                L + 1, nomes[L].trim(), pr1[L], pr2[L], media[L], sit[L]));
        }

        JOptionPane.showMessageDialog(null, relatorioFinal.toString(), "Relatório Final", JOptionPane.INFORMATION_MESSAGE);
    }
}