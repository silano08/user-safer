package springweb.usersafer.repository;

import springweb.usersafer.domain.UrlInfo;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class JpaElementRepository implements ElementRepository{

    private final EntityManager em;

    public JpaElementRepository(EntityManager em) {
        this.em = em;
    }


    @Override
    public UrlInfo save(UrlInfo urlInfo) {
        return null;
    }

    @Override
    public List<UrlInfo> findAll() {
        return null;
    }

    @Override
    public Optional<UrlInfo> findByName(Long name) {
        return Optional.empty();
    }
}
