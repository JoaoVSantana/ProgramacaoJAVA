
public class Teste {
	public static void main(String[] args) {
		Animal animal = new Animal("homo sapiens", 40 , "grande");
		Cachorro doguinho = new Cachorro("canis lupus familiaris", 20, "m�dio");
	
		System.out.println(doguinho.latir());
		System.out.println(doguinho.alimentar("ra��o"));
		System.out.println(doguinho.repousar(5, "min"));
		
		Animal bicho = new Animal();
		
		//bicho = new Cachorro ("canis lupus familiaris", 20, "m�dio");
		
		//Cachorro dog2 = (Cachorro)bicho;
		
		System.out.println(bicho.reproduzir());
		System.out.println(doguinho.reproduzir());
		
	
	}
}
