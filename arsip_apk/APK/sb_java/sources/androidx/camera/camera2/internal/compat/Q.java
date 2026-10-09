package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class Q extends U {
    public Q(Context r2) {
        super(r2, null);
    }

    public static Q j(Context r1) {
        return new Q(r1);
    }

    public static boolean l(Throwable r2) {
        if (r2.getClass().equals(RuntimeException.class) == false) goto L11;
        StackTraceElement[] r22 = r2.getStackTrace();
        if (r22 == null) goto L11;
        if (r22.length < 0) goto L11;
        return "_enableShutterSound".equals(r22[0].getMethodName());
    L11:
        return false;
    }

    @Override // androidx.camera.camera2.internal.compat.U, androidx.camera.camera2.internal.compat.P.b
    public void b(Executor r2, CameraManager.AvailabilityCallback r3) {
        this.f4277a.registerAvailabilityCallback(r2, r3);
    }

    @Override // androidx.camera.camera2.internal.compat.U, androidx.camera.camera2.internal.compat.P.b
    public void c(String r2, Executor r3, CameraDevice.StateCallback r4) {
        this.f4277a.openCamera(r2, r3, r4);     // Catch: RuntimeException -> L4 SecurityException -> L6 IllegalArgumentException -> L8 CameraAccessException -> L10
        return;
    L10:
        e = move-exception;
        throw CameraAccessExceptionCompat.e(e);
    L8:
        e = move-exception;
        throw e;
    L6:
        e = move-exception;
        throw e;
    L4:
        e = move-exception;
        if (k(e) == false) goto L15;
        m(e);
    L15:
        throw e;
    }

    @Override // androidx.camera.camera2.internal.compat.U, androidx.camera.camera2.internal.compat.P.b
    public CameraCharacteristics e(String r2) {
        return super.e(r2);
    L4:
        e = move-exception;
        if (k(e) == false) goto L8;
        m(e);
    L8:
        throw e;
    }

    @Override // androidx.camera.camera2.internal.compat.U, androidx.camera.camera2.internal.compat.P.b
    public void h(CameraManager.AvailabilityCallback r2) {
        this.f4277a.unregisterAvailabilityCallback(r2);
    }

    public final boolean k(Throwable r3) {
        if (Build.VERSION.SDK_INT == 28) goto L5;
        return false;
    L5:
        if (l(r3) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final void m(Throwable r3) {
        throw new CameraAccessExceptionCompat(10001, r3);
    }
}
