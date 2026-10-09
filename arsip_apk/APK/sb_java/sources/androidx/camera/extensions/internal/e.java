package androidx.camera.extensions.internal;

import androidx.camera.core.AbstractC2209b0;
import androidx.camera.extensions.impl.ExtensionVersionImpl;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static volatile e f6135a;

    public static class a extends e {
        public a() {
        }

        @Override // androidx.camera.extensions.internal.e
        public h c() {
            return null;
        }
    }

    public static class b extends e {

        /* renamed from: c, reason: collision with root package name */
        public static ExtensionVersionImpl f6136c;

        /* renamed from: b, reason: collision with root package name */
        public h f6137b;

        public b() {
            if (f6136c != null) goto L5;
            f6136c = new ExtensionVersionImpl();
        L5:
            h r02 = h.j(f6136c.checkApiVersion(d.a().d()));
            if (r02 != null) goto L8;
        L10:
            AbstractC2209b0.a("ExtenderVersion", "Selected vendor runtime: " + this.f6137b);
            return;
        L8:
            if (d.a().b().g() != r02.g()) goto L10;
            this.f6137b = r02;
            goto L10
        }

        @Override // androidx.camera.extensions.internal.e
        public h c() {
            return this.f6137b;
        }
    }

    public e() {
    }

    public static e a() {
        if (f6135a == null) goto L7;
        return f6135a;
    L7:
        monitor-enter(e.class);
    L12:
        th = move-exception;
        throw th;
    L9:
        if (f6135a == null) goto L22;
    L15:
        monitor-exit(e.class);     // Catch: Throwable -> L12
        return f6135a;
    L22:
        f6135a = new b();     // Catch: Throwable -> L12 NoClassDefFoundError -> L14
    L14:
        AbstractC2209b0.a("ExtenderVersion", "No versioning extender found. Falling back to default.");     // Catch: Throwable -> L12
        f6135a = new a();     // Catch: Throwable -> L12
        goto L15
    }

    public static h b() {
        return a().c();
    }

    public static boolean d(h r2) {
        if (b().a(r2.g(), r2.h()) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    public abstract h c();
}
