package br.com.jcmonsilv.bcontrol.datamanager.domain.empresa;

import jakarta.persistence.*;
import lombok.*;

@Entity (name = "Empresa")
@Table (name = "empresa", schema = "dmg")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Data
@Builder
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Long codigo;

    @Column(name = "nome", length = 250, nullable = false, unique = true)
    private String nome;

    @Column(name = "descricao", columnDefinition = "TEXT")
    private String descricao;

    public static Empresa fromEmpresaDTO(EmpresaDTO empresa){
        return empresa.toEmpresa();
    }
}
