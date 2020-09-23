
package builder;

public abstract class PlanetDalam implements BendaLangit{
    @Override
    public Penyusun_Planet bahan() { 
        return new BatuMineral();
    }
    
    @Override
    public abstract float ukuran();
}