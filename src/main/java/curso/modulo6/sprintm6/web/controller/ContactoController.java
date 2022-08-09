package curso.modulo6.sprintm6.web.controller;

import curso.modulo6.sprintm6.persistence.entity.Contacto;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * awakelab.modulo6.web.controller
 *
 * @author Sergio Teran on 26-07-2022
 */
@Controller
@RequestMapping("/contacto")
public class ContactoController {

    Log logger = LogFactory.getLog(InicioController.class);

    @GetMapping
    public String contacto(){
        logger.info("Ingreso al fomulario de contacto");
        return "contactoNew";
    }

    @PostMapping("/new")
    public String listarPorConsola(@ModelAttribute Contacto contacto){
        logger.warn(contacto.toString());
        return "inicio";
    }
}
