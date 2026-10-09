package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class s {
    public static androidx.core.os.i a(androidx.core.os.i r4, androidx.core.os.i r5) {
        LinkedHashSet r02 = new LinkedHashSet();
        int r1 = 0;
    L4:
        if (r1 >= (r4.f() + r5.f())) goto L13;
        if (r1 >= r4.f()) goto L8;
        Locale r2 = r4.c(r1);
    L9:
        if (r2 == null) goto L11;
        r02.add(r2);
    L11:
        r1 = r1 + 1;
        goto L4
    L8:
        r2 = r5.c(r1 - r4.f());
        goto L9
    L13:
        return androidx.core.os.i.a((Locale[]) r02.toArray(new Locale[r02.size()]));
    }

    public static androidx.core.os.i b(androidx.core.os.i r1, androidx.core.os.i r2) {
        if (r1 == null) goto L9;
        if (r1.e() == true) goto L9;
        return a(r1, r2);
    L9:
        return androidx.core.os.i.d();
    }
}
