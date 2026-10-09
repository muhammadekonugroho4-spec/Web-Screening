package androidx.compose.ui.text.android;

import android.text.Layout;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f19757a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f19758b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final Layout.Alignment f19759c = null;

    static {
        f19757a = new g0();
        Layout.Alignment[] r02 = Layout.Alignment.values();
        Layout.Alignment r1 = Layout.Alignment.ALIGN_NORMAL;
        int r2 = r02.length;
        int r4 = 0;
        Layout.Alignment r3 = r1;
    L3:
        if (r4 >= r2) goto L11;
        Layout.Alignment r5 = r02[r4];
        if (kotlin.jvm.internal.p.g(r5.name(), "ALIGN_LEFT") == false) goto L8;
        r1 = r5;
    L10:
        r4 = r4 + 1;
        goto L3
    L8:
        if (kotlin.jvm.internal.p.g(r5.name(), "ALIGN_RIGHT") == false) goto L10;
        r3 = r5;
        goto L10
    L11:
        f19758b = r1;
        f19759c = r3;
    }

    public g0() {
    }

    public final Layout.Alignment a(int r2) {
        if (r2 == 0) goto L22;
        if (r2 == 1) goto L20;
        if (r2 == 2) goto L18;
        if (r2 == 3) goto L16;
        if (r2 == 4) goto L14;
        return Layout.Alignment.ALIGN_NORMAL;
    L14:
        return f19759c;
    L16:
        return f19758b;
    L18:
        return Layout.Alignment.ALIGN_CENTER;
    L20:
        return Layout.Alignment.ALIGN_OPPOSITE;
    L22:
        return Layout.Alignment.ALIGN_NORMAL;
    }
}
