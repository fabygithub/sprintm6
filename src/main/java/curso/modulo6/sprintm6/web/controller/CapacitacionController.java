package curso.modulo6.sprintm6.web.controller;

import curso.modulo6.sprintm6.domain.service.CapacitacionService;
import curso.modulo6.sprintm6.persistence.entity.Capacitacion;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * awakelab.modulo6.web.controller
 *
 * @author Sergio Teran on 26-07-2022
 */
@Controller
@RequestMapping("/capacitacion")
public class CapacitacionController {

    Log logger = LogFactory.getLog(InicioController.class);

    private final CapacitacionService service;

    public CapacitacionController(CapacitacionService service) {
        this.service = service;
    }

    @GetMapping
    public String capacitacion(){
        logger.info("Ingresando al formulario de capacitaciones");
        return "capacitacion";
    }

    @GetMapping("/listar")
    public String listar(Model model){

        logger.info("Listado de capacitaciones desplegado");
        model.addAttribute("capacitaciones", service.getAll());
        return "listarCapacitaciones";

    }

    @GetMapping("/edit/{capacitacionId}")
    public String capacitacionEdit(@PathVariable("capacitacionId") int capacitacionId, Model model){
        model.addAttribute("capacitacion", service.getOne(capacitacionId).
                map(capacitacion -> capacitacion).
                orElse(null));
        return "capacitacionEdit";
    }

    @PostMapping("/save")
    public String capacitacionSave(@ModelAttribute Capacitacion capacitacion){
        logger.warn("esto es un advertencia");
        logger.info(capacitacion.toString());
        service.save(capacitacion);
        return "redirect:/capacitacion/listar";
    }
    @GetMapping("/new")
    public String capacitacionNew(){
        return "capacitacionNew";
    }

    @GetMapping("/del/{capacitacionId}")
    public String capacitacionDelete(@PathVariable("capacitacionId") int capacitacionId){
        service.delete(capacitacionId);
        return "redirect:/capacitacion/listar";
    }
}
