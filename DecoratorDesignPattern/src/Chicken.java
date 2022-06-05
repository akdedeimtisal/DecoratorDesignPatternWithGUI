
public class Chicken extends BakedPotatoDecorator {

    public Chicken(BakedPotato bp) {
        super(bp);
    }

    @Override
    String getDescription() {
        return "You have extra chicken\n" + this.bp.getDescription();
    }

    @Override
    double cost() {
        return this.bp.cost() + 15.0;

    }

}
