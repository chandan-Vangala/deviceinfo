package com.deviceinfo;

import android.os.Build;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.uimanager.IllegalViewOperationException;

public class HelloWorldModule extends ReactContextBaseJavaModule {

  public HelloWorldModule(ReactApplicationContext reactContext) {
    super(reactContext); //required by React Native
  }

  @Override
  //getName is required to define the name of the module represented in JavaScript
  public String getName() {
    return "HelloWorld";
  }

  @ReactMethod
  public void sayHi(Callback errorCallback, Callback successCallback) {
   try {
     System.out.println("Greetings from Java");
     successCallback.invoke("Callback : Greetings from Java");
   } catch (IllegalViewOperationException e) {
     errorCallback.invoke(e.getMessage());
   }
  }
  public void getHardwareAndSoftwareInfo(Callback errorCallback, Callback successCallback) {
    //return  Build.SERIAL;
     try {
     //System.out.println("Build Serial", Build.SERIAL);
     successCallback.invoke("Build Serial", Build.SERIAL);
   } catch (IllegalViewOperationException e) {
     errorCallback.invoke(e.getMessage());
   }
//            getString(R.string.model) + " " + Build.MODEL + "\n" +
//            getString(R.string.id) + " " + Build.ID + "\n" +
//            getString(R.string.manufacturer) + " " + Build.MANUFACTURER + "\n" +
//            getString(R.string.brand) + " " + Build.BRAND + "\n" +
//            getString(R.string.type) + " " + Build.TYPE + "\n" +
//            getString(R.string.user) + " " + Build.USER + "\n" +
//            getString(R.string.base) + " " + Build.VERSION_CODES.BASE + "\n" +
//            getString(R.string.incremental) + " " + Build.VERSION.INCREMENTAL + "\n" +
//            getString(R.string.sdk) + " " + Build.VERSION.SDK + "\n" +
//            getString(R.string.board) + " " + Build.BOARD + "\n" +
//            getString(R.string.host) + " " + Build.HOST + "\n" +
//            getString(R.string.fingerprint) + " " + Build.FINGERPRINT + "\n" +
//            getString(R.string.versioncode) + " " + Build.VERSION.RELEASE;
  }
}