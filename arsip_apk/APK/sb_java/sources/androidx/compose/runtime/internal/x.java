package androidx.compose.runtime.internal;

import android.os.Looper;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final long f16354a = 0;

    static {
        long r02 = Looper.getMainLooper().getThread().getId();     // Catch: Exception -> L4
    L5:
        f16354a = r02;
        return;
    L4:
        r02 = -1;
        goto L5
    }

    public static final long a() {
        return f16354a;
    }
}
