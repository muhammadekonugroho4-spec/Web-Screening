package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    public static final e.a f32577b = null;

    /* renamed from: a, reason: collision with root package name */
    public final Map f32578a;

    public class a implements e.a {
        public a() {
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        public e b(Object r2) {
            return new b(r2);
        }
    }

    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public final Object f32579a;

        public b(Object r1) {
            this.f32579a = r1;
        }

        @Override // com.bumptech.glide.load.data.e
        public Object a() {
            return this.f32579a;
        }

        @Override // com.bumptech.glide.load.data.e
        public void b() {
        }
    }

    static {
        f32577b = new a();
    }

    public f() {
        this.f32578a = new HashMap();
    }

    public synchronized e a(Object r6) {
        monitor-enter(this);
        com.bumptech.glide.util.k.d(r6);     // Catch: Throwable -> L11
        e.a r02 = (e.a) this.f32578a.get(r6.getClass());     // Catch: Throwable -> L11
        if (r02 != null) goto L13;
        Iterator r1 = this.f32578a.values().iterator();     // Catch: Throwable -> L11
    L7:
        if (r1.hasNext() == false) goto L13;
        e.a r2 = (e.a) r1.next();     // Catch: Throwable -> L11
        if (r2.a().isAssignableFrom(r6.getClass()) == false) goto L7;
        r02 = r2;
    L13:
        if (r02 != null) goto L15;
        r02 = f32577b;     // Catch: Throwable -> L11
    L15:
        e r62 = r02.b(r6);     // Catch: Throwable -> L11
        monitor-exit(this);
        return r62;
    L11:
        th = move-exception;
        throw th;
    }

    public synchronized void b(e.a r3) {
        monitor-enter(this);
        this.f32578a.put(r3.a(), r3);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }
}
