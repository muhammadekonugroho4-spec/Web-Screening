package androidx.camera.core.impl;

import android.view.Surface;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2267j0 {

    /* renamed from: androidx.camera.core.impl.j0$a */
    public interface a {
        void a(InterfaceC2267j0 r1);
    }

    Surface a();

    int b();

    int c();

    void close();

    androidx.camera.core.W d();

    androidx.camera.core.W f();

    void g();

    int getHeight();

    int getWidth();

    void h(a r1, Executor r2);
}
