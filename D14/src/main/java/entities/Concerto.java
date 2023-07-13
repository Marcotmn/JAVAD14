package entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Concerto")
@Getter
@Setter
@NoArgsConstructor
@ToString

public class Concerto extends Evento {
    public enum Genere {
        CLASSICO,
        ROCK,
        POP
    }

    private Genere genere;
    private boolean inStreaming;

    public Concerto(String titolo, String dataEvento, String descrizione, tipoEvento tipoEvento, int numeroMassimoPartecipanti,
                    Genere genere, boolean inStreaming) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
        this.genere = genere;
        this.inStreaming = inStreaming;
    }


}