package androidx.camera.camera2.internal;

import androidx.camera.core.AbstractC2209b0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f4523a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f4524b;

    public i2(Executor r2) {
        kotlin.jvm.internal.p.l(r2, "executor");
        this.f4523a = r2;
        this.f4524b = new AtomicInteger(0);
    }

    public final int a() {
        return this.f4524b.get();
    }

    public final void b() {
        this.f4524b.set(0);
        AbstractC2209b0.a("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }
}
