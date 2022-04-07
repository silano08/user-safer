package springweb.usersafer.repository;

import springweb.usersafer.domain.UrlInfo;

import java.util.List;
import java.util.Optional;

public interface ElementRepository {

    /* Url 등록 */
    UrlInfo save (UrlInfo urlInfo);

    /* 전체 Url 조회 */
    List<UrlInfo> findAll();

    /* Url 검색 */
    Optional<UrlInfo> findByName(Long name);

}
