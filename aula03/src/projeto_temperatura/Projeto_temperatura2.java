package projeto_temperatura;

import java.util.Scanner;

public class Projeto_temperatura2 {

    public static void main(String[] args) {
        // Definindo as variáveis .
        double[] temperatura = new double[7];
        double soma, media;
        int contador, dias_acima, dias_abaixo;
        // Iniciando soma com zero.
        soma = 0;
        Scanner dados = new Scanner(System.in);
        for (contador = 0; contador < 7; contador++) {
            // A cada posição do array podemos atribuir uma temperatura.
            System.out.println("Digite a " + (contador + 1) + "º temperatura: ");
            temperatura[contador] = dados.nextDouble();

            // Soma recebe o valor dela + a Temperatura digitada.
            soma = soma + temperatura[contador];
        }
        // Definindo média, dias acima e dias abaixo.
        media = soma / 7;
        dias_acima = 0;
        dias_abaixo = 0;
        // Repetição para percorrer o array temperatura e identificar se o dia está
        // acima ou baixo da média.
        for (contador = 0; contador < 7; contador++) {
            // Acima da média.
            if (temperatura[contador] > media) {
                dias_acima = dias_acima + 1;

            }
            // Abaixo da média.
            if (temperatura[contador] < media) {
                dias_abaixo = dias_abaixo + 1;
            }

        }
        // Imprimindo os valores na caixa de dialogo JoptionPane.
        System.out.println("A média das temperaturas é " + media);
        System.out.println("A quantidade de dias acima da média é" + dias_acima);
        System.out.println("A quantidade de dias abaixo da média é" + dias_abaixo);

        dados.close();
    }

}
