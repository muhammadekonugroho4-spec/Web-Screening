package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class S0 {

    public static final class a extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        public final List f4141a;

        public a(List r3) {
            this.f4141a = new ArrayList();
            Iterator r32 = r3.iterator();
        L4:
            if (r32.hasNext() == false) goto L8;
            CameraDevice.StateCallback r02 = (CameraDevice.StateCallback) r32.next();
            if ((r02 instanceof b) == true) goto L4;
            this.f4141a.add(r02);
            goto L4
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice r3) {
            Iterator r02 = this.f4141a.iterator();
        L4:
            if (r02.hasNext() == false) goto L6;
            ((CameraDevice.StateCallback) r02.next()).onClosed(r3);
            goto L4
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice r3) {
            Iterator r02 = this.f4141a.iterator();
        L4:
            if (r02.hasNext() == false) goto L6;
            ((CameraDevice.StateCallback) r02.next()).onDisconnected(r3);
            goto L4
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice r3, int r4) {
            Iterator r02 = this.f4141a.iterator();
        L4:
            if (r02.hasNext() == false) goto L6;
            ((CameraDevice.StateCallback) r02.next()).onError(r3, r4);
            goto L4
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice r3) {
            Iterator r02 = this.f4141a.iterator();
        L4:
            if (r02.hasNext() == false) goto L6;
            ((CameraDevice.StateCallback) r02.next()).onOpened(r3);
            goto L4
        }
    }

    public static final class b extends CameraDevice.StateCallback {
        public b() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice r1) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice r1) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice r1, int r2) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice r1) {
        }
    }

    public static CameraDevice.StateCallback a(List r2) {
        if (r2.isEmpty() == false) goto L7;
        return b();
    L7:
        if (r2.size() != 1) goto L11;
        return (CameraDevice.StateCallback) r2.get(0);
    L11:
        return new a(r2);
    }

    public static CameraDevice.StateCallback b() {
        return new b();
    }
}
