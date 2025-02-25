package DSA_Sprint1;

public class TaskLinkedList {
    private class Node {
        Task task;
        Node nextTask;

        public Node(Task task) {
            this.task = task;
            this.nextTask = null;
        }
    }

    // adding a dummy node to the head.
    private Node head;

    public TaskLinkedList() {
        head = new Node(null);
    }

    // method adding task to l
    public void addTask(Task task) {
        Node newNode = new Node(task);
        Node current = head;
    }
}
