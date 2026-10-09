package com.facebook.internal;

/* loaded from: classes4.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public static final E f36321a = null;

    /* renamed from: b, reason: collision with root package name */
    public static volatile String f36322b;

    static {
        f36321a = new E();
    }

    public E() {
    }

    public static final String a() {
        return f36322b;
    }

    public static final boolean b() {
        String r02 = f36322b;
        if (r02 != null) goto L5;
    L7:
        return false;
    L5:
        if (kotlin.text.y.a0(r02, "Unity.", false, 2, null) != true) goto L7;
        return true;
    }
}
