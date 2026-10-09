package androidx.camera.featurecombinationquery;

import android.hardware.camera2.params.SessionConfiguration;

/* loaded from: classes.dex */
public interface e {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f6164a;

        /* renamed from: b, reason: collision with root package name */
        public final int f6165b;

        /* renamed from: c, reason: collision with root package name */
        public final long f6166c;

        public a(int r1, int r2, long r3) {
            this.f6164a = r1;
            this.f6165b = r2;
            this.f6166c = r3;
        }

        public int a() {
            return this.f6164a;
        }
    }

    a a(SessionConfiguration r1);
}
