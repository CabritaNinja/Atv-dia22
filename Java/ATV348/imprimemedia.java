import javax.swing.JOptionPane;

public class imprimemedia {
    public static void main(String[] args) {
        int l;
        String[] nomes = new String[5];
        float[] pr1 = new float[5], pr2 = new float[5], media = new float[5] ;


        for (l = 0; l <= 4; l++) {
            nomes[l] = JOptionPane.showInputDialog( "Digite o nome do aluno :");

            pr1[l] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1 :"));

            pr2[l] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2 :"));
            
            media[l] = (pr1[l] + pr2[l]) / 2;
        }

        JOptionPane.showMessageDialog(null, "RELAÇÃO FINAL");

        for ( l = 0; l <= 4; l++) {

            JOptionPane.showMessageDialog(null,"nome: " + nomes[l] + "\n nota1: " + pr1[l] + "\n nota2: " + pr2[l] + "\n media: " + media[l]);
        }
    }
}