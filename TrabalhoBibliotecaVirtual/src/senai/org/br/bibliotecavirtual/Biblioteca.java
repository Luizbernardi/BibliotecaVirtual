package senai.org.br.bibliotecavirtual;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<ItemBiblioteca> listaItensDisponiveis;
	private List<Usuario> listaUsuarios;
	private List<ItemBiblioteca> catalogoCompleto;

	public Biblioteca() {
		this.listaItensDisponiveis = new ArrayList<>();
		this.listaUsuarios = new ArrayList<>();
		this.catalogoCompleto = new ArrayList<>();
	}
	public void adicionarItem(ItemBiblioteca item) {
		listaItensDisponiveis.add(item);
		if (!catalogoCompleto.contains(item)) {
			catalogoCompleto.add(item);
		}
	}
	public void adicionarUsuario(Usuario usuario) {
		listaUsuarios.add(usuario);
	}

	public void removerItem(ItemBiblioteca item) {
		listaItensDisponiveis.remove(item);
	}
	public void removerUsuario(Usuario usuario) {
		listaUsuarios.remove(usuario);
	}

	public ItemBiblioteca buscarItem(String titulo) {
		for (ItemBiblioteca item : catalogoCompleto) {
			if (item.getTitulo().equals(titulo)) {
				return item;
			}
		}
		return null; 
	}
	public List<ItemBiblioteca> listarItensDisponiveis() {
		return listaItensDisponiveis;
	}

	public List<Usuario> listarUsuarios() {
		return listaUsuarios;
	}

	public List<ItemBiblioteca> gerarCatalogoCompleto() {
		return catalogoCompleto;
	}
}

