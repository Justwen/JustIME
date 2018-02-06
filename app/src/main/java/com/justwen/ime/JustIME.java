package com.justwen.ime;

import android.inputmethodservice.InputMethodService;
import android.view.View;
import android.view.inputmethod.EditorInfo;

import com.justwen.ime.common.ControllerProxy;
import com.justwen.ime.common.ServiceHolder;
import com.justwen.ime.interfaces.ViewController;

/**
 * Created by Justwen on 2018/2/4.
 */

public class JustIME extends InputMethodService {

    private ViewController mViewController;

    @Override
    public void onCreate() {
        ServiceHolder.setService(this);
        mViewController = ControllerProxy.getInstance().getViewController();
        super.onCreate();
    }

    @Override
    public View onCreateInputView() {
        return mViewController.getInputView();
    }

    @Override
    public void onStartInputView(EditorInfo info, boolean restarting) {
        super.onStartInputView(info, restarting);
    }

    @Override
    public void onDestroy() {
        ServiceHolder.setService(null);
        super.onDestroy();
    }
}
