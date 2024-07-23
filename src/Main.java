public class Main {
    public static void main(String[] args) {

        try {
            Animal animal = new Animal();
            animal.eat();
            animal.run();
            animal.swim();
            animal.jump();
            animal.roar();

            Horse horse = new Horse();
            horse.eat();
            horse.run();
            horse.swim();
            horse.jump();

            Dog dog = new Dog();
            dog.eat();
            dog.run();
            dog.swim();
            dog.jump();

            Cat cat = new Cat();
            cat.eat();
            cat.run();
            cat.swim();
            cat.jump();

            Crocodile crocodile = new Crocodile();
            crocodile.eat();
            crocodile.run();
            crocodile.swim();

            Lion lion = new Lion();
            lion.eat();
            lion.run();
            lion.swim();
            lion.jump();
            lion.roar();

            Monkey monkey = new Monkey();
            monkey.eat();
            monkey.run();
            monkey.swim();
            monkey.jump();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }


        System.out.println("Hello world!");
    }
}