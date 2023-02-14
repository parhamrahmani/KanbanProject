package KanbanProject.persistence;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity (name = "board")
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "board_id", nullable = false)
    private long board_id;

    @Column(name = "board_name", nullable = false)
    private String board_name;

    @Column(name = "board_description", nullable = false)
    private String board_description;

    @Column(name = "board_owner", nullable = false)
    private String board_owner;

    @OneToMany(mappedBy = "board", fetch = FetchType.EAGER)
    private final List<TaskEntity> taskEntities = new ArrayList<>();

    public BoardEntity(String name, String description, String owner) {
        this.board_name = name;
        this.board_description = description;
        this.board_owner = owner;
    }

protected BoardEntity() {}

    public long getBoard_id() {
        return board_id;
    }

    public void setBoard_id(long board_id) {
        this.board_id = board_id;
    }

    public String getBoard_name() {
        return board_name;
    }

    public void setBoard_name(String name) {
        this.board_name = name;
    }

    public String getBoard_description() {
        return board_description;
    }

    public void setBoard_description(String description) {
        this.board_description = description;
    }

    public String getBoard_owner() {
        return board_owner;
    }

    public void setBoard_owner(String owner) {
        this.board_owner = owner;
    }

    public List<TaskEntity> getTaskEntities() {
        return taskEntities;
    }



}
