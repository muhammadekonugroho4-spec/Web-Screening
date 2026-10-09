package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.C;

/* loaded from: classes.dex */
public class y implements C.a {

    /* renamed from: a, reason: collision with root package name */
    public final CameraCharacteristics f4428a;

    public y(CameraCharacteristics r1) {
        this.f4428a = r1;
    }

    @Override // androidx.camera.camera2.internal.compat.C.a
    public CameraCharacteristics a() {
        return this.f4428a;
    }

    @Override // androidx.camera.camera2.internal.compat.C.a
    public Object b(CameraCharacteristics.Key r2) {
        return this.f4428a.get(r2);
    }
}
