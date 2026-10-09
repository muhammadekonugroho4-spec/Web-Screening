package androidx.camera.core.internal;

import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.H0;

/* loaded from: classes.dex */
public interface p extends H0 {

    /* renamed from: M, reason: collision with root package name */
    public static final Config.a f5714M = null;

    /* renamed from: N, reason: collision with root package name */
    public static final Config.a f5715N = null;

    static {
        f5714M = Config.a.a("camerax.core.target.name", String.class);
        f5715N = Config.a.a("camerax.core.target.class", Class.class);
    }

    default String F() {
        return (String) a(f5714M);
    }

    default String t(String r2) {
        return (String) d(f5714M, r2);
    }
}
