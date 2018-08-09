package com.example.user.lofta.model;

public class UserInfo {

    private String login;
    private String uName;
    private String followers;
    private String following;
    private String avatars;

    public UserInfo() {
    }


    public UserInfo(String login, String uName, String followers, String following, String avatars) {
        this.login = login;
        this.uName = uName;
        this.followers = followers;
        this.following = following;
        this.avatars = avatars;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getFollowers() {
        return followers;
    }

    public void setFollowers(String followers) {
        this.followers = followers;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

    public String getAvatars() {
        return avatars;
    }

    public void setAvatars(String avatars) {
        this.avatars = avatars;
    }
}
