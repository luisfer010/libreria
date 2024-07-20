package co.edu.uniquindio.libreria.entidades;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Entity
public class Autor implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(length = 15)
    private String codigo;

    @Column(length = 150, nullable = false)
    private String nombre;
}
