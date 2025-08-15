
package projeto_temperatura;
//Importando a biblioteca JOptionPane.
import javax.swing.JOptionPane;

public class Projeto_temperatura {
    public static void main(String[] args) {
        //Definindo as variáveis .
        double [] temperatura = new double[7];
        double soma, media;
        int contador, dias_acima, dias_abaixo;
        //Iniciando soma com zero.
        soma = 0; 
        
        for(contador =  0; contador < 7; contador++){
            //A cada posição do array podemos atribuir uma temperatura.
            temperatura[contador] = Double.parseDouble(JOptionPane.showInputDialog("Digite a "+ (contador + 1 )+"º temperatura: "));
            //Soma recebe o valor dela + a Temperatura digitada.
            soma = soma + temperatura[contador];
        }
        // Definindo média, dias acima e dias abaixo.
        media = soma /  7;
        dias_acima = 0;
        dias_abaixo= 0;
        // Repetição para percorrer o array temperatura e identificar se o dia está acima ou baixo da média. 
        for(contador= 0; contador< 7; contador++){
            //Acima da média.
            if (temperatura[contador]> media) {
                dias_acima = dias_acima+ 1;
                
            }
            //Abaixo da média.
            if (temperatura[contador]< media) {
                dias_abaixo = dias_abaixo + 1;
            }
            
        }
        //Imprimindo os valores na caixa de dialogo JoptionPane. 
        JOptionPane.showMessageDialog(null,"A média das temperaturas é: " + media);    
        JOptionPane.showMessageDialog(null,"A quantidade de dias acima da média: " + dias_acima);
        JOptionPane.showMessageDialog(null,"A quantidade de dias abaixo da média: " + dias_abaixo);
    }
    
}
