package grupospringboot.springproject.modelo;

import org.hibernate.annotations.Columns;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter @Setter  @AllArgsConstructor @NoArgsConstructor
@Data

@Entity
@Table(name="planeta")

public class Planeta{
    @Id  //llave de la tabla
    private Integer codigo;
    private String nombre;
}