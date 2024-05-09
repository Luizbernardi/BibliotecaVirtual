package senai.org.br.bibliotecavirtual;

public class Revista extends ItemBiblioteca {

	private Integer volume;
	private Integer edicao;
	private Boolean disponibilidade;

	public Revista(Integer id, String titulo, String autor, Integer anoPublicacao, Integer volume, Integer edicao) {
		super(id, titulo, autor, anoPublicacao);
		this.volume = volume;
		this.edicao = edicao;
		this.disponibilidade =  true;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public Integer getEdicao() {
		return edicao;
	}

	public void setEdicao(Integer edicao) {
		this.edicao = edicao;
	}
	public boolean getDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(Boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public void verificarDisponibilidade() {
		if (disponibilidade) {
			System.out.println("A revista está disponível para empréstimo.");
		} else {
			System.out.println("A revista não está disponível para empréstimo.");
		}
	}
	public void editarEdicao(Integer volume, Integer edicao) {
		this.volume = volume;
		this.edicao = edicao;
		System.out.println("Edição da revista editada para Volume " + volume + ", Edição " + edicao);
	}
	@Override
	public String toString() {
		return "Revista{" +
				"id=" + getId() +
				", titulo='" + getTitulo() + '\'' +
				", autor='" + getAutor() + '\'' +
				", anoPublicacao=" + getAnoPublicacao() +
				", volume='" + volume + '\'' +
				", edição=" + edicao + '\'' +
				", disponibilidade=" + disponibilidade +
				'}';
	}
}





