package item;

public class midia extends item {

	//atributos

	private String gravadora;
	private float duracao;

	//construtor
	public midia(int codigoitem, String descricaoitem,String gravadoramidia, float duracaomidia) {
		super(codigoitem, descricaoitem);
		gravadora = gravadoramidia;
		duracao = duracaomidia;

		//metodos

	}

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

	public float getDuracao() {
		return duracao;
	}

	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}
}
