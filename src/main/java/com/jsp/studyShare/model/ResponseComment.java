package com.jsp.studyShare.model;import java.util.List;public class ResponseComment {    private Comment comment;    private List<Reply> replys;    public Comment getComment() {        return comment;    }    public void setComment(Comment comment) {        this.comment = comment;    }    public List<Reply> getReplys() {        return replys;    }    public void setReplys(List<Reply> replys) {        this.replys = replys;    }}