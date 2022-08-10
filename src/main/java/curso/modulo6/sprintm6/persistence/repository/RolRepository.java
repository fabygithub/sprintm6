package curso.modulo6.sprintm6.persistence.repository;

import curso.modulo6.sprintm6.modelo.domain.dto.RolDTO;
import curso.modulo6.sprintm6.modelo.domain.repository.RolDTORepository;
import curso.modulo6.sprintm6.persistence.crud.RolCrud;
import curso.modulo6.sprintm6.persistence.entity.RolEntity;
import curso.modulo6.sprintm6.persistence.mapping.RolMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RolRepository implements RolDTORepository {
    private final RolCrud crud;
    private final RolMapper mapper;

    public RolRepository(RolCrud crud, RolMapper mapper) {
        this.crud = crud;
        this.mapper = mapper;
    }

    @Override
    public Optional<List<RolDTO>> findAll() {
        return Optional.of(mapper.toRols((List<RolEntity>) crud.findAll()));
    }

    @Override
    public Optional<RolDTO> findById(int rolId) {
        return crud.findById(rolId)
                .map(mapper::toRol);
    }

    @Override
    public Optional<RolDTO> findByRolName(String rolName) {
        return crud.findByRolName(rolName)
                .map(mapper::toRol);
    }

    @Override
    public RolDTO save(RolDTO rol) {
        return mapper.toRol(crud.save(mapper.toRolEntity(rol)));
    }

    @Override
    public void delete(int rolId) {
        crud.deleteById(rolId);
    }
}
