package co.edu.uniquindio.libreria.entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Entity
public class Libro implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String isbn;

    @Column(nullable = false, unique = true)
    private String nombre;

    @PositiveOrZero
    @Column(nullable = false)
    private int cantidad;

    @PositiveOrZero
    private int anio;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Genero genero;



}
