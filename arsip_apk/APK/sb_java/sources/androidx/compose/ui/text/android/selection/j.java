package androidx.compose.ui.text.android.selection;

/* loaded from: classes.dex */
public final class j implements f {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f19797a;

    /* renamed from: b, reason: collision with root package name */
    public final i f19798b;

    static {
    }

    public j(CharSequence r1, i r2) {
        this.f19797a = r1;
        this.f19798b = r2;
    }

    @Override // androidx.compose.ui.text.android.selection.f
    public int a(int r3) {
    L2:
        r3 = this.f19798b.q(r3);
        if (r3 == (-1)) goto L8;
        if (r3 == 0) goto L8;
        if (Character.isWhitespace(this.f19797a.charAt(r3 - 1)) == true) goto L2;
        return r3;
    L8:
        return -1;
    }

    @Override // androidx.compose.ui.text.android.selection.f
    public int b(int r3) {
    L2:
        r3 = this.f19798b.p(r3);
        if (r3 == (-1)) goto L10;
        if (r3 == this.f19797a.length()) goto L10;
        if (Character.isWhitespace(this.f19797a.charAt(r3)) == true) goto L2;
        return r3;
    L10:
        return -1;
    }

    @Override // androidx.compose.ui.text.android.selection.f
    public int c(int r2) {
    L2:
        r2 = this.f19798b.q(r2);
        if (r2 == (-1)) goto L4;
        if (Character.isWhitespace(this.f19797a.charAt(r2)) == true) goto L2;
        return r2;
    L4:
        return -1;
    }

    @Override // androidx.compose.ui.text.android.selection.f
    public int d(int r3) {
    L2:
        r3 = this.f19798b.p(r3);
        if (r3 == (-1)) goto L4;
        if (Character.isWhitespace(this.f19797a.charAt(r3 - 1)) == true) goto L2;
        return r3;
    L4:
        return -1;
    }
}
