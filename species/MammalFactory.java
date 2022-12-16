package species;

public class MammalFactory {
    
    public Mammal getMammal(String mammalType){
        if(mammalType == null){
            return null;
        }

        if(mammalType.equalsIgnoreCase("HUMAN")){
            return new Human();
        } else if(mammalType.equalsIgnoreCase("CAT")){
            return new Cat();
        } else if(mammalType.equalsIgnoreCase("DOG")){
            return new Dog();
        }
        return null;
    }
}
