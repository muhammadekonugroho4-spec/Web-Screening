package androidx.window.layout;

import java.util.List;
import kotlin.collections.F;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final List f28986a;

    public r(List r2) {
        kotlin.jvm.internal.p.l(r2, "displayFeatures");
        this.f28986a = r2;
    }

    public final List a() {
        return this.f28986a;
    }

    public boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (kotlin.jvm.internal.p.g(r.class, r3.getClass()) == true) goto L10;
        return false;
    L10:
        return kotlin.jvm.internal.p.g(this.f28986a, ((r) r3).f28986a);
    }

    public int hashCode() {
        return this.f28986a.hashCode();
    }

    public String toString() {
        return F.D0(this.f28986a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}
