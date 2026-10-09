package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public B f3353a;

    public FitWindowsFrameLayout(Context r1) {
        super(r1);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect r2) {
        B r02 = this.f3353a;
        if (r02 == null) goto L6;
        r02.a(r2);
    L6:
        return super.fitSystemWindows(r2);
    }

    public void setOnFitSystemWindowsListener(B r1) {
        this.f3353a = r1;
    }

    public FitWindowsFrameLayout(Context r1, AttributeSet r2) {
        super(r1, r2);
    }
}
