package dagger.android;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.ContentProvider;
import android.content.Context;
import dagger.internal.g;

/* loaded from: classes2.dex */
public abstract class a {
    public static void a(Activity r2) {
        g.c(r2, "activity");
        ComponentCallbacks2 r02 = r2.getApplication();
        if ((r02 instanceof c) == false) goto L7;
        e(r2, (c) r02);
        return;
    L7:
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{r02.getClass().getCanonicalName(), c.class.getCanonicalName()}));
    }

    public static void b(Service r2) {
        g.c(r2, "service");
        ComponentCallbacks2 r02 = r2.getApplication();
        if ((r02 instanceof c) == false) goto L7;
        e(r2, (c) r02);
        return;
    L7:
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{r02.getClass().getCanonicalName(), c.class.getCanonicalName()}));
    }

    public static void c(BroadcastReceiver r1, Context r2) {
        g.c(r1, "broadcastReceiver");
        g.c(r2, "context");
        ComponentCallbacks2 r22 = (Application) r2.getApplicationContext();
        if ((r22 instanceof c) == false) goto L7;
        e(r1, (c) r22);
        return;
    L7:
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{r22.getClass().getCanonicalName(), c.class.getCanonicalName()}));
    }

    public static void d(ContentProvider r2) {
        g.c(r2, "contentProvider");
        ComponentCallbacks2 r02 = (Application) r2.getContext().getApplicationContext();
        if ((r02 instanceof c) == false) goto L7;
        e(r2, (c) r02);
        return;
    L7:
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{r02.getClass().getCanonicalName(), c.class.getCanonicalName()}));
    }

    public static void e(Object r1, c r2) {
        r2.s();
        g.d(null, "%s.androidInjector() returned null", r2.getClass());
        throw null;
    }
}
