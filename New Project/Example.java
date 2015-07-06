import nominal.*;

public class Example{

    public static void main(String []args){
        System.out.println("Hello World");
        Dog dog = new Dog();
        RoboDog roboDog = new RoboDog();
        
        action(dog);
        action(roboDog);
        action((Dog)roboDog);
    }
    
    public static void action(Dog dog) {
       dog.bark(); 
    }  
}
