package com.photoShow;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yanggz
 * Date: 13-10-14
 * Time: 下午10:12
 * 定义列表页每一行展现需要的数据对象
 *
 */
public class PhotoShowInfo {

    private String picAddress;      //图片
    private String  descInfo;       //描述内容
    private int likeNum;            //好评数量
    private List replyContent;      //回复内容

    public List getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(List replyContent) {
        this.replyContent = replyContent;
    }

    public String getPicAddress() {
        return picAddress;
    }

    public void setPicAddress(String picAddress) {
        this.picAddress = picAddress;
    }

    public String getDescInfo() {
        return descInfo;
    }

    public void setDescInfo(String descInfo) {
        this.descInfo = descInfo;
    }

    public int getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }
}
