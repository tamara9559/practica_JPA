package co.edu.cue.jpa_hibernate.controlers;

import co.edu.cue.jpa_hibernate.models.Cliente;
import co.edu.cue.jpa_hibernate.utils.JpaUtil;
import jakarta.persistence.EntityManager;

public class HibernateListar {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();
        List<Cliente> clientes = em.createQuery("select c from Cliente c",
                Cliente.class).getResultList();
        clientes.forEach(System.out::println);
        em.close();
    }
}
