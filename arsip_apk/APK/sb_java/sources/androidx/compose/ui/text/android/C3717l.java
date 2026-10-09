package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: androidx.compose.ui.text.android.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3717l {

    /* renamed from: a, reason: collision with root package name */
    public static final C3717l f19783a = null;

    static {
        f19783a = new C3717l();
    }

    public C3717l() {
    }

    public static final BoringLayout a(CharSequence r11, TextPaint r12, int r13, Layout.Alignment r14, float r15, float r16, BoringLayout.Metrics r17, boolean r18, TextUtils.TruncateAt r19, int r20) {
        return new BoringLayout(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
    }

    public static final BoringLayout.Metrics b(CharSequence r2, TextPaint r3, TextDirectionHeuristic r4) {
        if (r4.isRtl(r2, 0, r2.length()) == false) goto L5;
        return null;
    L5:
        return BoringLayout.isBoring(r2, r3, null);
    }
}
