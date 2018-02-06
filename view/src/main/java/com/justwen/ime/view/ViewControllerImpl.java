package com.justwen.ime.view;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;

import com.justwen.ime.common.ControllerProxy;
import com.justwen.ime.interfaces.InputModeController;
import com.justwen.ime.interfaces.ViewController;
import com.justwen.ime.view.keyboard.KeyboardView;

/**
 * Created by Justwen on 2018/2/5.
 */

public class ViewControllerImpl implements ViewController {

    private ViewGroup mParentView;

    private KeyboardView mKeyboardView;

    private InputModeController mInputModeController = ControllerProxy.getInstance().getInputModeController();

    private SparseArray<KeyboardView> mKeyboardViewList = new SparseArray<>();

    @Override
    public View getInputView() {
        mParentView = InputViewFactory.getParentView();
        updateKeyboardView();
        return mParentView;
    }

    @Override
    public void updateKeyboardView() {
        mParentView.removeAllViews();
        mKeyboardView = makeKeyboardView(mInputModeController.getKeyboardType());
        mParentView.addView(mKeyboardView);
    }

    @Override
    public void onDestroy() {
        mParentView = null;
        mKeyboardViewList.clear();
    }

    @Override
    public View getInputView(boolean force) {
        return force ? getInputView() : mParentView;
    }

    @Override
    public View getKeyboardView() {
        return mKeyboardView;
    }

    private KeyboardView makeKeyboardView(int inputMode) {
        KeyboardView keyboardView = mKeyboardViewList.get(inputMode);
        if (keyboardView == null) {
            keyboardView = (KeyboardView) InputViewFactory.getKeyboardView(inputMode);
            mKeyboardViewList.put(inputMode, keyboardView);
        }
        return keyboardView;
    }

}
