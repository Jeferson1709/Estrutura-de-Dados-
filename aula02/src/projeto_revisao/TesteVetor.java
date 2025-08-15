package projeto_revisao;

public class TesteVetor {
    public static void main(String[] args) throws Exception{
        //Criando um nova objeto vetor. 
        Vetor vetor =new Vetor(5);
        
        //Acionando dois elementos. 
        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento");
       
        //Exibindo o tamnanho do vetor.
        System.out.println("Quantidade de informações no vetor: "+vetor.tamanho());
   
        //Exibindo o contéudo do vetor.
        System.out.println("Conteúdo do vetor: "+vetor.toString());
        
        //Exibindo o conteúdo em determinada posição
        System.out.println("Informação armazenada na posição 1: "+vetor.busca1("elemento 1"));
        
    }
}
