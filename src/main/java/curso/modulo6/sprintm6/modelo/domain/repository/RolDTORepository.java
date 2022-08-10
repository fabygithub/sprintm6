package curso.modulo6.sprintm6.modelo.domain.repository;

import curso.modulo6.sprintm6.modelo.domain.dto.RolDTO;

import java.util.List;
import java.util.Optional;

public interface RolDTORepository {
    Optional<List<RolDTO>> findAll();
    Optional<RolDTO> findById(int rolId);
    Optional<RolDTO> findByRolName(String rolName);
    RolDTO save(RolDTO rol);
    void delete(int rolId);
}
