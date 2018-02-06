package com.justwen.ime.common;

import com.justwen.ime.interfaces.InputController;
import com.justwen.ime.interfaces.InputModeController;
import com.justwen.ime.interfaces.ViewController;


public class ControllerProxy {

    private InputController mInputController;

    private InputModeController mInputModeController;

    private ViewController mViewController;

    private static class SingleTonHolder {
        static ControllerProxy sInstance = new ControllerProxy();
    }

    public static ControllerProxy getInstance() {
        return SingleTonHolder.sInstance;
    }

    public ViewController getViewController() {
        return mViewController;
    }

    public void setViewController(ViewController viewController) {
        mViewController = viewController;
        if (mInputModeController != null) {
            mInputModeController.setViewController(viewController);
        }
    }

    public InputController getInputController() {
        return mInputController;
    }

    public void setInputController(InputController inputController) {
        mInputController = inputController;
    }

    public InputModeController getInputModeController() {
        return mInputModeController;
    }

    public void setInputModeController(InputModeController inputModeController) {
        mInputModeController = inputModeController;
    }
}
