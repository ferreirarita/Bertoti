package pacote;

public class Teste {
	
	public static void main(String[] args) {
	Singleton one = Singleton.getInstance("CHURRAS");
	Singleton two = Singleton.getInstance("F�rias");
	System.out.println(one.salva);
	System.out.println(two.salva);
}
}