package curso.modulo6.sprintm6.web.controller;

import curso.modulo6.sprintm6.domain.service.ClienteService;
import curso.modulo6.sprintm6.domain.service.UsuarioService;
import curso.modulo6.sprintm6.persistence.entity.Cliente;
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
@RequestMapping("/cliente")
public class ClienteController {

    Log logger = LogFactory.getLog(InicioController.class);

    private final ClienteService service;
    private final UsuarioService uService;

    public ClienteController(ClienteService service, UsuarioService uService) {
        this.service = service;
        this.uService = uService;
    }

    @GetMapping("/edit/{usuarioId}")
    public String clienteEdit(@PathVariable("usuarioId") int usuarioId, Model model){
        Usuario u = new Usuario();
        u = uService.getOne(usuarioId).orElse(null);
        model.addAttribute("nombreUsuario", u.getUsuarioNombre());
        model.addAttribute("fechaNacimiento", u.getUsuarioFechaNac());
        model.addAttribute("cliente", service.getOneByIdUsuario(usuarioId));
        return "clienteEdit";
    }

    @PostMapping("save")
    public String clienteSave(@ModelAttribute Cliente cliente){
        logger.warn(cliente.toString());
        service.save(cliente);
        return "redirect:/usuario/listar";
    }
}
