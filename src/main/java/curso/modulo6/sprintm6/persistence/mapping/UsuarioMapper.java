package curso.modulo6.sprintm6.persistence.mapping;

import curso.modulo6.sprintm6.modelo.domain.dto.UsuarioEntidadDTO;
import curso.modulo6.sprintm6.persistence.entity.UsuarioEntidad;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {RolMapper.class})
public interface UsuarioMapper {
    @Mappings({
            @Mapping(source = "username", target = "username"),
            @Mapping(source = "password", target = "password"),
            @Mapping(source = "enable", target = "enabled"),
            @Mapping(source = "roles", target = "rols"),
    })
    UsuarioEntidadDTO toUser(UsuarioEntidad user);
    List<UsuarioEntidadDTO> toUsers(List<UsuarioEntidad> users);
    @InheritInverseConfiguration
    UsuarioEntidad toUsuario(UsuarioEntidadDTO user);
}
