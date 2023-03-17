package grupospringboot.springproject.servicio;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import grupospringboot.springproject.modelo.*;
import grupospringboot.springproject.repositorio.*;

@Service
public class ImplementacionServiciosPlaneta implements ServiciosPlaneta{

    @Autowired //inyeccion de dependencias
    RepositorioPlaneta repositorioPlaneta;

    @Transactional (readOnly = true)
    @Override
    public List<Planeta> listarPlanetas(){
        return (List <Planeta>) repositorioPlaneta.findAll();
    }

    @Transactional 
    @Override
    public void guardarPlanetas(Planeta planeta){
        repositorioPlaneta.save(planeta);
    }

    @Transactional 
    @Override
    public void eliminarPlanetas(Planeta planeta){
        //opcion 1
        //operacionesPlaneta.deleteById(planeta.getCodigo());
        //opcion 2
        repositorioPlaneta.delete(planeta);
    }

    @Transactional 
    @Override
    public void eliminarPlanetas(int codigo){        
        repositorioPlaneta.deleteById(codigo);        
    }

}