package senai.org.br.bibliotecavirtual;

public class MidiaEletronica extends ItemBiblioteca {
	private String formato;
	private String tamanhoArquivo;

	public MidiaEletronica(Integer id, String titulo, String autor, Integer anoPublicacao, String formato,
			String tamanhoArquivo) {
		super(id, titulo, autor, anoPublicacao);
		this.formato = formato;
		this.tamanhoArquivo = tamanhoArquivo;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getTamanhoArquivo() {
		return tamanhoArquivo;
	}

	public void setTamanhoArquivo(String tamanhoArquivo) {
		this.tamanhoArquivo = tamanhoArquivo;
	}
	public void reproduzir() {
		System.out.println("Reproduzindo a mídia eletrônica: " + getTitulo());
	}
	public void baixarArquivo() {
		System.out.println("Baixando arquivo da mídia eletrônica: " + getTitulo());
	}
	@Override
	public String toString() {
		return "MidiaEletronica{" +
				"id=" + getId() +
				", titulo='" + getTitulo() + '\'' +
				", autor='" + getAutor() + '\'' +
				", anoPublicacao=" + getAnoPublicacao() +
				", formato='" + formato + '\'' +
				", tamanhoArquivo=" + tamanhoArquivo +
				'}';
	}
}
