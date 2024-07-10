package dio.web.api.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import dio.web.api.handler.BussinesException;
import dio.web.api.model.Usuario;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if(usuario.getLogin() == null) 
            throw new BussinesException("O campo login é obrigatorio.");

        if(usuario.getId() == null) 
            System.out.println("SAVE - Recebendo o usuário na camada de repositorio");
        else 
            System.out.println("UPDATE - Recebendo o usuário na camada de repositorio");

        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson", "senha"));
        usuarios.add(new Usuario("frank", "senha"));
        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo id: %d para localizar um usuário", id));
        return new Usuario("gleyson", "senha");
    }

    public Usuario findByUser(String username) {
        System.out.println(String.format("FINF/username - Recebendo o username: %s para localizar um usuário", username));
        return new Usuario("gleyson", "senha");
    }
}
