package com.justwen.ime.view.keyboard;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import com.justwen.ime.view.R;
import com.justwen.ime.view.keyboard.key.Key;

import java.util.HashMap;
import java.util.Map;

public class KeyboardView extends RelativeLayout {

    private Map<Key,Rect> mKeyRectMap = new HashMap<>();

    public KeyboardView(Context context) {
        super(context);
    }

    public KeyboardView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void addKeyRectToMap(Key key, Rect rect) {
        mKeyRectMap.put(key,rect);
    }


}
