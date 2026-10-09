package androidx.glance.appwidget.protobuf;

/* renamed from: androidx.glance.appwidget.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3989l {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f25104a = null;

    static {
        f25104a = c();
    }

    public static C3990m a() {
        C3990m r02 = b("getEmptyRegistry");
        if (r02 == null) goto L6;
        return r02;
    L6:
        return C3990m.f25106c;
    }

    public static final C3990m b(String r2) {
        Class r02 = f25104a;
        if (r02 != null) goto L8;
        return null;
    L8:
        return (C3990m) r02.getDeclaredMethod(r2, null).invoke(null, null);
    L7:
        return null;
    }

    public static Class c() {
        return Class.forName("androidx.glance.appwidget.protobuf.ExtensionRegistry");
    L4:
        return null;
    }
}
