package androidx.camera.featurecombinationquery;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.camera.camera2.impl.j;
import androidx.camera.featurecombinationquery.e;

/* loaded from: classes.dex */
public class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final CameraDevice.CameraDeviceSetup f6162a;

    public c(CameraManager r1, String r2) {
        this.f6162a = j.a(r1, r2);
    }

    public static long b() {
        String r02 = System.getProperty("ro.build.date.utc");
        if (r02 != null) goto L10;
        return 0;
    L10:
        return Long.parseLong(r02) * 1000;
    L12:
        return 0;
    }

    @Override // androidx.camera.featurecombinationquery.e
    public e.a a(SessionConfiguration r5) {
        if (b.a(this.f6162a, r5) == false) goto L5;
        int r52 = 1;
    L7:
        return new e.a(r52, 2, b());
    L5:
        r52 = 2;
        goto L7
    }
}
