package org.greenrobot.eventbus.android;

import android.util.Log;
import java.util.logging.Level;
import org.greenrobot.eventbus.f;

/* loaded from: classes3.dex */
public class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f182463a;

    public c(String r1) {
        this.f182463a = r1;
    }

    @Override // org.greenrobot.eventbus.f
    public void a(Level r2, String r3) {
        if (r2 == Level.OFF) goto L6;
        Log.println(c(r2), this.f182463a, r3);
        return;
    }

    @Override // org.greenrobot.eventbus.f
    public void b(Level r3, String r4, Throwable r5) {
        if (r3 == Level.OFF) goto L6;
        Log.println(c(r3), this.f182463a, r4 + "\n" + Log.getStackTraceString(r5));
        return;
    }

    public final int c(Level r2) {
        int r22 = r2.intValue();
        if (r22 >= 800) goto L11;
        if (r22 >= 500) goto L8;
        return 2;
    L8:
        return 3;
    L11:
        if (r22 >= 900) goto L15;
        return 4;
    L15:
        if (r22 >= 1000) goto L18;
        return 5;
    L18:
        return 6;
    }
}
