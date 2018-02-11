package org.deepwater.daisy.entity.blog;

import java.util.Date;

public class Image {
    private Integer imageId;

    private String imageNumber;

    private String imageName;

    private String imageUrl;

    private Boolean imageIsIndex;

    private String imageDescription;

    private Boolean imageIsRemote;

    private Date imageCreatetime;

    private String imageCreator;

    private String imageType;

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    private int pageNo;

    private int pageSize;

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getImageNumber() {
        return imageNumber;
    }

    public void setImageNumber(String imageNumber) {
        this.imageNumber = imageNumber == null ? null : imageNumber.trim();
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName == null ? null : imageName.trim();
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public Boolean getImageIsIndex() {
        return imageIsIndex;
    }

    public void setImageIsIndex(Boolean imageIsIndex) {
        this.imageIsIndex = imageIsIndex;
    }

    public String getImageDescription() {
        return imageDescription;
    }

    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription == null ? null : imageDescription.trim();
    }

    public Boolean getImageIsRemote() {
        return imageIsRemote;
    }

    public void setImageIsRemote(Boolean imageIsRemote) {
        this.imageIsRemote = imageIsRemote;
    }

    public Date getImageCreatetime() {
        return imageCreatetime;
    }

    public void setImageCreatetime(Date imageCreatetime) {
        this.imageCreatetime = imageCreatetime;
    }

    public String getImageCreator() {
        return imageCreator;
    }

    public void setImageCreator(String imageCreator) {
        this.imageCreator = imageCreator == null ? null : imageCreator.trim();
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType == null ? null : imageType.trim();
    }

    @Override
    public String toString() {
        return "Image{" +
                "imageId=" + imageId +
                ", imageNumber='" + imageNumber + '\'' +
                ", imageName='" + imageName + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", imageIsIndex=" + imageIsIndex +
                ", imageDescription='" + imageDescription + '\'' +
                ", imageIsRemote=" + imageIsRemote +
                ", imageCreatetime=" + imageCreatetime +
                ", imageCreator='" + imageCreator + '\'' +
                ", imageType='" + imageType + '\'' +
                ", pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                '}';
    }
}