package item;

public class cd extends midia {


	//atributos

	private int faixas;
	private String artista;
	private String album;

	//construtor

	public cd(int codigoitem, String descricaoitem, String gravadoramidia, float duracaomidia, int faixascd, String artistacd,String albumcd) {
		super(codigoitem, descricaoitem, gravadoramidia, duracaomidia);

		faixas = faixascd;
		artista = artistacd;
		album = albumcd;

	}
	//metodos


	public int getFaixas() {
		return faixas;
	}

	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}
}

