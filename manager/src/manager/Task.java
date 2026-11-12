package manager;

public class Task {
    //atributos
    private String description;
    private boolean completed;

    //construtor
    public Task(String description, boolean completed) {
        this.description = description;
        this.completed = completed;
    }

    public Task(String description) {
        this.description = description;
    }

    //sets e gets
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
