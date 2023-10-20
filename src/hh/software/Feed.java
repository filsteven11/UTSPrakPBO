/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hh.software;

/**
 *
 * @author KATANA
 */
class Feed extends Post {
    private String caption;
    private int likes;

    public Feed(String postId, String caption, int likes) {
     super(postId, ContentState.SHOWED, ContentType.VIDEO);
      this.caption = caption;
      this.likes = likes;
}

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

     
    @Override
    public void display() {
    System.out.println("Feed Post ID: " + getPostId());
    System.out.println("Caption: " + caption);
    System.out.println("Likes: " + likes);
}

    }

