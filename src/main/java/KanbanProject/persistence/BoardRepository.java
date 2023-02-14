package KanbanProject.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
    List<BoardEntity> findAll();
    List<BoardEntity> findAllByBoardName(String boardName);
    List<BoardEntity> findAllByOwner(String owner);
    List<BoardEntity> findBoardEntitiesByBoard_id(Long board_id);
}
