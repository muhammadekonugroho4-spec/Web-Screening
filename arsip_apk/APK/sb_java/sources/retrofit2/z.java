package retrofit2;

import java.lang.annotation.Annotation;

/* loaded from: classes3.dex */
public final class z implements y {

    /* renamed from: a, reason: collision with root package name */
    public static final y f183605a = null;

    static {
        f183605a = new z();
    }

    public z() {
    }

    public static Annotation[] a(Annotation[] r4) {
        if (A.l(r4, y.class) == false) goto L5;
        return r4;
    L5:
        Annotation[] r02 = new Annotation[r4.length + 1];
        r02[0] = f183605a;
        System.arraycopy(r4, 0, r02, 1, r4.length);
        return r02;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return y.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object r1) {
        return r1 instanceof y;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + y.class.getName() + "()";
    }
}
