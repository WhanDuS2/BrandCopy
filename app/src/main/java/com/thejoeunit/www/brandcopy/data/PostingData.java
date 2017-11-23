package com.thejoeunit.www.brandcopy.data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by the on 2017-11-23.
 */

public class PostingData implements Serializable {

    private boolean isNotice = false; // 공지사항인지 아닌지,

    private int postClassification; // 게시판 분류 변수
    private int views; // 조회수
    private UserData writer; // 쓴사람
    private String content; // 글의 내용
    private String reply; // 글의 리플
    private String profileURL; // 이미지 경로
//    작성일시 필요

    private List<ReplyData> replyDataList;


}


