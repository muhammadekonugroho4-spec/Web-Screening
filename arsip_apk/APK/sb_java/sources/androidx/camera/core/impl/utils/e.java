package androidx.camera.core.impl.utils;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class e {

    public static class a {
        public static Context a(Context r02, String r1) {
            return r02.createAttributionContext(r1);
        }

        public static String b(Context r02) {
            return r02.getAttributionTag();
        }
    }

    public static class b {
        public static Context a(Context r02, int r1) {
            return r02.createDeviceContext(r1);
        }

        public static int b(Context r02) {
            return r02.getDeviceId();
        }
    }

    public static Context a(Context r4) {
        Context r02 = r4.getApplicationContext();
        int r1 = Build.VERSION.SDK_INT;
        if (r1 < 34) goto L8;
        int r2 = b.b(r4);
        if (r2 == b.b(r02)) goto L8;
        r02 = b.a(r02, r2);
    L8:
        if (r1 < 30) goto L13;
        String r42 = a.b(r4);
        if (Objects.equals(r42, a.b(r02)) == true) goto L13;
        return a.a(r02, r42);
    L13:
        return r02;
    }

    public static Application b(Context r1) {
        Context r12 = a(r1);
    L4:
        if ((r12 instanceof ContextWrapper) == false) goto L10;
        if ((r12 instanceof Application) == true) goto L8;
        r12 = ((ContextWrapper) r12).getBaseContext();
        goto L4
    L8:
        return (Application) r12;
    L10:
        return null;
    }
}
