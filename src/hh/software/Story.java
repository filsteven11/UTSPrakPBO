/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hh.software;

/**
 *
 * @author KATANA
 */

public class Story extends Post {
    private int duration;  
    private int views;
    
    public Story(String postId, String caption, ContentType contentType, int duration, int views) {
        super(postId, ContentState.SHOWED, contentType);
        this.duration = duration; 
        this.views = views;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    @Override
    public void display() {
        System.out.println("Story Post ID: " + getPostId());       
        System.out.println("Views: " + views);
    }
}
