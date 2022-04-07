package springweb.usersafer.service;

import org.springframework.beans.factory.annotation.Autowired;
import springweb.usersafer.domain.UrlInfo;
import springweb.usersafer.repository.ElementRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class ElementService {

    private final ElementRepository elementRepository;

    @Autowired
    public ElementService(ElementRepository elementRepository) {
        this.elementRepository = elementRepository;
    }

    /* 전체 Url 조회 */
    public List<UrlInfo> findUrl(){
        return elementRepository.findAll();
    }

    /* Url 등록 */
    public String upload(UrlInfo urlInfo){
        elementRepository.save(urlInfo);
        String result = "등록됐습니다";
        return result;
    }

}
