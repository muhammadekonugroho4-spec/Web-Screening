package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.huawei.hms.android.SystemUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC11772p;
import kotlin.collections.AbstractC11777v;
import kotlin.collections.F;
import kotlin.collections.r;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: f, reason: collision with root package name */
    public static final C1903a f179131f = null;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f179132a;

    /* renamed from: b, reason: collision with root package name */
    public final int f179133b;

    /* renamed from: c, reason: collision with root package name */
    public final int f179134c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final List f179135e;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.deserialization.a$a, reason: collision with other inner class name */
    public static final class C1903a {
        public /* synthetic */ C1903a(kotlin.jvm.internal.i r1) {
            this();
        }

        public C1903a() {
        }
    }

    static {
        f179131f = new C1903a(null);
    }

    public a(int... r4) {
        p.l(r4, "numbers");
        this.f179132a = r4;
        Integer r02 = r.A0(r4, 0);
        int r1 = -1;
        if (r02 == null) goto L5;
        int r03 = r02.intValue();
    L6:
        this.f179133b = r03;
        Integer r04 = r.A0(r4, 1);
        if (r04 == null) goto L9;
        int r05 = r04.intValue();
    L10:
        this.f179134c = r05;
        Integer r06 = r.A0(r4, 2);
        if (r06 == null) goto L13;
        r1 = r06.intValue();
    L13:
        this.d = r1;
        if (r4.length > 3) goto L16;
        List r42 = AbstractC11777v.o();
    L21:
        this.f179135e = r42;
        return;
    L16:
        if (r4.length > 1024) goto L19;
        r42 = F.z1(AbstractC11772p.f(r4).subList(3, r4.length));
        goto L21
    L19:
        throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + r4.length + '.');
    L9:
        r05 = -1;
        goto L10
    L5:
        r03 = -1;
        goto L6
    }

    public final int a() {
        return this.f179133b;
    }

    public final int b() {
        return this.f179134c;
    }

    public final boolean c(int r4, int r5, int r6) {
        int r02 = this.f179133b;
        if (r02 <= r4) goto L6;
        return true;
    L6:
        if (r02 >= r4) goto L8;
        return false;
    L8:
        int r42 = this.f179134c;
        if (r42 <= r5) goto L11;
        return true;
    L11:
        if (r42 >= r5) goto L14;
        return false;
    L14:
        if (this.d < r6) goto L16;
        return true;
    L16:
        return false;
    }

    public final boolean d(a r3) {
        p.l(r3, "version");
        return c(r3.f179133b, r3.f179134c, r3.d);
    }

    public final boolean e(int r4, int r5, int r6) {
        int r02 = this.f179133b;
        if (r02 >= r4) goto L6;
        return true;
    L6:
        if (r02 <= r4) goto L8;
        return false;
    L8:
        int r42 = this.f179134c;
        if (r42 >= r5) goto L11;
        return true;
    L11:
        if (r42 <= r5) goto L14;
        return false;
    L14:
        if (this.d > r6) goto L16;
        return true;
    L16:
        return false;
    }

    public boolean equals(Object r3) {
        if (r3 != null) goto L4;
        return false;
    L4:
        if (p.g(getClass(), r3.getClass()) == false) goto L17;
        a r32 = (a) r3;
        if (this.f179133b == r32.f179133b) goto L8;
        return false;
    L8:
        if (this.f179134c == r32.f179134c) goto L10;
        return false;
    L10:
        if (this.d == r32.d) goto L12;
        return false;
    L12:
        if (p.g(this.f179135e, r32.f179135e) == false) goto L21;
        return true;
    L21:
        return false;
    L17:
        return false;
    }

    public final boolean f(a r5) {
        p.l(r5, "ourVersion");
        int r02 = this.f179133b;
        if (r02 != 0) goto L11;
        if (r5.f179133b == 0) goto L7;
    L9:
        return false;
    L7:
        if (this.f179134c != r5.f179134c) goto L9;
        return true;
    L11:
        if (r02 == r5.f179133b) goto L13;
    L15:
        return false;
    L13:
        if (this.f179134c > r5.f179134c) goto L15;
        return true;
    }

    public final int[] g() {
        return this.f179132a;
    }

    public int hashCode() {
        int r02 = this.f179133b;
        int r03 = r02 + ((r02 * 31) + this.f179134c);
        int r04 = r03 + ((r03 * 31) + this.d);
        return r04 + ((r04 * 31) + this.f179135e.hashCode());
    }

    public String toString() {
        int[] r02 = g();
        ArrayList r1 = new ArrayList();
        int r2 = r02.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L8;
        int r4 = r02[r3];
        if (r4 == (-1)) goto L8;
        r1.add(Integer.valueOf(r4));
        r3 = r3 + 1;
    L8:
        if (r1.isEmpty() == false) goto L12;
        return SystemUtils.UNKNOWN;
    L12:
        return F.D0(r1, ".", null, null, 0, null, null, 62, null);
    }
}
