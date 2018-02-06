package com.justwen.ime.view.keyboard.key;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;

import com.justwen.ime.common.ControllerProxy;
import com.justwen.ime.interfaces.InputModeController;
import com.justwen.ime.view.R;

public class KeyView extends AppCompatTextView implements View.OnClickListener {

    protected int mKeyCode;

    protected InputModeController mInputModeController = ControllerProxy.getInstance().getInputModeController();

    public KeyView(Context context) {
        this(context, null);
    }

    public KeyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize(attrs);
    }

    protected void initialize(AttributeSet attrs) {

        if (attrs != null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.Key);
            int keyCode = a.getInt(R.styleable.Key_keyCode, 0);
            CharSequence text = a.getString(R.styleable.Key_keyLabel);
            setKey(keyCode, text);
            a.recycle();
        }
        setOnClickListener(this);
        onInitialize();
    }

    protected void onInitialize() {

    }

    protected void processKey() {
    }


    public void setKey(int code, CharSequence text) {
        mKeyCode = code;
        setText(text);
    }


    @Override
    public void onClick(View v) {
        processKey();
    }
}
