/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hh.software;

/**
 *
 * @author KATANA
 */
public class Reel extends Post {
    private int duration;
    private int playedCount;

    public Reel(String postId, int duration, int playedCount, ContentType contentType) {
        super(postId, ContentState.SHOWED, contentType);
        this.duration = duration;
        this.playedCount = playedCount;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPlayedCount() {
        return playedCount;
    }

    public void setPlayedCount(int playedCount) {
        this.playedCount = playedCount;
    }

    @Override
    public void display() {
        System.out.println("Reel Post ID: " + getPostId());
        System.out.println("Duration: " + duration + " seconds");
        System.out.println("Played Count: " + playedCount);
    }
}


