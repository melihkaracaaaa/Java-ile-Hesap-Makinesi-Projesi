package switchcasehesapmakinesi;

import java.util.Scanner;

public class SwitchCaseHesapMakinesi {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("***************");
        
        String işlemler = "1.Toplama İşlemi\n"
                + "2.Çıkarma İşlemi\n" 
                + "3.Çarpma İşlemi\n"
                + "4.Bölme İşlemi" ;
        
        System.out.println(işlemler);
        
        System.out.println("***************");

        System.out.print("İşlem seçiniz :");
        
        String işlem = scanner.nextLine();
            
        int a ;
        int b ;
        
        switch (işlem) {
                case "1":
                    System.out.print("Birinci sayı :");
                    a = scanner.nextInt();
                    
                    System.out.print("İkinci sayı :");
                    b = scanner.nextInt();
                    
                    System.out.println("Toplamları: " +  (a+b));
                    System.out.println("İşleminiz Sonlanmıştır...");

                    break ;
                case "2":
                    System.out.print("Birinci sayı :");
                    a = scanner.nextInt();
                    
                    System.out.print("İkinci sayı :");
                    b = scanner.nextInt();
                    
                    System.out.println("Farkları: " +  (a-b));
                    System.out.println("İşleminiz Sonlanmıştır...");
                    break ;
                
                case "3":
                    System.out.print("Birinci sayı :");
                    a = scanner.nextInt();
                   
                    System.out.print("İkinci sayı :");
                    b = scanner.nextInt();
                    
                    System.out.println("Çarpımları: " +  (a*b));
                    System.out.println("İşleminiz Sonlanmıştır...");

                    break;
                    
                case "4":
                    System.out.print("Birinci sayı :");
                    a = scanner.nextInt();
                   
                    System.out.print("İkinci sayı :");
                    b = scanner.nextInt();
                    
                    System.out.println("Bölümleri: " +  ((double)a/b));
                    System.out.println("İşleminiz Sonlanmıştır...");

                    break ;
                default: 
                    System.out.println("Geçersiz İşlem");
                    break;
      }
                           
   }
    
}
