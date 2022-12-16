import species.Mammal;
import species.MammalFactory;

public class MammalDemo {
    public static void main(String[] args){
        MammalFactory mammalFactory = new MammalFactory();

        Mammal mammal1 = mammalFactory.getMammal("Human");
        mammal1.setName("Steven");
        mammal1.printInformation();

        Mammal mammal2 = mammalFactory.getMammal("Dog");
        mammal2.setName("Ruffus");
        mammal2.printInformation();

        Mammal mammal3 = mammalFactory.getMammal("Cat");
        mammal3.setName("Mollie");
        mammal3.printInformation();
    }
    
}
