package androidx.compose.ui.tooling.animation.clock;

import java.util.List;
import kotlin.collections.AbstractC11776u;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20470a = null;

    static {
        f20470a = AbstractC11776u.e("TransformOriginInterruptionHandling");
    }

    public static final long a(long r2) {
        return r2 * 1000000;
    }

    public static final long b(long r2) {
        return (r2 + 999999) / 1000000;
    }
}
