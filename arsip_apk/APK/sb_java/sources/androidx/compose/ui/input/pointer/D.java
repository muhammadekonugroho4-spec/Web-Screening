package androidx.compose.ui.input.pointer;

/* loaded from: classes.dex */
public abstract class D {
    public static final int a(boolean r02, boolean r1, boolean r2) {
        int r12 = (r1 ? 1 : 0) << 1;
        return L.a(((r02 ? 1 : 0) | r12) | ((r2 ? 1 : 0) << 2));
    }
}
