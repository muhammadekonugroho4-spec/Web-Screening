package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f2096a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.functions.a f2097b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2098c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2099e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2100f;

    /* renamed from: g, reason: collision with root package name */
    public final List f2101g;

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f2102h;

    public P(Executor r2, kotlin.jvm.functions.a r3) {
        kotlin.jvm.internal.p.l(r2, "executor");
        kotlin.jvm.internal.p.l(r3, "reportFullyDrawn");
        this.f2096a = r2;
        this.f2097b = r3;
        this.f2098c = new Object();
        this.f2101g = new ArrayList();
        this.f2102h = new O(this);
    }

    public static /* synthetic */ void a(P r02) {
        d(r02);
    }

    public static final void d(P r2) {
        Object r02 = r2.f2098c;
        monitor-enter(r02);
        r2.f2099e = false;     // Catch: Throwable -> L10
        if (r2.d == 0) goto L8;
    L12:
        kotlin.w r22 = kotlin.w.f180450a;     // Catch: Throwable -> L10
        monitor-exit(r02);
        return;
    L8:
        if (r2.f2100f == true) goto L12;
        r2.f2097b.invoke();     // Catch: Throwable -> L10
        r2.b();     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        throw th;
    }

    public final void b() {
        Object r02 = this.f2098c;
        monitor-enter(r02);
        this.f2100f = true;     // Catch: Throwable -> L9
        Iterator r1 = this.f2101g.iterator();     // Catch: Throwable -> L9
    L7:
        if (r1.hasNext() == false) goto L11;
        ((kotlin.jvm.functions.a) r1.next()).invoke();     // Catch: Throwable -> L9
        goto L7
    L11:
        this.f2101g.clear();     // Catch: Throwable -> L9
        kotlin.w r12 = kotlin.w.f180450a;     // Catch: Throwable -> L9
        monitor-exit(r02);
        return;
    L9:
        th = move-exception;
        throw th;
    }

    public final boolean c() {
        Object r02 = this.f2098c;
        monitor-enter(r02);
        boolean r1 = this.f2100f;     // Catch: Throwable -> L7
        monitor-exit(r02);
        return r1;
    L7:
        th = move-exception;
        throw th;
    }
}
