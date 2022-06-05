
public class Main {
    public static void main(String[] args) {
        BakedPotato myBakedPatoto = new MixedBakedPotato();
        
        myBakedPatoto = new Chicken(new BurghulSalad(myBakedPatoto));
 
        System.out.println(myBakedPatoto.getDescription());
        System.out.println(myBakedPatoto.cost());
        
        BakedPotato secondBakedPatoto = new SimpleBakedPotato();
        secondBakedPatoto = new Sauce(new Chicken(secondBakedPatoto));
        
        System.out.println(secondBakedPatoto.getDescription());
        System.out.println(secondBakedPatoto.cost());
        
    }
}
