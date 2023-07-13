package entities;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "GaraDiAtletica")
@Getter
@Setter
@NoArgsConstructor
@ToString

public class GaraDiAtletica extends Evento {
    private Set<Persona> setAtleti;
    private Persona vincitore;

    public GaraDiAtletica(String titolo, String dataEvento, String descrizione, tipoEvento tipoEvento, int numeroMassimoPartecipanti,
                          Set<Persona> setAtleti, Persona vincitore) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
        this.setAtleti = setAtleti;
        this.vincitore = vincitore;
    }
}