
public abstract class BakedPotatoDecorator extends BakedPotato {
    BakedPotato bp;

    public BakedPotatoDecorator(BakedPotato bp) {
        this.bp = bp;
    }
    
    @Override
    abstract String getDescription();
    
    @Override
    abstract double cost();
    
}
