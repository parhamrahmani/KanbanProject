package KanbanProject.service;

import KanbanProject.persistence.BoardRepository;
import KanbanProject.persistence.TaskEntity;
import KanbanProject.persistence.TaskRepository;
import KanbanProject.web.api.Task;
import KanbanProject.web.api.TaskManipulationRequest;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    private final BoardRepository boardRepository;
    public TaskService(TaskRepository taskRepository, BoardRepository boardRepository) {
        this.taskRepository = taskRepository;
        this.boardRepository = boardRepository;
    }
    private Task transformTask (TaskEntity taskEntity){
       return new Task(
               taskEntity.getId(),
                taskEntity.getTask_name(),
                taskEntity.getTask_owner(),
                taskEntity.getTask_description(),
                taskEntity.getTask_status(),
                taskEntity.getBoard().getBoard_id()
       );
    }
    public List<Task> finaAll(){
        List<TaskEntity> taskEntities = taskRepository.findAll();
        return taskEntities.stream().map(this::transformTask).toList();
    }
    public Task findById(long id){
var taskEntity = taskRepository.findById(id);
    return taskEntity.stream().map(this::transformTask).findFirst().orElse(null);
    }
    public Task createTask(TaskManipulationRequest request){
        var board = boardRepository.findById(request.getBoard_id()).orElse(null);
        var taskEntity = new TaskEntity(request.getTask_name(),request.getTask_owner(),request.getTask_description(),request.getTask_status(),board);
        taskEntity = taskRepository.save(taskEntity);
        return transformTask(taskEntity);
    }

    public Task editTask(long id, TaskManipulationRequest request){
        TaskEntity taskEntity = taskRepository.findById(id).stream().findFirst().orElse(null);
        if(taskEntity == null) return null;
        taskEntity.setTask_name(request.getTask_name());
        taskEntity.setTask_owner(request.getTask_owner());
        taskEntity.setTask_description(request.getTask_description());
        taskEntity.setTask_status(request.getTask_status());
        taskEntity = taskRepository.save(taskEntity);
        return transformTask(taskEntity);
    }

    public boolean deleteTask(long id){
        if(!taskRepository.existsById(id)) return false;
        taskRepository.deleteById(id);
        return true;
    }
}


