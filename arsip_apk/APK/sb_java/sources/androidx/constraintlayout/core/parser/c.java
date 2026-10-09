package androidx.constraintlayout.core.parser;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class c implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final char[] f21192a;

    /* renamed from: b, reason: collision with root package name */
    public long f21193b;

    /* renamed from: c, reason: collision with root package name */
    public long f21194c;
    public b d;

    /* renamed from: e, reason: collision with root package name */
    public int f21195e;

    static {
    }

    public c(char[] r3) {
        this.f21193b = -1;
        this.f21194c = Long.MAX_VALUE;
        this.f21192a = r3;
    }

    public c a() {
        return (c) super.clone();
    L5:
        throw new AssertionError();
    }

    public String b() {
        String r02 = new String(this.f21192a);
        if (r02.length() >= 1) goto L6;
        return "";
    L6:
        long r3 = this.f21194c;
        if (r3 == Long.MAX_VALUE) goto L13;
        long r5 = this.f21193b;
        if (r3 < r5) goto L13;
        return r02.substring((int) r5, ((int) r3) + 1);
    L13:
        long r32 = this.f21193b;
        return r02.substring((int) r32, ((int) r32) + 1);
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return a();
    }

    public float e() {
        if ((this instanceof e) == true) goto L5;
        return Float.NaN;
    L5:
        return ((e) this).e();
    }

    public boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if ((r7 instanceof c) == true) goto L8;
        return false;
    L8:
        c r72 = (c) r7;
        if (this.f21193b == r72.f21193b) goto L12;
        return false;
    L12:
        if (this.f21194c == r72.f21194c) goto L15;
        return false;
    L15:
        if (this.f21195e == r72.f21195e) goto L18;
        return false;
    L18:
        if (Arrays.equals(this.f21192a, r72.f21192a) == true) goto L21;
        return false;
    L21:
        return Objects.equals(this.d, r72.d);
    }

    public int g() {
        if ((this instanceof e) == true) goto L5;
        return 0;
    L5:
        return ((e) this).g();
    }

    public int h() {
        return this.f21195e;
    }

    public int hashCode() {
        int r02 = Arrays.hashCode(this.f21192a) * 31;
        long r1 = this.f21193b;
        int r03 = (r02 + ((int) (r1 ^ (r1 >>> 32)))) * 31;
        long r12 = this.f21194c;
        int r04 = (r03 + ((int) (r12 ^ (r12 >>> 32)))) * 31;
        b r13 = this.d;
        if (r13 == null) goto L5;
        int r14 = r13.hashCode();
    L7:
        return ((r04 + r14) * 31) + this.f21195e;
    L5:
        r14 = 0;
        goto L7
    }

    public String j() {
        String r02 = getClass().toString();
        return r02.substring(r02.lastIndexOf(46) + 1);
    }

    public boolean k() {
        char[] r02 = this.f21192a;
        if (r02 != null) goto L5;
        return false;
    L5:
        if (r02.length < 1) goto L9;
        return true;
    L9:
        return false;
    }

    public void l(b r1) {
        this.d = r1;
    }

    public void m(long r5) {
        if (this.f21194c != Long.MAX_VALUE) goto L13;
        this.f21194c = r5;
        if (g.f21200a == false) goto L8;
        System.out.println("closing " + hashCode() + " -> " + this);
    L8:
        b r52 = this.d;
        if (r52 == null) goto L12;
        r52.o(this);
        return;
    L12:
        return;
    }

    public void n(long r1) {
        this.f21193b = r1;
    }

    public String toString() {
        long r02 = this.f21193b;
        long r2 = this.f21194c;
        if (r02 > r2) goto L10;
        if (r2 == Long.MAX_VALUE) goto L10;
        return j() + " (" + this.f21193b + " : " + this.f21194c + ") <<" + new String(this.f21192a).substring((int) this.f21193b, ((int) this.f21194c) + 1) + ">>";
    L10:
        return getClass() + " (INVALID, " + this.f21193b + "-" + this.f21194c + ")";
    }
}
