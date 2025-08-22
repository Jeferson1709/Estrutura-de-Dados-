package projeto_revisao;

public class TesteAdiciona{
public static void main(String[] args) throws Exception{
	Vetor vetor = new Vetor(5);
	vetor.adiciona("Elemento 0");	
	vetor.adiciona("Elemento 1");
	vetor.adiciona("Elemento 2");
	vetor.adiciona("Elemento 3");
	vetor.adiciona("Elemento 4");
	vetor.adiciona("Elemento 5");
	vetor.adiciona("Elemento 6");
	vetor.adiciona("Elemento 7");
	System.out.println("A quantidade de informações no vetor e: "+ vetor.tamanho());
	System.out.println("Dados do Vetor: "+vetor.toString());
}
}
