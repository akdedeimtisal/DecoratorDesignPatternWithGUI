
public class Sauce extends BakedPotatoDecorator{

    public Sauce(BakedPotato bp) {
        super(bp);
    }
    
    

    @Override
    String getDescription() {
        return "You have a sauce\n" + this.bp.getDescription();
    }

    @Override
    double cost() {
        return this.bp.cost() + 5.0;
    }
    
}
