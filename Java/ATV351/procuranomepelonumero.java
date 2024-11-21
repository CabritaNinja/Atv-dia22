import javax.swing.JOptionPane;

public class procuranomepelonumero  {
    public static void main(String[] args) {
        int l, num;
        String[] nomes = new String[5];

        for (l = 0; l <= 4; l++) {

            nomes[l] = JOptionPane.showInputDialog("Digite o nome " + (l + 1) + ":");
        }
       
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da pessoa:"));



        while (num < 1 || num > 5){
            
            JOptionPane.showMessageDialog(null, "Número fora do intervalo: ");
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da pessoa:"));
        }

        JOptionPane.showMessageDialog(null, "Nome: " + nomes[num - 1]);
    }
}