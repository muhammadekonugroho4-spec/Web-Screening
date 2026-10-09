package androidx.navigation.internal;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f26322a;

    public h(Context r1) {
        this.f26322a = r1;
    }

    public final Object a() {
        Context r02 = this.f26322a;
        if (r02 == null) goto L5;
        Context r03 = r02.getApplicationContext();
    L7:
        if ((r03 instanceof Application) == true) goto L9;
        return null;
    L9:
        return (Application) r03;
    L5:
        r03 = null;
        goto L7
    }

    public final Context b() {
        return this.f26322a;
    }

    public final String c(int r2) {
        Context r02 = this.f26322a;     // Catch: Resources.NotFoundException -> L4
        kotlin.jvm.internal.p.i(r02);     // Catch: Resources.NotFoundException -> L4
        String r03 = r02.getResources().getResourceName(r2);     // Catch: Resources.NotFoundException -> L4
        kotlin.jvm.internal.p.i(r03);     // Catch: Resources.NotFoundException -> L4
        return r03;
    L5:
        return String.valueOf(r2);
    }
}
