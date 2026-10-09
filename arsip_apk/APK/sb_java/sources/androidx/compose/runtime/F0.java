package androidx.compose.runtime;

/* loaded from: classes.dex */
public interface F0 extends InterfaceC3471v0, G0 {
    void A(long r1);

    @Override // androidx.compose.runtime.InterfaceC3471v0
    long e();

    @Override // androidx.compose.runtime.o2
    /* bridge */ /* synthetic */ default Object getValue() {
        return getValue();
    }

    default void i(long r1) {
        A(r1);
    }

    @Override // androidx.compose.runtime.G0
    /* bridge */ /* synthetic */ default void setValue(Object r3) {
        i(((Number) r3).longValue());
    }

    @Override // androidx.compose.runtime.o2
    default Long getValue() {
        return Long.valueOf(e());
    }
}
