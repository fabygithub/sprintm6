package curso.modulo6.sprintm6.web.controller;

import curso.modulo6.sprintm6.domain.service.AdministrativoService;
import curso.modulo6.sprintm6.domain.service.ClienteService;
import curso.modulo6.sprintm6.domain.service.ProfesionalService;
import curso.modulo6.sprintm6.domain.service.UsuarioService;
import curso.modulo6.sprintm6.persistence.entity.Administrativo;
import curso.modulo6.sprintm6.persistence.entity.Cliente;
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
    private final AdministrativoService aService;
    private final ClienteService cService;

    public UsuarioController(UsuarioService service, ProfesionalService pService, AdministrativoService administrativoService, ClienteService cService) {
        this.service = service;
        this.pService = pService;
        this.aService = administrativoService;
        this.cService = cService;
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
                                  @RequestParam("idProf") int idProf, @RequestParam("titulo") String titulo, @RequestParam("fechaIng") String fechaIng,
                                  @RequestParam(name = "idCl", defaultValue = "0") int idCl, @RequestParam("nombres") String nombres, @RequestParam("apellidos") String apellidos,
                                  @RequestParam(name = "rut", defaultValue = "0") int rut, @RequestParam("telefono") String telefono, @RequestParam("afp") String afp,
                                  @RequestParam("direccion") String direccion, @RequestParam("comuna") String comuna, @RequestParam(name = "edad", defaultValue = "0") int edad,
                                  @RequestParam(name = "idAdm", defaultValue = "0") int idAdm, @RequestParam("area") String area, @RequestParam("experiencia") String experiencia){

        Usuario usuario = new Usuario();
        usuario.setUsuarioId(id);
        usuario.setUsuarioNombre(nombre);
        usuario.setUsuarioFechaNac(fecha);

        if (nombres.equals("") && area.equals("")){
            usuario.setUsuarioTipo(2);
            service.save(usuario);
            Profesional profesional = new Profesional();
            profesional.setId(idProf);
            profesional.setTitulo(titulo);
            profesional.setFecha(fechaIng);
            profesional.setIdUsuario(service.maxId());
            pService.save(profesional);
        }else if (nombres.equals("") && titulo.equals("")){
            usuario.setUsuarioTipo(3);
            service.save(usuario);
            Administrativo administrativo = new Administrativo();
            administrativo.setIdAdmin(idAdm);
            administrativo.setArea(area);
            administrativo.setExperiencia(experiencia);
            administrativo.setIdUsuario(service.maxId());
            aService.save(administrativo);
        }else {
            usuario.setUsuarioTipo(1);
            service.save(usuario);
            Cliente cliente = new Cliente();
            cliente.setIdCliente(idCl);
            cliente.setRut(rut);
            cliente.setNombres(nombres);
            cliente.setApellidos(apellidos);
            cliente.setTelefono(telefono);
            cliente.setAfp(afp);
            cliente.setDireccion(direccion);
            cliente.setComuna(comuna);
            cliente.setEdad(edad);
            cliente.setIdUsuario(service.maxId());
            cService.save(cliente);
        }
        return "redirect:/usuario/listar";
    }
}
