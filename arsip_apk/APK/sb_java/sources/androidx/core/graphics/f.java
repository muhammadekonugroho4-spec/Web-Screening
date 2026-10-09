package androidx.core.graphics;

import android.graphics.Paint;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f22881a = null;

    public static class a {
        public static boolean a(Paint r02, String r1) {
            return r02.hasGlyph(r1);
        }
    }

    static {
        f22881a = new ThreadLocal();
    }

    public static boolean a(Paint r02, String r1) {
        return a.a(r02, r1);
    }
}
