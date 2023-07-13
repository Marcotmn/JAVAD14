package entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;


import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name = "Partecipazione")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Partecipazione {


	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Persona persona;
	
	@ManyToOne
	private Evento evento;
	
	@Enumerated(EnumType.STRING)
    private Stato stato;

	
	
	
	public Partecipazione (Persona persona, Evento evento, Stato stato) {
		
		this.persona = persona;
		this.evento = evento;
		this.stato = stato;
	}
	
	
}

