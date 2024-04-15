package model.session;

import javax.persistence.*;

@Entity
@Table(name="Discente")
public class Discente {


	@Column(name="iddiscente")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int chiave;

	@Column(name="cognome")
	private String cognome;

	@Column(name="nome")
	private String nome;

	@Column(name="anni")
	private int anni;

	public Discente() {
		this.nome = "";
		this.cognome = "";
	}

	public int getChiave() {
		return chiave;
	}

	public void setChiave(int chiave) {
		this.chiave = chiave;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnni() {
		return anni;
	}

	public void setAnni(int anni) {
		this.anni = anni;
	}
}
