package com.justwen.ime.impl;

import com.justwen.ime.common.InputMode;
import com.justwen.ime.common.PreferenceKey;
import com.justwen.ime.common.SharePreferenceHolder;
import com.justwen.ime.interfaces.InputModeController;
import com.justwen.ime.interfaces.ViewController;

/**
 * Created by Justwen on 2018/2/6.
 */

public class InputModeControllerImpl implements InputModeController {

    private int mInputMode;

    private int mInputRange;

    private ViewController mViewController;

    private SharePreferenceHolder mPreferenceHolder = SharePreferenceHolder.getInstance();

    public InputModeControllerImpl() {
        mInputMode = mPreferenceHolder.getInt(PreferenceKey.KEY_INPUT_MODE, InputMode.INPUT_MODE_3X4_PINGYIN);
        mInputRange = InputMode.INPUT_RANGE_TEXT;
    }

    @Override
    public int getInputRange() {
        return mInputRange;
    }

    @Override
    public int getInputMode() {
        return mInputMode;
    }

    @Override
    public int getKeyboardType() {
        return isTextRange() ? getInputMode() : getInputRange();
    }

    @Override
    public void setInputMode(int inputMode) {
        mInputMode = inputMode;
        mInputRange = InputMode.INPUT_RANGE_TEXT;
        mPreferenceHolder.putInt(PreferenceKey.KEY_INPUT_MODE, inputMode);
        if (isChineseMode()) {
            mPreferenceHolder.putInt(PreferenceKey.KEY_INPUT_MODE_CN, inputMode);
        } else {
            mPreferenceHolder.putInt(PreferenceKey.KEY_INPUT_MODE_EN, inputMode);
        }
        mViewController.updateKeyboardView();

    }

    @Override
    public void setInputRange(int inputRange) {
        if (mInputRange != inputRange) {
            mInputRange = inputRange;
            mViewController.updateKeyboardView();
        }

    }

    @Override
    public void toggleLanguage() {
        if (isChineseMode()) {
            setInputMode(mPreferenceHolder.getInt(PreferenceKey.KEY_INPUT_MODE_EN,InputMode.INPUT_MODE_QWERTY_EN));
        } else {
            setInputMode(mPreferenceHolder.getInt(PreferenceKey.KEY_INPUT_MODE_CN,InputMode.INPUT_MODE_3X4_PINGYIN));
        }

    }

    @Override
    public boolean isTextRange() {
        return mInputRange == InputMode.INPUT_RANGE_TEXT;
    }

    @Override
    public boolean isNumberRange() {
        return mInputRange == InputMode.INPUT_RANGE_NUMBER;
    }

    @Override
    public boolean isChineseMode() {
        return mInputMode == InputMode.INPUT_MODE_3X4_PINGYIN
                || mInputMode == InputMode.INPUT_MODE_QWERTY_PINYIN
                || mInputMode == InputMode.INPUT_MODE_QWERTY_WUBI
                || mInputMode == InputMode.INPUT_MODE_QWERTY_SHUANGPIN
                || mInputMode == InputMode.INPUT_MODE_HWR_FULL
                || mInputMode == InputMode.INPUT_MODE_HWR_HALF
                || mInputMode == InputMode.INPUT_MODE_3X4_STROKE;
    }

    @Override
    public void setViewController(ViewController viewController) {
        mViewController = viewController;
    }
}
