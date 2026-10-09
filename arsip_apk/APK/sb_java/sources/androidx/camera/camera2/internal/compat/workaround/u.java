package androidx.camera.camera2.internal.compat.workaround;

import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.core.impl.G0;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4420a;

    public u(G0 r2) {
        this.f4420a = r2.a(Preview3AThreadCrashQuirk.class);
    }

    public boolean a() {
        return this.f4420a;
    }
}
