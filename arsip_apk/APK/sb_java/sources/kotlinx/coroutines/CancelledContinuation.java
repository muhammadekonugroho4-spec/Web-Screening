package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u000b\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/CancelledContinuation;", "Lkotlinx/coroutines/CompletedExceptionally;", "Lkotlin/coroutines/e;", "continuation", "", "cause", "", "handled", "<init>", "(Lkotlin/coroutines/e;Ljava/lang/Throwable;Z)V", "makeResumed", "()Z", "Lkotlinx/atomicfu/AtomicBoolean;", "_resumed", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CancelledContinuation extends CompletedExceptionally {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _resumed$volatile$FU = null;
    private volatile /* synthetic */ int _resumed$volatile;

    static {
        _resumed$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(CancelledContinuation.class, "_resumed$volatile");
    }

    public CancelledContinuation(kotlin.coroutines.e<?> r3, Throwable r4, boolean r5) {
        if (r4 != null) goto L4;
        r4 = new CancellationException("Continuation " + r3 + " was cancelled normally");
    L4:
        super(r4, r5);
    }

    private final /* synthetic */ int get_resumed$volatile() {
        return this._resumed$volatile;
    }

    private static final /* synthetic */ AtomicIntegerFieldUpdater get_resumed$volatile$FU() {
        return _resumed$volatile$FU;
    }

    private final /* synthetic */ void set_resumed$volatile(int r1) {
        this._resumed$volatile = r1;
    }

    public final boolean makeResumed() {
        return get_resumed$volatile$FU().compareAndSet(this, 0, 1);
    }
}
