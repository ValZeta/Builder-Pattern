
package builder;

public abstract class PlanetLuar implements BendaLangit{
    @Override
    public Penyusun_Planet bahan() { 
        return new Gas();
    }
    
    @Override
    public abstract float ukuran(); 
}