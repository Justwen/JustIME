package com.justwen.ime.view.keyboard.key.func;

import android.content.Context;
import android.util.AttributeSet;

import com.justwen.ime.common.KeyCode;
import com.justwen.ime.view.R;

/**
 * Created by Justwen on 2018/2/5.
 */

public class SpaceKeyView extends FunctionKeyView {

    public SpaceKeyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onInitialize() {
        setKey(KeyCode.KEYCODE_SPACE,"空格\uD83C\uDFA4");
        setBackgroundResource(R.drawable.key_bg_normal);
    }
}
