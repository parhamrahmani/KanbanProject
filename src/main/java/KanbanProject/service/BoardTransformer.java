package KanbanProject.service;

import KanbanProject.persistence.BoardEntity;
import KanbanProject.persistence.TaskEntity;
import KanbanProject.web.api.Board;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class BoardTransformer {
    public Board boardTransformer(BoardEntity boardEntity)
    {
        var tasks = boardEntity.getTaskEntities().stream().map(TaskEntity::getId).toList();
        return new Board(
                boardEntity.getBoard_id(),
                boardEntity.getBoard_name(),
                boardEntity.getBoard_description(),
                boardEntity.getBoard_owner(),
                tasks
        );
    };
}
