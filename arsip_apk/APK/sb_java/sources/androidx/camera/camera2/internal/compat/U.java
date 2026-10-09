package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.D;
import androidx.camera.camera2.internal.compat.P;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class U implements P.b {

    /* renamed from: a, reason: collision with root package name */
    public final CameraManager f4277a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4278b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Map f4279a;

        /* renamed from: b, reason: collision with root package name */
        public final Handler f4280b;

        public a(Handler r2) {
            this.f4279a = new HashMap();
            this.f4280b = r2;
        }
    }

    public U(Context r2, Object r3) {
        this.f4277a = (CameraManager) r2.getSystemService("camera");
        this.f4278b = r3;
    }

    public static U i(Context r2, Handler r3) {
        return new U(r2, new a(r3));
    }

    @Override // androidx.camera.camera2.internal.compat.P.b
    public CameraManager a() {
        return this.f4277a;
    }

    @Override // androidx.camera.camera2.internal.compat.P.b
    public void b(Executor r4, CameraManager.AvailabilityCallback r5) {
        if (r4 == null) goto L20;
        a r02 = (a) this.f4278b;
        if (r5 == null) goto L16;
        Map r1 = r02.f4279a;
        monitor-enter(r1);
        P.a r2 = (P.a) r02.f4279a.get(r5);     // Catch: Throwable -> L10
        if (r2 != null) goto L12;
        r2 = new P.a(r4, r5);     // Catch: Throwable -> L10
        r02.f4279a.put(r5, r2);     // Catch: Throwable -> L10
    L12:
        monitor-exit(r1);     // Catch: Throwable -> L10
    L17:
        this.f4277a.registerAvailabilityCallback(r2, r02.f4280b);
        return;
    L10:
        th = move-exception;
        throw th;
    L16:
        r2 = null;
        goto L17
    L20:
        throw new IllegalArgumentException("executor was null");
    }

    @Override // androidx.camera.camera2.internal.compat.P.b
    public void c(String r2, Executor r3, CameraDevice.StateCallback r4) {
        androidx.core.util.h.g(r3);
        androidx.core.util.h.g(r4);
        D.b r02 = new D.b(r3, r4);
        a r32 = (a) this.f4278b;
        this.f4277a.openCamera(r2, r02, r32.f4280b);     // Catch: CameraAccessException -> L5
        return;
    L5:
        e = move-exception;
        throw CameraAccessExceptionCompat.e(e);
    }

    @Override // androidx.camera.camera2.internal.compat.P.b
    public CameraCharacteristics e(String r2) {
        return this.f4277a.getCameraCharacteristics(r2);
    L4:
        e = move-exception;
        throw CameraAccessExceptionCompat.e(e);
    }

    @Override // androidx.camera.camera2.internal.compat.P.b
    public Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // androidx.camera.camera2.internal.compat.P.b
    public String[] g() {
        return this.f4277a.getCameraIdList();
    L4:
        e = move-exception;
        throw CameraAccessExceptionCompat.e(e);
    }

    @Override // androidx.camera.camera2.internal.compat.P.b
    public void h(CameraManager.AvailabilityCallback r3) {
        if (r3 == null) goto L11;
        a r02 = (a) this.f4278b;
        Map r1 = r02.f4279a;
        monitor-enter(r1);
        P.a r32 = (P.a) r02.f4279a.remove(r3);     // Catch: Throwable -> L8
        monitor-exit(r1);     // Catch: Throwable -> L8
    L12:
        if (r32 == null) goto L14;
        r32.d();
    L14:
        this.f4277a.unregisterAvailabilityCallback(r32);
        return;
    L8:
        th = move-exception;
        throw th;
    L11:
        r32 = null;
        goto L12
    }
}
