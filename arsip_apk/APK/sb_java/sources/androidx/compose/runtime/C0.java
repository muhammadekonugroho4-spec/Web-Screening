package androidx.compose.runtime;

/* loaded from: classes.dex */
public interface C0 extends InterfaceC3391e0, G0 {
    @Override // androidx.compose.runtime.InterfaceC3391e0
    double f();

    @Override // androidx.compose.runtime.o2
    /* bridge */ /* synthetic */ default Object getValue() {
        return getValue();
    }

    default void l(double r1) {
        t(r1);
    }

    @Override // androidx.compose.runtime.G0
    /* bridge */ /* synthetic */ default void setValue(Object r3) {
        l(((Number) r3).doubleValue());
    }

    void t(double r1);

    @Override // androidx.compose.runtime.o2
    default Double getValue() {
        return Double.valueOf(f());
    }
}
