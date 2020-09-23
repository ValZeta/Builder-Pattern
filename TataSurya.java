
package builder;

import java.util.ArrayList;
import java.util.List;

public class TataSurya {
    private List<BendaLangit> items = new ArrayList<BendaLangit>();
    
    public void addItem(BendaLangit item){ 
        items.add(item);
    }
    
    public void showItems(){ 
        for (BendaLangit item : items) {
            System.out.println("Nama\t\t: " + item.nama()); 
            System.out.println("Deskripsi\t: "+item.deskripsi()); 
            System.out.println("Bahan Penyusun\t: "+item.bahan().b()); 
            System.out.println("Diameter\t: "+item.ukuran()+" km");
            System.out.println();
        }
    }   
}