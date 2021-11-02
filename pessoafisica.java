package pessoa;

public class pessoafisica extends pessoa {

	//coonstrutor
	public pessoafisica(String nomepessoa, String enderecopessoa, String cpfpessoafisica, String estadocivilpessoafisica) {
		super(nomepessoa, enderecopessoa);
		cpf=cpfpessoafisica;
		estadocivil=estadocivilpessoafisica;
	}

	//atributos
	
	private String cpf;
	private String estadocivil;
	
	
	//metodos
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
	
}
	
