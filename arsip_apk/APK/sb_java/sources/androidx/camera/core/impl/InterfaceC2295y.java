package androidx.camera.core.impl;

import android.content.Context;
import androidx.camera.core.C2330v;
import java.util.Set;

/* renamed from: androidx.camera.core.impl.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2295y extends B {

    /* renamed from: androidx.camera.core.impl.y$a */
    public interface a {
        InterfaceC2295y a(Context r1, P r2, C2330v r3, long r4, androidx.camera.core.D r6, androidx.camera.core.internal.l r7);
    }

    Object a();

    CameraInternal b(String r1);

    InterfaceC2294x0 c();

    Set d();

    androidx.camera.core.concurrent.a e();

    void shutdown();
}
