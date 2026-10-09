package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public B f3354a;

    public FitWindowsLinearLayout(Context r1) {
        super(r1);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect r2) {
        B r02 = this.f3354a;
        if (r02 == null) goto L6;
        r02.a(r2);
    L6:
        return super.fitSystemWindows(r2);
    }

    public void setOnFitSystemWindowsListener(B r1) {
        this.f3354a = r1;
    }

    public FitWindowsLinearLayout(Context r1, AttributeSet r2) {
        super(r1, r2);
    }
}
