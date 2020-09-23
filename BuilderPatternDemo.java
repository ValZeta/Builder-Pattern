
package builder;

import java.util.Scanner;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        TataSuryaBuilder TSBuilder = new TataSuryaBuilder();
        Scanner in = new Scanner(System.in);
        for(String ulang = "y"; ulang.equals("y") || ulang.equals("Y");){
            System.out.println("DATA TATA SURYA");
            System.out.println("1. Planet Luar");
            System.out.println("2. Planet Dalam");
            System.out.print("Pilihan : ");
            int pilihan = in.nextInt();
            int pil_input;
            switch(pilihan){
                case 1:
                    TataSurya planetLuar = TSBuilder.preparePlanetLuar();              
                    planetLuar.showItems();
                    break;
                    
                case 2:
                    TataSurya planetDalam = TSBuilder.preparePlanetDalam(); 
                    planetDalam.showItems();
                    break;
                    
                default:
                    System.out.println("Menu tidak tersedia.");
                    break;
            }
            System.out.print("Ulangi? (y/n) : ");
            ulang = in.next();
            if(ulang.equals("Y") || ulang.equals("y")){
                System.out.println("\n=========================\n");
            }
            else if(ulang.equals("N") || ulang.equals("n")){
                System.out.println("Terimakasih\nSemoga wawasan Anda bertambah");
            }
        }
    }
}