package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public static final A f19862a = null;

    static {
        f19862a = new A();
    }

    public A() {
    }

    public final int a(Context r3) {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
        return 0;
    L5:
        return B.f19877a.a(r3);
    }
}
