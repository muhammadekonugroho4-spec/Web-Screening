package ai.advance.event;

import android.content.Context;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class a {
    public static final String a() {
        return Locale.getDefault().toString();
    }

    public static boolean b(Context r1, String r2) {
        if (r1.getPackageManager().checkPermission(r2, r1.getPackageName()) != 0) goto L6;
        return true;
    L6:
        return false;
    }
}
