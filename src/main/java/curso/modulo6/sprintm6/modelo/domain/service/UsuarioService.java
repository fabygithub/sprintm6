package curso.modulo6.sprintm6.modelo.domain.service;

import curso.modulo6.sprintm6.persistence.entity.Usuario;
import curso.modulo6.sprintm6.persistence.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * curso.awake.modulo6.grupal51.domain.service
 *
 * @author Sergio Teran on 02-08-2022
 */

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> getAll(){
        return repository.getAll();
    }

    public Optional<Usuario> getOne(int idUsuario){
        return repository.getOne(idUsuario);
    }
    public Usuario save(Usuario usuario){
        return repository.save(usuario);
    }
    public boolean delete(int idUsuario){
        return getOne(idUsuario).map(usuario -> {
            repository.delete(idUsuario);
            return true;
        }).orElse(false);
    }
    public Integer maxId(){
        return repository.maxId();
    }

}
