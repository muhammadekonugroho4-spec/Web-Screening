package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final c f4334a;

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final SessionConfiguration f4335a;

        /* renamed from: b, reason: collision with root package name */
        public final List f4336b;

        public a(Object r1) {
            SessionConfiguration r12 = (SessionConfiguration) r1;
            this.f4335a = r12;
            this.f4336b = Collections.unmodifiableList(p.i(r12.getOutputConfigurations()));
        }

        @Override // androidx.camera.camera2.internal.compat.params.p.c
        public i a() {
            return i.b(this.f4335a.getInputConfiguration());
        }

        @Override // androidx.camera.camera2.internal.compat.params.p.c
        public CameraCaptureSession.StateCallback b() {
            return this.f4335a.getStateCallback();
        }

        @Override // androidx.camera.camera2.internal.compat.params.p.c
        public Executor c() {
            return this.f4335a.getExecutor();
        }

        @Override // androidx.camera.camera2.internal.compat.params.p.c
        public List d() {
            return this.f4336b;
        }

        @Override // androidx.camera.camera2.internal.compat.params.p.c
        public void e(i r2) {
            this.f4335a.setInputConfiguration((InputConfiguration) r2.a());
        }

        public boolean equals(Object r2) {
            if ((r2 instanceof a) == true) goto L7;
            return false;
        L7:
            return Objects.equals(this.f4335a, ((a) r2).f4335a);
        }

        @Override // androidx.camera.camera2.internal.compat.params.p.c
        public Object f() {
            return this.f4335a;
        }

        @Override // androidx.camera.camera2.internal.compat.params.p.c
        public int g() {
            return this.f4335a.getSessionType();
        }

        @Override // androidx.camera.camera2.internal.compat.params.p.c
        public void h(CaptureRequest r2) {
            this.f4335a.setSessionParameters(r2);
        }

        public int hashCode() {
            return this.f4335a.hashCode();
        }

        public a(int r2, List r3, Executor r4, CameraCaptureSession.StateCallback r5) {
            this(new SessionConfiguration(r2, p.h(r3), r4, r5));
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final List f4337a;

        /* renamed from: b, reason: collision with root package name */
        public final CameraCaptureSession.StateCallback f4338b;

        /* renamed from: c, reason: collision with root package name */
        public final Executor f4339c;
        public final int d;

        /* renamed from: e, reason: collision with root package name */
        public i f4340e;

        /* renamed from: f, reason: collision with root package name */
        public CaptureRequest f4341f;

        public b(int r2, List r3, Executor r4, CameraCaptureSession.StateCallback r5) {
            this.f4340e = null;
            this.f4341f = null;
            this.d = r2;
            this.f4337a = Collections.unmodifiableList(new ArrayList(r3));
            this.f4338b = r5;
            this.f4339c = r4;
        }

        @Override // androidx.camera.camera2.internal.compat.params.p.c
        public i a() {
            return this.f4340e;
        }

        @Override // androidx.camera.camera2.internal.compat.params.p.c
        public CameraCaptureSession.StateCallback b() {
            return this.f4338b;
        }

        @Override // androidx.camera.camera2.internal.compat.params.p.c
        public Executor c() {
            return this.f4339c;
        }

        @Override // androidx.camera.camera2.internal.compat.params.p.c
        public List d() {
            return this.f4337a;
        }

        @Override // androidx.camera.camera2.internal.compat.params.p.c
        public void e(i r3) {
            if (this.d == 1) goto L7;
            this.f4340e = r3;
            return;
        L7:
            throw new UnsupportedOperationException("Method not supported for high speed session types");
        }

        public boolean equals(Object r6) {
            if (this != r6) goto L6;
            return true;
        L6:
            if ((r6 instanceof b) == false) goto L22;
            b r62 = (b) r6;
            if (Objects.equals(this.f4340e, r62.f4340e) == false) goto L22;
            if (this.d != r62.d) goto L22;
            if (this.f4337a.size() != r62.f4337a.size()) goto L22;
            int r1 = 0;
        L16:
            if (r1 >= this.f4337a.size()) goto L21;
            if (((j) this.f4337a.get(r1)).equals(r62.f4337a.get(r1)) == false) goto L19;
            r1 = r1 + 1;
            goto L16
        L19:
            return false;
        L21:
            return true;
        L22:
            return false;
        }

        @Override // androidx.camera.camera2.internal.compat.params.p.c
        public Object f() {
            return null;
        }

        @Override // androidx.camera.camera2.internal.compat.params.p.c
        public int g() {
            return this.d;
        }

        @Override // androidx.camera.camera2.internal.compat.params.p.c
        public void h(CaptureRequest r1) {
            this.f4341f = r1;
        }

        public int hashCode() {
            int r02 = this.f4337a.hashCode() ^ 31;
            int r1 = (r02 << 5) - r02;
            i r03 = this.f4340e;
            if (r03 != null) goto L5;
            int r04 = 0;
        L6:
            int r05 = r04 ^ r1;
            int r12 = (r05 << 5) - r05;
            return this.d ^ r12;
        L5:
            r04 = r03.hashCode();
            goto L6
        }
    }

    public interface c {
        i a();

        CameraCaptureSession.StateCallback b();

        Executor c();

        List d();

        void e(i r1);

        Object f();

        int g();

        void h(CaptureRequest r1);
    }

    public p(int r3, List r4, Executor r5, CameraCaptureSession.StateCallback r6) {
        if (Build.VERSION.SDK_INT >= 28) goto L6;
        this.f4334a = new b(r3, r4, r5, r6);
        return;
    L6:
        this.f4334a = new a(r3, r4, r5, r6);
    }

    public static List h(List r2) {
        ArrayList r02 = new ArrayList(r2.size());
        Iterator r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L6;
        r02.add((OutputConfiguration) ((j) r22.next()).i());
        goto L4
    L6:
        return r02;
    }

    public static List i(List r2) {
        ArrayList r02 = new ArrayList(r2.size());
        Iterator r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L6;
        r02.add(j.j((OutputConfiguration) r22.next()));
        goto L4
    L6:
        return r02;
    }

    public Executor a() {
        return this.f4334a.c();
    }

    public i b() {
        return this.f4334a.a();
    }

    public List c() {
        return this.f4334a.d();
    }

    public int d() {
        return this.f4334a.g();
    }

    public CameraCaptureSession.StateCallback e() {
        return this.f4334a.b();
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof p) == true) goto L7;
        return false;
    L7:
        return this.f4334a.equals(((p) r2).f4334a);
    }

    public void f(i r2) {
        this.f4334a.e(r2);
    }

    public void g(CaptureRequest r2) {
        this.f4334a.h(r2);
    }

    public int hashCode() {
        return this.f4334a.hashCode();
    }

    public Object j() {
        return this.f4334a.f();
    }
}
