package com.stockbit.common.utils;

import android.app.Activity;
import android.net.Uri;

/* renamed from: com.stockbit.common.utils.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC5859i {

    /* renamed from: com.stockbit.common.utils.i$a */
    public interface a {
        void a(Activity r1, Uri r2);
    }

    public static void a(Activity r1, androidx.browser.customtabs.d r2, Uri r3, a r4) {
        if (r1 == null) goto L15;
        String r02 = AbstractC5861k.a(r1);     // Catch: Exception -> L11
        if (r02 != null) goto L9;
        if (r4 == null) goto L14;
        r4.a(r1, r3);     // Catch: Exception -> L11
        return;
    L14:
        return;
    L9:
        r2.f3882a.setPackage(r02);     // Catch: Exception -> L11
        r2.a(r1, r3);     // Catch: Exception -> L11
        return;
    L11:
        timber.log.a.c("Exception", new Object[0]);
        return;
    }
}
