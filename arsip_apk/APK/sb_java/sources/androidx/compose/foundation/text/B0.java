package androidx.compose.foundation.text;

import android.R;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class B0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9276a = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            if (Build.VERSION.SDK_INT > 26) goto L5;
            int r02 = androidx.compose.foundation.N0.f7201a;
        L7:
            return B0.a(r02);
        L5:
            r02 = R.string.autofill;
            goto L7
        }

        public final int b() {
            return B0.a(R.string.copy);
        }

        public final int c() {
            return B0.a(R.string.cut);
        }

        public final int d() {
            return B0.a(R.string.paste);
        }

        public final int e() {
            return B0.a(R.string.selectAll);
        }

        public a() {
        }
    }

    static {
        f9276a = new a(null);
    }

    public static int a(int r02) {
        return r02;
    }
}
