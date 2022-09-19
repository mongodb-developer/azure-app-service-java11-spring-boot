package com.mongo.atlas.example.resource;

public class PersonRequest {

    private String name;
    private String location;

    private String GovtId;

    public PersonRequest() {


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGovtId() {
        return GovtId;
    }

    public void setGovtId(String govtId) {
        GovtId = govtId;
    }
}
