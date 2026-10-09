package androidx.compose.ui.platform;

import com.clevertap.android.sdk.Constants;

/* renamed from: androidx.compose.ui.platform.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3648a implements InterfaceC3658f {

    /* renamed from: a, reason: collision with root package name */
    public String f19285a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f19286b;

    static {
    }

    public AbstractC3648a() {
        this.f19286b = new int[2];
    }

    public final int[] c(int r3, int r4) {
        if (r3 < 0) goto L8;
        if (r4 < 0) goto L10;
        if (r3 == r4) goto L11;
        int[] r02 = this.f19286b;
        r02[0] = r3;
        r02[1] = r4;
        return r02;
    L11:
        return null;
    L10:
        return null;
    L8:
        return null;
    }

    public final String d() {
        String r02 = this.f19285a;
        if (r02 == null) goto L5;
        return r02;
    L5:
        kotlin.jvm.internal.p.D(Constants.KEY_TEXT);
        return null;
    }

    public void e(String r1) {
        f(r1);
    }

    public final void f(String r1) {
        this.f19285a = r1;
    }
}
