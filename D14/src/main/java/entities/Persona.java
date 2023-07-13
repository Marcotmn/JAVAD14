package entities;




import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;



import java.time.LocalDate;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.ManyToMany;


@Entity
@Table(name = "Persona")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Persona {


	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String cognome;
	private String email;
	private LocalDate dataNascita;
	@Enumerated(EnumType.STRING)
    private Sesso sesso;
	
	@ManyToMany
	private Set<GaraDiAtletica> gareAtletica;
	

	
	public Persona (String nome, String cognome, String email, LocalDate dataNascita, Sesso sesso) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.dataNascita = dataNascita;
		this.sesso = sesso;
		
	}
	

}


