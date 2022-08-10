package curso.modulo6.sprintm6.modelo.domain.service;

import curso.modulo6.sprintm6.modelo.domain.dto.RolDTO;
import curso.modulo6.sprintm6.modelo.domain.dto.UsuarioEntidadDTO;
import curso.modulo6.sprintm6.modelo.domain.repository.UsuarioEntidadDTORepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UsuarioEntidadService implements UserDetailsService {

    private final UsuarioEntidadDTORepository repository;


    public UsuarioEntidadService(UsuarioEntidadDTORepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //return new User("brian", "{noop}kupita", new ArrayList<>());
        UsuarioEntidadDTO user = repository.findById(username)
                .orElseThrow(()-> new UsernameNotFoundException("User not found"));
        return new User(user.getUsername()
                , user.getPassword()
                , user.isEnabled()
                , true
                , true
                , true
                , mapperRols(user.getRols()));
    }

    private Collection<? extends GrantedAuthority> mapperRols(List<RolDTO> rols){
        return rols.stream()
                .map(rolDTO -> new SimpleGrantedAuthority(rolDTO.getRolName()))
                .collect(Collectors.toList());
    }

}

