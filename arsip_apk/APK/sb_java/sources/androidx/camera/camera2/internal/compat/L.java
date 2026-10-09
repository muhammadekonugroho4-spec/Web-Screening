package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.D;
import androidx.camera.core.AbstractC2209b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class L implements D.a {

    /* renamed from: a, reason: collision with root package name */
    public final CameraDevice f4264a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4265b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f4266a;

        public a(Handler r1) {
            this.f4266a = r1;
        }
    }

    public L(CameraDevice r1, Object r2) {
        this.f4264a = (CameraDevice) androidx.core.util.h.g(r1);
        this.f4265b = r2;
    }

    public static void b(CameraDevice r3, List r4) {
        String r32 = r3.getId();
        Iterator r42 = r4.iterator();
    L4:
        if (r42.hasNext() == false) goto L10;
        String r02 = ((androidx.camera.camera2.internal.compat.params.j) r42.next()).c();
        if (r02 == null) goto L4;
        if (r02.isEmpty() == true) goto L4;
        AbstractC2209b0.l("CameraDeviceCompat", "Camera " + r32 + ": Camera doesn't support physicalCameraId " + r02 + ". Ignoring.");
        goto L4
    }

    public static void c(CameraDevice r1, androidx.camera.camera2.internal.compat.params.p r2) {
        androidx.core.util.h.g(r1);
        androidx.core.util.h.g(r2);
        androidx.core.util.h.g(r2.e());
        List r02 = r2.c();
        if (r02 == null) goto L11;
        if (r2.a() == null) goto L9;
        b(r1, r02);
        return;
    L9:
        throw new IllegalArgumentException("Invalid executor");
    L11:
        throw new IllegalArgumentException("Invalid output configurations");
    }

    public static List d(List r2) {
        ArrayList r02 = new ArrayList(r2.size());
        Iterator r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L6;
        r02.add(((androidx.camera.camera2.internal.compat.params.j) r22.next()).d());
        goto L4
    L6:
        return r02;
    }
}
