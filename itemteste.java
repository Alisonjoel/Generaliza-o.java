package item;

public class itemteste  {

	public static void main(String[] args) {
	
		
	//classeLivro
		
		livro livroteste = new livro (1,"livroteste","Emilio");
		
		System.out.println("Livro : " + livroteste.getAutor());

	//classeMidia
	    midia midiateste = new midia (2,"midiateste","grava rio",3);
	    
		System.out.println("Midia =  " +"Gravadora : "+ midiateste.getGravadora() +", Duração : " + midiateste.getDuracao());
		
	//classecd
		
		cd cdteste = new cd (3,"cdteste","gravadoracd",3,10,"Luancd","albumcd");
		
		System.out.println("CD = " + "Faixa : " +cdteste.getFaixas() +", Artista : " + cdteste.getArtista() +", Album : "+ cdteste.getAlbum());
	
	//classeVHS
		vhs vhsteste = new vhs (4,"vhsteste","gravadoravhs",4,"tituloVHS");
		System.out.println("VHS Titulo : " + vhsteste.getTitulo());
	
	}

}
