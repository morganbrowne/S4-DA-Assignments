package DSA_Sprint1;

public class Task {
    private String name;
    private boolean status;

    public Task(String name) {
        this.name = name;
        this.status = false;
    }

    public String getName() {
        return name;
    }
    public boolean getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // add toString to show status of the task.
    // will show "completed" or "pending"
    @Override
    public String toString() {
        return name + (status ? " Completed " : " Pending ");
    }
}
