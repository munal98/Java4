import java.util.Scanner;

public class Ornek4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Sola dayalı üçgen için 1\nSağa dayalı üçgen için 2'ye basınız.\nSeçim:");
		int seçim = sc.nextInt();
		
		if(seçim ==1) {
			//sola dayalı üçgen
			for (int i = 0; i < 5; i++) {//satır sayısına göre kurduk.
				//i=0,1,2,3,4
				for (int j = 0; j <= i; j++) {
					//j=0,1,2
					//her satırda yapılacak olan işleme göre düzenledik.
					//satır sayısı kadar yıldız yazdırılması işlemi
					System.err.print("*");
				}
				System.out.println();
			}
		}else if(seçim ==2) {
			//sağa dayalı üçgen
			for (int i = 0; i < 5; i++) {
				
				for (int j = 1; j < 5 - i; j++) {
					System.out.print(" ");					
				}
				for (int j = 0; j <= i; j++) {
					System.err.print("*");
				}
				System.out.println();
			}
			
		}else
			System.out.println("Geçersiz bir sayı girdiniz...");


	}

}
