package com.thejoeunit.www.brandcopy.data;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

/**
 * Created by the on 2017-11-23.
 */

public class PostingData implements Serializable {

    private boolean isNotice = false; // 공지사항인지 아닌지,


    private int postClassification; // 게시판 분류 변수
    private int views; // 조회수
    private String content; // 글의 내용
    private String reply; // 글의 리플
    private String profileURL; // 이미지 경로
    private String title;

    private List<ReplyData> replyDataList;

    public PostingData() {
    }

    public PostingData(boolean isNotice, int postClassification, int views, String content, String reply, String profileURL, String title, List<ReplyData> replyDataList) {
        this.isNotice = isNotice;
        this.postClassification = postClassification;
        this.views = views;
        this.content = content;
        this.reply = reply;
        this.profileURL = profileURL;
        this.title = title;
        this.replyDataList = replyDataList;
    }

    public boolean isNotice() {
        return isNotice;
    }

    public void setNotice(boolean notice) {
        isNotice = notice;
    }

    public int getPostClassification() {
        return postClassification;
    }

    public void setPostClassification(int postClassification) {
        this.postClassification = postClassification;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getProfileURL() {
        return profileURL;
    }

    public void setProfileURL(String profileURL) {
        this.profileURL = profileURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ReplyData> getReplyDataList() {
        return replyDataList;
    }

    public void setReplyDataList(List<ReplyData> replyDataList) {
        this.replyDataList = replyDataList;
    }
}


