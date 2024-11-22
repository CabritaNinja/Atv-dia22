import javax.swing.JOptionPane;

public class  vetorlO {
    public static void main(String[] args) {
        int[] vet1 = new int[10], vet2 = new int[20], vetc = new int[10];
        int i, c, d, L; 
         L = 0;  


         JOptionPane.showMessageDialog(null, "entrada de dados do vetor 1 ( 10 elementos)");

        for ( i = 0; i <= 9; i++) {

            vet1[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com " + (i + 1) + " elemento :"));
        }

        JOptionPane.showMessageDialog(null, "entrada de dados do vetor 2 ( 20 elementos)");

        for ( i = 0; i <= 19; i++) {

            vet2[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com " + (i + 1) + " elemento"));
        }

        for (i = 0; i <= 9; i++) {
            vetc[i] = -999999999; // inicializando com valores fora do contexto
        }
        
        for (i = 0; i <= 9; i++) {
            c = 0;
            while (vet1[i] != vet2[c] && c < 19) {
                c++;
            }
            if (vet1[i] == vet2[c]) {
                d = 0;
                while (vet1[i] != vetc[d] && d < L) {
                    d++;
                }
                if (d == L) {
                    vetc[d] = vet1[i];
                    L++;
                }
            }
        }
        if (L != 0) {

            JOptionPane.showMessageDialog(null, "Elementos comuns");
            for (i = 0; i < L; i++) {
                
            }
            JOptionPane.showMessageDialog(null, vet1[i]);

        } else {
            JOptionPane.showMessageDialog(null, "Não existem elementos comuns.");
        }
    }
}