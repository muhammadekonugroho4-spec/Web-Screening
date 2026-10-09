package kotlin.reflect.jvm.internal.impl.storage;

/* loaded from: classes3.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f179956a;

    /* renamed from: b, reason: collision with root package name */
    public final Thread f179957b;

    public k(Object r1) {
        this.f179956a = r1;
        this.f179957b = Thread.currentThread();
    }

    public Object a() {
        if (b() == false) goto L7;
        return this.f179956a;
    L7:
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean b() {
        if (this.f179957b != Thread.currentThread()) goto L6;
        return true;
    L6:
        return false;
    }
}
