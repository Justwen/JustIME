package com.justwen.ime.view.keyboard;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import com.justwen.ime.view.R;

public class ParentView extends FrameLayout {

    public ParentView(@NonNull Context context) {
        this(context,null);
    }

    public ParentView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initialize();
    }

    private void initialize() {
        setBackgroundResource(R.color.keyboard_bg);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int height = MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.keyboard_height),MeasureSpec.EXACTLY);
        setMeasuredDimension(widthMeasureSpec,height);
        super.onMeasure(widthMeasureSpec, height);
    }
}
