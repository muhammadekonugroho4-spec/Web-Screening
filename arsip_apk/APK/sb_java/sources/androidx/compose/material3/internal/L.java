package androidx.compose.material3.internal;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final Map f13667a;

    static {
    }

    public L() {
        this.f13667a = new LinkedHashMap();
    }

    public final void a(Object r2, float r3) {
        Float r32 = Float.valueOf(r3);
        this.f13667a.put(r2, r32);
    }

    public final Map b() {
        return this.f13667a;
    }
}
