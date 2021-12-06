
public class AutoLuokka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auto auto1 = new Auto(5);
		Auto auto2 = new Auto(2);
		
		auto1.merkki = "Toyota";
		auto1.malli = "Corolla";
		auto1.bensanMaara = 10;
		auto1.kiihdyta();
		auto1.kiihdyta();
		auto1.naytaTiedot();
		auto1.tankkaa(5);
		
		auto2.merkki = "Honda";
		auto2.malli = "CRV";
		auto2.bensanMaara = 12;
		

		
	}

}

class Auto {
	
	public String merkki;
	public String malli;
	public int bensanMaara;
	
	public void jarruta()
	{
		System.out.println("Auto jarruttaa");
	}
	
	public void kiihdyta()
	{
		if (bensanMaara>0) {
			
		bensanMaara=bensanMaara-1;
		System.out.println("Auto kiihdyttaa");
		} else {
			System.out.println("");
		}
	}
	public void naytaTiedot()
	{
		System.out.println("Auton merkki: " + merkki);
		System.out.println("Auton malli: " + malli);
		System.out.println("Bensan m��r�: " + bensanMaara);
	}
	public Auto(int maara)
	{
		maara = 5;
	}
	public void tankkaa(int maara)
	{
		System.out.println("Tankissa bensaa: " + bensanMaara);
		System.out.println("Tankkaus: " + maara);
		System.out.println("Tankissa bensaa tankkauksen j�lkeen: " + (bensanMaara + maara));
	}
	public Auto(String autoMerkki, String autoMalli, int bensa)
	{
//		autoMerkki = "Honda";
//		autoMalli = "CRV";
//		bensa = 12;
	}
	
}