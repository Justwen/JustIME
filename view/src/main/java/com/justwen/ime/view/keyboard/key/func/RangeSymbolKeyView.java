package com.justwen.ime.view.keyboard.key.func;

import android.content.Context;
import android.util.AttributeSet;

import com.justwen.ime.common.KeyCode;

/**
 * Created by Justwen on 2018/2/5.
 */

public class RangeSymbolKeyView extends FunctionKeyView {

    public RangeSymbolKeyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onInitialize() {
        super.onInitialize();
        setKey(KeyCode.KEYCODE_RANGE_SYMBOL,"符");
    }
}
