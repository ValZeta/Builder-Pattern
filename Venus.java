
package builder;

import java.util.ArrayList;

public class Venus extends PlanetLuar{
    @Override
    public float ukuran() { 
        return 12104f;
    }
    @Override
    public String nama() { 
        return "Venus";
    }
    @Override
    public String deskripsi() { 
        return "Planet terdekat kedua dari Matahari dan tidak memiliki satelit alami";
    }  
}