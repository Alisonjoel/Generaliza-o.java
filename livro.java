package item;

public class livro extends item {
	
	//atributos
		
	private String autor;
	
	//construtor
	
	public livro(int codigoitem, String descricaoitem,String autorlivro) {
		super(codigoitem, descricaoitem);
		autor = autorlivro;
		
	//metodos
	
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
