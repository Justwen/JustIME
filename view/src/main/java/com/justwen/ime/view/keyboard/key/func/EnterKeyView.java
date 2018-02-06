package com.justwen.ime.view.keyboard.key.func;

import android.content.Context;
import android.util.AttributeSet;

import com.justwen.ime.common.KeyCode;

/**
 * Created by Justwen on 2018/2/5.
 */

public class EnterKeyView extends FunctionKeyView {

    public EnterKeyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onInitialize() {
        super.onInitialize();
        setKey(KeyCode.KEYCODE_ENTER,"回车");
    }
}
