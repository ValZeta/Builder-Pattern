
package builder;

import java.util.Scanner;


public class TataSuryaBuilder {
    
    public TataSurya preparePlanetLuar (){ 
        Scanner in = new Scanner(System.in);
        TataSurya TS = new TataSurya(); 
        System.out.print("Masukkan nama Planet  : ");
        String pil = in.next();
        String pil2 = pil.toLowerCase();
        if(pil2.equals("jupiter")){
            System.out.println();
            System.out.println("=========================\nPlanet Luar Sabuk Asteroid"); 
            TS.addItem(new Jupiter());
        }
        else if(pil2.equals("neptunus")){
            System.out.println();
            System.out.println("=========================\nPlanet Luar Sabuk Asteroid"); 
            TS.addItem(new Neptunus());
        }
        else if(pil2.equals("saturnus")){
            System.out.println();
            System.out.println("=========================\nPlanet Luar Sabuk Asteroid"); 
            TS.addItem(new Saturnus());
        }
        else if(pil2.equals("uranus")){
            System.out.println();
            System.out.println("=========================\nPlanet Luar Sabuk Asteroid"); 
            TS.addItem(new Uranus());
        }
        else{
            System.out.println("Tidak ada data\nCoba ketikkan: 'jupiter', 'saturnus', 'neptunus', 'uranus',");
        }
        return TS;
    }
    
    public TataSurya preparePlanetDalam (){ 
        Scanner in = new Scanner(System.in);
        TataSurya TS = new TataSurya();
        System.out.print("Masukkan nama Planet  : ");
        String pil = in.next();
        String pil2 = pil.toLowerCase();
        if(pil2.equals("bumi")){
            System.out.println();
            System.out.println("=========================\nPlanet Dalam Sabuk Asteroid"); 
            TS.addItem(new Bumi());
        }
        else if(pil2.equals("mars")){
            System.out.println();
            System.out.println("=========================\nPlanet Dalam Sabuk Asteroid"); 
            TS.addItem(new Mars());
        }
        else if(pil2.equals("merkurius")){
            System.out.println();
            System.out.println("=========================\nPlanet Dalam Sabuk Asteroid"); 
            TS.addItem(new Merkurius());
        }
        else if(pil2.equals("venus")){
            System.out.println();
            System.out.println("=========================\nPlanet Dalam Sabuk Asteroid"); 
            TS.addItem(new Venus());
        }
        else{
            System.out.println("Tidak ada data\nCoba ketikkan: 'merkurius', 'venus', 'bumi', 'mars',");
        }
        return TS;
    }
}