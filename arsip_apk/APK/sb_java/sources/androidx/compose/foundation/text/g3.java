package androidx.compose.foundation.text;

/* loaded from: classes.dex */
public final class g3 implements androidx.compose.ui.text.input.G {

    /* renamed from: b, reason: collision with root package name */
    public final androidx.compose.ui.text.input.G f9942b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9943c;
    public final int d;

    public g3(androidx.compose.ui.text.input.G r1, int r2, int r3) {
        this.f9942b = r1;
        this.f9943c = r2;
        this.d = r3;
    }

    @Override // androidx.compose.ui.text.input.G
    public int a(int r3) {
        int r02 = this.f9942b.a(r3);
        if (r3 >= 0) goto L5;
    L7:
        return r02;
    L5:
        if (r3 > this.d) goto L7;
        h3.b(r02, this.f9943c, r3);
        goto L7
    }

    @Override // androidx.compose.ui.text.input.G
    public int b(int r3) {
        int r02 = this.f9942b.b(r3);
        if (r3 >= 0) goto L5;
    L7:
        return r02;
    L5:
        if (r3 > this.f9943c) goto L7;
        h3.a(r02, this.d, r3);
        goto L7
    }
}
