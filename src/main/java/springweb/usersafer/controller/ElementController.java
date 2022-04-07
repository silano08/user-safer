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
    @PostMapping(value = "/register", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Map<String, Object> registerUrl(UrlInfo urlInfo) {
        UrlInfo urlinfo = new UrlInfo();


        System.out.println("spring:"+ urlinfo.getAddress());

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
