package com.justwen.ime.view.keyboard.key;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.justwen.ime.view.R;
import com.justwen.ime.view.keyboard.KeyboardView;

/**
 * Created by Justwen on 2018/2/5.
 */

public class CharacterKeyView extends KeyView {

    private Key mKey;

    private KeyboardView mParent;

    private Rect mRect;

    public CharacterKeyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onInitialize() {
        setBackgroundResource(R.drawable.key_bg_normal);
    }

    public void setParent(KeyboardView parent) {
        mParent = parent;
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (mParent != null && mRect == null) {
            LinearLayout parent = (LinearLayout) getParent();
            mRect = new Rect((left + (int) parent.getX()), (top + (int) parent.getY()), (right + (int) parent.getX()), (bottom + (int) parent.getY()));
            mParent.addKeyRectToMap(mKey, mRect);
        }
    }

    @Override
    public void setKey(int code, CharSequence text) {
        super.setKey(code, text);
        if (mKey == null) {
            mKey = new Key();
        }
        mKey.setKeyCode(code);
        mKey.setLabel(text);
    }
}
