package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.util.k;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Map f32714a;

    /* renamed from: b, reason: collision with root package name */
    public final b f32715b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Lock f32716a;

        /* renamed from: b, reason: collision with root package name */
        public int f32717b;

        public a() {
            this.f32716a = new ReentrantLock();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Queue f32718a;

        public b() {
            this.f32718a = new ArrayDeque();
        }

        public a a() {
            Queue r02 = this.f32718a;
            monitor-enter(r02);
            a r1 = (a) this.f32718a.poll();     // Catch: Throwable -> L10
            monitor-exit(r02);     // Catch: Throwable -> L10
            if (r1 == null) goto L8;
            return r1;
        L8:
            return new a();
        L10:
            th = move-exception;
            throw th;
        }

        public void b(a r4) {
            Queue r02 = this.f32718a;
            monitor-enter(r02);
        L7:
            th = move-exception;
            throw th;
        L5:
            if (this.f32718a.size() >= 10) goto L9;
            this.f32718a.offer(r4);     // Catch: Throwable -> L7
        L9:
            monitor-exit(r02);     // Catch: Throwable -> L7
        }
    }

    public c() {
        this.f32714a = new HashMap();
        this.f32715b = new b();
    }

    public void a(String r3) {
        monitor-enter(this);
        a r02 = (a) this.f32714a.get(r3);     // Catch: Throwable -> L6
        if (r02 != null) goto L8;
        r02 = this.f32715b.a();     // Catch: Throwable -> L6
        this.f32714a.put(r3, r02);     // Catch: Throwable -> L6
    L8:
        r02.f32717b++;
        monitor-exit(this);     // Catch: Throwable -> L6
        r02.f32716a.lock();
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public void b(String r6) {
        monitor-enter(this);
        a r02 = (a) k.d(this.f32714a.get(r6));     // Catch: Throwable -> L10
        int r1 = r02.f32717b;     // Catch: Throwable -> L10
        if (r1 < 1) goto L18;
        int r12 = r1 - 1;     // Catch: Throwable -> L10
        r02.f32717b = r12;     // Catch: Throwable -> L10
        if (r12 != 0) goto L14;
        a r13 = (a) this.f32714a.remove(r6);     // Catch: Throwable -> L10
        if (r13.equals(r02) == false) goto L13;
        this.f32715b.b(r13);     // Catch: Throwable -> L10
        goto L14
    L13:
        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + r02 + ", but actually removed: " + r13 + ", safeKey: " + r6);     // Catch: Throwable -> L10
    L14:
        monitor-exit(this);     // Catch: Throwable -> L10
        r02.f32716a.unlock();
        return;
    L18:
        throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + r6 + ", interestedThreads: " + r02.f32717b);     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        throw th;
    }
}
