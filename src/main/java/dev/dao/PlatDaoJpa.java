package dev.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.transaction.annotation.Transactional;

import dev.entite.Plat;


@PersistenceContext
public class PlatDaoJpa implements IPlatDao {

	// injecter une instance d'EntityManager
	@PersistenceContext private EntityManager em;
	
	@Override
	public List<Plat> listerPlats() {
		TypedQuery<Plat> query = em.createQuery("select id, nom, prixEnCentimesEuros from Plat", Plat.class);
		ArrayList<Plat> lstFou = (ArrayList<Plat>) query.getResultList( );
		
		return lstFou;
	}

	@Override
	@Transactional
	public void ajouterPlat(String nomPlat, Integer prixPlat) {
		Plat plat  = new Plat();
		plat.setNom( nomPlat);
		plat.setPrixEnCentimesEuros( prixPlat);
		em.persist(plat);
		
	}

}
