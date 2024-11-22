import javax.swing.JOptionPane;

public class Vetor48 {
    public static void main(String[] args) {
        int[] leitos = new int[50], nd = new int[50], cod = new int[50];
        int k = 0, chave = 0, quarto, op;
        String[] sit = new String[50], din = new String[50], dout = new String[50], nome = new String[50], tel = new String[50];
        String resp, respl, nomep;
        double[] precos = new double[50], despesas = new double[50];
        double valor, total;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("\n\n\nHotel Fazenda Sucesso \n"
                    + "\n1. Cadastrar quartos "
                    + "\n2. Lista todos os quartos"
                    + "\n3. Lista quartos desocupados"
                    + "\n4. Aluguel / reserva quarto"
                    + "\n5. Entra despesas extras"
                    + "\n6. Calcula despesa do quarto"
                    + "\n7. Sair"
                    + "\nopcao:"));

            if (op == 1) {
                if (chave == 1) {
                    JOptionPane.showMessageDialog(null, "\nAtencao. Dados ja cadastrados");
                } else {
                    for (int i = 0; i < 50; i++) {
                        sit[i] = "L";
                        nd[i] = 0;
                        despesas[i] = 0.;
                        din[i] = "XXXX";
                        dout[i] = "XXXX";
                        nome[i] = "";
                        tel[i] = "";
                        precos[i] = 30.;
                        leitos[i] = 5;
                    }
                    chave = 1;
                }
            } else if (op == 2) {
                if (chave == 0) {
                    JOptionPane.showMessageDialog(null, "\nEscolha a opcao 1");
                } else {
                    for (int i = 0; i < 50; i++) {
                        JOptionPane.showMessageDialog(null, "numero do quarto: " + (i + 1)
                                + "\nsituacao quarto: " + sit[i]
                                + "\nquantidade de leitos: " + leitos[i]
                                + "\npreco do quarto: " + precos[i]
                                + "\ndespesas: " + despesas[i]
                                + "\ndata de entrada: " + din[i]
                                + "\ndata de saida: " + dout[i]
                                + "\nnumero de dias: " + nd[i]);
                    }
                }
            } else if (op == 3) {
                if (chave == 0) {
                    JOptionPane.showMessageDialog(null, "\nEscolha a opcao 1");
                } else {
                    for (int i = 0; i < 50; i++) {
                        if (sit[i].equals("A")) {
                            JOptionPane.showMessageDialog(null, "numero do quarto: " + (i + 1)
                                    + "\ndespesas: " + despesas[i]
                                    + "\ndata de entrada: " + din[i]
                                    + "\ndata de saida: " + dout[i]
                                    + "\nnumero de dias: " + nd[i]);
                        }
                    }
                }
            } else if (op == 4) {
                if (chave == 0) {
                    JOptionPane.showMessageDialog(null, "\nEscolha a opcao 1");
                } else {
                    resp = JOptionPane.showInputDialog("\nDigite A( aluguel) R(reserva): ");
                    while (!resp.equals("A") && !resp.equals("a") && !resp.equals("R") && !resp.equals("r")) {
                        resp = JOptionPane.showInputDialog("\nResposta invalida. Digite A( aluguel) R(reserva): ");
                    }

                    if (resp.equals("A") || resp.equals("a")) {
                        respl = JOptionPane.showInputDialog("\nTinha reserva (s/n)? ");
                        if (respl.equals("S") || respl.equals("s")) {
                            nomep = JOptionPane.showInputDialog("\nEntre com nome: ");
                            int i = 0;
                            while (!nomep.equals(nome[i]) && i < 49) {
                                i++;
                            }
                            if (nomep.equals(nome[i])) {
                                quarto = i;
                                sit[i] = "A";
                                despesas[i] = 0.;
                                din[quarto] = JOptionPane.showInputDialog("\ndata de entrada: ");
                                dout[quarto] = JOptionPane.showInputDialog("\ndata de saida: ");
                                nd[quarto] = Integer.parseInt(JOptionPane.showInputDialog("\nnumero de dias: "));
                            } else {
                                respl = "N";
                            }
                        }
                    } else if (resp.equals("R") || resp.equals("r")) {
                        for (int i = 0; i < 50; i++) {
                            if (sit[i].equals("L")) {
                                JOptionPane.showMessageDialog(null, "numero do quarto: " + (i + 1)
                                        + "\nquantidade de leitos: " + leitos[i]
                                        + "\npreco do quarto: " + precos[i]);
                            }
                        }
                        quarto = Integer.parseInt(JOptionPane.showInputDialog("\nDigite o numero do quarto para reserva: "));
                        while (quarto < 1 || quarto > 50) {
                            quarto = Integer.parseInt(JOptionPane.showInputDialog("\nQuarto Invalido. Entre novamente: "));
                        }
                        while (sit[quarto - 1].equals("A")) {
                            quarto = Integer.parseInt(JOptionPane.showInputDialog("\nQuarto ocupado. Digite novamente: "));
                        }
                        sit[quarto - 1] = "R";
                        nome[quarto - 1] = JOptionPane.showInputDialog("\nDigite nome: ");
                        tel[quarto - 1] = JOptionPane.showInputDialog("\nDigite telefone para contato: ");
                        din[quarto - 1] = JOptionPane.showInputDialog("\ndata de entrada: ");
                        dout[quarto - 1] = JOptionPane.showInputDialog("\ndata de saida: ");
                        nd[quarto - 1] = Integer.parseInt(JOptionPane.showInputDialog("\nnumero de dias: "));
                    }
                }
            } else if (op == 5) {
                if (chave == 0) {
                    JOptionPane.showMessageDialog(null, "\nEscolha a opcao 1");
                } else {
                    quarto = Integer.parseInt(JOptionPane.showInputDialog("\nDigite o numero do quarto: "));
                    while (quarto < 1 || quarto > 50) {
                        quarto = Integer.parseInt(JOptionPane.showInputDialog("\nDigite o numero do quarto: "));
                    }
                    valor = Double.parseDouble(JOptionPane.showInputDialog("\ndespesas: "));
                    despesas[quarto - 1] += valor;
                }
            } else if (op == 6) {
                if (chave == 0) {
                    JOptionPane.showMessageDialog(null, "\nEscolha a opcao 1");
                } else {
                    quarto = Integer.parseInt(JOptionPane.showInputDialog("\nDigite o numero do quarto: "));
                    while (quarto < 1 || quarto > 50) {
                        quarto = Integer.parseInt(JOptionPane.showInputDialog("\nDigite o numero do quarto: "));
                    }
                    total = despesas[quarto - 1] + precos[quarto - 1];
                    JOptionPane.showMessageDialog(null, "\ndespesas: R$ " + total);
                    sit[quarto - 1] = "L";
                    despesas[quarto - 1] = 0.;
                    din[quarto - 1] = "XXXX";
                    dout[quarto - 1] = "XXXX";
                    nd[quarto - 1] = 0;
                    nome[quarto - 1] = "";
                }
            } else if (op == 7) {
                JOptionPane.showMessageDialog(null, "\nSaindo");
            } else {
                JOptionPane.showMessageDialog(null, "\nOpcao nao disponivel");
            }
        } while (op != 7);
    }
}
