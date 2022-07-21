package senac.entra21.java.oop.lista04;

public class AgendaContato { // criei o nome assim para as classes ficarem próximas
	
	private String nome;
	private String email;
	private String telefone;
	
	public AgendaContato() {}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String mostrarInformacoes() {
		return "Nome: " + this.nome + " - E-mail: " + this.email + " - Telefone: " + this.telefone;
	}

//	@Override
//	public String toString() {
//		return "AgendaContato [nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
//	}

	
	
}
