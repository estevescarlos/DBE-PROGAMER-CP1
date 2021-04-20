package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.model.User;
import br.com.fiap.util.EntityManagerFacade;

public class UserDAO {

	private EntityManager em = EntityManagerFacade.get();

	public void save(User user) {
		try {
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();

		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
		}
		em.close();
	}

	public List<User> getAll() {
		String jpql = "SELECT s from User s";
		TypedQuery<User> createQuery = em.createQuery(jpql, User.class);
		return createQuery.getResultList();
	}

}