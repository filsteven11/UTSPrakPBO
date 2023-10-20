/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hh.software;

/**
 *
 * @author KATANA
 */
public class Comment extends Post {
    private String commentId;
    private String text;
    private ContentState status;

    public Comment(String commentId, String text, ContentState status) {
        super(commentId, ContentState.SHOWED, ContentType.PICTURE); 
        this.commentId = commentId;
        this.text = text;
        this.status =status;
    }

    @Override
    public ContentState getStatus() {
        return status;
    }

    @Override
    public void setStatus(ContentState status) {
        this.status = status;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentID(String commentID) {
        this.commentId = commentID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println("Comment ID: " + commentId);
        System.out.println("Text: " + text);
        System.out.println("Status: " + getStatus()); 
    }
}


