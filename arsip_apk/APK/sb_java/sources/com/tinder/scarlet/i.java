package com.tinder.scarlet;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class i {

    public static final class a extends i {

        /* renamed from: a, reason: collision with root package name */
        public final g f173674a;

        public a(g r2) {
            p.l(r2, "session");
            super(null);
            this.f173674a = r2;
        }

        public final g a() {
            return this.f173674a;
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L4;
            return true;
        L4:
            if ((r2 instanceof a) == true) goto L6;
            return false;
        L6:
            if (p.g(this.f173674a, ((a) r2).f173674a) == true) goto L13;
            return false;
        L13:
            return true;
        }

        public int hashCode() {
            g r02 = this.f173674a;
            if (r02 != null) goto L5;
            return 0;
        L5:
            return r02.hashCode();
        }

        public String toString() {
            return "Connected(session=" + this.f173674a + ")";
        }
    }

    public static final class b extends i {

        /* renamed from: a, reason: collision with root package name */
        public final g f173675a;

        /* renamed from: b, reason: collision with root package name */
        public final int f173676b;

        public b(g r2, int r3) {
            p.l(r2, "session");
            super(null);
            this.f173675a = r2;
            this.f173676b = r3;
        }

        public final int a() {
            return this.f173676b;
        }

        public final g b() {
            return this.f173675a;
        }

        public boolean equals(Object r3) {
            if (this != r3) goto L4;
            return true;
        L4:
            if ((r3 instanceof b) == false) goto L10;
            b r32 = (b) r3;
            if (p.g(this.f173675a, r32.f173675a) == true) goto L8;
            return false;
        L8:
            if (this.f173676b == r32.f173676b) goto L16;
            return false;
        L16:
            return true;
        L10:
            return false;
        }

        public int hashCode() {
            g r02 = this.f173675a;
            if (r02 == null) goto L5;
            int r03 = r02.hashCode();
        L7:
            return (r03 * 31) + Integer.hashCode(this.f173676b);
        L5:
            r03 = 0;
            goto L7
        }

        public String toString() {
            return "Connecting(session=" + this.f173675a + ", retryCount=" + this.f173676b + ")";
        }
    }

    public static final class c extends i {

        /* renamed from: a, reason: collision with root package name */
        public static final c f173677a = null;

        static {
            f173677a = new c();
        }

        public c() {
            super(null);
        }
    }

    public static final class d extends i {

        /* renamed from: a, reason: collision with root package name */
        public static final d f173678a = null;

        static {
            f173678a = new d();
        }

        public d() {
            super(null);
        }
    }

    public static final class e extends i {

        /* renamed from: a, reason: collision with root package name */
        public static final e f173679a = null;

        static {
            f173679a = new e();
        }

        public e() {
            super(null);
        }
    }

    public static final class f extends i {

        /* renamed from: a, reason: collision with root package name */
        public final io.reactivex.disposables.b f173680a;

        /* renamed from: b, reason: collision with root package name */
        public final int f173681b;

        /* renamed from: c, reason: collision with root package name */
        public final long f173682c;

        public f(io.reactivex.disposables.b r2, int r3, long r4) {
            p.l(r2, "timerDisposable");
            super(null);
            this.f173680a = r2;
            this.f173681b = r3;
            this.f173682c = r4;
        }

        public final int a() {
            return this.f173681b;
        }

        public final io.reactivex.disposables.b b() {
            return this.f173680a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L4;
            return true;
        L4:
            if ((r5 instanceof f) == false) goto L12;
            f r52 = (f) r5;
            if (p.g(this.f173680a, r52.f173680a) == true) goto L8;
            return false;
        L8:
            if (this.f173681b == r52.f173681b) goto L10;
            return false;
        L10:
            if (this.f173682c == r52.f173682c) goto L19;
            return false;
        L19:
            return true;
        L12:
            return false;
        }

        public int hashCode() {
            io.reactivex.disposables.b r02 = this.f173680a;
            if (r02 == null) goto L5;
            int r03 = r02.hashCode();
        L7:
            return (((r03 * 31) + Integer.hashCode(this.f173681b)) * 31) + Long.hashCode(this.f173682c);
        L5:
            r03 = 0;
            goto L7
        }

        public String toString() {
            return "WaitingToRetry(timerDisposable=" + this.f173680a + ", retryCount=" + this.f173681b + ", retryInMillis=" + this.f173682c + ")";
        }
    }

    public i() {
    }

    public /* synthetic */ i(kotlin.jvm.internal.i r1) {
        this();
    }
}
