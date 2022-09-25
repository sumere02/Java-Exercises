class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String talk(){
        return "Animal is talking";
    }
}

class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public String talk() {
        // TODO Auto-generated method stub
        return this.getName() + " meows.";
    }
}

class Dog extends Animal{
    
    public Dog(String name){
        super(name);
    }

    public String talk(){
        return this.getName() + " barks.";
    }
}

class Horse extends Animal {

    public Horse(String name){
        super(name);
    }

    public String talk(){
        return this.getName() + " neighs.";
    }
}

public class Main{

    //All classes are subclass of object class (Base class in java)
    public static void talk(Object object){
        //System.out.println(object.talk());
        if(object instanceof Dog) {
            Dog dog = (Dog)object;
            System.out.println(dog.talk());
        }
        else if(object instanceof Cat) {
            Cat cat = (Cat)object;
            System.out.println(cat.talk());
        }
        else if(object instanceof Horse){
            Horse horse = (Horse)object;
            System.out.println(horse.talk());
        }
        else if(object instanceof Animal) {
            Animal animal = (Animal)object;
            System.out.println(animal.talk());
        }
        else{
            System.out.println("Not an animal");
        }
    }
    public static void main(String[] args) {
        /*
        //Polymorphism
        Animal animal_1 = new Cat("Fir Fir");
        Animal animal_2 = new Dog("Karabas");
        Animal animal_3 = new Horse("Sahbatur");
        talk(animal_1);
        talk(animal_2);
        talk(animal_3); 
        System.out.println(animal_1.talk());
        System.out.println(animal_2.talk());
        System.out.println(animal_3.talk());
        */
        /*
        Dog dog_1 = new Dog("Karabas");
        //Dog (IS-A) is an animal
        if(dog_1 instanceof Animal){
            System.out.println("Animal is in dog class");
        }
        */
        Animal cat = new Cat("Fir Fir");
        Animal dog = new Dog("Karabas");
        Animal horse = new Horse("Sahbatur");
        Animal animal = new Animal("Limon");
        talk(dog);
        talk(cat);
        talk(horse);
        talk(animal);
         
    }
}