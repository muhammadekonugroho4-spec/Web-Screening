package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.AbstractC2114b;
import androidx.camera.camera2.internal.compat.AbstractC2116d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class R0 {

    public static final class a extends CameraCaptureSession.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        public final List f4130a;

        public a(List r3) {
            this.f4130a = new ArrayList();
            Iterator r32 = r3.iterator();
        L4:
            if (r32.hasNext() == false) goto L8;
            CameraCaptureSession.StateCallback r02 = (CameraCaptureSession.StateCallback) r32.next();
            if ((r02 instanceof b) == true) goto L4;
            this.f4130a.add(r02);
            goto L4
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession r3) {
            Iterator r02 = this.f4130a.iterator();
        L4:
            if (r02.hasNext() == false) goto L6;
            ((CameraCaptureSession.StateCallback) r02.next()).onActive(r3);
            goto L4
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession r3) {
            Iterator r02 = this.f4130a.iterator();
        L4:
            if (r02.hasNext() == false) goto L6;
            AbstractC2116d.a((CameraCaptureSession.StateCallback) r02.next(), r3);
            goto L4
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession r3) {
            Iterator r02 = this.f4130a.iterator();
        L4:
            if (r02.hasNext() == false) goto L6;
            ((CameraCaptureSession.StateCallback) r02.next()).onClosed(r3);
            goto L4
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession r3) {
            Iterator r02 = this.f4130a.iterator();
        L4:
            if (r02.hasNext() == false) goto L6;
            ((CameraCaptureSession.StateCallback) r02.next()).onConfigureFailed(r3);
            goto L4
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession r3) {
            Iterator r02 = this.f4130a.iterator();
        L4:
            if (r02.hasNext() == false) goto L6;
            ((CameraCaptureSession.StateCallback) r02.next()).onConfigured(r3);
            goto L4
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession r3) {
            Iterator r02 = this.f4130a.iterator();
        L4:
            if (r02.hasNext() == false) goto L6;
            ((CameraCaptureSession.StateCallback) r02.next()).onReady(r3);
            goto L4
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession r3, Surface r4) {
            Iterator r02 = this.f4130a.iterator();
        L4:
            if (r02.hasNext() == false) goto L6;
            AbstractC2114b.a((CameraCaptureSession.StateCallback) r02.next(), r3, r4);
            goto L4
        }
    }

    public static final class b extends CameraCaptureSession.StateCallback {
        public b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession r1) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession r1) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession r1) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession r1) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession r1) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession r1) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession r1, Surface r2) {
        }
    }

    public static CameraCaptureSession.StateCallback a(List r2) {
        if (r2.isEmpty() == false) goto L7;
        return b();
    L7:
        if (r2.size() != 1) goto L11;
        return (CameraCaptureSession.StateCallback) r2.get(0);
    L11:
        return new a(r2);
    }

    public static CameraCaptureSession.StateCallback b() {
        return new b();
    }
}
