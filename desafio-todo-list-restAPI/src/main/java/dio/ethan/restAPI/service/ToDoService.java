package dio.ethan.restAPI.service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.logging.Logger;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dio.ethan.restAPI.repository.ToDoRepository;
import dio.ethan.restAPI.model.ToDo;

@Service
public class ToDoService {
    private static Logger logger = Logger.getLogger(ToDoService.class.getName());
    @Autowired
    private ToDoRepository toDoRepository;

    /**
     * @return
     */
    public List<ToDo> getMyTodoList(){
        List<ToDo> toDoList= new ArrayList<>();
        toDoRepository.findAll().forEach(toDoList::add);

        return  toDoList;
    }

    public Optional<ToDo> GetTodoByID(long toDoId) {
        return toDoRepository.findById(toDoId);
    }

    public long AddItemToThelist(ToDo toDo) {
        long toDoId = 0;
        toDoRepository.save(toDo);
        toDoId = toDo.getToDoId();
        return toDoId;
    }

    public void DeleteItem(long id){
        toDoRepository.deleteById(id);
        logger.info("Item removido da lista");
    }

    public long AtualizarToDoItem(long toDoId, ToDo toDo) {
        long toDoAtualizar = 0;
        try {
            ToDo toDoAtualizado = toDoRepository.findById(toDoId).get();
            // Atualiza os campos do toDoAtualizado com os dados de toDo
            toDoRepository.save(toDoAtualizado);
            toDoAtualizar = toDoAtualizado.getToDoId();
            return toDoAtualizar;
        } catch (Exception e) {
            e.printStackTrace(); // Evitar usar printStackTrace() em produção
        }
        return toDoAtualizar;
    }

    public boolean toDoItemIdValido(long toDoId){
        return toDoRepository.findById(toDoId).isPresent();
    }

    public long getNumeroTodoItem(){
        return toDoRepository.count();
      }
}
