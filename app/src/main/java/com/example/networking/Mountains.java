package com.example.networking;

import androidx.annotation.NonNull;

public class Mountains {

    private String name;
    private String location;
    private int size;

    public Mountains(String name, String location, int size) {
        this.name = name;
        this.location = location;
        this.size = size;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @NonNull
    @Override
    public String toString() {
        return name + "Är såhär hög" + size;
    }

}
