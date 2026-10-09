package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class m {

    public static class a {
        public static KeyguardManager a(Context r1) {
            return (KeyguardManager) r1.getSystemService(KeyguardManager.class);
        }

        public static boolean b(KeyguardManager r02) {
            return r02.isDeviceSecure();
        }
    }

    public static KeyguardManager a(Context r02) {
        return a.a(r02);
    }

    public static boolean b(Context r02) {
        KeyguardManager r03 = a(r02);
        if (r03 != null) goto L7;
        return false;
    L7:
        return a.b(r03);
    }
}
