package species;
public class Dog implements Mammal {
    String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printInformation(){
        System.out.println("I am a "+this.getClass().getSimpleName()+" and my name is " + this.name);
    }
}