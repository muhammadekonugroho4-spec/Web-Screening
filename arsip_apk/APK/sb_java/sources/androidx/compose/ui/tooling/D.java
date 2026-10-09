package androidx.compose.ui.tooling;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final a f20411a = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public static /* synthetic */ void c(a r02, String r1, Throwable r2, int r3, Object r4) {
            if ((r3 & 2) == 0) goto L5;
            r2 = null;
        L5:
            r02.b(r1, r2);
        }

        public final void a(String r2, Throwable r3) {
            Log.e("PreviewLogger", r2, r3);
        }

        public final void b(String r2, Throwable r3) {
            Log.w("PreviewLogger", r2, r3);
        }

        public a() {
        }
    }

    static {
        f20411a = new a(null);
    }
}
