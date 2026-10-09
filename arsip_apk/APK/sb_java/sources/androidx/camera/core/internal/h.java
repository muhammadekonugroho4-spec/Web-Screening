package androidx.camera.core.internal;

import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.H0;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface h extends H0 {

    /* renamed from: L, reason: collision with root package name */
    public static final Config.a f5695L = null;

    static {
        f5695L = Config.a.a("camerax.core.io.ioExecutor", Executor.class);
    }
}
