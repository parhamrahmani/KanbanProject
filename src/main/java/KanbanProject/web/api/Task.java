package KanbanProject.web.api;

public class Task {
private Long task_id;
    private String task_name;
    private String task_description;
    private String task_owner;
    private String task_status;
    private Long board_id;

    public Task(Long task_id, String task_name, String task_description, String task_owner, String task_status, Long board_id) {
        this.task_id = task_id;
        this.task_name = task_name;
        this.task_description = task_description;
        this.task_owner = task_owner;
        this.task_status = task_status;
        this.board_id = board_id;
    }
    public Long getTask_id() {
        return task_id;
    }
    public void setTask_id(Long task_id) {
        this.task_id = task_id;
    }
    public String getTask_name() {
        return task_name;
    }
    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }
    public String getTask_description() {
        return task_description;
    }
    public void setTask_description(String task_description) {
        this.task_description = task_description;
    }
    public String getTask_owner() {
        return task_owner;
    }
    public void setTask_owner(String task_owner) {
        this.task_owner = task_owner;
    }
    public String getTask_status() {
        return task_status;
    }
    public void setTask_status(String task_status) {
        this.task_status = task_status;
    }
    public Long getBoard_id() {
        return board_id;
    }
    public void setBoard_id(Long board_id) {
        this.board_id = board_id;
    }

}
