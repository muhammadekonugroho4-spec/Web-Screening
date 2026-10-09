package androidx.window;

import java.lang.reflect.Method;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f28902a;

    public d(ClassLoader r2) {
        p.l(r2, "loader");
        this.f28902a = r2;
    }

    public static /* synthetic */ Class a(d r02) {
        return f(r02);
    }

    public static /* synthetic */ boolean b(d r02) {
        return g(r02);
    }

    public static final Class f(d r1) {
        Class<?> r12 = r1.f28902a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
        p.k(r12, "loadClass(...)");
        return r12;
    }

    public static final boolean g(d r3) {
        Method r02 = r3.d().getDeclaredMethod("getWindowExtensions", null);
        Class r32 = r3.c();
        androidx.window.reflection.a r1 = androidx.window.reflection.a.f29015a;
        p.i(r02);
        if (r1.b(r02, r32) == true) goto L5;
        return false;
    L5:
        if (r1.d(r02) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final Class c() {
        Class<?> r02 = this.f28902a.loadClass("androidx.window.extensions.WindowExtensions");
        p.k(r02, "loadClass(...)");
        return r02;
    }

    public final Class d() {
        Class<?> r02 = this.f28902a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
        p.k(r02, "loadClass(...)");
        return r02;
    }

    public final boolean e() {
        return androidx.window.reflection.a.f29015a.a(new c(this));
    }

    public final boolean h() {
        if (e() == true) goto L5;
        return false;
    L5:
        if (androidx.window.reflection.a.e("WindowExtensionsProvider#getWindowExtensions is not valid", new b(this)) == false) goto L10;
        return true;
    L10:
        return false;
    }
}
