package androidx.constraintlayout.compose;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20958a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f20959b;

    static {
    }

    public t(Object r1) {
        this.f20958a = r1;
        this.f20959b = new LinkedHashMap();
    }

    public Object a() {
        return this.f20958a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof t) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(a(), ((t) r4).a()) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return a().hashCode();
    }
}
