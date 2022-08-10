package curso.modulo6.sprintm6.web.controller;

import curso.modulo6.sprintm6.modelo.domain.service.ProfesionalService;
import curso.modulo6.sprintm6.modelo.domain.service.UsuarioService;
import curso.modulo6.sprintm6.persistence.entity.Profesional;
import curso.modulo6.sprintm6.persistence.entity.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * curso.modulo6.sprintm6.web.controller
 *
 * @author Sergio Teran on 09-08-2022
 */

@Controller
@RequestMapping("/profesional")
public class ProfesionalController {

    private final ProfesionalService service;
    private final UsuarioService uService;


    public ProfesionalController(ProfesionalService service, UsuarioService uService) {
        this.service = service;
        this.uService = uService;
    }

    @PostMapping("/save")
    public String profesionalSave(@RequestParam("id") int id, @RequestParam("nombre") String nombre, @RequestParam("fecha") String fecha,
                                  @RequestParam("idProf") int idProf, @RequestParam("titulo") String titulo, @RequestParam("fechaIng") String fechaIng){

        Usuario usuario = new Usuario();

        usuario.setUsuarioId(id);
        usuario.setUsuarioNombre(nombre);
        usuario.setUsuarioFechaNac(fecha);
        usuario.setUsuarioTipo(2);

        uService.save(usuario);

        Profesional profesional = new Profesional();
        profesional.setId(idProf);
        profesional.setTitulo(titulo);
        profesional.setFecha(fechaIng);
        profesional.setIdUsuario(uService.maxId());

        service.save(profesional);

        return "inicio";
    }


}
