package kotlin.ranges;

import java.util.Iterator;
import kotlin.collections.M;

/* loaded from: classes3.dex */
public class k implements Iterable, kotlin.jvm.internal.markers.a {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final long f177555a;

    /* renamed from: b, reason: collision with root package name */
    public final long f177556b;

    /* renamed from: c, reason: collision with root package name */
    public final long f177557c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final k a(long r8, long r10, long r12) {
            return new k(r8, r10, r12);
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public k(long r3, long r5, long r7) {
        if (r7 == 0) goto L11;
        if (r7 == Long.MIN_VALUE) goto L9;
        this.f177555a = r3;
        this.f177556b = kotlin.internal.c.d(r3, r5, r7);
        this.f177557c = r7;
        return;
    L9:
        throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
    L11:
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final long e() {
        return this.f177555a;
    }

    public boolean equals(Object r5) {
        if ((r5 instanceof k) == true) goto L5;
        return false;
    L5:
        if (isEmpty() == true) goto L7;
    L8:
        k r52 = (k) r5;
        if (this.f177555a == r52.f177555a) goto L11;
        return false;
    L11:
        if (this.f177556b == r52.f177556b) goto L13;
        return false;
    L13:
        if (this.f177557c != r52.f177557c) goto L21;
        return true;
    L21:
        return false;
    L7:
        if (((k) r5).isEmpty() == false) goto L8;
        return true;
    }

    public final long f() {
        return this.f177556b;
    }

    public final long g() {
        return this.f177557c;
    }

    public M h() {
        return new l(this.f177555a, this.f177556b, this.f177557c);
    }

    public int hashCode() {
        if (isEmpty() == false) goto L6;
        return -1;
    L6:
        long r02 = 31;
        long r2 = this.f177555a;
        long r5 = this.f177556b;
        long r03 = r02 * (((r2 ^ (r2 >>> 32)) * r02) + (r5 ^ (r5 >>> 32)));
        long r22 = this.f177557c;
        return (int) (r03 + (r22 ^ (r22 >>> 32)));
    }

    public boolean isEmpty() {
        long r02 = this.f177557c;
        long r3 = this.f177555a;
        long r5 = this.f177556b;
        if (r02 <= 0) goto L9;
        if (r3 <= r5) goto L7;
        return true;
    L7:
        return false;
    L9:
        if (r3 >= r5) goto L11;
        return true;
    L11:
        return false;
    }

    @Override // java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return h();
    }

    public String toString() {
        if (this.f177557c <= 0) goto L7;
        StringBuilder r02 = new StringBuilder();
        r02.append(this.f177555a);
        r02.append("..");
        r02.append(this.f177556b);
        r02.append(" step ");
        long r1 = this.f177557c;
    L5:
        r02.append(r1);
        return r02.toString();
    L7:
        r02 = new StringBuilder();
        r02.append(this.f177555a);
        r02.append(" downTo ");
        r02.append(this.f177556b);
        r02.append(" step ");
        r1 = -this.f177557c;
        goto L5
    }
}
