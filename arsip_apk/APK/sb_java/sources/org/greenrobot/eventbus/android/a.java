package org.greenrobot.eventbus.android;

import org.greenrobot.eventbus.f;
import org.greenrobot.eventbus.g;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f182460c = null;

    /* renamed from: a, reason: collision with root package name */
    public final f f182461a;

    /* renamed from: b, reason: collision with root package name */
    public final g f182462b;

    static {
        if (b.c() == false) goto L5;
        a r02 = b.b();
    L6:
        f182460c = r02;
        return;
    L5:
        r02 = null;
        goto L6
    }

    public a(f r1, g r2) {
        this.f182461a = r1;
        this.f182462b = r2;
    }

    public static boolean a() {
        if (f182460c == null) goto L6;
        return true;
    L6:
        return false;
    }

    public static a b() {
        return f182460c;
    }
}
