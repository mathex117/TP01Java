package tp01;

public class Demo {

	public static void main(String[] args) {

		//Cria o objeto L1
		LivroDeBiblioteca L1 =
				new LivroDeBiblioteca("Introdu��o � POO usando JAVA",
				"Prof. Rafael Santos", "Campus/SBC", (short)2003, "g11p17");

		//Exibe os dados do objeto
		System.out.println(L1.getDados());

		//Verifica se o livro est� dispon�vel e se estiver empresta
		if(!L1.getEmprestado()){
			L1.Empresta();
			System.out.println("O livro Introducao a POO usando JAVA foi emprestado com sucesso! Dever� ser devolvido em 7 dias.");
		}else{
			String msg = "Para testar a possibilidade de se solicitar o empr�stimo de um livro j� emprestado repita o procedimento acima.";
			System.out.println(msg);
		}
	}

}
