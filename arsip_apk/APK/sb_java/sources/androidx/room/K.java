package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class K implements androidx.sqlite.db.f, androidx.sqlite.db.e {

    /* renamed from: i, reason: collision with root package name */
    public static final a f27662i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final TreeMap f27663j = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f27664a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f27665b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f27666c;
    public final double[] d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f27667e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[][] f27668f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f27669g;

    /* renamed from: h, reason: collision with root package name */
    public int f27670h;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final K a(String r4, int r5) {
            kotlin.jvm.internal.p.l(r4, "query");
            TreeMap r02 = K.f27663j;
            monitor-enter(r02);
            Map.Entry r1 = r02.ceilingEntry(Integer.valueOf(r5));     // Catch: Throwable -> L9
            if (r1 == null) goto L11;
            r02.remove(r1.getKey());     // Catch: Throwable -> L9
            K r12 = (K) r1.getValue();     // Catch: Throwable -> L9
            r12.n(r4, r5);     // Catch: Throwable -> L9
            kotlin.jvm.internal.p.i(r12);     // Catch: Throwable -> L9
            monitor-exit(r02);
            return r12;
        L11:
            kotlin.w r13 = kotlin.w.f180450a;     // Catch: Throwable -> L9
            monitor-exit(r02);
            K r03 = new K(r5, null);
            r03.n(r4, r5);
            return r03;
        L9:
            th = move-exception;
            throw th;
        }

        public final void b() {
            TreeMap r02 = K.f27663j;
            if (r02.size() <= 15) goto L8;
            int r1 = r02.size() - 10;
            Iterator r03 = r02.descendingKeySet().iterator();
            kotlin.jvm.internal.p.k(r03, "iterator(...)");
        L5:
            int r2 = r1 - 1;
            if (r1 <= 0) goto L10;
            r03.next();
            r03.remove();
            r1 = r2;
            goto L5
        L10:
            return;
        }

        public a() {
        }
    }

    static {
        f27662i = new a(null);
        f27663j = new TreeMap();
    }

    public /* synthetic */ K(int r1, kotlin.jvm.internal.i r2) {
        this(r1);
    }

    public static final K i(String r1, int r2) {
        return f27662i.a(r1, r2);
    }

    public final void M0(int r2, String r3) {
        kotlin.jvm.internal.p.l(r3, "value");
        U(r2, r3);
    }

    @Override // androidx.sqlite.db.e
    public void U(int r3, String r4) {
        kotlin.jvm.internal.p.l(r4, "value");
        this.f27669g[r3] = 4;
        this.f27667e[r3] = r4;
    }

    @Override // androidx.sqlite.db.f
    public String c() {
        String r02 = this.f27665b;
        if (r02 == null) goto L6;
        return r02;
    L6:
        throw new IllegalStateException("Required value was null.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // androidx.sqlite.db.e
    public void e0(int r3, byte[] r4) {
        kotlin.jvm.internal.p.l(r4, "value");
        this.f27669g[r3] = 5;
        this.f27668f[r3] = r4;
    }

    @Override // androidx.sqlite.db.f
    public void f(androidx.sqlite.db.e r7) {
        kotlin.jvm.internal.p.l(r7, "statement");
        int r02 = l();
        if (1 > r02) goto L31;
        int r2 = 1;
    L5:
        int r3 = this.f27669g[r2];
        if (r3 != 1) goto L8;
        r7.o(r2);
    L29:
        if (r2 == r02) goto L35;
        r2 = r2 + 1;
        goto L5
    L35:
        return;
    L8:
        if (r3 != 2) goto L10;
        r7.m(r2, this.f27666c[r2]);
        goto L29
    L10:
        if (r3 != 3) goto L12;
        r7.p(r2, this.d[r2]);
        goto L29
    L12:
        if (r3 != 4) goto L14;
        String r32 = this.f27667e[r2];
        if (r32 == null) goto L25;
        r7.U(r2, r32);
        goto L29
    L25:
        throw new IllegalArgumentException("Required value was null.");
    L14:
        if (r3 != 5) goto L29;
        byte[] r33 = this.f27668f[r2];
        if (r33 == null) goto L20;
        r7.e0(r2, r33);
        goto L29
    L20:
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void k(K r5) {
        kotlin.jvm.internal.p.l(r5, "other");
        int r02 = r5.l() + 1;
        System.arraycopy(r5.f27669g, 0, this.f27669g, 0, r02);
        System.arraycopy(r5.f27666c, 0, this.f27666c, 0, r02);
        System.arraycopy(r5.f27667e, 0, this.f27667e, 0, r02);
        System.arraycopy(r5.f27668f, 0, this.f27668f, 0, r02);
        System.arraycopy(r5.d, 0, this.d, 0, r02);
    }

    public int l() {
        return this.f27670h;
    }

    @Override // androidx.sqlite.db.e
    public void m(int r3, long r4) {
        this.f27669g[r3] = 2;
        this.f27666c[r3] = r4;
    }

    public final void n(String r2, int r3) {
        kotlin.jvm.internal.p.l(r2, "query");
        this.f27665b = r2;
        this.f27670h = r3;
    }

    @Override // androidx.sqlite.db.e
    public void o(int r3) {
        this.f27669g[r3] = 1;
    }

    @Override // androidx.sqlite.db.e
    public void p(int r3, double r4) {
        this.f27669g[r3] = 3;
        this.d[r3] = r4;
    }

    public final void release() {
        TreeMap r02 = f27663j;
        monitor-enter(r02);
        r02.put(Integer.valueOf(this.f27664a), this);     // Catch: Throwable -> L7
        f27662i.b();     // Catch: Throwable -> L7
        kotlin.w r1 = kotlin.w.f180450a;     // Catch: Throwable -> L7
        monitor-exit(r02);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public K(int r2) {
        this.f27664a = r2;
        int r22 = r2 + 1;
        this.f27669g = new int[r22];
        this.f27666c = new long[r22];
        this.d = new double[r22];
        this.f27667e = new String[r22];
        this.f27668f = new byte[r22][];
    }
}
