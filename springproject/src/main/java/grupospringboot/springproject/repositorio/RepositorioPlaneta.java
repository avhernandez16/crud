package grupospringboot.springproject.repositorio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import grupospringboot.springproject.modelo.Planeta;

@Repository
public interface RepositorioPlaneta  extends CrudRepository<Planeta, Integer> {
    
}
