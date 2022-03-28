package springweb.usersafer.service;

import org.springframework.beans.factory.annotation.Autowired;
import springweb.usersafer.repository.ElementRepository;

import javax.transaction.Transactional;

@Transactional
public class ElementService {

    private final ElementRepository elementRepository;

    @Autowired
    public ElementService(ElementRepository elementRepository) {
        this.elementRepository = elementRepository;
    }


}
