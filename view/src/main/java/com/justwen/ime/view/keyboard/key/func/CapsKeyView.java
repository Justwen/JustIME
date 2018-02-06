package com.justwen.ime.view.keyboard.key.func;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by Justwen on 2018/2/5.
 */

public class CapsKeyView  extends FunctionKeyView {

    public CapsKeyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onInitialize() {
        super.onInitialize();
        setKey(1,"↑");
    }
}
