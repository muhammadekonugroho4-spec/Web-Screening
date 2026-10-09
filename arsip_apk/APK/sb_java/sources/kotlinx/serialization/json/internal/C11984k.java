package kotlinx.serialization.json.internal;

/* renamed from: kotlinx.serialization.json.internal.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11984k extends C11983j {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f180874c;

    public C11984k(InterfaceC11990q r2, boolean r3) {
        kotlin.jvm.internal.p.l(r2, "writer");
        super(r2);
        this.f180874c = r3;
    }

    @Override // kotlinx.serialization.json.internal.C11983j
    public void n(String r2) {
        kotlin.jvm.internal.p.l(r2, "value");
        if (this.f180874c == false) goto L6;
        super.n(r2);
        return;
    L6:
        super.k(r2);
    }
}
