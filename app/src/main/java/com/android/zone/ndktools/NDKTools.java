package com.android.zone.ndktools;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class NDKTools {

    static {
        System.loadLibrary("ndkdemotest-jni");
    }
    private Context context;
    public NDKTools(Context context){
        this.context=context;
    }
    public static native String getStringFromNDK();
    public native void callbackmethod();

    public native void callbackIntmethod();
    public native void callbackStringmethod();

    public native void callStaticmethod();

    public void helloFromJava(){
        Toast.makeText(context, "C调用了java的空方法",Toast.LENGTH_SHORT ).show();
    }
    public int add(int x,int y) {
        return x+y;
    }
    public void printString(String s){
        Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    }
    public static void staticmethod(String s){
        Log.w("NDKTools",s);
    }


}
