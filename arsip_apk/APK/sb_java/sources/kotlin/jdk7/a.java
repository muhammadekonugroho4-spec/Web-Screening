package kotlin.jdk7;

import androidx.activity.S;
import kotlin.f;

/* loaded from: classes3.dex */
public abstract class a {
    public static final void a(AutoCloseable r02, Throwable r1) {
        if (r02 == null) goto L13;
        if (r1 != null) goto L11;
        S.a(r02);
        return;
    L11:
        S.a(r02);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        f.a(r1, th);
        return;
    }
}
