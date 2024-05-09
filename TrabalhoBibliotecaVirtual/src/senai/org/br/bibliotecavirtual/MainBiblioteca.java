package senai.org.br.bibliotecavirtual;
import java.awt.Toolkit;

import javax.swing.JOptionPane;

public class MainBiblioteca {
	private static Biblioteca biblioteca = new Biblioteca();
	private static Livro livro1;
	private static Revista revista1;
	private static MidiaEletronica midia1;
	private static Usuario usuario1;

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		int opcao;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("== Selecione o Setor Desejado ==\n"
					+ "1. Adicionar/Remover.\n"
					+ "2. Outras operações.\n"
					+ "0. Sair"));

			switch (opcao) {
			case 1:
				menuAdicionarRemover();
				break;
			case 2:
				menuOutrasOperacoes();
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Encerrando Programa");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida");
			}
		} while (opcao != 0);
	}

	public static void menuAdicionarRemover() {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("== Menu Adicionar/Remover ==\n"
				+ "1. Adicionar item\n"
				+ "2. Adicionar usuário\n"
				+ "3. Remover item\n" 
				+ "4. Remover usuario\n"
				+ "0. Voltar"));

		switch (opcao) {
		case 1:
			adicionarItem(biblioteca);
			break;
		case 2:
			adicionarUsuario();
			break;
		case 3:
			removerItem();
			break;
		case 4:
			removerUsuario();
			break;	
		case 0:
			return;
		default:
			JOptionPane.showMessageDialog(null, "Opção Inválida");
		}
	}

	public static void menuOutrasOperacoes() {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("== Menu Outras Operações ==\n"
				+ "1. Emprestar item\n"
				+ "2. Devolver item\n"
				+ "3. Calcular preço de venda\n"
				+ "4. Informações detalhadas\n"
				+ "5. Verificar disponibilidade\n"
				+ "6. Editar edição\n"
				+ "7. Reproduzir\n"
				+ "8. Baixar arquivo\n"
				+ "9. Gerar catálogo completo\n"
				+ "10. Listar itens disponíveis\n"
				+ "11. Listar usuários\n"
				+ "12. Buscar item\n"
				+ "0. Voltar"));

		switch (opcao) {
		case 1:
			emprestarItem(usuario1, biblioteca);
			break;
		case 2:
			devolverItem(usuario1, biblioteca);
			break;
		case 3:
			calcularPrecoVenda();
			break;
		case 4:
			informacoesDetalhadas();
			break;
		case 5:
			verificarDisponibilidade();
			break;
		case 6:
			editarEdicao();
			break;
		case 7:
			reproduzir();
			break;
		case 8:
			baixarArquivo();
			break;
		case 9:
			gerarCatalogoCompleto();
			break;
		case 10:
			listarItensDisponiveis();
			break;
		case 11:
			listarUsuarios();
			break;
		case 12:
			buscarItem();
			break;
		case 0:
			return;
		default:
			JOptionPane.showMessageDialog(null, "Opção Inválida");
		}
	}

	private static void calcularPrecoVenda() {
		System.out.println("o preço do livro é: " + livro1.calcularPrecoVenda() +" R$");
	}

	private static void informacoesDetalhadas() {
		livro1.informacoesDetalhadas();
	}

	public static void removerItem() {
		biblioteca.removerItem(midia1);
		System.out.println("Item removido com sucesso");
	}
	public static void removerUsuario() {
		biblioteca.removerUsuario(usuario1);;
		System.out.println("Usuario removido com sucesso");
	}

	private static void buscarItem() {
		System.out.println(biblioteca.buscarItem("pé de feijao"));
	}

	private static void listarUsuarios() {
		System.out.println(biblioteca.listarUsuarios());
	}

	private static void listarItensDisponiveis() {
		System.out.println(biblioteca.listarItensDisponiveis());
	}

	private static void gerarCatalogoCompleto() {
		System.out.println(biblioteca.gerarCatalogoCompleto());
	}

	private static void baixarArquivo() {
		midia1.baixarArquivo();
	}

	private static void reproduzir() {
		midia1.reproduzir();
		Toolkit.getDefaultToolkit().beep();
	}

	private static void editarEdicao() {
		revista1.editarEdicao(2, 2);
	}
	private static void verificarDisponibilidade() {
		revista1.verificarDisponibilidade();
	}
	public static void devolverItem(Usuario usuario, Biblioteca biblioteca) {
		ItemBiblioteca item = biblioteca.buscarItem("pé de feijao");
		if (item != null) {
			usuario.devolverItem(item, biblioteca);
		} else {
			System.out.println("Item não encontrado.");
		}
	}
	private static void emprestarItem(Usuario usuario, Biblioteca biblioteca) {
		ItemBiblioteca item = biblioteca.buscarItem("pé de feijao");
		if (item != null) {
			usuario.emprestarItem(item, biblioteca);
		} else {
			System.out.println("Item não encontrado.");
		}
	}
	private static void adicionarUsuario() {
		usuario1 = new Usuario(1, "João", "joao@email.com", "Rua A, 123");
		biblioteca.adicionarUsuario(usuario1);
	}
	private static void adicionarItem(Biblioteca biblioteca) {
		livro1 = new Livro(1, "pé de feijao", "joao", 2020, "Aventura", 200);
		revista1 = new Revista(2, "Revista da Monica", "naosei o nome", 2014, 1, 1);
		midia1 = new MidiaEletronica(3, "podcast do joze", "joze", 2019, "MP4", "1024 Mb");

		biblioteca.adicionarItem(livro1);
		biblioteca.adicionarItem(revista1);
		biblioteca.adicionarItem(midia1);
	}

}
