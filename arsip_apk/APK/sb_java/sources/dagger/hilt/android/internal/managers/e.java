package dagger.hilt.android.internal.managers;

import android.content.ComponentCallbacks2;
import android.content.Context;

/* loaded from: classes2.dex */
public abstract class e {
    public static Object a(Context r3) {
        ComponentCallbacks2 r32 = dagger.hilt.android.internal.a.a(r3.getApplicationContext());
        dagger.hilt.internal.d.a(r32 instanceof dagger.hilt.internal.b, "Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: %s", new Object[]{r32.getClass()});
        return ((dagger.hilt.internal.b) r32).L2();
    }
}
