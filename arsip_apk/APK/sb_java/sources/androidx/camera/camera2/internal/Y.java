package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.AbstractC2115c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Y {

    public static final class a extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        public final List f4219a;

        public a(List r3) {
            this.f4219a = new ArrayList();
            Iterator r32 = r3.iterator();
        L4:
            if (r32.hasNext() == false) goto L8;
            CameraCaptureSession.CaptureCallback r02 = (CameraCaptureSession.CaptureCallback) r32.next();
            if ((r02 instanceof b) == true) goto L4;
            this.f4219a.add(r02);
            goto L4
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(CameraCaptureSession r9, CaptureRequest r10, Surface r11, long r12) {
            Iterator r02 = this.f4219a.iterator();
        L4:
            if (r02.hasNext() == false) goto L6;
            AbstractC2115c.a((CameraCaptureSession.CaptureCallback) r02.next(), r9, r10, r11, r12);
            goto L4
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession r3, CaptureRequest r4, TotalCaptureResult r5) {
            Iterator r02 = this.f4219a.iterator();
        L4:
            if (r02.hasNext() == false) goto L6;
            ((CameraCaptureSession.CaptureCallback) r02.next()).onCaptureCompleted(r3, r4, r5);
            goto L4
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession r3, CaptureRequest r4, CaptureFailure r5) {
            Iterator r02 = this.f4219a.iterator();
        L4:
            if (r02.hasNext() == false) goto L6;
            ((CameraCaptureSession.CaptureCallback) r02.next()).onCaptureFailed(r3, r4, r5);
            goto L4
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession r3, CaptureRequest r4, CaptureResult r5) {
            Iterator r02 = this.f4219a.iterator();
        L4:
            if (r02.hasNext() == false) goto L6;
            ((CameraCaptureSession.CaptureCallback) r02.next()).onCaptureProgressed(r3, r4, r5);
            goto L4
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession r3, int r4) {
            Iterator r02 = this.f4219a.iterator();
        L4:
            if (r02.hasNext() == false) goto L6;
            ((CameraCaptureSession.CaptureCallback) r02.next()).onCaptureSequenceAborted(r3, r4);
            goto L4
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession r3, int r4, long r5) {
            Iterator r02 = this.f4219a.iterator();
        L4:
            if (r02.hasNext() == false) goto L6;
            ((CameraCaptureSession.CaptureCallback) r02.next()).onCaptureSequenceCompleted(r3, r4, r5);
            goto L4
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession r10, CaptureRequest r11, long r12, long r14) {
            Iterator r02 = this.f4219a.iterator();
        L4:
            if (r02.hasNext() == false) goto L6;
            ((CameraCaptureSession.CaptureCallback) r02.next()).onCaptureStarted(r10, r11, r12, r14);
            goto L4
        }
    }

    public static final class b extends CameraCaptureSession.CaptureCallback {
        public b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(CameraCaptureSession r1, CaptureRequest r2, Surface r3, long r4) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession r1, CaptureRequest r2, TotalCaptureResult r3) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession r1, CaptureRequest r2, CaptureFailure r3) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession r1, CaptureRequest r2, CaptureResult r3) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession r1, int r2) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession r1, int r2, long r3) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession r1, CaptureRequest r2, long r3, long r5) {
        }
    }

    public static CameraCaptureSession.CaptureCallback a(List r1) {
        return new a(r1);
    }

    public static CameraCaptureSession.CaptureCallback b(CameraCaptureSession.CaptureCallback... r02) {
        return a(Arrays.asList(r02));
    }

    public static CameraCaptureSession.CaptureCallback c() {
        return new b();
    }
}
