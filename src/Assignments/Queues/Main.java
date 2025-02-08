package Assignments.Queues;

public class Main {
    public static void main(String[] args) {
        AnimalShelterManager shelter = new AnimalShelterManager();

        shelter.enQueue(new Animal("Dexter", "dog"));
        shelter.enQueue(new Animal("Kramer", "dog"));
        shelter.enQueue(new Animal("Melvin", "cat"));
        shelter.enQueue(new Animal("Whiskers", "cat"));
        shelter.enQueue(new Animal("Max", "dog"));


        System.out.println("You chose to take either a dog or cat. you got a " + shelter.deQueueCat().getType() + ". and their name is " +shelter.deQueueCat().getName());

    }
}
