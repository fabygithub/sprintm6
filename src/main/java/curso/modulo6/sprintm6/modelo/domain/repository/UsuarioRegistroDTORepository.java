package curso.modulo6.sprintm6.modelo.domain.repository;

import curso.modulo6.sprintm6.modelo.domain.dto.UsuarioRegistroDTO;

import java.util.List;
import java.util.Optional;

public interface UsuarioRegistroDTORepository {

    Optional<List<UsuarioRegistroDTO>> findAll();
    Optional<UsuarioRegistroDTO> findById(int studentId, int gradeId);
    UsuarioRegistroDTO save(UsuarioRegistroDTO register);
    void delete(int studentId, int gradeId);

}
