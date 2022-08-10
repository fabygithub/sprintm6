package curso.modulo6.sprintm6.persistence.repository;

import curso.modulo6.sprintm6.persistence.crud.IClienteCrudRepository;
import curso.modulo6.sprintm6.persistence.entity.Cliente;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * curso.modulo6.sprintm6.persistence.repository
 *
 * @author Sergio Teran on 09-08-2022
 */

@Repository
public class ClienteRepository {

    private final IClienteCrudRepository crudRepository;

    public ClienteRepository(IClienteCrudRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    public List<Cliente> getAll(){
        return (List<Cliente>) crudRepository.findAll();
    }
    public Optional<Cliente> getOne(int clienteId){
        return crudRepository.findById(clienteId);
    }
    public void delete(int clienteId){
        crudRepository.deleteById(clienteId);
    }
    public Cliente save(Cliente cap){
        return crudRepository.save(cap);
    }

    public Cliente getOneByUsuario(int usuarioId){
        return crudRepository.findOneByIdUsuario(usuarioId);
    }

}
