package com.bumptech.glide.provider;

import com.bumptech.glide.load.h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final List f33264a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f33265a;

        /* renamed from: b, reason: collision with root package name */
        public final h f33266b;

        public a(Class r1, h r2) {
            this.f33265a = r1;
            this.f33266b = r2;
        }

        public boolean a(Class r2) {
            return this.f33265a.isAssignableFrom(r2);
        }
    }

    public f() {
        this.f33264a = new ArrayList();
    }

    public synchronized void a(Class r3, h r4) {
        monitor-enter(this);
        this.f33264a.add(new a(r3, r4));     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized h b(Class r5) {
        monitor-enter(this);
        int r02 = this.f33264a.size();     // Catch: Throwable -> L10
        int r1 = 0;
    L4:
        if (r1 >= r02) goto L13;
        a r2 = (a) this.f33264a.get(r1);     // Catch: Throwable -> L10
        if (r2.a(r5) == true) goto L7;
        r1 = r1 + 1;
        goto L4
    L7:
        h r52 = r2.f33266b;     // Catch: Throwable -> L10
        monitor-exit(this);
        return r52;
    L13:
        monitor-exit(this);
        return null;
    L10:
        th = move-exception;
        throw th;
    }
}
