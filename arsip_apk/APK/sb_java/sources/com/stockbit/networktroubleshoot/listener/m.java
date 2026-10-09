package com.stockbit.networktroubleshoot.listener;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Map f122663a;

    public m() {
        this.f122663a = new LinkedHashMap();
    }

    public final b a(String r2) {
        p.l(r2, "host");
        return (b) this.f122663a.get(r2);
    }

    public final void b(String r2, b r3) {
        p.l(r2, "host");
        p.l(r3, "result");
        this.f122663a.put(r2, r3);
    }
}
