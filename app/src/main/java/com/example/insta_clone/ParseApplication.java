package com.example.insta_clone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

 public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("HZ6zrHWTIck4tOTSpENoz8e0LgxDPwRwzpilFult")
                .clientKey("gZJaoQUuH0Tg8UatdCitBahCkMQlKzzo4W7olusV")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
