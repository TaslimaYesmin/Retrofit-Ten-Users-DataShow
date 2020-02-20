package com.example.eighteenfebruaryapplication.model;

public class Address {
    private String street;
    private String suite;
    private String city;
    private String  zipcode;
    private Geo geo;


    public Geo getGeo() {
        return geo;
    }

    public String getStreet() {
        return street;
    }

    public String getSuite() {
        return suite;
    }

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }
}
