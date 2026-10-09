package androidx.camera.view.internal.compat.quirk;

import androidx.camera.core.impl.E0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {
    public static List a(E0 r3) {
        ArrayList r02 = new ArrayList();
        if (r3.a(SurfaceViewStretchedQuirk.class, SurfaceViewStretchedQuirk.g()) == false) goto L6;
        r02.add(new SurfaceViewStretchedQuirk());
    L6:
        if (r3.a(SurfaceViewNotCroppedByParentQuirk.class, SurfaceViewNotCroppedByParentQuirk.d()) == false) goto L8;
        r02.add(new SurfaceViewNotCroppedByParentQuirk());
    L8:
        return r02;
    }
}
