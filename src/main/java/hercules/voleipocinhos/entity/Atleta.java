package hercules.voleipocinhos.entity;

import hercules.voleipocinhos.enums.Posicao;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Setter
@Getter
@Entity
public class Atleta {

    @Id
    @GeneratedValue
    private Integer codigo;

    private String nome;

    private char sexo;

    private short nivel;

    private Date dataNascimento;

    private Posicao posicao;

}
