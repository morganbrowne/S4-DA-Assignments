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
        while (current.nextTask != null) {
            current = current.nextTask;
        }
        current.nextTask = newNode;
    }

    public void printTasks() {
        if (head.nextTask == null) {
            System.out.println("No tasks to display. ");
            return;
        }
        Node current = head.nextTask;
        while (current != null) {
            System.out.println(current.task);
            current = current.nextTask;
        }
    }

    // this method shows if the task has been comleted.
    public void completedTask(String taskName) {
        Node current = head.nextTask;
        while (current != null) {
            if (current.task.getName().equals(taskName)) {
                current.task.setStatus(true);
                System.out.println(taskName + "Is Completed. ");
                return;
            }
            current = current.nextTask;
        }
    }


}
