package com.huawei.agconnect.core.a;

import a.a.a.a.c.f;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes6.dex */
public class a extends com.huawei.agconnect.a {

    /* renamed from: b, reason: collision with root package name */
    public static final List f38853b = null;

    static {
        f38853b = new CopyOnWriteArrayList();
    }

    public a() {
    }

    public static void a() {
        Iterator r02 = f38853b.iterator();
        if (r02.hasNext() == true) goto L5;
        return;
    L5:
        f.a(r02.next());
        throw null;
    }
}
