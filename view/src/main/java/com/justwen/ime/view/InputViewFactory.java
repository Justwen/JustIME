package com.justwen.ime.view;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.justwen.ime.common.InputMode;
import com.justwen.ime.common.KeyCode;
import com.justwen.ime.common.ServiceHolder;
import com.justwen.ime.view.keyboard.KeyboardView;
import com.justwen.ime.view.keyboard.ParentView;
import com.justwen.ime.view.keyboard.key.CharacterKeyView;

/**
 * Created by Justwen on 2018/2/5.
 */

public class InputViewFactory {

    public static ViewGroup getParentView() {
        return new ParentView(ServiceHolder.getContext());
    }

    public static View getKeyboardView(int inputMode) {
        LayoutInflater inflater = ServiceHolder.getLayoutInflater();
        KeyboardView keyboardView = null;

        switch (inputMode) {
            case InputMode.INPUT_MODE_QWERTY_PINYIN:
            case InputMode.INPUT_MODE_QWERTY_SHUANGPIN:
            case InputMode.INPUT_MODE_QWERTY_WUBI:
                keyboardView = (KeyboardView) inflater.inflate(R.layout.keyboard_qwerty_pinyin, null, false);
                initQwertyKeyboard(keyboardView);
                break;
            case InputMode.INPUT_MODE_3X4_PINGYIN:
                keyboardView = (KeyboardView) inflater.inflate(R.layout.keyboard_3x4_pinyin, null, false);
                init3x4Keyboard(keyboardView);
                break;
            case InputMode.INPUT_MODE_QWERTY_EN:
                keyboardView = (KeyboardView) inflater.inflate(R.layout.keyboard_qwerty_en, null, false);
                initQwertyKeyboard(keyboardView);
                break;
            default:
                break;
        }

        return keyboardView;
    }

    private static void initQwertyKeyboard(KeyboardView keyboardView) {
        Resources res = ServiceHolder.getContext().getResources();
        for (char i = KeyCode.KEYCODE_A; i <= KeyCode.KEYCODE_Z; i++) {
            int resId = res.getIdentifier("key_" + i, "id", "com.justwen.ime");
            CharacterKeyView keyView = keyboardView.findViewById(resId);
            if (keyView != null) {
                keyView.setParent(keyboardView);
                keyView.setKey(i, String.valueOf(i));
            }
        }
    }

    private static void init3x4Keyboard(KeyboardView keyboardView) {

    }

}
