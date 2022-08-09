package curso.modulo6.sprintm6.domain.service;

import curso.modulo6.sprintm6.persistence.repository.ClienteRepository;
import org.springframework.stereotype.Service;

/**
 * curso.modulo6.sprintm6.domain.service
 *
 * @author Sergio Teran on 09-08-2022
 */

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }
}
