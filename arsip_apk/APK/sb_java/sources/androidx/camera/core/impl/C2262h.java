package androidx.camera.core.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2262h extends P {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f5408a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f5409b;

    public C2262h(Executor r1, Handler r2) {
        if (r1 == null) goto L11;
        this.f5408a = r1;
        if (r2 == null) goto L9;
        this.f5409b = r2;
        return;
    L9:
        throw new NullPointerException("Null schedulerHandler");
    L11:
        throw new NullPointerException("Null cameraExecutor");
    }

    @Override // androidx.camera.core.impl.P
    public Executor b() {
        return this.f5408a;
    }

    @Override // androidx.camera.core.impl.P
    public Handler c() {
        return this.f5409b;
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof P) == false) goto L12;
        P r52 = (P) r5;
        if (this.f5408a.equals(r52.b()) == false) goto L12;
        if (this.f5409b.equals(r52.c()) == false) goto L12;
        return true;
    L12:
        return false;
    }

    public int hashCode() {
        return ((this.f5408a.hashCode() ^ 1000003) * 1000003) ^ this.f5409b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f5408a + ", schedulerHandler=" + this.f5409b + "}";
    }
}
