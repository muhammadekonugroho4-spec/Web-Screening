package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: androidx.compose.ui.text.android.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3716k {

    /* renamed from: a, reason: collision with root package name */
    public static final C3716k f19780a = null;

    static {
        f19780a = new C3716k();
    }

    public C3716k() {
    }

    public final BoringLayout a(CharSequence r14, TextPaint r15, int r16, BoringLayout.Metrics r17, Layout.Alignment r18, boolean r19, boolean r20, TextUtils.TruncateAt r21, int r22) {
        boolean r02 = false;
        if (r16 < 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == true) goto L8;
        androidx.compose.ui.text.internal.a.a("negative width");
    L8:
        if (r22 < 0) goto L10;
        r02 = true;
    L10:
        if (r02 == true) goto L13;
        androidx.compose.ui.text.internal.a.a("negative ellipsized width");
    L13:
        if (Build.VERSION.SDK_INT < 33) goto L17;
        return C3715j.a(r14, r15, r16, r18, 1.0f, 0.0f, r17, r19, r20, r21, r22);
    L17:
        return C3717l.a(r14, r15, r16, r18, 1.0f, 0.0f, r17, r19, r21, r22);
    L5:
        r2 = false;
        goto L6
    }

    public final boolean b(BoringLayout r3) {
        if (Build.VERSION.SDK_INT >= 33) goto L5;
        return false;
    L5:
        return C3715j.c(r3);
    }

    public final BoringLayout.Metrics c(CharSequence r3, TextPaint r4, TextDirectionHeuristic r5) {
        if (Build.VERSION.SDK_INT < 33) goto L7;
        return C3715j.b(r3, r4, r5);
    L7:
        return C3717l.b(r3, r4, r5);
    }
}
