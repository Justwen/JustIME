package com.justwen.ime.interfaces;

/**
 * Created by Justwen on 2018/2/5.
 */

public interface InputModeController {

    int getInputRange();

    int getInputMode();

    int getKeyboardType();

    void setInputMode(int inputMode);

    void setInputRange(int inputRange);

    void toggleLanguage();

    boolean isTextRange();

    boolean isNumberRange();

    boolean isChineseMode();

    void setViewController(ViewController viewController);

}
