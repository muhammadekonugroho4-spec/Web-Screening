package kotlin.io;

import java.io.Closeable;

/* loaded from: classes3.dex */
public abstract class b {
    public static final void a(Closeable r02, Throwable r1) {
        if (r02 == null) goto L13;
        if (r1 != null) goto L11;
        r02.close();
        return;
    L11:
        r02.close();     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        kotlin.f.a(r1, th);
        return;
    }
}
