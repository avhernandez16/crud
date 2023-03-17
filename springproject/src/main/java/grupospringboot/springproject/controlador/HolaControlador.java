package grupospringboot.springproject.controlador;

import grupospringboot.springproject.servicio.*;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import grupospringboot.springproject.modelo.*;
import org.springframework.beans.factory.annotation.Autowired;



//OPERACIONES CRUD- LISTAR

@Controller
public class HolaControlador {

    //Visualizacion planetas
    @Autowired
    ServiciosPlaneta serviciosPlaneta;

    @GetMapping("/")
    public String Iniciar (Model parametros){
        List <Planeta> listaPlanetas;

        listaPlanetas= (List<Planeta>) serviciosPlaneta.listarPlanetas();
        parametros.addAttribute("Planetas",listaPlanetas);
        return "html/inicio";
    }

    @GetMapping("/agregar")
    public String agregar (Planeta planeta){
        return "html/crear";
    }

    @PostMapping("/guardar")
    public String guardar (Planeta planeta){
        serviciosPlaneta.guardarPlanetas(planeta);
        return "redirect:/";
    }
    
    @GetMapping("/eliminar/{codigo}") //opcion 1 eliminar
    //@GetMapping("/eliminar")      //opcion 2 eliminar
    public String eliminar (Planeta planeta){
        serviciosPlaneta.eliminarPlanetas(planeta);
        return "redirect:/";
    }

    //version 2 eliminar
    // @GetMapping("/eliminar/{codigo}") //opcion 1 eliminar
    // public String eliminar (Planeta planeta){
    //     serviciosPlaneta.eliminarPlanetas(planeta.getCodigo());
    //     return "redirect:/";
    // }
    
    @GetMapping("/editar/{codigo}")      
    public String editar (Planeta planeta, Model modelo){
        modelo.addAttribute("planeta", planeta);
        return "html/modificar";
    }
}
