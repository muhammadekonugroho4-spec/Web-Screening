package androidx.work.impl.utils;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class L {

    /* renamed from: e, reason: collision with root package name */
    public static final String f29573e = null;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.work.C f29574a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f29575b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f29576c;
    public final Object d;

    public interface a {
        void a(androidx.work.impl.model.j r1);
    }

    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final L f29577a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.work.impl.model.j f29578b;

        public b(L r1, androidx.work.impl.model.j r2) {
            this.f29577a = r1;
            this.f29578b = r2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object r02 = this.f29577a.d;
            monitor-enter(r02);
        L9:
            th = move-exception;
            throw th;
        L5:
            if (((b) this.f29577a.f29575b.remove(this.f29578b)) == null) goto L11;
            a r1 = (a) this.f29577a.f29576c.remove(this.f29578b);     // Catch: Throwable -> L9
            if (r1 == null) goto L12;
            r1.a(this.f29578b);     // Catch: Throwable -> L9
        L12:
            monitor-exit(r02);     // Catch: Throwable -> L9
            return;
        L11:
            androidx.work.r.e().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f29578b}));     // Catch: Throwable -> L9
            goto L12
        }
    }

    static {
        f29573e = androidx.work.r.i("WorkTimer");
    }

    public L(androidx.work.C r2) {
        this.f29575b = new HashMap();
        this.f29576c = new HashMap();
        this.d = new Object();
        this.f29574a = r2;
    }

    public void a(androidx.work.impl.model.j r6, long r7, a r9) {
        Object r02 = this.d;
        monitor-enter(r02);
        androidx.work.r.e().a(f29573e, "Starting timer for " + r6);     // Catch: Throwable -> L7
        b(r6);     // Catch: Throwable -> L7
        b r1 = new b(this, r6);     // Catch: Throwable -> L7
        this.f29575b.put(r6, r1);     // Catch: Throwable -> L7
        this.f29576c.put(r6, r9);     // Catch: Throwable -> L7
        this.f29574a.b(r7, r1);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void b(androidx.work.impl.model.j r6) {
        Object r02 = this.d;
        monitor-enter(r02);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (((b) this.f29575b.remove(r6)) == null) goto L9;
        androidx.work.r.e().a(f29573e, "Stopping timer for " + r6);     // Catch: Throwable -> L7
        this.f29576c.remove(r6);     // Catch: Throwable -> L7
    L9:
        monitor-exit(r02);     // Catch: Throwable -> L7
    }
}
