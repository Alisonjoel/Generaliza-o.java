package pessoa;

public class pessoa {

	//atributos
	private String nome;
	private String endereco;
	
	//construtor
	
	public pessoa (String nomepessoa, String enderecopessoa) {
		nome = nomepessoa;
		endereco = enderecopessoa;
	}

	//metodos 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
