package androidx.camera.core.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class P {
    public P() {
    }

    public static P a(Executor r1, Handler r2) {
        return new C2262h(r1, r2);
    }

    public abstract Executor b();

    public abstract Handler c();
}
