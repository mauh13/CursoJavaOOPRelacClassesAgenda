package senac.entra21.java.oop.lista04;

public class Agenda {
	
	private String nome;
	private AgendaContato contatos[];
	
	public Agenda(){}
	
	public Agenda(String nome){}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public AgendaContato[] getContatos() {
		return contatos;
	}

	public void setContatos(AgendaContato[] contatos) {
		this.contatos = contatos;
	}

	public void mostrarContatos() {
		System.out.println("\nContatos da Agenda " + this.nome + ": \n");
		for (AgendaContato x : contatos) {
			System.out.println(x.mostrarInformacoes());
		}
	}
	
	
}
