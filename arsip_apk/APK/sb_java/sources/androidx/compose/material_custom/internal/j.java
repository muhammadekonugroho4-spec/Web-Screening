package androidx.compose.material_custom.internal;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Map f15642a;

    static {
    }

    public j() {
        this.f15642a = new LinkedHashMap();
    }

    public final void a(Object r2, float r3) {
        this.f15642a.put(r2, Float.valueOf(r3));
    }

    public final Map b() {
        return this.f15642a;
    }
}
