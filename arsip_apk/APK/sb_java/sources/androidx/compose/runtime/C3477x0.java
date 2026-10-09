package androidx.compose.runtime;

/* renamed from: androidx.compose.runtime.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3477x0 implements kotlin.jvm.functions.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.l f16742a;

    public C3477x0(kotlin.jvm.functions.l r1) {
        this.f16742a = r1;
    }

    public final Object a(long r4) {
        return this.f16742a.invoke(Long.valueOf(r4 / 1000000));
    }

    @Override // kotlin.jvm.functions.l
    public /* bridge */ /* synthetic */ Object invoke(Object r3) {
        return a(((Number) r3).longValue());
    }
}
