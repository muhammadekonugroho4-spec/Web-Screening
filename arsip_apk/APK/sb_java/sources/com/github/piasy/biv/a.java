package com.github.piasy.biv;

import android.net.Uri;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f37853b;

    /* renamed from: a, reason: collision with root package name */
    public final com.github.piasy.biv.loader.a f37854a;

    public a(com.github.piasy.biv.loader.a r1) {
        this.f37854a = r1;
    }

    public static com.github.piasy.biv.loader.a a() {
        if (f37853b == null) goto L7;
        return f37853b.f37854a;
    L7:
        throw new IllegalStateException("You must initialize BigImageViewer before use it!");
    }

    public static void b(com.github.piasy.biv.loader.a r1) {
        f37853b = new a(r1);
    }

    public static void c(Uri... r4) {
        if (r4 == null) goto L7;
        com.github.piasy.biv.loader.a r02 = a();
        int r1 = r4.length;
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L9;
        r02.c(r4[r2]);
        r2 = r2 + 1;
        goto L5
    L9:
        return;
    }
}
