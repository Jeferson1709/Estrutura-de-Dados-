package projeto_revisao;

public class TesteObjeto {
	public static void main(String[] args) {
		VetorObjeto vetor =  new VetorObjeto(5);
		
		Contato c1 = new Contato("Jeferson","11 99999-9999", "Jefersonteste@gmail.com");
		Contato c2 = new Contato("Maria","11 99999-9999", "Mariateste@gmail.com");
		Contato c3= new Contato("Carlos","11 99999-9999", "Carlosteste@gmail.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Quantidade de dados do vator: "+ vetor.tamanho());
		System.out.println("Dados do Vetor: "+ vetor.toString());
	} 
	
}
