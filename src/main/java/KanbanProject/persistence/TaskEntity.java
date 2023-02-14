package KanbanProject.persistence;

import javax.persistence.*;

@Entity (name = "task")
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "task_name", nullable = false)
    private String task_name;

    @Column(name = "task_description", nullable = false)
    private String task_description;

    @Column(name = "task_status", nullable = false)
    private String task_status;

    @Column(name = "owner", nullable = false)
    private String task_owner;

    @ManyToOne(cascade = CascadeType.MERGE, targetEntity = BoardEntity.class)
    private BoardEntity board;

    protected TaskEntity() {}

    public TaskEntity(String name, String description, String status, String owner, BoardEntity board) {
        this.task_name = name;
        this.task_description = description;
        this.task_status = status;
        this.task_owner = owner;
        this.board = board;
    }
    public String getTask_name() {
        return task_name;
    }
    public void setTask_name(String name) {this.task_name = name;}
    public String getTask_description() {
        return task_description;
    }
    public void setTask_description(String description) {
        this.task_description = description;
    }
    public String getTask_status() {
        return task_status;
    }
    public void setTask_status(String status) {
        this.task_status = status;
    }
    public String getTask_owner() {
        return task_owner;
    }
    public void setTask_owner(String owner) {
        this.task_owner = owner;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long task_id) {
        this.id = task_id;
    }
    public BoardEntity getBoard() {
        return board;
    }
    public void setBoard(BoardEntity board) {
        this.board = board;
    }
}
