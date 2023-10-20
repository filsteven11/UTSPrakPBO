/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hh.software;
import hh.software.Post.ContentState;
import java.util.List; 
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KATANA
 */


public class User {
    private String userId;
    private String username;
    private String password;
    private String bio;
    private List<Post> posts;

    public User(String userId, String username, String password, String bio) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.bio = bio;
        this.posts = new ArrayList<>(); 
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

   

    public void createPost(Post post) {
        posts.add(post); 
    }

    public void showUserPosts() {
        List<Post> pinnedPosts = new ArrayList<>();
        List<Post> showedPosts = new ArrayList<>();
        List<Post> archivedPosts = new ArrayList<>();
        int deletedPostCount = 0;

        int postCount = posts.size(); 
        for (int i = 0; i < postCount; i++) {
            Post post = posts.get(i); 
            if (post.getStatus() == ContentState.PINNED) {
                pinnedPosts.add(post);
            } else if (post.getStatus() == ContentState.SHOWED) {
                showedPosts.add(post);
            } else if (post.getStatus() == ContentState.ARCHIVED) {
                archivedPosts.add(post);
            } else if (post.getStatus() == ContentState.DELETED) {
                deletedPostCount++;
            }
        }
 
        System.out.println("PINNED Posts:");
        int pinnedPostCount = pinnedPosts.size();
        for (int i = 0; i < pinnedPostCount; i++) {
            Post pinnedPost = pinnedPosts.get(i);
            pinnedPost.display();
        }
        
        System.out.println("SHOWED Posts:");
        int showedPostCount = showedPosts.size();
        for (int i = 0; i < showedPostCount; i++) {
            Post showedPost = showedPosts.get(i);
            showedPost.display();
        }

        System.out.println("ARCHIVED Posts:");
        int archivedPostCount = archivedPosts.size();
        for (int i = 0; i < archivedPostCount; i++) {
            Post archivedPost = archivedPosts.get(i);
            archivedPost.display();
        }

        System.out.println("DELETED Posts: " + deletedPostCount);
    }

    public void showPost(String postId) {
        for (Post post : posts) {
            if (post.getPostId().equals(postId)) {
                post.display();
                return;
            }
        }
        System.out.println("Post with ID " + postId + " not found.");
    }

    public void changePostState(String postId, ContentState newStatus) {
    Post postToChange = findPostById(postId);

    if (postToChange == null) {
        System.out.println("Post not found.");
        return;
    }

    if (newStatus == ContentState.PINNED) {
        if (postToChange instanceof Feed && canPinMorePosts()) {
            postToChange.setStatus(newStatus);
            System.out.println("Post with ID " + postId + " is now PINNED.");
            return;
        }
        System.out.println("Cannot pin more posts. Limit.");
    } else if (newStatus == ContentState.SHOWED || newStatus == ContentState.ARCHIVED || newStatus == ContentState.DELETED) {
        if (postToChange.getStatus() == ContentState.PINNED || (postToChange.getStatus() == ContentState.SHOWED && newStatus == ContentState.PINNED)) {
            postToChange.setStatus(newStatus);
            System.out.println("Post with ID " + postId + " status updated to " + newStatus);
            return;
        }
        if (postToChange.getStatus() == ContentState.ARCHIVED && newStatus == ContentState.DELETED) {
            postToChange.setStatus(newStatus);
            System.out.println("Post with ID " + postId + " is now DELETED.");
            return;
        }
        System.out.println("Invalid state transition.");
    } else {
        System.out.println("Invalid new status.");
    }
}


private Post findPostById(String postId) {
    for (Post post : posts) {
        if (post.getPostId().equals(postId)) {
            return post;
        }
    }
    return null;
}

private boolean canPinMorePosts() {
    int pinnedPostCount = 0;
    for (Post post : posts) {
        if (post.getStatus() == ContentState.PINNED) {
            pinnedPostCount++;
        }
    }
    return pinnedPostCount < 3;
}

}
