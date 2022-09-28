package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
	      DortIslem dortIslem = new DortIslem();
	      int Toplama = dortIslem.Topla(3, 4);
	      int Çıkarım = dortIslem.Cikar(5, 2);
	      int Bölme = dortIslem.Bol(8, 2);
	      int Çarpma = dortIslem.Carp(4, 6);
	      
	      System.out.println("Toplam: "+ Toplama);
	      System.out.println("Çıkarma: "+ Çıkarım);
	      System.out.println("Bölme: "+ Bölme);
	      System.out.println("Çarpma: "+ Çarpma);

	}

}
