package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.AbstractC2115c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class Q0 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final Map f4123a;

    /* renamed from: b, reason: collision with root package name */
    public a f4124b;

    public interface a {
        void a(CameraCaptureSession r1, int r2, boolean r3);
    }

    public Q0() {
        this.f4124b = null;
        this.f4123a = new HashMap();
    }

    public void a(CaptureRequest r5, List r6) {
        List r02 = (List) this.f4123a.get(r5);
        if (r02 == null) goto L6;
        ArrayList r1 = new ArrayList(r6.size() + r02.size());
        r1.addAll(r6);
        r1.addAll(r02);
        this.f4123a.put(r5, r1);
        return;
    L6:
        this.f4123a.put(r5, r6);
    }

    public final List b(CaptureRequest r2) {
        List r22 = (List) this.f4123a.get(r2);
        if (r22 == null) goto L6;
        return r22;
    L6:
        return Collections.EMPTY_LIST;
    }

    public void c(a r1) {
        this.f4124b = r1;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession r9, CaptureRequest r10, Surface r11, long r12) {
        Iterator r02 = b(r10).iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        AbstractC2115c.a((CameraCaptureSession.CaptureCallback) r02.next(), r9, r10, r11, r12);
        goto L4
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession r3, CaptureRequest r4, TotalCaptureResult r5) {
        Iterator r02 = b(r4).iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((CameraCaptureSession.CaptureCallback) r02.next()).onCaptureCompleted(r3, r4, r5);
        goto L4
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession r3, CaptureRequest r4, CaptureFailure r5) {
        Iterator r02 = b(r4).iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((CameraCaptureSession.CaptureCallback) r02.next()).onCaptureFailed(r3, r4, r5);
        goto L4
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession r3, CaptureRequest r4, CaptureResult r5) {
        Iterator r02 = b(r4).iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((CameraCaptureSession.CaptureCallback) r02.next()).onCaptureProgressed(r3, r4, r5);
        goto L4
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession r4, int r5) {
        Iterator r02 = this.f4123a.values().iterator();
    L4:
        if (r02.hasNext() == false) goto L9;
        Iterator r1 = ((List) r02.next()).iterator();
    L7:
        if (r1.hasNext() == false) goto L4;
        ((CameraCaptureSession.CaptureCallback) r1.next()).onCaptureSequenceAborted(r4, r5);
        goto L7
    L9:
        a r03 = this.f4124b;
        if (r03 == null) goto L15;
        r03.a(r4, r5, true);
        return;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession r4, int r5, long r6) {
        Iterator r02 = this.f4123a.values().iterator();
    L4:
        if (r02.hasNext() == false) goto L9;
        Iterator r1 = ((List) r02.next()).iterator();
    L7:
        if (r1.hasNext() == false) goto L4;
        ((CameraCaptureSession.CaptureCallback) r1.next()).onCaptureSequenceCompleted(r4, r5, r6);
        goto L7
    L9:
        a r62 = this.f4124b;
        if (r62 == null) goto L15;
        r62.a(r4, r5, false);
        return;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession r10, CaptureRequest r11, long r12, long r14) {
        Iterator r02 = b(r11).iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((CameraCaptureSession.CaptureCallback) r02.next()).onCaptureStarted(r10, r11, r12, r14);
        goto L4
    }
}
