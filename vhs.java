package item;

public class vhs extends midia {

	//atributos

	private String titulo;

	//construtor
	public vhs(int codigoitem, String descricaoitem, String gravadoramidia, float duracaomidia, String titulomidia) {
		super(codigoitem, descricaoitem, gravadoramidia, duracaomidia);
		titulo = titulomidia;
	}
	
	//metodos

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
