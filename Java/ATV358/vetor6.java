import javax.swing.JOptionPane;

public class vetor6{
    public static void main(String[] args) {
        float[] precoCompra = new float[100], precoVenda = new float[100];
        float lucro;
        int totLucroMenor10 = 0, totLucroMenor20 = 0, totLucroMaior20 = 0,a;
    

        for (a = 0; a < 100; a++) {

            precoCompra[a] = Float.parseFloat(JOptionPane.showInputDialog("Preço de compra da mercadoria :"));

            precoVenda[a] = Float.parseFloat(JOptionPane.showInputDialog("Preço de venda da mercadoria :"));
        }

        for (a = 0; a < 100; a++) {
            lucro = precoVenda[a] - precoCompra[a];

            if (lucro < 10) {
                totLucroMenor10++;

            }else
            { if(lucro <= 20.0)

            { 
                totLucroMenor20++; 
            }
            else
            { 
                totLucroMaior20++; 
            }
            } 
        }
        JOptionPane.showMessageDialog(null, "\nTotal de mercadorias com lucro < 10%: " + totLucroMenor10 + "\nTotal de mercadorias com 10% <= lucro <= 20%: " + totLucroMenor20 + "\nTotal de mercadorias com lucro > 20%: " + totLucroMaior20
        );
    }
}