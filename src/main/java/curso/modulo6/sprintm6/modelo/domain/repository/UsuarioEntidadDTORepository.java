package curso.modulo6.sprintm6.modelo.domain.repository;

import curso.modulo6.sprintm6.modelo.domain.dto.UsuarioEntidadDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface UsuarioEntidadDTORepository{

    Optional<List<UsuarioEntidadDTO>> findAll();
    Optional<UsuarioEntidadDTO> findById(String username);
    UsuarioEntidadDTO save(UsuarioEntidadDTO user);
    void delete(String username);
    boolean existsByUsername(String username);
}
