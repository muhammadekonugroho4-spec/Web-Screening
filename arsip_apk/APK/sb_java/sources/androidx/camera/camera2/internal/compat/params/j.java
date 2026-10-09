package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final a f4327a;

    public interface a {
        Surface a();

        void b(Surface r1);

        String c();

        void d();

        void e(long r1);

        void f(long r1);

        void g(String r1);

        void h(int r1);

        Object i();
    }

    public j(int r3, Surface r4) {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 < 33) goto L7;
        this.f4327a = new n(r3, r4);
        return;
    L7:
        if (r02 < 28) goto L10;
        this.f4327a = new m(r3, r4);
        return;
    L10:
        this.f4327a = new l(r3, r4);
    }

    public static j j(Object r3) {
        if (r3 != null) goto L5;
        return null;
    L5:
        int r1 = Build.VERSION.SDK_INT;
        if (r1 < 33) goto L9;
        a r32 = n.l((OutputConfiguration) r3);
    L12:
        if (r32 != null) goto L15;
        return null;
    L15:
        return new j(r32);
    L9:
        if (r1 < 28) goto L11;
        r32 = m.k((OutputConfiguration) r3);
        goto L12
    L11:
        r32 = l.j((OutputConfiguration) r3);
        goto L12
    }

    public void a(Surface r2) {
        this.f4327a.b(r2);
    }

    public void b() {
        this.f4327a.d();
    }

    public String c() {
        return this.f4327a.c();
    }

    public Surface d() {
        return this.f4327a.a();
    }

    public void e(long r2) {
        this.f4327a.f(r2);
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof j) == true) goto L7;
        return false;
    L7:
        return this.f4327a.equals(((j) r2).f4327a);
    }

    public void f(int r2) {
        this.f4327a.h(r2);
    }

    public void g(String r2) {
        this.f4327a.g(r2);
    }

    public void h(long r2) {
        this.f4327a.e(r2);
    }

    public int hashCode() {
        return this.f4327a.hashCode();
    }

    public Object i() {
        return this.f4327a.i();
    }

    public j(OutputConfiguration r1) {
        this.f4327a = n.l(r1);
    }

    public j(a r1) {
        this.f4327a = r1;
    }
}
