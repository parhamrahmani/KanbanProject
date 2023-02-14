package KanbanProject.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
    List<TaskEntity> findAll();
    List<TaskEntity> findAllByTaskName(String taskName);
    List<TaskEntity> findAllByOwner(String owner);
    List<TaskEntity> findTaskEntitiesByTask_id(Long task_id);
    List<TaskEntity> findTaskEntitiesByBoard(BoardEntity board);
    List<TaskEntity> findTaskEntitiesByStatus(String status);
}
