package androidx.compose.foundation.relocation;

/* loaded from: classes.dex */
public interface a {
    static /* synthetic */ Object a(a r02, androidx.compose.ui.geometry.g r1, kotlin.coroutines.e r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 1) == 0) goto L7;
        r1 = null;
    L7:
        return r02.b(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
    }

    Object b(androidx.compose.ui.geometry.g r1, kotlin.coroutines.e r2);
}
