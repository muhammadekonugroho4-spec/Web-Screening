package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class h {

    public static class a {
        public static LocaleList a(Object r02) {
            return ((LocaleManager) r02).getApplicationLocales();
        }
    }

    public static androidx.core.os.i a(Context r2) {
        if (Build.VERSION.SDK_INT < 33) goto L11;
        Object r22 = b(r2);
        if (r22 == null) goto L9;
        return androidx.core.os.i.i(a.a(r22));
    L9:
        return androidx.core.os.i.d();
    L11:
        return androidx.core.os.i.b(e.b(r2));
    }

    public static Object b(Context r1) {
        return r1.getSystemService("locale");
    }
}
