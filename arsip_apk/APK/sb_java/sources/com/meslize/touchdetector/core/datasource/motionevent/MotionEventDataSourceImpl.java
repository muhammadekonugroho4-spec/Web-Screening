package com.meslize.touchdetector.core.datasource.motionevent;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.meslize.touchdetector.core.datasource.motionevent.entity.a;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class MotionEventDataSourceImpl extends FrameLayout {
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent r2) {
        super.dispatchTouchEvent(r2);
        new a(r2);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        throw null;
    }
}
