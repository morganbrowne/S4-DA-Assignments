package Assignments.Queues;

public class Main {
    public static void main(String[] args) {
        AnimalShelterManager shelter = new AnimalShelterManager();

        shelter.enQueue(new Animal("Dexter", "dog"));
        shelter.enQueue(new Animal("Kramer", "dog"));
        shelter.enQueue(new Animal("Melvin", "cat"));
        shelter.enQueue(new Animal("Whiskers", "cat"));
        shelter.enQueue(new Animal("Max", "dog"));


        //System.out.println("You chose to take either a dog or cat. you got a " + shelter.deQueueCat().getType() + ". and their name is " +shelter.deQueueCat().getName());

        // Taking a cat
        Animal adotpedAnimalCat = shelter.deQueueCat();
        if (adotpedAnimalCat != null) {
            System.out.println("You chose to take a cat, their name is: " + adotpedAnimalCat.getName());
        } else {
            System.out.println("No cat available for adoption. ");
        }

        // For taking a dog.
        Animal adoptedAnimalDog = shelter.deQueueDog();
        if (adoptedAnimalDog != null) {
            System.out.println("You chose to take a  dog, their name is: " + adoptedAnimalDog.getName());
        } else {
            System.out.println("No dogs available for adoption. ");
        }
    }
}
