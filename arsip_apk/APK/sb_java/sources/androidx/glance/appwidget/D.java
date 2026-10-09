package androidx.glance.appwidget;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final Map f24785a;

    public D() {
        this.f24785a = new LinkedHashMap();
    }

    public final C a(int r2, int r3, String r4) {
        C r22 = (C) this.f24785a.get(b(r2, r3, r4));
        if (r22 == null) goto L5;
        return r22;
    L5:
        return C.f24771e.a();
    }

    public final String b(int r2, int r3, String r4) {
        return r2 + '-' + r3 + '-' + r4;
    }

    public final void c(int r2, int r3, String r4) {
        this.f24785a.remove(b(r2, r3, r4));
    }

    public final void d(int r2, int r3, String r4, C r5) {
        this.f24785a.put(b(r2, r3, r4), r5);
    }
}
