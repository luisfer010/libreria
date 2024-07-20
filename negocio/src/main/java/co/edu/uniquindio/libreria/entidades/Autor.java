package co.edu.uniquindio.libreria.entidades;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Autor implements Serializable {

    @Id
    private String codigo;

    private String nombre;
}
