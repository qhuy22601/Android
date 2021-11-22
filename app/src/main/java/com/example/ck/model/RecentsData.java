package com.example.ck.model;

public class RecentsData {
    String placeName;
    String countName;
    int Url;

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getCountName() {
        return countName;
    }

    public void setCountName(String countName) {
        this.countName = countName;
    }

    public int getUrl() {
        return Url;
    }

    public void setUrl(int url) {
        Url = url;
    }

    public RecentsData(String placeName, String countName, int url) {
        this.placeName = placeName;
        this.countName = countName;
        Url = url;
    }
}
