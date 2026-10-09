package androidx.camera.core;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.camera.core.impl.InterfaceC2267j0;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2212d implements InterfaceC2267j0 {

    /* renamed from: a, reason: collision with root package name */
    public final ImageReader f4926a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4927b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4928c;

    public C2212d(ImageReader r2) {
        this.f4927b = new Object();
        this.f4928c = true;
        this.f4926a = r2;
    }

    public static /* synthetic */ void e(final C2212d r1, Executor r2, final InterfaceC2267j0.a r3, ImageReader r4) {
        Object r42 = r1.f4927b;
        monitor-enter(r42);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (r1.f4928c == true) goto L9;
        r2.execute(new RunnableC2210c(r1, r3));     // Catch: Throwable -> L7
    L9:
        monitor-exit(r42);     // Catch: Throwable -> L7
    }

    public static /* synthetic */ void i(C2212d r02, InterfaceC2267j0.a r1) {
        r02.getClass();
        r1.a(r02);
    }

    @Override // androidx.camera.core.impl.InterfaceC2267j0
    public Surface a() {
        Object r02 = this.f4927b;
        monitor-enter(r02);
        Surface r1 = this.f4926a.getSurface();     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // androidx.camera.core.impl.InterfaceC2267j0
    public int b() {
        Object r02 = this.f4927b;
        monitor-enter(r02);
        int r1 = this.f4926a.getImageFormat();     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // androidx.camera.core.impl.InterfaceC2267j0
    public int c() {
        Object r02 = this.f4927b;
        monitor-enter(r02);
        int r1 = this.f4926a.getMaxImages();     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // androidx.camera.core.impl.InterfaceC2267j0
    public void close() {
        Object r02 = this.f4927b;
        monitor-enter(r02);
        this.f4926a.close();     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // androidx.camera.core.impl.InterfaceC2267j0
    public W d() {
        Object r02 = this.f4927b;
        monitor-enter(r02);
        Image r2 = this.f4926a.acquireNextImage();     // Catch: Throwable -> L7 RuntimeException -> L9
    L13:
        if (r2 != null) goto L16;
        monitor-exit(r02);     // Catch: Throwable -> L7
        return null;
    L16:
        C2206a r1 = new C2206a(r2);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L9:
        e = move-exception;
        if (j(e) == false) goto L19;
        r2 = null;
        goto L13
    L19:
        throw e;     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        throw th;
    }

    @Override // androidx.camera.core.impl.InterfaceC2267j0
    public W f() {
        Object r02 = this.f4927b;
        monitor-enter(r02);
        Image r2 = this.f4926a.acquireLatestImage();     // Catch: Throwable -> L7 RuntimeException -> L9
    L13:
        if (r2 != null) goto L16;
        monitor-exit(r02);     // Catch: Throwable -> L7
        return null;
    L16:
        C2206a r1 = new C2206a(r2);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L9:
        e = move-exception;
        if (j(e) == false) goto L19;
        r2 = null;
        goto L13
    L19:
        throw e;     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        throw th;
    }

    @Override // androidx.camera.core.impl.InterfaceC2267j0
    public void g() {
        Object r02 = this.f4927b;
        monitor-enter(r02);
        this.f4928c = true;     // Catch: Throwable -> L8
        this.f4926a.setOnImageAvailableListener(null, null);     // Catch: Throwable -> L8
        monitor-exit(r02);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // androidx.camera.core.impl.InterfaceC2267j0
    public int getHeight() {
        Object r02 = this.f4927b;
        monitor-enter(r02);
        int r1 = this.f4926a.getHeight();     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // androidx.camera.core.impl.InterfaceC2267j0
    public int getWidth() {
        Object r02 = this.f4927b;
        monitor-enter(r02);
        int r1 = this.f4926a.getWidth();     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // androidx.camera.core.impl.InterfaceC2267j0
    public void h(final InterfaceC2267j0.a r3, final Executor r4) {
        Object r02 = this.f4927b;
        monitor-enter(r02);
        this.f4928c = false;     // Catch: Throwable -> L8
        ImageReader.OnImageAvailableListener r1 = new C2208b(this, r4, r3);     // Catch: Throwable -> L8
        this.f4926a.setOnImageAvailableListener(r1, androidx.camera.core.impl.utils.k.a());     // Catch: Throwable -> L8
        monitor-exit(r02);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public final boolean j(RuntimeException r2) {
        return "ImageReaderContext is not initialized".equals(r2.getMessage());
    }
}
