package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		//OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		//ogretmenKrediManager.hesapla();
		//TarimKrediManager tarimKrediManager = new TarimKrediManager();
		
		
		KrediUI krediUI = new KrediUI();
		krediUI.krediHesapla(new OgretmenKrediManager());
		krediUI.krediHesapla(new TarimKrediManager());
		krediUI.krediHesapla(new AskerKrediManager());
		
	}

}
