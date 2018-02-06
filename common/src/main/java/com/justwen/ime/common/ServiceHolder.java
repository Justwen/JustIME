package com.justwen.ime.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.inputmethodservice.InputMethodService;
import android.view.LayoutInflater;

@SuppressLint("StaticFieldLeak")
public class ServiceHolder {

    private static Context sContext;

    private static InputMethodService sService;

    public static void setContext(Context context) {
        sContext = context.getApplicationContext();
    }

    public static void setService(InputMethodService service) {
        sService = service;
    }

    public static Context getContext() {
        return sContext;
    }

    public static InputMethodService getService() {
        return sService;
    }

    public static LayoutInflater getLayoutInflater() {
        return sService.getLayoutInflater();
    }

}
