package androidx.window.layout.util;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;

/* loaded from: classes4.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f28994a = null;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f28995a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final String f28996b = null;

        static {
            f28995a = new a();
            String r02 = b.class.getSimpleName();
            kotlin.jvm.internal.p.k(r02, "getSimpleName(...)");
            f28996b = r02;
        }

        public a() {
        }

        public final b a() {
            int r02 = Build.VERSION.SDK_INT;
            if (r02 < 30) goto L7;
            return f.f29000b;
        L7:
            if (r02 < 29) goto L11;
            return e.f28999b;
        L11:
            if (r02 < 28) goto L15;
            return d.f28998b;
        L15:
            return c.f28997b;
        }

        public final String b() {
            return f28996b;
        }
    }

    static {
        f28994a = a.f28995a;
    }

    Rect a(Activity r1);
}
