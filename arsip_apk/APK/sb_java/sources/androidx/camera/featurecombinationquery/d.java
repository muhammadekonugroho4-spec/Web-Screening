package androidx.camera.featurecombinationquery;

import android.content.Context;
import android.hardware.camera2.CameraManager;

/* loaded from: classes.dex */
public class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final CameraManager f6163a;

    public d(Context r2) {
        this.f6163a = (CameraManager) r2.getSystemService(CameraManager.class);
    }

    @Override // androidx.camera.featurecombinationquery.g
    public e a(String r3) {
        return new c(this.f6163a, r3);
    }
}
