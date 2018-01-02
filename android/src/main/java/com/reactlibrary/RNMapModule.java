package com.reactlibrary;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;

public class RNMapModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;
  
  public RNMapModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNMap";
  }
  
  @ReactMethod
  public void showMap(Location myLocation, List<GeoPoint> ponts) {
    MapFragment mapFragment = new MapFragment();
    android.app.FragmentManager manager = this.getCurrentActivity().getFragmentManager();
    android.app.FragmentTransaction transaction = manager.beginTransaction();
//    transaction.add(R.id.fl_main, mapFragment);
//    transaction.commit();
  }
}
