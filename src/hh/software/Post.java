package hh.software;

import java.sql.Timestamp;
import jdk.jfr.ContentType;

public class Post {
    private String postId;
    private ContentState status;
    private Timestamp timeUpload;
    private ContentType postType;

    public Post(String postId, ContentState status, ContentType postType) {
        this.postId = postId;
        this.status = status;
        this.timeUpload = new Timestamp(System.currentTimeMillis());
        this.postType = postType;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public ContentState getStatus() {
        return status;
    }

    public void setStatus(ContentState status) {
        this.status = status;
    }

    public Timestamp getTimeUpload() {
        return timeUpload;
    }

    public void setTimeUpload(Timestamp timeUpload) {
        this.timeUpload = timeUpload;
    }

    public ContentType getPostType() {
        return postType;
    }

    public void setPostType(ContentType postType) {
        this.postType = postType;
    }

    void display() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

public enum ContentState {
    ARCHIVED,
    SHOWED,
    DELETED,
    PINNED
}

public enum ContentType {
    PICTURE,
    VIDEO,
    
}

}

