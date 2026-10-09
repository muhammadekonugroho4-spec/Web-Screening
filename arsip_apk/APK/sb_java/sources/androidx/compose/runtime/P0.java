package androidx.compose.runtime;

import androidx.compose.runtime.internal.AbstractC3406b;
import androidx.compose.runtime.internal.AtomicInt;

/* loaded from: classes.dex */
public final class P0 implements InterfaceC3402i {

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.functions.a f15978b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInt f15979c;

    static {
    }

    public P0(kotlin.jvm.functions.a r1) {
        this.f15978b = r1;
        this.f15979c = AbstractC3406b.b(false);
    }

    @Override // androidx.compose.runtime.InterfaceC3402i
    public void cancel() {
        if (AbstractC3406b.d(this.f15979c, true) == true) goto L6;
        this.f15978b.invoke();
        return;
    }
}
