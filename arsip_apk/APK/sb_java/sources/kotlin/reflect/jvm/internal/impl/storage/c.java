package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public final class c extends d {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f179951c;
    public final kotlin.jvm.functions.l d;

    public c(Lock r2, Runnable r3, kotlin.jvm.functions.l r4) {
        p.l(r2, "lock");
        p.l(r3, "checkCancelled");
        p.l(r4, "interruptedExceptionHandler");
        super(r2);
        this.f179951c = r3;
        this.d = r4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.d, kotlin.reflect.jvm.internal.impl.storage.j
    public void lock() {
    L9:
        if (a().tryLock(50, TimeUnit.MILLISECONDS) == true) goto L12;
        this.f179951c.run();     // Catch: InterruptedException -> L6
        goto L9
    L12:
        return;
    L6:
        e = move-exception;
        this.d.invoke(e);
    }

    public c(Runnable r2, kotlin.jvm.functions.l r3) {
        p.l(r2, "checkCancelled");
        p.l(r3, "interruptedExceptionHandler");
        this(new ReentrantLock(), r2, r3);
    }
}
