package curso.modulo6.sprintm6.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * awakelab.modulo6.web.controller
 *
 * @author Sergio Teran on 26-07-2022
 */
@Controller
@RequestMapping("/")
public class InicioController {

    Log logger = LogFactory.getLog(InicioController.class);

    @GetMapping
    public String inicio(){
        logger.info("Accede al inicio");
        return "inicio";
    }
}
