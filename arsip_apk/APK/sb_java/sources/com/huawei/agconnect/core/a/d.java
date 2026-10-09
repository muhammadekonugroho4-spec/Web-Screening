package com.huawei.agconnect.core.a;

import a.a.a.a.c.f;
import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static Map f38861c;
    public static Map d;

    /* renamed from: a, reason: collision with root package name */
    public Map f38862a;

    /* renamed from: b, reason: collision with root package name */
    public Map f38863b;

    static {
        f38861c = new HashMap();
        d = new HashMap();
    }

    public d(List r2, Context r3) {
        this.f38862a = new HashMap();
        this.f38863b = new HashMap();
        a(r2, r3);
    }

    public void a(List r1, Context r2) {
        if (r1 == null) goto L9;
        Iterator r12 = r1.iterator();
        if (r12.hasNext() == true) goto L7;
        return;
    L7:
        f.a(r12.next());
        throw null;
    }
}
