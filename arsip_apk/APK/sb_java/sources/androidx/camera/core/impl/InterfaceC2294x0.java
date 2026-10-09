package androidx.camera.core.impl;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2294x0 {

    /* renamed from: androidx.camera.core.impl.x0$a */
    public interface a {
        void a(Object r1);

        void onError(Throwable r1);
    }

    ListenableFuture a();

    void b(Executor r1, a r2);

    void c(a r1);
}
