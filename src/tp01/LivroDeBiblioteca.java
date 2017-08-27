package tp01;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{

	private boolean emprestado;
	private String localizacao;

	public LivroDeBiblioteca(String Titulo, String Autor,  String Editora, short Anoedicao, String Localizacao){
		super(Titulo, Autor, Editora, Anoedicao);
		this.localizacao = Localizacao;
		emprestado = false;
	}

	@Override
	public boolean getEmprestado() { return this.emprestado; }

	@Override
	public String getLocalizacao() { return this.localizacao; }

	@Override
	public void Empresta() { this.emprestado = true; }

	@Override
	public void Devolve() { this.emprestado = false; }

	public String getDados(){
		return 	"Título "+titulo+"\n"+
				"Autor "+autor+"\n"+
				"Editora "+editora+"\n"+
				"Ano "+anoedicao+
				"Localização "+localizacao+"\n";
	}
}
