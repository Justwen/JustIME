package com.justwen.ime.view.keyboard.key.func;

import android.content.Context;
import android.util.AttributeSet;

import com.justwen.ime.common.KeyCode;
import com.justwen.ime.view.R;

/**
 * Created by Justwen on 2018/2/5.
 */

public class ApostropheKeyView extends FunctionKeyView {

    public ApostropheKeyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onInitialize() {
        setBackgroundResource(R.drawable.key_bg_normal);
        setKey(KeyCode.KEYCODE_APOSTROPHE, "分词");
    }
}
