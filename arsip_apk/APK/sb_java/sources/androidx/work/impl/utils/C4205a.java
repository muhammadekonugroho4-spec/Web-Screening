package androidx.work.impl.utils;

import android.app.Application;

/* renamed from: androidx.work.impl.utils.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4205a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4205a f29580a = null;

    static {
        f29580a = new C4205a();
    }

    public C4205a() {
    }

    public final String a() {
        String r02 = Application.getProcessName();
        kotlin.jvm.internal.p.k(r02, "getProcessName()");
        return r02;
    }
}
