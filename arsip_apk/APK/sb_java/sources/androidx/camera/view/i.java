package androidx.camera.view;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static /* synthetic */ boolean a(AtomicReference r1, Object r2, Object r3) {
    L3:
        if (r1.compareAndSet(r2, r3) == true) goto L4;
        if (r1.get() == r2) goto L3;
        return false;
    L4:
        return true;
    }
}
