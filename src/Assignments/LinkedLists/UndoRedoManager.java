package Assignments.LinkedLists;

/**
 * Assignment #4.
 * Implememt an application that support undo/redo functionality. Use a linked list to maintain a sequence of states.\
 * Each state change is stored as a node in the list, allowoing for easy navigation
 * 1<>2<>3<>4<>5
 */

public class UndoRedoManager<T> {
    private class Node {
        private T state;
        private Node prev;
        private Node next;

        private Node (T state) {
            this.state = state;
        }

    }
    private Node currentState;

    //perform an operation
    public void  addState (T newState) {
        Node newNode = new Node (newState);
        if (currentState != null) {
            newNode.prev = currentState; // The .prev allows to move backward when calling undo().
            currentState.next = newNode;
        }
        currentState = newNode;
    }
    //Undo operation
    public T undo(){
        if (currentState != null && currentState.prev != null) {
            currentState = currentState.prev;
            return currentState.state;
        }
        return null;
    }

    //Redo Operation
    public T redo(){
        if (currentState != null && currentState.next != null) {
            currentState = currentState.next;
            return currentState.state;
        }
        return null;
    }

    public static void main(String[] args) {
        UndoRedoManager<String> manager = new UndoRedoManager<>();

        manager.addState("1");
        manager.addState("2");
        manager.addState("3");

        System.out.println("Undo " + manager.undo());
        System.out.println("Undo " + manager.undo());
        System.out.println("Redo " + manager.redo());
        System.out.println("Redo " + manager.redo());
        manager.addState("4");
        manager.addState("5");

        System.out.println("Redo " + manager.undo());

        System.out.println("Redo " + manager.redo());
        System.out.println("Redo " + manager.redo());



        // System.out.println("Redo " + manager.redo());





    }
}
