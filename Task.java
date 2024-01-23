public class Task {
    private String name;
    private String dueDate;
    private boolean completed;
     
    public Task(String name, String dueDate, boolean completed) {
        this.name = name;
        this.dueDate = dueDate;
        this.completed = completed;
    }
    
    public String getTaskName() {
    	return name;
    }
    
    void setTaskName(String newName) {
    	name = newName;
    }
    
    public String getDueDate() {
    	return dueDate;
    }
    
    void setDueDate(String newDueDate) {
    	dueDate = newDueDate;
    }
    
    public void setCompleted(Boolean newStatus) {
    	completed = newStatus; 
    }
    
    public boolean isCompleted() {
    	return completed;
    }
}
