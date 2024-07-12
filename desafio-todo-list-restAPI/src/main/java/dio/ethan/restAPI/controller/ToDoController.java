package dio.ethan.restAPI.controller;


import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import dio.ethan.restAPI.model.ResponseToDoList;
import dio.ethan.restAPI.model.ToDo;
import dio.ethan.restAPI.service.ToDoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping(ToDoController.BASE_URL)
public class ToDoController {
    public static final String BASE_URL = "api/v1/todo";
    private static final Logger logger = Logger.getLogger(ToDoController.class.getName());

    @Autowired
    private ToDoService toDoService;

    @RequestMapping(method = RequestMethod.POST, value = "/additem")
    public ResponseEntity<ResponseToDoList> AddItemTolist(@Valid @RequestBody ToDo toDo){
        long toDoId = 0;
        toDoId = toDoService.AddItemToThelist(toDo);

        if(toDoId>0){
            ResponseToDoList responseToDoList= new ResponseToDoList("Item adicionado a lista", HttpStatus.CREATED);
            logger.info(responseToDoList.getMensagem() + ". code: " + responseToDoList.getCode());
            return new ResponseEntity<ResponseToDoList>(responseToDoList,HttpStatus.CREATED);

        }else{
            ResponseToDoList responseToDoList = new ResponseToDoList("Item não adicionado a lista", HttpStatus.BAD_REQUEST);
            logger.info(responseToDoList.getMensagem() + ". code: " + responseToDoList.getCode());
            return new ResponseEntity<ResponseToDoList>(responseToDoList,HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/atualizaritem/{atualizarToDoId}")
    public ResponseEntity<ResponseToDoList> AtualizarItem(@PathVariable long atualizarToDoId, @Valid @RequestBody ToDo toDo){

        boolean toDoIdValido = toDoService.toDoItemIdValido(atualizarToDoId);

        if(toDoIdValido){
            long toDoId = 0;
            toDoId = toDoService.AtualizarToDoItem(atualizarToDoId, toDo);

            if(toDoId > 0){
                ResponseToDoList responseToDoList= new ResponseToDoList("Item com o titulo " + toDo.getToDoTitulo() + " atualizado", HttpStatus.OK);
                logger.info(responseToDoList.getMensagem() + ". codigo: " + responseToDoList.getCode());
                return new ResponseEntity<ResponseToDoList>(responseToDoList,HttpStatus.OK);

            }else{
                ResponseToDoList responseTodoList= new ResponseToDoList("Item não foi atualizado", HttpStatus.BAD_REQUEST);
                logger.info(responseTodoList.getMensagem() + ". codigo: " + responseTodoList.getCode());
                return new ResponseEntity<ResponseToDoList>(responseTodoList,HttpStatus.BAD_REQUEST);
            }
        }else {
            ResponseToDoList responseToDoList = new ResponseToDoList("Sem sucesso, informação inválida. Por favor, tente novamente.", HttpStatus.NOT_FOUND);
            return new ResponseEntity<ResponseToDoList>(responseToDoList, HttpStatus.NOT_FOUND);
        }
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/todolist")
    public org.hibernate.mapping.List getToDoList(){
        return toDoService.getMyTodoList();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteitem/{deleteToDoId}")
    public ResponseEntity<ResponseToDoList> DeleteItem(@PathVariable long deleteTodoId){

        boolean toDoIdValido = toDoService.toDoItemIdValido(deleteTodoId);

        if(toDoIdValido){
            toDoService.DeleteItem(deleteTodoId);
                ResponseToDoList responseToDoList= new ResponseToDoList("Item deletado", HttpStatus.OK);
                logger.info(responseToDoList.getMensagem() + ". codigo: " + responseToDoList.getCode());
                return new ResponseEntity<ResponseToDoList>(responseToDoList,HttpStatus.OK);
        }else {
            ResponseToDoList responseToDoList = new ResponseToDoList("Request not successful, invalid information provided. Please try again.", HttpStatus.NOT_FOUND);

            return new ResponseEntity<ResponseToDoList>(responseToDoList, HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "/todocount")
    public long getNumeroTodo(){
        return toDoService.getNumeroTodoItem();
    }
}
