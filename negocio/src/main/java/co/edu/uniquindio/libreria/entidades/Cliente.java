package co.edu.uniquindio.libreria.entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Entity
public class Cliente implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @Column(length = 15)
    private String cedula;

    @Column(length = 100, nullable = false)
    private String nombre;

    @Email
    @Column(length = 150, nullable = false, unique = true)
    private String correo;

    @ElementCollection
    private Map<String, String> telefonos;


}
