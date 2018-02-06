package com.justwen.ime;

import android.app.Application;

import com.justwen.ime.common.ControllerProxy;
import com.justwen.ime.common.ServiceHolder;
import com.justwen.ime.impl.InputModeControllerImpl;
import com.justwen.ime.view.ViewControllerImpl;


public class JustImeApplication extends Application {

    @Override
    public void onCreate() {
        ServiceHolder.setContext(this);
        ControllerProxy.getInstance().setInputModeController(new InputModeControllerImpl());
        ControllerProxy.getInstance().setViewController(new ViewControllerImpl());
        super.onCreate();
    }
}
