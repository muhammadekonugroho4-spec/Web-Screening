package io.reactivex.disposables;

/* loaded from: classes2.dex */
final class RunnableDisposable extends ReferenceDisposable<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    public RunnableDisposable(Runnable r1) {
        super(r1);
    }

    @Override // io.reactivex.disposables.ReferenceDisposable
    public /* bridge */ /* synthetic */ void b(Object r1) {
        c((Runnable) r1);
    }

    public void c(Runnable r1) {
        r1.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + a() + ", " + get() + ")";
    }
}
