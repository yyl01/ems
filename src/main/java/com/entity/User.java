package com.entity;

public class User {
    private int id;
    private String username;
    private String name;
    private String password;
    private String sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public User(int id, String username, String name, String password,
                String sex) {
        super();
        this.id = id;
        this.username = username;
        this.name = name;
        this.password = password;
        this.sex = sex;
    }

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", name=" + name
                + ", password=" + password + ", sex=" + sex + "]";
    }

}
