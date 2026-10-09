package androidx.camera.camera2.internal.compat.workaround;

import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.core.AbstractC2209b0;
import androidx.camera.core.impl.G0;

/* loaded from: classes.dex */
public class A {

    /* renamed from: a, reason: collision with root package name */
    public final TorchFlashRequiredFor3aUpdateQuirk f4392a;

    public A(G0 r2) {
        this.f4392a = (TorchFlashRequiredFor3aUpdateQuirk) r2.b(TorchFlashRequiredFor3aUpdateQuirk.class);
    }

    public boolean a() {
        TorchFlashRequiredFor3aUpdateQuirk r02 = this.f4392a;
        if (r02 != null) goto L5;
    L7:
        boolean r03 = false;
    L8:
        AbstractC2209b0.a("UseFlashModeTorchFor3aUpdate", "shouldUseFlashModeTorch: " + r03);
        return r03;
    L5:
        if (r02.g() == false) goto L7;
        r03 = true;
        goto L8
    }
}
