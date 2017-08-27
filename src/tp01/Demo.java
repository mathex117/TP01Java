package tp01;

public class Demo {

	public static void main(String[] args) {

		//Cria o objeto L1
		LivroDeBiblioteca L1 =
				new LivroDeBiblioteca("Introdução à POO usando JAVA",
				"Prof. Rafael Santos", "Campus/SBC", (short)2003, "g11p17");

		//Exibe os dados do objeto
		System.out.println(L1.getDados());

		//Verifica se o livro está disponível e se estiver empresta
		if(!L1.getEmprestado()){
			L1.Empresta();
			System.out.println("O livro Introducao a POO usando JAVA foi emprestado com sucesso! Deverá ser devolvido em 7 dias.");
		}else{
			String msg = "Para testar a possibilidade de se solicitar o empréstimo de um livro já emprestado repita o procedimento acima.";
			System.out.println(msg);
		}
	}

}
