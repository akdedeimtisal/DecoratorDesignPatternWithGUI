
public class BurghulSalad extends BakedPotatoDecorator {

    public BurghulSalad(BakedPotato bp) {
        super(bp);
    }

    @Override
    String getDescription() {
        return "You have extra burghul salad\n" + this.bp.getDescription();
    }

    @Override
    double cost() {
        return this.bp.cost() + 9.0;
    }

}
