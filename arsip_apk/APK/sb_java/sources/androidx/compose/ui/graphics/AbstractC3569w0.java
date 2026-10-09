package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;

/* renamed from: androidx.compose.ui.graphics.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3569w0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17859b = null;

    /* renamed from: a, reason: collision with root package name */
    public final ColorFilter f17860a;

    /* renamed from: androidx.compose.ui.graphics.w0$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public static /* synthetic */ AbstractC3569w0 b(a r02, long r1, int r3, int r4, Object r5) {
            if ((r4 & 2) == 0) goto L6;
            r3 = AbstractC3513e0.f17338a.z();
        L6:
            return r02.a(r1, r3);
        }

        public final AbstractC3569w0 a(long r3, int r5) {
            return new C3515f0(r3, r5, null);
        }

        public a() {
        }
    }

    static {
        f17859b = new a(null);
    }

    public AbstractC3569w0(ColorFilter r1) {
        this.f17860a = r1;
    }

    public final ColorFilter a() {
        return this.f17860a;
    }
}
