import javax.swing.JOptionPane;

public class vetor8 {
    public static void main(String[] args) {

        int[] ultdia = new int[12];
        int data, i, dia, mes;
        String[] signos = new String[12];

        for (i = 0; i < 12; i++) {
            signos[i] = JOptionPane.showInputDialog("Digite o signo :");
            ultdia[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o último dia para o signo :"));
        }

        data = Integer.parseInt(JOptionPane.showInputDialog("Digite a data no formato ddmm ou 9999 para terminar:"));

        while (data != 9999) {
            dia = data / 100;
            mes = data % 100;
            mes--;

            if (dia > ultdia[mes]) {
                mes = (mes + 1) % 12;
            }

            JOptionPane.showMessageDialog(null, "Signo: " + signos[mes]);

            data = Integer.parseInt(JOptionPane.showInputDialog("Digite a data no formato ddmm ou 9999 para terminar:"));
        }

    }
}

      