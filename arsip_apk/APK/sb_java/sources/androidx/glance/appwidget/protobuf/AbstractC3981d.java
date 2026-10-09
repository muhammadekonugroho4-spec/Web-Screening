package androidx.glance.appwidget.protobuf;

/* renamed from: androidx.glance.appwidget.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3981d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f25051a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f25052b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f25053c = false;

    static {
        f25052b = a("libcore.io.Memory");
        if (f25051a == false) goto L5;
    L7:
        boolean r02 = false;
    L8:
        f25053c = r02;
        return;
    L5:
        if (a("org.robolectric.Robolectric") == null) goto L7;
        r02 = true;
        goto L8
    }

    public static Class a(String r02) {
        return Class.forName(r02);
    L4:
        return null;
    }

    public static Class b() {
        return f25052b;
    }

    public static boolean c() {
        if (f25051a == false) goto L5;
        return true;
    L5:
        if (f25052b != null) goto L7;
        return false;
    L7:
        if (f25053c == false) goto L14;
        return false;
    L14:
        return true;
    }
}
