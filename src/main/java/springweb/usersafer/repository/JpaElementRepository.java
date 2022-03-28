package springweb.usersafer.repository;

import javax.persistence.EntityManager;

public class JpaElementRepository implements ElementRepository{

    private final EntityManager em;

    public JpaElementRepository(EntityManager em) {
        this.em = em;
    }
}
