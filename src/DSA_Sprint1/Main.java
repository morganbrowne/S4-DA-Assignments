package DSA_Sprint1;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("John");
        user1.addTask(new Task("Do Luandary"));
        user1.addTask(new Task("Do Homework"));
        user1.addTask(new Task("Make tomorrows lunch"));
        user1.printTasks();

        user1.markTaskComplete("Do Luandary");
        user1.printTasks();
    }
}
