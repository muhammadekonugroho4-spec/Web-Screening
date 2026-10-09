package androidx.recyclerview.widget;

import androidx.recyclerview.widget.i;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: androidx.recyclerview.widget.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4127c {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f27380a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f27381b;

    /* renamed from: c, reason: collision with root package name */
    public final i.f f27382c;

    /* renamed from: androidx.recyclerview.widget.c$a */
    public static final class a {
        public static final Object d = null;

        /* renamed from: e, reason: collision with root package name */
        public static Executor f27383e;

        /* renamed from: a, reason: collision with root package name */
        public Executor f27384a;

        /* renamed from: b, reason: collision with root package name */
        public Executor f27385b;

        /* renamed from: c, reason: collision with root package name */
        public final i.f f27386c;

        static {
            d = new Object();
        }

        public a(i.f r1) {
            this.f27386c = r1;
        }

        public C4127c a() {
            if (this.f27385b != null) goto L16;
            Object r02 = d;
            monitor-enter(r02);
        L9:
            th = move-exception;
            throw th;
        L7:
            if (f27383e != null) goto L11;
            f27383e = Executors.newFixedThreadPool(2);     // Catch: Throwable -> L9
        L11:
            monitor-exit(r02);     // Catch: Throwable -> L9
            this.f27385b = f27383e;
        L16:
            return new C4127c(this.f27384a, this.f27385b, this.f27386c);
        }
    }

    public C4127c(Executor r1, Executor r2, i.f r3) {
        this.f27380a = r1;
        this.f27381b = r2;
        this.f27382c = r3;
    }

    public Executor a() {
        return this.f27381b;
    }

    public i.f b() {
        return this.f27382c;
    }

    public Executor c() {
        return this.f27380a;
    }
}
