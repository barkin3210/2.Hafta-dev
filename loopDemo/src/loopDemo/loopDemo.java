package loopDemo;

public class loopDemo {

	public static void main(String[] args) {
		// For
		// i++ i yi bir bir arttır
		// i+=2 i yi iki iki arttır
		for (int i = 2; i < 10; i+=2) {
			System.out.println(i);
	
		}
		System.out.println("For Döngüsü bitti");
	    int i=2;
	    //While 
	    while(i<10) {
	    	System.out.println(i);
	    	i++ ;
	     }
	    System.out.println("While Döngüsü Bitti");
	    
	    
	    //Do-While
	    int j=1;
	    do {
	    	System.out.println(j);
	    	j+=2;
	    	
	    	}while(j<10);
	    System.out.println("Do-While Döngüsü Bitti");

	}
}

