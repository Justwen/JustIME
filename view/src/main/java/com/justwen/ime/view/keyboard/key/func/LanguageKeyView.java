package com.justwen.ime.view.keyboard.key.func;

import android.content.Context;
import android.util.AttributeSet;

import com.justwen.ime.common.KeyCode;

/**
 * Created by Justwen on 2018/2/5.
 */

public class LanguageKeyView extends FunctionKeyView {

    public LanguageKeyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onInitialize() {
        super.onInitialize();
        if (mInputModeController.isChineseMode()) {
            setKey(KeyCode.KEYCODE_LANGUAGE, "中/EN");
        } else {
            setKey(KeyCode.KEYCODE_LANGUAGE, "EN/中");
        }
    }

    @Override
    protected void processKey() {
        mInputModeController.toggleLanguage();
    }
}
