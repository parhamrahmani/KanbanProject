package KanbanProject.web.api;

public class BoardManipulationRequest {
    private String board_name;
    private String board_description;
    private String board_owner;
    private String board_status;

    public BoardManipulationRequest() {}
    public BoardManipulationRequest(String board_name, String board_description, String board_owner, String board_status) {
        this.board_name = board_name;
        this.board_description = board_description;
        this.board_owner = board_owner;
        this.board_status = board_status;
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
    public String getBoard_status() {
        return board_status;
    }
    public void setBoard_status(String board_status) {
        this.board_status = board_status;
    }


}
