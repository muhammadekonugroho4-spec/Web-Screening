package androidx.compose.ui.text.android.selection;

/* loaded from: classes.dex */
public abstract class b implements f {
    static {
    }

    public b() {
    }

    @Override // androidx.compose.ui.text.android.selection.f
    public int a(int r3) {
        int r32 = f(r3);
        if (r32 != (-1)) goto L6;
        return -1;
    L6:
        if (f(r32) != (-1)) goto L8;
        return -1;
    L8:
        return r32;
    }

    @Override // androidx.compose.ui.text.android.selection.f
    public int b(int r3) {
        int r32 = e(r3);
        if (r32 != (-1)) goto L6;
        return -1;
    L6:
        if (e(r32) != (-1)) goto L8;
        return -1;
    L8:
        return r32;
    }

    @Override // androidx.compose.ui.text.android.selection.f
    public int c(int r1) {
        return f(r1);
    }

    @Override // androidx.compose.ui.text.android.selection.f
    public int d(int r1) {
        return e(r1);
    }

    public abstract int e(int r1);

    public abstract int f(int r1);
}
