package dev.entite;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="plat")
public class Plat {
	
	@Id
	@Column(name="id", nullable=false)
	private int		id;
	
    @Column(name="nom")
    private String 	nom;
    
    @Column(name="prix")
    private Integer prixEnCentimesEuros;

    public Plat() {
    }

    public Plat(String nom, Integer prixEnCentimesEuros) {
        this.nom = nom;
        this.prixEnCentimesEuros = prixEnCentimesEuros;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plat plat = (Plat) o;
        return nom.equals(plat.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }

	/** Getter
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/** Setter
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the prixEnCentimesEuros
	 */
	public Integer getPrixEnCentimesEuros() {
		return prixEnCentimesEuros;
	}

	/** Setter
	 * @param prixEnCentimesEuros the prixEnCentimesEuros to set
	 */
	public void setPrixEnCentimesEuros(Integer prixEnCentimesEuros) {
		this.prixEnCentimesEuros = prixEnCentimesEuros;
	}
}
