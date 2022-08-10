package curso.modulo6.sprintm6.web.controller;

import curso.modulo6.sprintm6.domain.service.AdministrativoService;
import curso.modulo6.sprintm6.domain.service.UsuarioService;
import curso.modulo6.sprintm6.persistence.entity.Administrativo;
import curso.modulo6.sprintm6.persistence.entity.Usuario;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * curso.modulo6.sprintm6.web.controller
 *
 * @author Sergio Teran on 10-08-2022
 */

@Controller
@RequestMapping("/administrativo")
public class AdministrativoController {

    Log logger = LogFactory.getLog(InicioController.class);

    private final AdministrativoService service;
    private final UsuarioService uService;

    public AdministrativoController(AdministrativoService service, UsuarioService uService) {
        this.service = service;
        this.uService = uService;
    }
    @PostMapping("/save")
    public String administrativoSave(@ModelAttribute Administrativo administrativo){
        service.save(administrativo);
        return "redirect:/usuario/listar";
    }

    @GetMapping("/edit/{usuarioId}")
    public String administrativoEdit(@PathVariable("usuarioId") int usuarioId, Model model){
        Usuario u = new Usuario();
        u = uService.getOne(usuarioId).orElse(null);
        model.addAttribute("nombreUsuario", u.getUsuarioNombre());
        model.addAttribute("fechaNacimiento", u.getUsuarioFechaNac());
        model.addAttribute("administrativo", service.getOneByIdUsuario(usuarioId));
        return "administrativoEdit";
    }

}
