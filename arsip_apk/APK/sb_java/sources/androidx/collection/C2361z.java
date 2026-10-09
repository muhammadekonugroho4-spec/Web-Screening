package androidx.collection;

import java.util.Arrays;
import kotlin.collections.AbstractC11772p;

/* renamed from: androidx.collection.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2361z implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f6492a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f6493b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f6494c;
    public /* synthetic */ int d;

    public C2361z() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public void a() {
        int r02 = this.d;
        Object[] r1 = this.f6494c;
        int r3 = 0;
    L3:
        if (r3 >= r02) goto L5;
        r1[r3] = null;
        r3 = r3 + 1;
        goto L3
    L5:
        this.d = 0;
        this.f6492a = false;
    }

    public C2361z b() {
        Object r02 = super.clone();
        kotlin.jvm.internal.p.j(r02, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C2361z r03 = (C2361z) r02;
        r03.f6493b = (long[]) this.f6493b.clone();
        r03.f6494c = (Object[]) this.f6494c.clone();
        return r03;
    }

    public boolean c(long r1) {
        if (g(r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return b();
    }

    public Object e(long r3) {
        int r32 = androidx.collection.internal.a.b(this.f6493b, this.d, r3);
        if (r32 >= 0) goto L5;
        return null;
    L5:
        if (this.f6494c[r32] != A.a()) goto L8;
        return null;
    L8:
        return this.f6494c[r32];
    }

    public int g(long r10) {
        if (this.f6492a == false) goto L14;
        int r02 = this.d;
        long[] r1 = this.f6493b;
        Object[] r2 = this.f6494c;
        int r4 = 0;
        int r5 = 0;
    L5:
        if (r4 >= r02) goto L12;
        Object r6 = r2[r4];
        if (r6 == A.a()) goto L11;
        if (r4 == r5) goto L10;
        r1[r5] = r1[r4];
        r2[r5] = r6;
        r2[r4] = null;
    L10:
        r5 = r5 + 1;
    L11:
        r4 = r4 + 1;
        goto L5
    L12:
        this.f6492a = false;
        this.d = r5;
    L14:
        return androidx.collection.internal.a.b(this.f6493b, this.d, r10);
    }

    public boolean h() {
        if (m() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public long i(int r10) {
        if (r10 >= 0) goto L5;
    L7:
        boolean r1 = false;
    L8:
        if (r1 == true) goto L11;
        androidx.collection.internal.d.a("Expected index to be within 0..size()-1, but was " + r10);
    L11:
        if (this.f6492a == false) goto L22;
        int r12 = this.d;
        long[] r2 = this.f6493b;
        Object[] r3 = this.f6494c;
        int r4 = 0;
        int r5 = 0;
    L13:
        if (r4 >= r12) goto L20;
        Object r6 = r3[r4];
        if (r6 == A.a()) goto L19;
        if (r4 == r5) goto L18;
        r2[r5] = r2[r4];
        r3[r5] = r6;
        r3[r4] = null;
    L18:
        r5 = r5 + 1;
    L19:
        r4 = r4 + 1;
        goto L13
    L20:
        this.f6492a = false;
        this.d = r5;
    L22:
        return this.f6493b[r10];
    L5:
        if (r10 >= this.d) goto L7;
        r1 = true;
        goto L8
    }

    public void j(long r10, Object r12) {
        int r02 = androidx.collection.internal.a.b(this.f6493b, this.d, r10);
        if (r02 < 0) goto L6;
        this.f6494c[r02] = r12;
        return;
    L6:
        int r03 = ~r02;
        if (r03 >= this.d) goto L13;
        if (this.f6494c[r03] != A.a()) goto L13;
        this.f6493b[r03] = r10;
        this.f6494c[r03] = r12;
        return;
    L13:
        if (this.f6492a == false) goto L25;
        int r1 = this.d;
        long[] r2 = this.f6493b;
        if (r1 < r2.length) goto L25;
        Object[] r04 = this.f6494c;
        int r4 = 0;
        int r5 = 0;
    L17:
        if (r4 >= r1) goto L24;
        Object r6 = r04[r4];
        if (r6 == A.a()) goto L23;
        if (r4 == r5) goto L22;
        r2[r5] = r2[r4];
        r04[r5] = r6;
        r04[r4] = null;
    L22:
        r5 = r5 + 1;
    L23:
        r4 = r4 + 1;
        goto L17
    L24:
        this.f6492a = false;
        this.d = r5;
        r03 = ~androidx.collection.internal.a.b(this.f6493b, r5, r10);
    L25:
        int r13 = this.d;
        if (r13 < this.f6493b.length) goto L28;
        int r14 = androidx.collection.internal.a.f(r13 + 1);
        long[] r22 = Arrays.copyOf(this.f6493b, r14);
        kotlin.jvm.internal.p.k(r22, "copyOf(...)");
        this.f6493b = r22;
        Object[] r15 = Arrays.copyOf(this.f6494c, r14);
        kotlin.jvm.internal.p.k(r15, "copyOf(...)");
        this.f6494c = r15;
    L28:
        int r16 = this.d;
        if ((r16 - r03) == 0) goto L31;
        long[] r23 = this.f6493b;
        int r3 = r03 + 1;
        AbstractC11772p.n(r23, r23, r3, r03, r16);
        Object[] r17 = this.f6494c;
        AbstractC11772p.o(r17, r17, r3, r03, this.d);
    L31:
        this.f6493b[r03] = r10;
        this.f6494c[r03] = r12;
        this.d++;
    }

    public void k(long r3) {
        int r32 = androidx.collection.internal.a.b(this.f6493b, this.d, r3);
        if (r32 >= 0) goto L5;
        return;
    L5:
        if (this.f6494c[r32] == A.a()) goto L9;
        this.f6494c[r32] = A.a();
        this.f6492a = true;
        return;
    }

    public void l(int r3) {
        if (this.f6494c[r3] == A.a()) goto L6;
        this.f6494c[r3] = A.a();
        this.f6492a = true;
        return;
    }

    public int m() {
        if (this.f6492a == false) goto L14;
        int r02 = this.d;
        long[] r1 = this.f6493b;
        Object[] r2 = this.f6494c;
        int r4 = 0;
        int r5 = 0;
    L5:
        if (r4 >= r02) goto L12;
        Object r6 = r2[r4];
        if (r6 == A.a()) goto L11;
        if (r4 == r5) goto L10;
        r1[r5] = r1[r4];
        r2[r5] = r6;
        r2[r4] = null;
    L10:
        r5 = r5 + 1;
    L11:
        r4 = r4 + 1;
        goto L5
    L12:
        this.f6492a = false;
        this.d = r5;
    L14:
        return this.d;
    }

    public Object n(int r10) {
        if (r10 >= 0) goto L5;
    L7:
        boolean r1 = false;
    L8:
        if (r1 == true) goto L11;
        androidx.collection.internal.d.a("Expected index to be within 0..size()-1, but was " + r10);
    L11:
        if (this.f6492a == false) goto L22;
        int r12 = this.d;
        long[] r2 = this.f6493b;
        Object[] r3 = this.f6494c;
        int r4 = 0;
        int r5 = 0;
    L13:
        if (r4 >= r12) goto L20;
        Object r6 = r3[r4];
        if (r6 == A.a()) goto L19;
        if (r4 == r5) goto L18;
        r2[r5] = r2[r4];
        r3[r5] = r6;
        r3[r4] = null;
    L18:
        r5 = r5 + 1;
    L19:
        r4 = r4 + 1;
        goto L13
    L20:
        this.f6492a = false;
        this.d = r5;
    L22:
        return this.f6494c[r10];
    L5:
        if (r10 >= this.d) goto L7;
        r1 = true;
        goto L8
    }

    public String toString() {
        if (m() > 0) goto L6;
        return "{}";
    L6:
        StringBuilder r1 = new StringBuilder(this.d * 28);
        r1.append('{');
        int r02 = this.d;
        int r2 = 0;
    L7:
        if (r2 >= r02) goto L15;
        if (r2 <= 0) goto L10;
        r1.append(", ");
    L10:
        r1.append(i(r2));
        r1.append('=');
        Object r3 = n(r2);
        if (r3 == r1) goto L13;
        r1.append(r3);
    L14:
        r2 = r2 + 1;
        goto L7
    L13:
        r1.append("(this Map)");
        goto L14
    L15:
        r1.append('}');
        String r03 = r1.toString();
        kotlin.jvm.internal.p.k(r03, "toString(...)");
        return r03;
    }

    public C2361z(int r2) {
        if (r2 != 0) goto L6;
        this.f6493b = androidx.collection.internal.a.f6449b;
        this.f6494c = androidx.collection.internal.a.f6450c;
        return;
    L6:
        int r22 = androidx.collection.internal.a.f(r2);
        this.f6493b = new long[r22];
        this.f6494c = new Object[r22];
    }

    public /* synthetic */ C2361z(int r1, int r2, kotlin.jvm.internal.i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 10;
    L5:
        this(r1);
    }
}
