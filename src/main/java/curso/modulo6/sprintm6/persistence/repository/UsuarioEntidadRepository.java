package curso.modulo6.sprintm6.persistence.repository;

import curso.modulo6.sprintm6.modelo.domain.dto.UsuarioEntidadDTO;
import curso.modulo6.sprintm6.modelo.domain.repository.UsuarioEntidadDTORepository;
import curso.modulo6.sprintm6.persistence.crud.UsuarioCrud;
import curso.modulo6.sprintm6.persistence.entity.UsuarioEntidad;
import curso.modulo6.sprintm6.persistence.mapping.UsuarioMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UsuarioEntidadRepository implements UsuarioEntidadDTORepository {

    private final UsuarioCrud crud;

    private final UsuarioMapper mapper;

    public UsuarioEntidadRepository(UsuarioCrud crud, UsuarioMapper mapper) {
        this.crud = crud;
        this.mapper = mapper;
    }


    @Override
    public Optional<List<UsuarioEntidadDTO>> findAll() {
        return Optional.of(mapper.toUsers((List<UsuarioEntidad>) crud.findAll()));
    }

    @Override
    public Optional<UsuarioEntidadDTO> findById(String username) {
        return crud.findById(username)
                .map(mapper::toUser);
    }

    @Override
    public UsuarioEntidadDTO save(UsuarioEntidadDTO user) {
        return mapper.toUser(crud.save(mapper.toUsuario(user)));
    }

    @Override
    public void delete(String username) {
        crud.deleteById(username);
    }

    @Override
    public boolean existsByUsername(String username) {
        return crud.existsByUsername(username);
    }

}
