package androidx.compose.ui;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f16839a = null;

    static {
        f16839a = new Handler(Looper.getMainLooper());
    }

    public static /* synthetic */ void a(kotlin.jvm.functions.a r02) {
        d(r02);
    }

    public static final long b() {
        return System.currentTimeMillis();
    }

    public static final Object c(long r1, final kotlin.jvm.functions.a r3) {
        Runnable r02 = new b(r3);
        f16839a.postDelayed(r02, r1);
        return r02;
    }

    public static final void d(kotlin.jvm.functions.a r02) {
        r02.invoke();
    }

    public static final void e(Object r1) {
        if ((r1 instanceof Runnable) == false) goto L5;
        Runnable r02 = (Runnable) r1;
    L6:
        if (r02 != null) goto L8;
        return;
    L8:
        f16839a.removeCallbacks((Runnable) r1);
        return;
    L5:
        r02 = null;
        goto L6
    }
}
