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
    public void enQueue() {


    }











}





