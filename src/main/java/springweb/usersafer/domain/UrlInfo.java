package springweb.usersafer.domain;

import lombok.*;

import javax.persistence.*;

@Entity
public class UrlInfo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name="ADDRESS")
    private String address;

    @Column(name="TITLE")
    private String title;

    @Column(name="DEL_YN")
    private String delYn;

    @Column(name="FILE_NAME")
    private String fileName;

    @Column(name="FILE_PATH")
    private String filePath;

    @Column(name="USER_INFO_ID")
    private String userInfoId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDelYn() {
        return delYn;
    }

    public void setDelYn(String delYn) {
        this.delYn = delYn;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(String userInfoId) {
        this.userInfoId = userInfoId;
    }
}
