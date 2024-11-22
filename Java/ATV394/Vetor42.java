import javax.swing.JOptionPane;

public class Vetor42 {
    public static void main(String[] args) {
        int L, c, tam, flag = 0, flagl = 0, flag2 = 0;
        double[] nota1 = new double[50];
        double[] nota2 = new double[50];
        double[] media = new double[50];
        String[] nomes = new String[50];
        String op;

        do {
            op = JOptionPane.showInputDialog(
                "\n\n\nMENU\n" +
                "\n1 - ENTRAR NOMES" +
                "\n2 - ENTRAR 1ª NOTA" +
                "\n3 - ENTRAR 2ª NOTA" +
                "\n4 - CALCULAR MÉDIA" +
                "\n5 - LISTAR NO DISPLAY" +
                "\n6 - SAIR" +
                "\nOPÇÃO:"
            );

            if (op.equals("1")) {
                flag = 1;
                for (L = 0; L <= 49; L++) {
                    nomes[L] = JOptionPane.showInputDialog("Digite " + (L + 1) + "º nome (com até 30 caracteres e todas as letras maiúsculas):");
                    while (nomes[L].length() > 30) {
                        nomes[L] = JOptionPane.showInputDialog("Nome com até 30 caracteres. Digite " + (L + 1) + "º nome novamente (todas as letras maiúsculas):");
                    }
                    tam = nomes[L].length();
                    if (tam < 30) {
                        for (c = 0; c < 30 - tam; c++) {
                            nomes[L] += " ";
                        }
                    }
                }
            } else if (op.equals("2")) {
                if (flag == 0) {
                    JOptionPane.showMessageDialog(null, "NÃO TEM NOME CADASTRADO");
                } else {
                    for (L = 0; L <= 49; L++) {
                        nota1[L] = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota do aluno " + (L + 1) + ":"));
                    }
                    flagl = 1;
                }
            } else if (op.equals("3")) {
                if (flag == 0) {
                    JOptionPane.showMessageDialog(null, "NÃO TEM NOME CADASTRADO");
                } else {
                    for (L = 0; L <= 49; L++) {
                        nota2[L] = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2ª nota do aluno " + (L + 1) + ":"));
                    }
                    flag2 = 1;
                }
            } else if (op.equals("4")) {
                if (flag == 0 || flagl == 0 || flag2 == 0) {
                    JOptionPane.showMessageDialog(null, "NEM TODOS OS DADOS ESTÃO CADASTRADOS");
                } else {
                    for (L = 0; L <= 49; L++) {
                        media[L] = (3 * nota1[L] + 7 * nota2[L]) / 10;
                    }
                }
            } else if (op.equals("5")) {
                if (flag == 0 || flagl == 0 || flag2 == 0) {
                    JOptionPane.showMessageDialog(null, "NEM TODOS OS DADOS ESTÃO CADASTRADOS");
                } else {
                    StringBuilder output = new StringBuilder();
                    output.append("\nNOME\t\t\tNOTA1\tNOTA2\tMÉDIA\n");
                    for (L = 0; L <= 49; L++) {
                        output.append(nomes[L]).append("\t").append(nota1[L]).append("\t").append(nota2[L]).append("\t").append(media[L]).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, output.toString());
                }
            } else if (!op.equals("6")) {
                JOptionPane.showMessageDialog(null, "OPÇÃO NÃO DISPONÍVEL");
            }
        } while (!op.equals("6"));

        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }
}
