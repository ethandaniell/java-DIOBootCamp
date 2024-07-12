package dio.ethan.restAPI.repository;

import org.springframework.data.repository.CrudRepository;

import dio.ethan.restAPI.model.ToDo;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {
    
}
