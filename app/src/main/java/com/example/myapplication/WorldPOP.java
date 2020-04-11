package com.example.myapplication;

import com.univocity.parsers.annotations.Parsed;

public class WorldPOP {
    @Parsed
    private String id;
    @Parsed
    private String country;
    @Parsed
    private String city;
    @Parsed
    private String accentCity;
    @Parsed
    private String region;
    @Parsed
    private String population;
    @Parsed
    private String latitude;
    @Parsed
    private String longitude;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAccentCity() {
        return accentCity;
    }

    public void setAccentCity(String accentCity) {
        this.accentCity = accentCity;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "[" +
                "id: " + id  +
                ", country: " + country  +
                ", city: " + city  +
                ", accentCity: " + accentCity  +
                ", region: " + region  +
                ", population: " + population  +
                ", latitude: " + latitude  +
                ", longitude: " + longitude  +
                ']';
    }
}
