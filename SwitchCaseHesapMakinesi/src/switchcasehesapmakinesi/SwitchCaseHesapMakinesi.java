package switchcasehesapmakinesi;

import java.util.Scanner;

public class SwitchCaseHesapMakinesi {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("***************");
        
        String islemler = "1.Toplama İslemi\n"
                + "2.Cikarma İslemi\n" 
                + "3.Carpma İslemi\n"
                + "4.Bolme İslemi" ;
        
        System.out.println(islemler);
        
        System.out.println("***************");

        System.out.print("İslem seciniz :");
        
        String işlem = scanner.nextLine();
            
        int a ;
        int b ;
        
        switch (islem) {
                case "1":
                    System.out.print("Birinci sayi :");
                    a = scanner.nextInt();
                    
                    System.out.print("İkinci sayi :");
                    b = scanner.nextInt();
                    
                    System.out.println("Toplamlari: " +  (a+b));
                    System.out.println("İsleminiz Sonlanmistır...");

                    break ;
                case "2":
                    System.out.print("Birinci sayi :");
                    a = scanner.nextInt();
                    
                    System.out.print("İkinci sayi :");
                    b = scanner.nextInt();
                    
                    System.out.println("Farklari: " +  (a-b));
                    System.out.println("İsleminiz Sonlanmistir...");
                    break ;
                
                case "3":
                    System.out.print("Birinci sayi :");
                    a = scanner.nextInt();
                   
                    System.out.print("İkinci sayi :");
                    b = scanner.nextInt();
                    
                    System.out.println("Carpimlari: " +  (a*b));
                    System.out.println("İsleminiz Sonlanmiştir...");

                    break;
                    
                case "4":
                    System.out.print("Birinci sayi :");
                    a = scanner.nextInt();
                   
                    System.out.print("İkinci sayi :");
                    b = scanner.nextInt();
                    
                    System.out.println("Bolumleri: " +  ((double)a/b));
                    System.out.println("İsleminiz Sonlanmistir...");

                    break ;
                default: 
                    System.out.println("Gecersiz İslem");
                    break;
      }
                           
   }
    
}
