interface BasicAnimal{
    void eat();
    void sleep();

}


class monkey{
    void jump(){
        System.out.println("Jumping");
    }

    void bite(){
        System.out.println("I will bite you");
    }
}

class human extends monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating");
    }

    public void sleep(){
        System.out.println("Sleeping");
    }
}


public class oop20 {
    public static void main(String[] args) {
        human human= new human();
        BasicAnimal basicAnimal= new human();
        human.jump();
        human.bite();
        human.eat();
        human.sleep();
        basicAnimal.eat();
        basicAnimal.sleep();
        

        
    }
    
}
