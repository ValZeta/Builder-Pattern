
package builder;

import java.util.Scanner;

public class Mars extends PlanetDalam{

    @Override
    public float ukuran() {
        return 6779f;
    }

    @Override
    public String nama() {
        return "Mars";
    }

    @Override
    public String deskripsi() {
        return "Planet terdekat keempat dari Matahari. Warnanya merah sehingga mendapatkan julukan Planet Merah";
    }
}