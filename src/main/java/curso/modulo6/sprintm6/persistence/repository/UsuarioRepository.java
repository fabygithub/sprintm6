package curso.modulo6.sprintm6.persistence.repository;


import curso.modulo6.sprintm6.persistence.crud.IUsuarioCrudRepository;
import curso.modulo6.sprintm6.persistence.entity.Profesional;
import curso.modulo6.sprintm6.persistence.entity.Usuario;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * curso.awake.modulo6.grupal51.persistence.repository
 *
 * @author Sergio Teran on 02-08-2022
 */

@Repository
public class UsuarioRepository {

    private final IUsuarioCrudRepository crudRepository;

    public UsuarioRepository(IUsuarioCrudRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    public List<Usuario> getAll(){
        return (List<Usuario>) crudRepository.findAll();
    }
    public Optional<Usuario> getOne(int idUsuario){
        return crudRepository.findById(idUsuario);
    }
    public Usuario save(Usuario usuario){
        return crudRepository.save(usuario);
    }
    public void delete(int idUsuario){
        crudRepository.deleteById(idUsuario);
    }
    public Integer maxId(){
        return crudRepository.maxId();
    }



}
