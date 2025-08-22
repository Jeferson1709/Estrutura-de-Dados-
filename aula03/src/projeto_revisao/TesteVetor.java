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
        
        //Adiciona um elemento ao início. 
        vetor.adicionaInicio(0, "Elemento 0");
        
        //Exibindo a quantidade e=de informações
        System.out.println("A quantidade de informações no vetor e: "+ vetor.tamanho());
        
        //Exibindo os Dados do Vetor
        System.out.println("Dados do Vetor: " + vetor.toString());
        
        //Exibindo a informação na posição 1
        System.out.println("Informação na posição 1: " + vetor.busca(1));
       
    }
}
