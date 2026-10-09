package kotlin;

import kotlin.Result;

/* loaded from: classes3.dex */
public abstract class l {
    public static final Object a(Throwable r1) {
        kotlin.jvm.internal.p.l(r1, "exception");
        return new Result.Failure(r1);
    }

    public static final void b(Object r1) {
        if ((r1 instanceof Result.Failure) == true) goto L6;
        return;
    L6:
        throw ((Result.Failure) r1).exception;
    }
}
