package androidx.compose.runtime;

/* loaded from: classes.dex */
public interface E0 extends InterfaceC3423o0, G0 {
    @Override // androidx.compose.runtime.InterfaceC3423o0
    int d();

    @Override // androidx.compose.runtime.o2
    /* bridge */ /* synthetic */ default Object getValue() {
        return getValue();
    }

    void h(int r1);

    default void j(int r1) {
        h(r1);
    }

    @Override // androidx.compose.runtime.G0
    /* bridge */ /* synthetic */ default void setValue(Object r1) {
        j(((Number) r1).intValue());
    }

    @Override // androidx.compose.runtime.o2
    default Integer getValue() {
        return Integer.valueOf(d());
    }
}
