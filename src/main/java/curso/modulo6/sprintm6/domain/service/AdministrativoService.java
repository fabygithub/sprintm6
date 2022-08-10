package curso.modulo6.sprintm6.domain.service;

import curso.modulo6.sprintm6.persistence.entity.Administrativo;
import curso.modulo6.sprintm6.persistence.repository.AdministrativoRepository;
import org.springframework.stereotype.Service;

/**
 * curso.modulo6.sprintm6.domain.service
 *
 * @author Sergio Teran on 09-08-2022
 */

@Service
public class AdministrativoService {

    private final AdministrativoRepository repository;

    public AdministrativoService(AdministrativoRepository repository) {
        this.repository = repository;
    }

    public Administrativo save(Administrativo administrativo){
        return repository.save(administrativo);
    }
}
