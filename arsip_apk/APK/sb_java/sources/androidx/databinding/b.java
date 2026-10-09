package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class b implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public List f23594a;

    /* renamed from: b, reason: collision with root package name */
    public long f23595b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f23596c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final a f23597e;

    public static abstract class a {
        public a() {
        }

        public abstract void a(Object r1, Object r2, int r3, Object r4);
    }

    public b(a r3) {
        this.f23594a = new ArrayList();
        this.f23595b = 0;
        this.f23597e = r3;
    }

    public synchronized void a(Object r2) {
        monitor-enter(this);
        if (r2 == null) goto L15;
        int r02 = this.f23594a.lastIndexOf(r2);     // Catch: Throwable -> L9
        if (r02 >= 0) goto L7;
    L11:
        this.f23594a.add(r2);     // Catch: Throwable -> L9
    L12:
        monitor-exit(this);
        return;
    L7:
        if (c(r02) == false) goto L12;
    L15:
        throw new IllegalArgumentException("callback cannot be null");     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    }

    public synchronized b b() {
        monitor-enter(this);
        b r1 = (b) super.clone();     // Catch: Throwable -> L12 CloneNotSupportedException -> L17
        r1.f23595b = 0;     // Catch: Throwable -> L12 CloneNotSupportedException -> L14
        r1.f23596c = null;     // Catch: Throwable -> L12 CloneNotSupportedException -> L14
        int r02 = 0;
        r1.d = 0;     // Catch: Throwable -> L12 CloneNotSupportedException -> L14
        r1.f23594a = new ArrayList();     // Catch: Throwable -> L12 CloneNotSupportedException -> L14
        int r2 = this.f23594a.size();     // Catch: Throwable -> L12 CloneNotSupportedException -> L14
    L7:
        if (r02 >= r2) goto L20;
        if (c(r02) == true) goto L16;
        r1.f23594a.add(this.f23594a.get(r02));     // Catch: Throwable -> L12 CloneNotSupportedException -> L14
    L16:
        r02 = r02 + 1;
    L20:
        monitor-exit(this);
        return r1;
    L14:
        CloneNotSupportedException e2 = e;
    L19:
        e2.printStackTrace();     // Catch: Throwable -> L12
    L17:
        e = move-exception;
        r1 = null;
        e2 = e;
    L12:
        th = move-exception;
        throw th;
    }

    public final boolean c(int r11) {
        if (r11 < 64) goto L5;
        long[] r7 = this.f23596c;
        if (r7 != null) goto L11;
        return false;
    L11:
        int r8 = (r11 / 64) - 1;
        if (r8 < r7.length) goto L14;
        return false;
    L14:
        long r2 = 1 << (r11 % 64);
        if ((r2 & r7[r8]) == 0) goto L17;
        return true;
    L17:
        return false;
    L5:
        if (((1 << r11) & this.f23595b) == 0) goto L7;
        return true;
    L7:
        return false;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return b();
    }

    public synchronized void e(Object r4, int r5, Object r6) {
        monitor-enter(this);
        this.d++;
        i(r4, r5, r6);     // Catch: Throwable -> L12
        int r42 = this.d - 1;
        this.d = r42;     // Catch: Throwable -> L12
        if (r42 != 0) goto L18;
        long[] r43 = this.f23596c;     // Catch: Throwable -> L12
        if (r43 == null) goto L15;
        int r44 = r43.length - 1;
    L8:
        if (r44 < 0) goto L15;
        long r1 = this.f23596c[r44];     // Catch: Throwable -> L12
        if (r1 == 0) goto L14;
        l((r44 + 1) * 64, r1);     // Catch: Throwable -> L12
        this.f23596c[r44] = 0;     // Catch: Throwable -> L12
    L14:
        r44 = r44 - 1;
    L15:
        long r02 = this.f23595b;     // Catch: Throwable -> L12
        if (r02 == 0) goto L18;
        l(0, r02);     // Catch: Throwable -> L12
        this.f23595b = 0;     // Catch: Throwable -> L12
    L18:
        monitor-exit(this);
        return;
    L12:
        th = move-exception;
        throw th;
    }

    public final void g(Object r7, int r8, Object r9, int r10, int r11, long r12) {
        long r02 = 1;
    L3:
        if (r10 >= r11) goto L8;
        if ((r12 & r02) != 0) goto L7;
        this.f23597e.a(this.f23594a.get(r10), r7, r8, r9);
    L7:
        r02 = r02 << 1;
        r10 = r10 + 1;
        goto L3
    }

    public final void h(Object r11, int r12, Object r13) {
        g(r11, r12, r13, 0, Math.min(64, this.f23594a.size()), this.f23595b);
    }

    public final void i(Object r10, int r11, Object r12) {
        int r6 = this.f23594a.size();
        long[] r02 = this.f23596c;
        if (r02 != null) goto L5;
        int r03 = -1;
    L6:
        j(r10, r11, r12, r03);
        g(r10, r11, r12, (r03 + 2) * 64, r6, 0);
        return;
    L5:
        r03 = r02.length - 1;
        goto L6
    }

    public final void j(Object r10, int r11, Object r12, int r13) {
        if (r13 >= 0) goto L5;
        h(r10, r11, r12);
        return;
    L5:
        long r7 = this.f23596c[r13];
        int r5 = (r13 + 1) * 64;
        int r6 = Math.min(this.f23594a.size(), r5 + 64);
        j(r10, r11, r12, r13 - 1);
        g(r10, r11, r12, r5, r6, r7);
    }

    public synchronized void k(Object r2) {
        monitor-enter(this);
    L6:
        th = move-exception;
        throw th;
    L4:
        if (this.d != 0) goto L8;
        this.f23594a.remove(r2);     // Catch: Throwable -> L6
    L11:
        monitor-exit(this);
        return;
    L8:
        int r22 = this.f23594a.lastIndexOf(r2);     // Catch: Throwable -> L6
        if (r22 < 0) goto L11;
        m(r22);     // Catch: Throwable -> L6
        goto L11
    }

    public final void l(int r8, long r9) {
        int r02 = r8 + 63;
        long r1 = Long.MIN_VALUE;
    L3:
        if (r02 < r8) goto L8;
        if ((r9 & r1) == 0) goto L7;
        this.f23594a.remove(r02);
    L7:
        r1 = r1 >>> 1;
        r02 = r02 - 1;
        goto L3
    }

    public final void m(int r9) {
        if (r9 >= 64) goto L6;
        this.f23595b = (1 << r9) | this.f23595b;
        return;
    L6:
        int r3 = (r9 / 64) - 1;
        long[] r4 = this.f23596c;
        if (r4 != null) goto L10;
        this.f23596c = new long[this.f23594a.size() / 64];
    L12:
        long r02 = 1 << (r9 % 64);
        long[] r92 = this.f23596c;
        r92[r3] = r02 | r92[r3];
        return;
    L10:
        if (r4.length > r3) goto L12;
        long[] r42 = new long[this.f23594a.size() / 64];
        long[] r5 = this.f23596c;
        System.arraycopy(r5, 0, r42, 0, r5.length);
        this.f23596c = r42;
        goto L12
    }
}
