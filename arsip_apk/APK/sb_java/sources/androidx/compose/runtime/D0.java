package androidx.compose.runtime;

/* loaded from: classes.dex */
public interface D0 extends InterfaceC3403i0, G0 {
    @Override // androidx.compose.runtime.InterfaceC3403i0
    float a();

    @Override // androidx.compose.runtime.o2
    /* bridge */ /* synthetic */ default Object getValue() {
        return getValue();
    }

    default void k(float r1) {
        q(r1);
    }

    void q(float r1);

    @Override // androidx.compose.runtime.G0
    /* bridge */ /* synthetic */ default void setValue(Object r1) {
        k(((Number) r1).floatValue());
    }

    @Override // androidx.compose.runtime.o2
    default Float getValue() {
        return Float.valueOf(a());
    }
}
