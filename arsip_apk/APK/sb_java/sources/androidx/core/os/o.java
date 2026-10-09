package androidx.core.os;

import android.content.Context;
import android.os.UserManager;

/* loaded from: classes.dex */
public abstract class o {

    public static class a {
        public static boolean a(Context r1) {
            return ((UserManager) r1.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    public static boolean a(Context r02) {
        return a.a(r02);
    }
}
