package senai.org.br.bibliotecavirtual;

public class Livro extends ItemBiblioteca {

	private String genero;
	private Integer numPaginas;

	public Livro(Integer id, String titulo, String autor, Integer anoPublicacao, String genero, Integer numPaginas) {
		super(id, titulo, autor, anoPublicacao);
		this.genero = genero;
		this.numPaginas = numPaginas;
	}
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(Integer numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	public Double calcularPrecoVenda() {
		double precoPorPagina = 0.10;
		double precoFinal = precoPorPagina * numPaginas;
		return precoFinal;
	}
	public void  informacoesDetalhadas() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Livro{" +
				"id=" + getId() +
				", titulo='" + getTitulo() + '\'' +
				", autor='" + getAutor() + '\'' +
				", anoPublicacao=" + getAnoPublicacao() +
				", genero='" + genero + '\'' +
				", numPaginas=" + numPaginas +
				'}';
	}
}


