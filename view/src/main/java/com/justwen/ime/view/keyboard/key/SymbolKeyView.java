package com.justwen.ime.view.keyboard.key;

import android.content.Context;
import android.util.AttributeSet;

import com.justwen.ime.view.R;

/**
 * Created by Justwen on 2018/2/6.
 */

public class SymbolKeyView extends KeyView {

    public SymbolKeyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onInitialize() {
        setBackgroundResource(R.drawable.key_bg_func);
    }
}
