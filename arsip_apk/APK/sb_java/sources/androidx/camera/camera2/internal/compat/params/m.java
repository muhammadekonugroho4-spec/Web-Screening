package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* loaded from: classes.dex */
public class m extends l {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final OutputConfiguration f4331a;

        /* renamed from: b, reason: collision with root package name */
        public long f4332b;

        public a(OutputConfiguration r3) {
            this.f4332b = 1;
            this.f4331a = r3;
        }

        public boolean equals(Object r7) {
            if ((r7 instanceof a) == true) goto L5;
            return false;
        L5:
            a r72 = (a) r7;
            if (Objects.equals(this.f4331a, r72.f4331a) == true) goto L8;
        L11:
            return false;
        L8:
            if (this.f4332b != r72.f4332b) goto L11;
            return true;
        }

        public int hashCode() {
            int r02 = this.f4331a.hashCode() ^ 31;
            int r1 = (r02 << 5) - r02;
            return Long.hashCode(this.f4332b) ^ r1;
        }
    }

    public m(int r3, Surface r4) {
        this(new a(new OutputConfiguration(r3, r4)));
    }

    public static m k(OutputConfiguration r2) {
        return new m(new a(r2));
    }

    @Override // androidx.camera.camera2.internal.compat.params.l, androidx.camera.camera2.internal.compat.params.j.a
    public String c() {
        return null;
    }

    @Override // androidx.camera.camera2.internal.compat.params.l, androidx.camera.camera2.internal.compat.params.j.a
    public void f(long r2) {
        ((a) this.f4333a).f4332b = r2;
    }

    @Override // androidx.camera.camera2.internal.compat.params.l, androidx.camera.camera2.internal.compat.params.j.a
    public void g(String r2) {
        ((OutputConfiguration) i()).setPhysicalCameraId(r2);
    }

    @Override // androidx.camera.camera2.internal.compat.params.l, androidx.camera.camera2.internal.compat.params.k, androidx.camera.camera2.internal.compat.params.j.a
    public Object i() {
        androidx.core.util.h.a(this.f4333a instanceof a);
        return ((a) this.f4333a).f4331a;
    }

    public m(Object r1) {
        super(r1);
    }
}
