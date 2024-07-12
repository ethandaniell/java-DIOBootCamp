package dio.ethan.restAPI.model;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "todo")
@AllArgsConstructor
@NoArgsConstructor
public class ToDo {
    @Id
    @SequenceGenerator(name = "todo_seq", initialValue = 1110, allocationSize = 101)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "todo_seq")
    @Column(name = "todo_item_id", updatable = false, nullable = false)
    private long ToDoId;

    @NotBlank
    @Size(min = 5, message = "Uma descrição deve ter pelo menos 5 letras")
    @Column(name = "todo_titulo")
    private String toDoTitulo;

    @Column(name = "is_completo")
    private boolean isCompleto;

    @FutureOrPresent
    @Column(name = "todo_data")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-aaaa")
    @Temporal(TemporalType.DATE)
    private Date toDoData;


    public long getToDoId() {
        return this.ToDoId;
    }

    public void setToDoId(long ToDoId) {
        this.ToDoId = ToDoId;
    }

    public String getToDoTitulo() {
        return this.toDoTitulo;
    }

    public void setToDoTitulo(String toDoTitulo) {
        this.toDoTitulo = toDoTitulo;
    }

    public boolean isCompleto() {
        return isCompleto;
    }

    public void setCompleto(boolean complete) {
        isCompleto = complete;
    }


    public Date getToDoData() {
        return this.toDoData;
    }

    public void setToDoData(Date toDoData) {
        this.toDoData = toDoData;
    }

}
