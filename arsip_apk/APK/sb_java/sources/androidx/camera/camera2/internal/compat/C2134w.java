package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.C2119g;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.internal.compat.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2134w implements C2119g.a {

    /* renamed from: a, reason: collision with root package name */
    public final CameraCaptureSession f4389a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4390b;

    /* renamed from: androidx.camera.camera2.internal.compat.w$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f4391a;

        public a(Handler r1) {
            this.f4391a = r1;
        }
    }

    public C2134w(CameraCaptureSession r1, Object r2) {
        this.f4389a = (CameraCaptureSession) androidx.core.util.h.g(r1);
        this.f4390b = r2;
    }

    public static C2119g.a e(CameraCaptureSession r2, Handler r3) {
        return new C2134w(r2, new a(r3));
    }

    @Override // androidx.camera.camera2.internal.compat.C2119g.a
    public CameraCaptureSession a() {
        return this.f4389a;
    }

    @Override // androidx.camera.camera2.internal.compat.C2119g.a
    public int b(List r2, Executor r3, CameraCaptureSession.CaptureCallback r4) {
        C2119g.b r02 = new C2119g.b(r3, r4);
        a r32 = (a) this.f4390b;
        return this.f4389a.captureBurst(r2, r02, r32.f4391a);
    }

    @Override // androidx.camera.camera2.internal.compat.C2119g.a
    public int c(List r2, Executor r3, CameraCaptureSession.CaptureCallback r4) {
        C2119g.b r02 = new C2119g.b(r3, r4);
        a r32 = (a) this.f4390b;
        return this.f4389a.setRepeatingBurst(r2, r02, r32.f4391a);
    }

    @Override // androidx.camera.camera2.internal.compat.C2119g.a
    public int d(CaptureRequest r2, Executor r3, CameraCaptureSession.CaptureCallback r4) {
        C2119g.b r02 = new C2119g.b(r3, r4);
        a r32 = (a) this.f4390b;
        return this.f4389a.setRepeatingRequest(r2, r02, r32.f4391a);
    }
}
