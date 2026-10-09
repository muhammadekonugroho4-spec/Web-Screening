package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.internal.compat.V;
import androidx.camera.core.AbstractC2209b0;

/* loaded from: classes.dex */
public abstract class X implements V.a {

    /* renamed from: a, reason: collision with root package name */
    public final StreamConfigurationMap f4285a;

    public static class a {
        public static Size[] a(StreamConfigurationMap r02, int r1) {
            return r02.getHighResolutionOutputSizes(r1);
        }
    }

    public X(StreamConfigurationMap r1) {
        this.f4285a = r1;
    }

    @Override // androidx.camera.camera2.internal.compat.V.a
    public StreamConfigurationMap a() {
        return this.f4285a;
    }

    @Override // androidx.camera.camera2.internal.compat.V.a
    public int[] d() {
        return this.f4285a.getOutputFormats();
    L6:
        e = move-exception;
        AbstractC2209b0.m("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e);
        return null;
    }

    @Override // androidx.camera.camera2.internal.compat.V.a
    public Size[] e() {
        return this.f4285a.getHighSpeedVideoSizes();
    }

    @Override // androidx.camera.camera2.internal.compat.V.a
    public Range[] f(Size r2) {
        return this.f4285a.getHighSpeedVideoFpsRangesFor(r2);
    }

    @Override // androidx.camera.camera2.internal.compat.V.a
    public Size[] g(int r2) {
        return a.a(this.f4285a, r2);
    }
}
