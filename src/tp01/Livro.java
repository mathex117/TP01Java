package tp01;

public class Livro {

	protected String titulo;
	protected String autor;
	protected String editora;
	protected short anoedicao;

	public Livro(String Titulo, String Autor,  String Editora, short Anoedicao){
		this.titulo = Titulo;
		this.autor = Autor;
		this.editora = Editora;
		this.anoedicao = Anoedicao;	
	}

	public String getTitulo() { return titulo; }
	public void setTitulo(String titulo) { this.titulo = titulo; }
	
	public String getAutor() { return autor; }
	public void setAutor(String autor) { this.autor = autor; }

	public String getEditora() { return editora; }
	public void setEditora(String editora) { this.editora = editora; }

	public short getAnoedicao() { return anoedicao; }
	public void setAnoedicao(short anoedicao) { this.anoedicao = anoedicao; }

	public String getDados(){
		return 	"Título "+titulo+"\n"+
				"Autor "+autor+"\n"+
				"Editora "+editora+"\n"+
				"Ano "+anoedicao+"\n";
	}
}
