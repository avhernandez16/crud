package grupospringboot.springproject.servicio;
import java.util.List;
import grupospringboot.springproject.modelo.*;


public interface ServiciosPlaneta {
    public List <Planeta> listarPlanetas();
    public void guardarPlanetas(Planeta planeta);
    public void eliminarPlanetas(Planeta planeta);
    public void eliminarPlanetas(int codigo);
}
