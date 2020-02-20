package com.example.eighteenfebruaryapplication.model;

public class Post {
    private String id;
    private String name;
    private String username;
    private String email;
    private Company company;
    private Address address;
    private Geo geo;
    private String phone;
    private String website;

    public Post(String id, String name, String username, String email, Company company, Address address, Geo geo,String phone,String website) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.company = company;
        this.address = address;
        this.geo = geo;
        this.phone = phone;
        this.website = website;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Company getCompany() {
        return company;
    }

    public Address getAddress() {
        return address;
    }

    public Geo getGeo() {
        return geo;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }
}
