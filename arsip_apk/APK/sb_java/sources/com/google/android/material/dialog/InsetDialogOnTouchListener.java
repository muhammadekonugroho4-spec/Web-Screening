package com.google.android.material.dialog;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes5.dex */
public class InsetDialogOnTouchListener implements View.OnTouchListener {
    private final Dialog dialog;
    private final int leftInset;
    private final int prePieSlop;
    private final int topInset;

    public InsetDialogOnTouchListener(Dialog r2, Rect r3) {
        this.dialog = r2;
        this.leftInset = r3.left;
        this.topInset = r3.top;
        this.prePieSlop = ViewConfiguration.get(r2.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View r6, MotionEvent r7) {
        View r02 = r6.findViewById(R.id.content);
        int r1 = this.leftInset + r02.getLeft();
        int r2 = r02.getWidth() + r1;
        int r3 = this.topInset + r02.getTop();
        if (new RectF(r1, r3, r2, r02.getHeight() + r3).contains(r7.getX(), r7.getY()) == false) goto L5;
        return false;
    L5:
        MotionEvent r03 = MotionEvent.obtain(r7);
        if (r7.getAction() != 1) goto L9;
        r03.setAction(4);
    L9:
        if (Build.VERSION.SDK_INT >= 28) goto L11;
        r03.setAction(0);
        int r72 = this.prePieSlop;
        r03.setLocation((-r72) - 1, (-r72) - 1);
    L11:
        r6.performClick();
        return this.dialog.onTouchEvent(r03);
    }
}
