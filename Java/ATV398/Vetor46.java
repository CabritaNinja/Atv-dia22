import javax.swing.JOptionPane;

public class Vetor46 {
    public static void main(String[] args) {
        int k = 0, codi, codigo, quantidade, i, t;
        int[] cod = new int[50];
        int[] quant = new int[50];
        double[] preco = new double[50];
        double geral = 0, venda, auxp;
        String auxnome, nnome, op;

        do {
            op = JOptionPane.showInputDialog(
                "\nMENU\n" +
                "\n1 - CADASTRAR PRODUTO" +
                "\n2 - ALTERAR PRODUTO" +
                "\n3 - REMOVER PRODUTO" +
                "\n4 - LISTAR PRODUTOS" +
                "\n5 - CONSULTAR PRODUTO" +
                "\n6 - SAIR" +
                "\nOPÇÃO:"
            );

            if (op.equals("1")) {
                do {
                    codi = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto ou 0 para acabar:"));
                    if (codi != 0 && k < 50) {
                        cod[k] = codi;
                        quant[k] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto:"));
                        preco[k] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));
                        k++;
                    } else if (k >= 50) {
                        JOptionPane.showMessageDialog(null, "Central completa");
                    }
                } while (k < 50 && codi != 0);
            } else if (op.equals("2")) {
                nnome = JOptionPane.showInputDialog("Digite o código do produto para alterar:");
                i = 0;
                while (i < k && !nnome.equals(String.valueOf(cod[i]))) {
                    i++;
                }
                if (i < k && nnome.equals(String.valueOf(cod[i]))) {
                    quant[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade:"));
                    preco[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo preço:"));
                } else {
                    JOptionPane.showMessageDialog(null, "Produto não cadastrado");
                }
            } else if (op.equals("3")) {
                nnome = JOptionPane.showInputDialog("Digite o código do produto para remover:");
                i = 0;
                while (i < k && !nnome.equals(String.valueOf(cod[i]))) {
                    i++;
                }
                if (i < k && nnome.equals(String.valueOf(cod[i]))) {
                    cod[i] = 0;
                    quant[i] = 0;
                    preco[i] = 0.0;
                    JOptionPane.showMessageDialog(null, "Produto removido com sucesso.");
                } else {
                    JOptionPane.showMessageDialog(null, "Produto não cadastrado");
                }
            } else if (op.equals("4")) {
                StringBuilder lista = new StringBuilder("\nLista de Produtos:\n");
                for (i = 0; i < k; i++) {
                    if (cod[i] != 0) {
                        lista.append("\nCódigo: ").append(cod[i])
                            .append("\nQuantidade: ").append(quant[i])
                            .append("\nPreço: ").append(preco[i]).append("\n");
                    }
                }
                JOptionPane.showMessageDialog(null, lista.toString());
            } else if (op.equals("5")) {
                nnome = JOptionPane.showInputDialog("Digite o código do produto para consultar:");
                i = 0;
                while (i < k && !nnome.equals(String.valueOf(cod[i]))) {
                    i++;
                }
                if (i < k && nnome.equals(String.valueOf(cod[i]))) {
                    JOptionPane.showMessageDialog(null, "Código: " + cod[i] +
                        "\nQuantidade: " + quant[i] +
                        "\nPreço: " + preco[i]);
                } else {
                    JOptionPane.showMessageDialog(null, "Produto não cadastrado");
                }
            } else if (op.equals("6")) {
                JOptionPane.showMessageDialog(null, "Saindo");
            } else {
                JOptionPane.showMessageDialog(null, "Opção não disponível");
            }
        } while (!op.equals("6"));

        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }
}
