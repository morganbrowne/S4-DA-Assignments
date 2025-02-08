/**
 * Assignment #5:
 * An Animal shelter, which holds only dogs and cats, operates on a strictly "first in, first out" bases.
 * People must adopt either the "oldest" (based on arrival time) of  all animals at the shelter, or they can select
 *  whether they would prefer a dog or cat (and will receive the oldest animal of that type).
 *  They cannot select which specific animal they would like.
 *  Create a datastucture to maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog and DequeueCat.
 */

package Assignments.Queues;

import java.util.LinkedList;
import java.util.Queue;

//
public class AnimalShelterManager {
    private Queue<Animal> dog;
    private Queue<Animal> cat;
    private int orderCount;

    //  Now have to Initialize the two animal queues into linked lists.
    //dog and cat.
    public AnimalShelterManager() {
        dog = new LinkedList<>();
        cat = new LinkedList<>();
        orderCount = 0;
    }
    // enQueue to add animal to the shelter.
    public void enQueue(Animal animal) {
        animal.setOrderOfArival(++orderCount);
        if (animal.getType().equals("dog")) {
            dog.add(animal);
        } else if (animal.getType().equals("cat")) {
            cat.add(animal);
        } else {// if user doesn't type cat or dog print...
            throw new IllegalArgumentException("Not a valid animal, must be 'dog' or 'cat'. ");
        }
    }


    // deQueueAny for both cat and dog. take the oldest of either for customer.
    public Animal deQueueAny() {
        // Check if either of the two animals are in the system.
        if (dog.isEmpty() && cat.isEmpty()) {
            System.out.println("No cats or dogs available. ");
        } // if one of the types are not available return the opposite method for said animal
        if (dog.isEmpty()) return deQueueCat();
        if (cat.isEmpty()) return deQueueDog();
        // so the .peek() gets the oldest of both types and use "<" to compare witch type came to the shelter first.
        return (dog.peek().getOrderOfArival() < cat.peek().getOrderOfArival()) ? deQueueDog() : deQueueCat();
    }



    public Animal deQueueCat() {
        if (cat.isEmpty()) {
            System.out.println("No cats available. ");
            return null;
        } else {
            return cat.poll(); // can use .poll() to get the front of queue
        }
    }

    public Animal deQueueDog() {
        if (dog.isEmpty()) {
            System.out.println("No dogs available. ");
            return null;
        } else {
            return dog.poll();
        }
    }
}





