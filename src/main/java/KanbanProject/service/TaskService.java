package KanbanProject.service;

import KanbanProject.persistence.TaskEntity;
import KanbanProject.persistence.TaskRepository;
import KanbanProject.web.api.Task;
import KanbanProject.web.api.TaskManipulationRequest;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.function.Function;


import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
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
    /* public Task create(TaskManipulationRequest task){
        var taskEntity = new TaskEntity(
                task.getTask_name(),
                task.getTask_description(),
                task.getTask_owner(),
                task.getTask_status(),
                task.getBoard_id()
        );
        taskEntity = taskRepository.save(taskEntity);
        return transformTask(taskEntity);

    } */
}


