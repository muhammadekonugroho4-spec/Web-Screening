package androidx.core.util;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f23078a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23079b;

    public d(Object r1, Object r2) {
        this.f23078a = r1;
        this.f23079b = r2;
    }

    public static d a(Object r1, Object r2) {
        return new d(r1, r2);
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof d) == true) goto L5;
        return false;
    L5:
        d r42 = (d) r4;
        if (c.a(r42.f23078a, this.f23078a) == true) goto L8;
    L11:
        return false;
    L8:
        if (c.a(r42.f23079b, this.f23079b) == false) goto L11;
        return true;
    }

    public int hashCode() {
        Object r02 = this.f23078a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        Object r2 = this.f23079b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r03 ^ r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "Pair{" + this.f23078a + " " + this.f23079b + "}";
    }
}
