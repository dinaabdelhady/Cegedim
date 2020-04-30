package com.cegedim.docMngSys.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class File {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long fileId;
    private String FileName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Users auther;

    private long version;
    private Date lastModDate;

    public Users getAuther() {
        return auther;
    }

    public void setAuther(Users auther) {
        this.auther = auther;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String fileName) {
        FileName = fileName;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public Date getLastModDate() {
        return lastModDate;
    }

    public void setLastModDate(Date lastModDate) {
        this.lastModDate = lastModDate;
    }
}
