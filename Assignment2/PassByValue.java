package Assignment2;
public class PassByValue {
    // Method to demonstrate pass-by-value with primitive type
    public static void modifyPrimitive(int number) {
        number = 100; // Changes local copy only
        System.out.println("Inside modifyPrimitive: number = " + number);
    }

    // Method to demonstrate pass-by-value with object reference
    public static void modifyObject(Person person) {
        // Can modify object's state through the reference
        person.setName("Modified");
        // Changing the reference itself doesn't affect original value
        person = new Person("New Object");
        System.out.println("Inside modifyObject: person = " + person.getName());
    }

    // Simple Person class for demonstration
    static class Person
    {
        private String name;

        public Person(String name)
        {
            //constructor
            this.name = name;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // Demonstrate with primitive type
        int value = 10;
        System.out.println("Before modifyPrimitive: value = " + value);
        modifyPrimitive(value);
        System.out.println("After modifyPrimitive: value = " + value);

        System.out.println("\n----------------\n");

        // Demonstrate with object reference
        Person person = new Person("Original");
        System.out.println("Before modifyObject: person = " + person.getName());
        //send the object reference variable to this static method
        modifyObject(person);
        System.out.println("After modifyObject: person = " + person.getName());
    }
}