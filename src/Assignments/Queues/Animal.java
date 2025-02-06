/**
 * Assignment #5:
 * An Animal shelter, which holds only dogs and cats, operates on a strictly "first in, first out" bases.
 * People must adopt either the "oldest" (based on arrival time) of  all animals at the shelter, or they can select
 *  whether they would prefer a dog or cat (and will receive the oldest animal of that type).
 *  They cannot select which specific animal they would like.
 *  Create a datastucture to maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog and DequeueCat.
 */
package Assignments.Queues;


// Animal Class for the type of animal.
public class Animal extends AnimalShelterManager {
    private String name;
    private String type;
    private int orderOfArival;

    public Animal(String name, String type ) {
        this.name = name;
        this.type = type;
    }

    public void setOrderOfArival(int order) {
        this.orderOfArival = order;
    }

    public String getName() {
        return name;
    }
    public String geType() {
        return type;
    }
    public int  getOrderOfArival() {
        return orderOfArival;
    }



}

