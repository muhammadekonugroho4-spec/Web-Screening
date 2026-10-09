package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* loaded from: classes.dex */
public class l extends k {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final OutputConfiguration f4328a;

        /* renamed from: b, reason: collision with root package name */
        public String f4329b;

        /* renamed from: c, reason: collision with root package name */
        public long f4330c;

        public a(OutputConfiguration r3) {
            this.f4330c = 1;
            this.f4328a = r3;
        }

        public boolean equals(Object r7) {
            if ((r7 instanceof a) == true) goto L5;
            return false;
        L5:
            a r72 = (a) r7;
            if (Objects.equals(this.f4328a, r72.f4328a) == true) goto L8;
        L13:
            return false;
        L8:
            if (this.f4330c != r72.f4330c) goto L13;
            if (Objects.equals(this.f4329b, r72.f4329b) == false) goto L13;
            return true;
        }

        public int hashCode() {
            int r02 = this.f4328a.hashCode() ^ 31;
            int r1 = (r02 << 5) - r02;
            String r03 = this.f4329b;
            if (r03 != null) goto L5;
            int r04 = 0;
        L6:
            int r05 = r04 ^ r1;
            int r12 = (r05 << 5) - r05;
            return Long.hashCode(this.f4330c) ^ r12;
        L5:
            r04 = r03.hashCode();
            goto L6
        }
    }

    public l(int r3, Surface r4) {
        this(new a(new OutputConfiguration(r3, r4)));
    }

    public static l j(OutputConfiguration r2) {
        return new l(new a(r2));
    }

    @Override // androidx.camera.camera2.internal.compat.params.j.a
    public void b(Surface r2) {
        ((OutputConfiguration) i()).addSurface(r2);
    }

    @Override // androidx.camera.camera2.internal.compat.params.j.a
    public String c() {
        return ((a) this.f4333a).f4329b;
    }

    @Override // androidx.camera.camera2.internal.compat.params.j.a
    public void d() {
        ((OutputConfiguration) i()).enableSurfaceSharing();
    }

    @Override // androidx.camera.camera2.internal.compat.params.j.a
    public void f(long r2) {
        ((a) this.f4333a).f4330c = r2;
    }

    @Override // androidx.camera.camera2.internal.compat.params.j.a
    public void g(String r2) {
        ((a) this.f4333a).f4329b = r2;
    }

    @Override // androidx.camera.camera2.internal.compat.params.k, androidx.camera.camera2.internal.compat.params.j.a
    public Object i() {
        androidx.core.util.h.a(this.f4333a instanceof a);
        return ((a) this.f4333a).f4328a;
    }

    public l(Object r1) {
        super(r1);
    }
}
