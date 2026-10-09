package kotlin.ranges;

import java.util.Iterator;
import kotlin.collections.L;

/* loaded from: classes3.dex */
public class h implements Iterable, kotlin.jvm.internal.markers.a {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f177547a;

    /* renamed from: b, reason: collision with root package name */
    public final int f177548b;

    /* renamed from: c, reason: collision with root package name */
    public final int f177549c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final h a(int r2, int r3, int r4) {
            return new h(r2, r3, r4);
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public h(int r2, int r3, int r4) {
        if (r4 == 0) goto L11;
        if (r4 == Integer.MIN_VALUE) goto L9;
        this.f177547a = r2;
        this.f177548b = kotlin.internal.c.c(r2, r3, r4);
        this.f177549c = r4;
        return;
    L9:
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    L11:
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final int e() {
        return this.f177547a;
    }

    public boolean equals(Object r3) {
        if ((r3 instanceof h) == true) goto L5;
        return false;
    L5:
        if (isEmpty() == true) goto L7;
    L8:
        h r32 = (h) r3;
        if (this.f177547a == r32.f177547a) goto L11;
        return false;
    L11:
        if (this.f177548b == r32.f177548b) goto L13;
        return false;
    L13:
        if (this.f177549c != r32.f177549c) goto L21;
        return true;
    L21:
        return false;
    L7:
        if (((h) r3).isEmpty() == false) goto L8;
        return true;
    }

    public final int f() {
        return this.f177548b;
    }

    public final int g() {
        return this.f177549c;
    }

    public L h() {
        return new i(this.f177547a, this.f177548b, this.f177549c);
    }

    public int hashCode() {
        if (isEmpty() == false) goto L7;
        return -1;
    L7:
        return (((this.f177547a * 31) + this.f177548b) * 31) + this.f177549c;
    }

    public boolean isEmpty() {
        if (this.f177549c <= 0) goto L9;
        if (this.f177547a <= this.f177548b) goto L7;
        return true;
    L7:
        return false;
    L9:
        if (this.f177547a >= this.f177548b) goto L11;
        return true;
    L11:
        return false;
    }

    @Override // java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return h();
    }

    public String toString() {
        if (this.f177549c <= 0) goto L7;
        StringBuilder r02 = new StringBuilder();
        r02.append(this.f177547a);
        r02.append("..");
        r02.append(this.f177548b);
        r02.append(" step ");
        int r1 = this.f177549c;
    L5:
        r02.append(r1);
        return r02.toString();
    L7:
        r02 = new StringBuilder();
        r02.append(this.f177547a);
        r02.append(" downTo ");
        r02.append(this.f177548b);
        r02.append(" step ");
        r1 = -this.f177549c;
        goto L5
    }
}
