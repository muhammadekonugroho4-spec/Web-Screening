package org.greenrobot.eventbus;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.greenrobot.eventbus.f;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: m, reason: collision with root package name */
    public static final ExecutorService f182494m = null;

    /* renamed from: a, reason: collision with root package name */
    public boolean f182495a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f182496b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f182497c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f182498e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f182499f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f182500g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f182501h;

    /* renamed from: i, reason: collision with root package name */
    public ExecutorService f182502i;

    /* renamed from: j, reason: collision with root package name */
    public List f182503j;

    /* renamed from: k, reason: collision with root package name */
    public f f182504k;

    /* renamed from: l, reason: collision with root package name */
    public g f182505l;

    static {
        f182494m = Executors.newCachedThreadPool();
    }

    public d() {
        this.f182495a = true;
        this.f182496b = true;
        this.f182497c = true;
        this.d = true;
        this.f182499f = true;
        this.f182502i = f182494m;
    }

    public f a() {
        f r02 = this.f182504k;
        if (r02 == null) goto L6;
        return r02;
    L6:
        return f.a.a();
    }

    public g b() {
        g r02 = this.f182505l;
        if (r02 == null) goto L6;
        return r02;
    L6:
        if (org.greenrobot.eventbus.android.a.a() == true) goto L8;
        return null;
    L8:
        return org.greenrobot.eventbus.android.a.b().f182462b;
    }
}
