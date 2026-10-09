package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;

/* loaded from: classes.dex */
public interface G0 {
    static /* synthetic */ Object d(G0 r02, MutatePriority r1, kotlin.jvm.functions.p r2, kotlin.coroutines.e r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 1) == 0) goto L7;
        r1 = MutatePriority.Default;
    L7:
        return r02.g(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
    }

    boolean a();

    default boolean b() {
        return true;
    }

    float c(float r1);

    boolean e();

    default boolean f() {
        return true;
    }

    Object g(MutatePriority r1, kotlin.jvm.functions.p r2, kotlin.coroutines.e r3);
}
