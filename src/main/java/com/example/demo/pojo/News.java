package com.example.demo.pojo;

public class News {

    private int id;

    private int typeId;

    private Integer imgType;

    /**
     * 如果img_type为1或者3的话，本字段必填。
        是一个json数组
        ['']
        ['','','']
     */

    private String coverImg;

    private String title;

    private String publisher;

    private String publisherFace;

    private String createTime;

    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public Integer getImgType() {
        return imgType;
    }

    public void setImgType(Integer imgType) {
        this.imgType = imgType;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    public String getPublisherFace() {
        return publisherFace;
    }


    public void setPublisherFace(String publisherFace) {
        this.publisherFace = publisherFace;
    }


    public String getCreateTime() {
        return createTime;
    }


    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    public String getContent() {
        return content;
    }


    public void setContent(String content) {
        this.content = content;
    }
}