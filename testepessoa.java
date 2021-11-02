package pessoa;

public class testepessoa {

	public static void main(String[] args) {

		//classePF
		pessoafisica pessoaf = new pessoafisica ("João","Pedro Gonçalves","012","solteiro");
		
		System.out.println("Nome PessoaF: " + pessoaf.getNome());
		System.out.println("Endereco : " + pessoaf.getEndereco());
		System.out.println("CPF : " + pessoaf.getCpf());
		System.out.println("Estado Civil : " + pessoaf.getEstadocivil());

		System.out.println("---------------------------");
		
		//classePJ
		pessoajuridica pessoaj = new pessoajuridica ("Casa do Pão","Ernesto brigjest","015","MEI");
		
		System.out.println("Nome PessoaJ: " + pessoaj.getNome());
		System.out.println("Endereco : " + pessoaj.getEndereco());
		System.out.println("CNPJ : " + pessoaj.getCnpj());
		System.out.println("Tipo da Empresa : " + pessoaj.getTipoempresa());
	}
}
