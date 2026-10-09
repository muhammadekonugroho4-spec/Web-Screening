package androidx.camera.camera2.internal.compat.workaround;

import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.core.impl.G0;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4408a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4409b;

    public n(G0 r3) {
        boolean r02 = false;
        this.f4409b = false;
        if (r3.b(AutoFlashUnderExposedQuirk.class) == null) goto L5;
        r02 = true;
    L5:
        this.f4408a = r02;
    }

    public void a() {
        this.f4409b = false;
    }

    public void b() {
        this.f4409b = true;
    }

    public boolean c(int r2) {
        if (this.f4409b == false) goto L9;
        if (r2 == 0) goto L6;
        return false;
    L6:
        if (this.f4408a == false) goto L12;
        return true;
    L12:
        return false;
    L9:
        return false;
    }
}
