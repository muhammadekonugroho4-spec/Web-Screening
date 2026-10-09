package androidx.camera.core.processing;

import androidx.camera.core.t0;

/* renamed from: androidx.camera.core.processing.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2319n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f5919a;

    public /* synthetic */ RunnableC2319n(t0 r1) {
        this.f5919a = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5919a.close();
    }
}
