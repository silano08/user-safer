package springweb.usersafer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springweb.usersafer.repository.ElementRepository;
import springweb.usersafer.repository.JpaElementRepository;
import springweb.usersafer.service.ElementService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Configuration
public class SpringConfig {

    @PersistenceContext
    private EntityManager em;

    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }

    @Bean
    public ElementService elementService(){
        return new ElementService(elementRepository());
    }

    @Bean
    public ElementRepository elementRepository(){
        return new JpaElementRepository(em);
    }


}
