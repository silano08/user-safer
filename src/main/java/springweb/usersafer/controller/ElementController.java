package springweb.usersafer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springweb.usersafer.domain.UrlInfo;
import springweb.usersafer.service.ElementService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/url-safer")
public class ElementController{

    private ElementService elementService;

    @Autowired
    public ElementController(ElementService elementService) {
        this.elementService = elementService;
    }

    /*
    * URL 등록
    */
    @PostMapping(value = "/registerurl", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Map<String, Object> registerUrl(UrlInfo InputUrlInfo) {
        UrlInfo urlinfo = new UrlInfo();

        // 유저 정보를 프론트에서 줘야하는거 아닌가..
        // 유저정보를 백단에서 확인하는 미들웨어가 있어야할것같은데 < 이거 나중에 리팩토링 ㄱㄱ

        // 이런식으로 set 여러번하는거 너무 소모적인데 줄일방법없나..
//        urlinfo.setAddress(InputUrlInfo.getAddress());
//        urlinfo.setTitle(InputUrlInfo.getTitle());

        Map<String, Object> result = new HashMap<>();
        result.put("결과","결과1");

        return result;
    }

    /*
    URL 목록 조회
    */
    @GetMapping(value = "/listUrl", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<List<UrlInfo>> listUrl(Model model) {
        List<UrlInfo> UrlInfo = elementService.findUrl();

        return new ResponseEntity<>(UrlInfo, HttpStatus.OK);
    }

    /*
    URL 검색
    */
    @GetMapping(value = "/searchUrl", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Map<String, Object> searchUrl(UrlInfo urlInfo) {
        Map<String, Object> result = new HashMap<>();

        result.put("결과","결과1");

        return result;
    }

    /*
    URL 편집
    */
    @PostMapping(value = "/edit", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Map<String, Object> editUrl(UrlInfo urlInfo) {
        Map<String, Object> result = new HashMap<>();

        result.put("결과","결과1");

        return result;
    }

    /*
    URL 삭제
    */
    @PostMapping(value = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Map<String, Object> deleteUrl() {
        Map<String, Object> result = new HashMap<>();

        result.put("결과","결과1");

        return result;
    }

}
