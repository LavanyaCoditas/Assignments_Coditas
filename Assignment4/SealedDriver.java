package Assignment4;

public class SealedDriver {
    public static void main(String[] args) {


        Dog dog = new Dog("my dogga");
        Cat cat = new Cat("boko");
        cat.Sound();
        System.out.println("\n");
        dog.Sound();
    }
}
sealed abstract class Animal permits Dog,Cat
{

    public abstract void  Sound( ) ;


}
final class Dog extends Animal
{
    String name;
    public Dog( String name)
    {
       this.name=name;
    }

    @Override
    public void Sound()
    {
        System.out.println(name+" makes a very unique sound : as  bawww bawww baww");
    }
}
non-sealed class Cat extends Animal

{
    String name;
    public Cat(String name)
    {
        this.name=name ;
    }
@Override
public void Sound( )
{
    System.out.println(name+" make a meoww meoww sound here in cat class");
}


}