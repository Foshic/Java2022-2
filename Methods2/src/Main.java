
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj = "Bugün hava çok güzel.";
		String newMsg=mesaj.substring(0,2);
		System.out.println(newMsg);
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(15, 7);
		System.out.println(sayi);
		int toplam=topla2(10,40,40);
		System.out.println(toplam);

	}

	public static void ekle() {

	}

	public static void sil() {

	}

	public static void guncelle() {

	}

	public static String sehirVer() {
		return "Ankara";
	}

	public static int  topla(int sayi1, int sayi2){
		
		return sayi1+sayi2;

	}
	public static int topla2(int... sayilar) {
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
		
		
	}

}
