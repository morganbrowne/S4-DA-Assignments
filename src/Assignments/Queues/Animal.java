package Assignments.Queues;


// Animal Class for the type of animal.
public class Animal extends AnimalShelterManager {
    private String name;
    private String type;
    private String orderOfArival;

    public Animal(String name, String type, String orderOfArival) {
        this.name = name;
        this.type = type;
        this.orderOfArival = orderOfArival;
    }
}

