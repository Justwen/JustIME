package com.justwen.ime.view.keyboard.key;

import android.graphics.drawable.Drawable;

/**
 * Created by Justwen on 2018/2/5.
 */

public class Key {

    private int mKeyCode;

    private CharSequence mLabel;

    private Drawable mIcon;

    public Key(int keyCode) {
        mKeyCode = keyCode;
    }

    public Key() {
    }

    public int getKeyCode() {
        return mKeyCode;
    }

    public void setKeyCode(int keyCode) {
        mKeyCode = keyCode;
    }

    public CharSequence getLabel() {
        return mLabel;
    }

    public void setLabel(CharSequence label) {
        mLabel = label;
    }

    public Drawable getIcon() {
        return mIcon;
    }

    public void setIcon(Drawable icon) {
        mIcon = icon;
    }
}
