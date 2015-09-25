
public class Matboks {
	private int sjokolader;
	private int volum;
	
	public Matboks(int volum) {
		this.volum = volum;
	}
	
	public void leggInn(int antall) {
		sjokolader += antall;
	}
	
	public int taUt(int antall) {
		int faktiskAntall = 0;
	
		if(antall > sjokolader) {
			faktiskAntall = sjokolader;
			sjokolader = 0;
		}
		else {
			faktiskAntall = antall;
			sjokolader -= antall;
		}
		
		return faktiskAntall;
	}
	
	public void skrivAntall() {
		System.out.println("Det er " + sjokolader + " sjokolader i boksen");
	}
	
}
