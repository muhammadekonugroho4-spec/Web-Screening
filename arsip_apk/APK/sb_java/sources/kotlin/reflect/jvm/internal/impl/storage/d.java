package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public class d implements j {

    /* renamed from: b, reason: collision with root package name */
    public final Lock f179952b;

    public d(Lock r2) {
        p.l(r2, "lock");
        this.f179952b = r2;
    }

    public final Lock a() {
        return this.f179952b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.j
    public void lock() {
        this.f179952b.lock();
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.j
    public void unlock() {
        this.f179952b.unlock();
    }

    public /* synthetic */ d(Lock r1, int r2, kotlin.jvm.internal.i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = new ReentrantLock();
    L5:
        this(r1);
    }
}
