package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;

/* loaded from: classes.dex */
public abstract class g {
    public static IBinder a(Bundle r02, String r1) {
        return r02.getBinder(r1);
    }

    public static void b(Bundle r02, String r1, IBinder r2) {
        r02.putBinder(r1, r2);
    }
}
