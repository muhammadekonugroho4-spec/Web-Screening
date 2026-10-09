package androidx.glance.session;

import android.os.PowerManager;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f25415a = null;

    static {
        f25415a = new a();
    }

    public a() {
    }

    public final boolean a(PowerManager r1) {
        return r1.isDeviceIdleMode();
    }
}
