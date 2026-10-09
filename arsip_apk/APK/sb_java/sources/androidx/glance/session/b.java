package androidx.glance.session;

import android.os.PowerManager;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25416a = null;

    static {
        f25416a = new b();
    }

    public b() {
    }

    public final boolean a(PowerManager r2) {
        if (r2.isLowPowerStandbyEnabled() == false) goto L5;
        return true;
    L5:
        if (r2.isDeviceLightIdleMode() == true) goto L11;
        return false;
    L11:
        return true;
    }
}
