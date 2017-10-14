package com.example.pc.myapplication;

import android.app.Application;
import android.widget.Toast;

import com.onesignal.OSNotificationOpenResult;
import com.onesignal.OneSignal;

/**
 * Created by pc on 14/10/2017.
 */

public class App extends Application  {

    @Override
    public void onCreate() {
        super.onCreate();
        OneSignal.startInit(this)
                .setNotificationOpenedHandler(new OneSignal.NotificationOpenedHandler() {
                    @Override
                    public void notificationOpened(OSNotificationOpenResult result) {
                        Toast.makeText(App.this, "sjdfnwejvfngewfn", Toast.LENGTH_SHORT).show();
                    }
                })
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();

    }
}
