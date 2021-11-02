package pessoa;

public class pessoajuridica extends pessoa {

	///construtor
	public pessoajuridica(String nomepessoa, String enderecopessoa, String cnpjpessoajuridica, String tipoempresapessoajuridica) {
		super(nomepessoa, enderecopessoa);
		
		cnpj=cnpjpessoajuridica;
		tipoempresa = tipoempresapessoajuridica;
	}

	//atributos
	private String cnpj;
	private String tipoempresa;
	
	//metodos
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getTipoempresa() {
		return tipoempresa;
	}
	public void setTipoempresa(String tipoempresa) {
		this.tipoempresa = tipoempresa;
	}
	
	
}
