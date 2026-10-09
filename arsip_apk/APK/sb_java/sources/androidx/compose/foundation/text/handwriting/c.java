package androidx.compose.foundation.text.handwriting;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f9965a = false;

    static {
        if (Build.VERSION.SDK_INT < 34) goto L5;
        boolean r02 = true;
    L6:
        f9965a = r02;
        return;
    L5:
        r02 = false;
        goto L6
    }

    public static final boolean a() {
        return f9965a;
    }
}
