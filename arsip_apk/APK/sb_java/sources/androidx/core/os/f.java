package androidx.core.os;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class f {

    public static class a {
        public static LocaleList a(Configuration r02) {
            return r02.getLocales();
        }

        public static void b(Configuration r02, i r1) {
            r02.setLocales((LocaleList) r1.h());
        }
    }

    public static i a(Configuration r02) {
        return i.i(a.a(r02));
    }

    public static void b(Configuration r02, i r1) {
        a.b(r02, r1);
    }
}
