package com.justwen.ime.common;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by Justwen on 2018/2/6.
 */

public class SharePreferenceHolder {

    private SharedPreferences mPreferences;

    private static class SingletonHolder {
        static SharePreferenceHolder sInstance = new SharePreferenceHolder();
    }

    public static SharePreferenceHolder getInstance() {
        return SingletonHolder.sInstance;
    }

    private SharePreferenceHolder() {
        mPreferences = PreferenceManager.getDefaultSharedPreferences(ServiceHolder.getContext());
    }

    public void putInt(String key, int value) {
        mPreferences.edit().putInt(key, value).apply();
    }

    public int getInt(String key, int defVal) {
        return mPreferences.getInt(key, defVal);
    }

    public SharedPreferences.Editor getEditor() {
        return mPreferences.edit();
    }
}
