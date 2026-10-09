package org.greenrobot.eventbus;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class i {
    public static final List d = null;

    /* renamed from: a, reason: collision with root package name */
    public Object f182511a;

    /* renamed from: b, reason: collision with root package name */
    public p f182512b;

    /* renamed from: c, reason: collision with root package name */
    public i f182513c;

    static {
        d = new ArrayList();
    }

    public i(Object r1, p r2) {
        this.f182511a = r1;
        this.f182512b = r2;
    }

    public static i a(p r2, Object r3) {
        List r02 = d;
        monitor-enter(r02);
        int r1 = r02.size();     // Catch: Throwable -> L9
        if (r1 <= 0) goto L11;
        i r12 = (i) r02.remove(r1 - 1);     // Catch: Throwable -> L9
        r12.f182511a = r3;     // Catch: Throwable -> L9
        r12.f182512b = r2;     // Catch: Throwable -> L9
        r12.f182513c = null;     // Catch: Throwable -> L9
        monitor-exit(r02);     // Catch: Throwable -> L9
        return r12;
    L11:
        monitor-exit(r02);     // Catch: Throwable -> L9
        return new i(r3, r2);
    L9:
        th = move-exception;
        throw th;
    }

    public static void b(i r3) {
        r3.f182511a = null;
        r3.f182512b = null;
        r3.f182513c = null;
        List r02 = d;
        monitor-enter(r02);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (r02.size() >= 10000) goto L9;
        r02.add(r3);     // Catch: Throwable -> L7
    L9:
        monitor-exit(r02);     // Catch: Throwable -> L7
    }
}
