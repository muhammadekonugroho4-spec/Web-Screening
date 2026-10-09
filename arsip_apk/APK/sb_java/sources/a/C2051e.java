package a;

import java.util.Map;
import kotlin.jvm.internal.p;

/* renamed from: a.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2051e {

    /* renamed from: a, reason: collision with root package name */
    public final Map f1462a;

    public C2051e(Map r2) {
        p.l(r2, "s2Ids");
        this.f1462a = r2;
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if ((r7 instanceof C2051e) == true) goto L8;
        return false;
    L8:
        C2051e r72 = (C2051e) r7;
        Double r1 = Double.valueOf(0.0d);
        r72.getClass();
        if (p.g(r1, Double.valueOf(0.0d)) == true) goto L12;
        return false;
    L12:
        if (p.g(Double.valueOf(0.0d), Double.valueOf(0.0d)) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f1462a, r72.f1462a) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r2 = Double.hashCode(0.0d) * 31;
        int r02 = (Double.hashCode(0.0d) + r2) * 31;
        return this.f1462a.hashCode() + r02;
    }

    public final String toString() {
        return "CSLocationInfo(latitude=0.0, longitude=0.0, s2Ids=" + this.f1462a + ')';
    }
}
