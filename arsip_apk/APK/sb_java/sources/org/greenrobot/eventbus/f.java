package org.greenrobot.eventbus;

import com.clevertap.android.sdk.Constants;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public interface f {

    public static class a {
        public static f a() {
            if (org.greenrobot.eventbus.android.a.a() == false) goto L7;
            return org.greenrobot.eventbus.android.a.b().f182461a;
        L7:
            return new b();
        }
    }

    public static class b implements f {
        public b() {
        }

        @Override // org.greenrobot.eventbus.f
        public void a(Level r4, String r5) {
            System.out.println(Constants.AES_PREFIX + r4 + "] " + r5);
        }

        @Override // org.greenrobot.eventbus.f
        public void b(Level r4, String r5, Throwable r6) {
            System.out.println(Constants.AES_PREFIX + r4 + "] " + r5);
            r6.printStackTrace(System.out);
        }
    }

    void a(Level r1, String r2);

    void b(Level r1, String r2, Throwable r3);
}
