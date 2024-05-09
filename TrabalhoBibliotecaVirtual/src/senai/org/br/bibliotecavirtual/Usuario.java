package senai.org.br.bibliotecavirtual;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private Integer idUsuario;
	private String nome;
	private String email;
	private String endereco;
	private List<ItemBiblioteca> itensEmprestados;

	public Usuario(Integer idUsuario, String nome, String email, String endereco) {
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.itensEmprestados = new ArrayList<>();
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void emprestarItem(ItemBiblioteca item, Biblioteca biblioteca) {
		if (biblioteca.listarItensDisponiveis().contains(item)) {
			itensEmprestados.add(item);
			System.out.println("Item emprestado com sucesso: " + item.getTitulo());
			biblioteca.removerItem(item);
		} else {
			System.out.println("O item não está disponível para empréstimo no momento.");
		}
	}
	public void devolverItem(ItemBiblioteca item, Biblioteca biblioteca) {
		if (itensEmprestados.contains(item)) {
			itensEmprestados.remove(item);
			System.out.println("Item devolvido com sucesso: " + item.getTitulo());
			biblioteca.adicionarItem(item);
		} else {
			System.out.println("Você não tem este item para devolver.");
		}
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco
				+ ", itensEmprestados=" + itensEmprestados + "]";
	}


}
