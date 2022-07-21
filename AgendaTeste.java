package senac.entra21.java.oop.lista04;

import java.util.Scanner;

public class AgendaTeste {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Agenda agenda = new Agenda();
		
		System.out.println("---<<<((({{{ CRIANDO UMA AGENDA }}})))>>>---");
		System.out.print("\nPor gentileza crie um nome para a agenda: ");
		agenda.setNome(leia.nextLine());
		
		System.out.print("\nQuantos contatos deseja cadastrar? ");
				
		AgendaContato contatox[] = new AgendaContato[leia.nextInt()]; // usei contatoX para não confundir
		
//		AgendaContato cont2 = new AgendaContato();
		
		for (int i=0; i<contatox.length; i++) {
			AgendaContato contato = new AgendaContato();
			
			System.out.println("\nCadastrando o " + (i+1) + "º contato: ");
			System.out.print("Nome: ");
			contato.setNome(leia.next());
			System.out.print("Email: ");
			contato.setEmail(leia.next());
			System.out.print("Telefone: ");
			contato.setTelefone(leia.next());
			
			contatox[i] = contato;			
		}
	
//		System.out.println(cont2);
		
		agenda.setContatos(contatox);
		
		agenda.mostrarContatos();
		
		leia.close();
		}

}
