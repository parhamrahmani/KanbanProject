package KanbanProject.web.api;

import java.util.List;

public class Board {
    private Long board_id;
    private String board_name;
    private String board_description;
    private String board_owner;
    private List<Task> tasks;

  public Board(Long board_id, String board_name, String board_description, String board_owner, List<Task> tasks) {
        this.board_id = board_id;
        this.board_name = board_name;
        this.board_description = board_description;
        this.board_owner = board_owner;
        this.tasks = tasks;
    }
    public Long getBoard_id() {
        return board_id;
    }

    public void setBoard_id(Long board_id) {
        this.board_id = board_id;
    }

    public String getBoard_name() {
        return board_name;
    }

    public void setBoard_name(String board_name) {
        this.board_name = board_name;
    }

    public String getBoard_description() {
        return board_description;
    }

    public void setBoard_description(String board_description) {
        this.board_description = board_description;
    }

    public String getBoard_owner() {
        return board_owner;
    }

    public void setBoard_owner(String board_owner) {
        this.board_owner = board_owner;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

}
