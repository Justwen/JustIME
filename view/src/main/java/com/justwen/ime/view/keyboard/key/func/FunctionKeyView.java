package com.justwen.ime.view.keyboard.key.func;

import android.content.Context;
import android.util.AttributeSet;

import com.justwen.ime.view.R;
import com.justwen.ime.view.keyboard.key.KeyView;

/**
 * Created by Justwen on 2018/2/5.
 */

public class FunctionKeyView extends KeyView {

    public FunctionKeyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onInitialize() {
        setBackgroundResource(R.drawable.key_bg_func);
    }
}
