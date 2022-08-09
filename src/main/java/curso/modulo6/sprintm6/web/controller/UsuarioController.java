package curso.modulo6.sprintm6.web.controller;

import curso.modulo6.sprintm6.domain.service.ProfesionalService;
import curso.modulo6.sprintm6.domain.service.UsuarioService;
import curso.modulo6.sprintm6.persistence.entity.Profesional;
import curso.modulo6.sprintm6.persistence.entity.Usuario;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * curso.awake.modulo6.grupal51.web.controller
 *
 * @author Sergio Teran on 02-08-2022
 */

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    Log logger = LogFactory.getLog(InicioController.class);

    private final UsuarioService service;
    private final ProfesionalService pService;

    public UsuarioController(UsuarioService service, ProfesionalService pService) {
        this.service = service;
        this.pService = pService;
    }

    @GetMapping("/listar")
    public String usuarioListar(Model model){
        model.addAttribute("usuarios", service.getAll());
        return "usuarioList";
    }

    @GetMapping("/new")
    public String usuarioNew(){
        return "usuarioNew";
    }

    @PostMapping("/save")
    public String profesionalSave(@RequestParam("id") int id, @RequestParam("nombre") String nombre, @RequestParam("fecha") String fecha,
                                  @RequestParam("idProf") int idProf, @RequestParam("titulo") String titulo, @RequestParam("fechaIng") String fechaIng){

        Usuario usuario = new Usuario();

        usuario.setUsuarioId(id);
        usuario.setUsuarioNombre(nombre);
        usuario.setUsuarioFechaNac(fecha);
        usuario.setUsuarioTipo(2);

        service.save(usuario);

        Profesional profesional = new Profesional();
        profesional.setId(idProf);
        profesional.setTitulo(titulo);
        profesional.setFecha(fechaIng);
        profesional.setIdUsuario(service.maxId());

        pService.save(profesional);

        return "inicio";
    }


}
