package com.zjw.pdf_epub_provider.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author yishnee
 * @version 1.0
 */
@Data
@Accessors(chain = true)
@Entity
@Table(name = "txt")
public class TxtInfo {
    //保存时间
    private String saveTime;
    //保存的html集合路径(文件夹)
    @Id
    private String savePath;
    //关联的用户Id
    private Integer userId;

}
