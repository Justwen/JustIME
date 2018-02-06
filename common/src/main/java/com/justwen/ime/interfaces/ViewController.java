package com.justwen.ime.interfaces;

import android.view.View;

/**
 * Created by Justwen on 2018/2/5.
 */

public interface ViewController {

    View getInputView();

    void updateKeyboardView();

    void onDestroy();

    View getInputView(boolean force);

    View getKeyboardView();
}
