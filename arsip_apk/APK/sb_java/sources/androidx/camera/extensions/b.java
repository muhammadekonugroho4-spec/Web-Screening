package androidx.camera.extensions;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import androidx.camera.core.InterfaceC2329u;
import androidx.camera.extensions.internal.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final g f6107e = null;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2329u f6108a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6109b;

    /* renamed from: c, reason: collision with root package name */
    public c f6110c;
    public final androidx.camera.extensions.internal.b d;

    public class a implements g {
        public a() {
        }
    }

    static {
        f6107e = new a();
    }

    public b(InterfaceC2329u r3, Context r4) {
        this.f6108a = r3;
        if (Build.VERSION.SDK_INT < 31) goto L5;
        this.d = new androidx.camera.extensions.internal.b((CameraManager) r4.getSystemService(CameraManager.class));
    L6:
        this.f6109b = androidx.camera.extensions.internal.c.a(r3.a());
        this.f6110c = new androidx.camera.extensions.a(this);
        return;
    L5:
        this.d = null;
        goto L6
    }
}
