package androidx.window.layout.util;

import android.content.Context;
import android.os.Build;

/* loaded from: classes4.dex */
public interface k {

    /* renamed from: a, reason: collision with root package name */
    public static final a f29002a = null;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f29003a = null;

        static {
            f29003a = new a();
        }

        public a() {
        }

        public final k a() {
            if (Build.VERSION.SDK_INT < 34) goto L7;
            return l.f29004b;
        L7:
            return m.f29005b;
        }
    }

    static {
        f29002a = a.f29003a;
    }

    float a(Context r1);
}
