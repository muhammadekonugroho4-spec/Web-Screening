package io.sentry.android.core.internal.util;

import android.content.ContentProvider;
import io.sentry.J0;
import io.sentry.android.core.C11511b0;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final C11511b0 f175499a;

    public k() {
        this(new C11511b0(J0.e()));
    }

    public void a(ContentProvider r3) {
        int r02 = this.f175499a.d();
        if (r02 >= 26) goto L5;
        return;
    L5:
        if (r02 > 28) goto L14;
        String r03 = r3.getCallingPackage();
        String r32 = r3.getContext().getPackageName();
        if (r03 == null) goto L12;
        if (r03.equals(r32) == false) goto L12;
        return;
    L12:
        throw new SecurityException("Provider does not allow for granting of Uri permissions");
    }

    public k(C11511b0 r1) {
        this.f175499a = r1;
    }
}
