package stringsDemo;

public class stringsDemo {

	public static void main(String[] args) {
		String mesaj ="Bugün hava çok güzel.";
		System.out.println(mesaj);
		
           // mesaj.lenght() ifadesi mesajdaki toplam eleman sayısını veriyor.
		System.out.println("Eleman sayısı : "+mesaj.length());
		   //+mesaj.charAt(4) 5 elemandaki harfi veriyor.
		System.out.println("5. eleman : "+mesaj.charAt(4));
           //mesaj.concat mesajın devamına ekleme yapar.
	    System.out.println(mesaj.concat(" Yaşasın!"));
	       //mesaj.startsWith mesajın başı B ile başlıyorsa true yazısı çıkar.
	    System.out.println(mesaj.startsWith("B"));
	       //mesaj.getChars mesaj kısmındaki mesajın ilk 5 harfini yazar. 
	    char[] karakterler = new char[5];
	    mesaj.getChars(0,5, karakterler,0);
	    System.out.println(karakterler);
	       //mesaj.indexOf baştan başlayarak yani sağ taraftan ilk a harfinin kaçıncı sırada olduğunu söyler. 
	    System.out.println(mesaj.indexOf("a"));
	       //mesaj.lastIndexOf sondan başlayarak yani sol taraftan başlayarak ilk a harfinin kaçıncı sırada olduğunu söyler.
	    System.out.println(mesaj.lastIndexOf("a")); 
          
		   //mesajı yenilemek için kullanılır.
		String yeniMesaj = mesaj.replace(" ", "-");
		System.out.println(yeniMesaj);
		   //mesajın istediğin bölümlerini almak için kullanılır. (Sıkça kullanılır.) 2 ve 5 dahil değil
		System.out.println(mesaj.substring(2,5));	
	       //mesajın kelimelerini alt alta yazmaya veya bölmeye yarar. (Sıklıkla kullanılır.)
	    for (String kelime : mesaj.split(" ")) {
	    	System.out.println(kelime);
	    }
	       //mesajdaki bütün harfleri küçük yazar. (Sıklıkla kullanılır.)
		System.out.println(mesaj.toLowerCase());
		   //mesajdaki bütün harfleri büyük yazar. (Sıklıkla kullanılır.)
		System.out.println(mesaj.toUpperCase());
	       //mesajdaki yanlarda kalan boşlukları birleştirir.
		System.out.println(mesaj.trim());
	
	
	} 

}
