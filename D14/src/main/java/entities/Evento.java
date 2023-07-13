package entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Table(name = "Evento")
@NoArgsConstructor
@Getter
@Setter
public class Evento {
	
	@Id
	@GeneratedValue
	private Long id;
	private String titolo;
	private LocalDate dataEvento;
	private String descrizione;
	
	@Enumerated(EnumType.STRING)
    private tipoEvento tipoEvento;
	private int numeroMassimoPartecipanti;


	public Evento(String titolo, String dataEvento, String descrizione, tipoEvento tipoEvento, int numeroMassimoPartecipanti) {
		this.titolo = titolo;
		this.dataEvento = LocalDate.parse(dataEvento); 
		this.descrizione = descrizione;
		this.tipoEvento = tipoEvento;
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	

	}

}
