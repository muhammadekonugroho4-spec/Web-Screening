package io.reactivex.internal.queue;

import io.reactivex.internal.fuseable.d;
import io.reactivex.internal.util.f;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class a implements d {

    /* renamed from: i, reason: collision with root package name */
    public static final int f174546i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final Object f174547j = null;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f174548a;

    /* renamed from: b, reason: collision with root package name */
    public int f174549b;

    /* renamed from: c, reason: collision with root package name */
    public long f174550c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public AtomicReferenceArray f174551e;

    /* renamed from: f, reason: collision with root package name */
    public final int f174552f;

    /* renamed from: g, reason: collision with root package name */
    public AtomicReferenceArray f174553g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicLong f174554h;

    static {
        f174546i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
        f174547j = new Object();
    }

    public a(int r4) {
        this.f174548a = new AtomicLong();
        this.f174554h = new AtomicLong();
        int r42 = f.a(Math.max(8, r4));
        int r02 = r42 - 1;
        AtomicReferenceArray r1 = new AtomicReferenceArray(r42 + 1);
        this.f174551e = r1;
        this.d = r02;
        a(r42);
        this.f174553g = r1;
        this.f174552f = r02;
        this.f174550c = r42 - 2;
        p(0);
    }

    public static int b(int r02) {
        return r02;
    }

    public static int c(long r02, int r2) {
        return b(((int) r02) & r2);
    }

    public static Object g(AtomicReferenceArray r02, int r1) {
        return r02.get(r1);
    }

    private void m(long r2) {
        this.f174554h.lazySet(r2);
    }

    public static void n(AtomicReferenceArray r02, int r1, Object r2) {
        r02.lazySet(r1, r2);
    }

    private void p(long r2) {
        this.f174548a.lazySet(r2);
    }

    public final void a(int r2) {
        this.f174549b = Math.min(r2 / 4, f174546i);
    }

    @Override // io.reactivex.internal.fuseable.e
    public void clear() {
    L3:
        if (poll() != null) goto L3;
        if (isEmpty() == false) goto L3;
    }

    public final long d() {
        return this.f174554h.get();
    }

    public final long e() {
        return this.f174548a.get();
    }

    public final long f() {
        return this.f174554h.get();
    }

    public final AtomicReferenceArray h(AtomicReferenceArray r3, int r4) {
        int r42 = b(r4);
        AtomicReferenceArray r02 = (AtomicReferenceArray) g(r3, r42);
        n(r3, r42, null);
        return r02;
    }

    public final long i() {
        return this.f174548a.get();
    }

    @Override // io.reactivex.internal.fuseable.e
    public boolean isEmpty() {
        if (i() != f()) goto L6;
        return true;
    L6:
        return false;
    }

    public final Object j(AtomicReferenceArray r4, long r5, int r7) {
        this.f174553g = r4;
        int r72 = c(r5, r7);
        Object r02 = g(r4, r72);
        if (r02 == null) goto L5;
        n(r4, r72, null);
        m(r5 + 1);
    L5:
        return r02;
    }

    public boolean k(Object r9, Object r10) {
        AtomicReferenceArray r02 = this.f174551e;
        long r1 = i();
        int r3 = this.d;
        long r4 = 2 + r1;
        if (g(r02, c(r4, r3)) != null) goto L5;
        int r12 = c(r1, r3);
        n(r02, r12 + 1, r10);
        n(r02, r12, r9);
        p(r4);
        return true;
    L5:
        AtomicReferenceArray r7 = new AtomicReferenceArray(r02.length());
        this.f174551e = r7;
        int r13 = c(r1, r3);
        n(r7, r13 + 1, r10);
        n(r7, r13, r9);
        o(r02, r7);
        n(r02, r13, f174547j);
        p(r4);
        return true;
    }

    public final void l(AtomicReferenceArray r5, long r6, int r8, Object r9, long r10) {
        AtomicReferenceArray r1 = new AtomicReferenceArray(r5.length());
        this.f174551e = r1;
        this.f174550c = (r10 + r6) - 1;
        n(r1, r8, r9);
        o(r5, r1);
        n(r5, r8, f174547j);
        p(r6 + 1);
    }

    public final void o(AtomicReferenceArray r2, AtomicReferenceArray r3) {
        n(r2, b(r2.length() - 1), r3);
    }

    @Override // io.reactivex.internal.fuseable.e
    public boolean offer(Object r12) {
        if (r12 == null) goto L18;
        AtomicReferenceArray r1 = this.f174551e;
        long r3 = e();
        int r6 = this.d;
        int r5 = c(r3, r6);
        if (r3 < this.f174550c) goto L6;
        long r7 = this.f174549b + r3;
        if (g(r1, c(r7, r6)) != null) goto L12;
        this.f174550c = r7 - 1;
        return q(r1, r12, r3, r5);
    L12:
        if (g(r1, c(r3 + 1, r6)) == null) goto L14;
        l(r1, r3, r5, r12, r6);
        return true;
    L14:
        return q(r1, r12, r3, r5);
    L6:
        return q(r1, r12, r3, r5);
    L18:
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // io.reactivex.internal.fuseable.d, io.reactivex.internal.fuseable.e
    public Object poll() {
        AtomicReferenceArray r02 = this.f174553g;
        long r1 = d();
        int r3 = this.f174552f;
        int r4 = c(r1, r3);
        Object r5 = g(r02, r4);
        if (r5 != f174547j) goto L5;
        boolean r6 = true;
    L7:
        if (r5 == null) goto L11;
        if (r6 == true) goto L11;
        n(r02, r4, null);
        m(r1 + 1);
        return r5;
    L11:
        if (r6 == true) goto L13;
        return null;
    L13:
        return j(h(r02, r3 + 1), r1, r3);
    L5:
        r6 = false;
        goto L7
    }

    public final boolean q(AtomicReferenceArray r1, Object r2, long r3, int r5) {
        n(r1, r5, r2);
        p(r3 + 1);
        return true;
    }
}
