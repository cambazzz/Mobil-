package com.example.mytagram;
import android.graphics.Bitmap;
import android.location.Location;

public class Post {
    private Bitmap image;
    private String message;
    private Location location;


    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
