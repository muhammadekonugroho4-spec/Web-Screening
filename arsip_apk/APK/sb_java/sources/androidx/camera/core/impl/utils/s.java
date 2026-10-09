package androidx.camera.core.impl.utils;

import androidx.camera.core.resolutionselector.c;

/* loaded from: classes.dex */
public abstract class s {
    public static androidx.camera.core.resolutionselector.c a(androidx.camera.core.resolutionselector.c r1, androidx.camera.core.resolutionselector.c r2) {
        if (r2 != null) goto L4;
        return r1;
    L4:
        if (r1 != null) goto L6;
        return r2;
    L6:
        c.a r12 = c.a.b(r1);
        if (r2.b() == null) goto L10;
        r12.d(r2.b());
    L10:
        if (r2.d() == null) goto L12;
        r12.e(r2.d());
    L12:
        r2.c();
        if (r2.a() == 0) goto L16;
        r12.c(r2.a());
    L16:
        return r12.a();
    }
}
