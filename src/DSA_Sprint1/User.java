package DSA_Sprint1;

public class User {
    private String userName;
    private TaskLinkedList tasklist;

    public User(String userName) {
        this.userName = userName;
        this.tasklist = new TaskLinkedList();
    }

    public String getName() {
        return userName;
    }
    public TaskLinkedList getTaskList() {
        return tasklist;
    }

    public void addTask(Task task) {
        tasklist.addTask(task);
    }

    public void markTaskComplete(String name) {
        tasklist.completedTask(name);
    }

    public void printTasks() {
        System.out.println("Tasks for " + userName + ":");
        tasklist.printTasks();
    }
}
