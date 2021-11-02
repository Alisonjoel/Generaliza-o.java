package item;

public class item {

	
	//atributos
	private int codigo;
	private String descricao;
	
	//construtor
	
	public item (int codigoitem, String descricaoitem) {
		codigo = codigoitem;
		descricao = descricaoitem;
	}
	
	//metodos
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
