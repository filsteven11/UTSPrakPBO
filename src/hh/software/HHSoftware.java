/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hh.software;

import hh.software.Post.ContentState;
import hh.software.Post.ContentType;

/**
 *
 * @author KATANA
 */
public class HHSoftware {

    public static void main(String[] args) {

        User user = new User("111", "asep123", "9876543210", "Pengagum V-Tuber");

        Post feedPost1 = new Feed("101", "Tahun baruan", 100);
        Post feedPost2 = new Feed("102", "New year New Hope", 200);
        Post story1 = new Story("201", "Happy new year", ContentType.PICTURE, 15, 500);
        Post story2 = new Story("202", "1 January ?", ContentType.VIDEO, 30, 800);
        Post reel1 = new Reel("301", 20, 1000, ContentType.VIDEO);
        Post reel2 = new Reel("302", 25, 1200, ContentType.PICTURE);

        user.createPost(feedPost1);
        user.createPost(feedPost2);
        user.createPost(story1);
        user.createPost(story2);
        user.createPost(reel1);
        user.createPost(reel2);

        System.out.println("=====  User Posts =====");
        user.showUserPosts();

        System.out.println("\n=====  Post by ID =====");
        user.showPost("102");
        user.showPost("201");

        System.out.println("\n=====  Post State =====");
        user.changePostState("101", ContentState.PINNED);
        user.changePostState("201", ContentState.ARCHIVED);
        user.changePostState("302", ContentState.PINNED);
        user.changePostState("301", ContentState.DELETED);

        System.out.println("\n=====  Posts After Changes =====");
        user.showUserPosts();
    }
}
    
