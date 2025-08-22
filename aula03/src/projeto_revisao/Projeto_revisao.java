package projeto_revisao;

public class Projeto_revisao{
    public static void main(String[] args) {
        
    //Declarando um array de 365 posições.
    double[] temperatura = new double[365];
    //Atribuindo valores nas posições.
    temperatura[0] = 25.7;
    temperatura[1] = 27.4;
    temperatura[2] = 29.3;
    temperatura[3] = 31.4;
    temperatura[4]= 30.2;
    temperatura[5]= 29.6;
    

    System.out.print("O valor da temperatura do dia 3 é: " + temperatura[2]);
    System.out.print("O tamanho do vetor:  " + temperatura.length);
    // Mostrando o valor da temperatura no dia.          
    for(int i = 0; i< temperatura.length; i++){
        System.out.println("O valor da temperatura do dia "+ (i+1)+ " é "+ temperatura[i]);
    }
    //Mostrando os valores de cada posição.
    for(double temp : temperatura){
        System.out.println(temp);
    }
    }
    
}
