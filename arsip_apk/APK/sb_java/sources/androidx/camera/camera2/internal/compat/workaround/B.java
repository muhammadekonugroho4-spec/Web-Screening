package androidx.camera.camera2.internal.compat.workaround;

import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;
import androidx.camera.core.impl.G0;

/* loaded from: classes.dex */
public class B {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4393a;

    public B(G0 r2) {
        this.f4393a = r2.a(UseTorchAsFlashQuirk.class);
    }

    public boolean a() {
        return this.f4393a;
    }
}
