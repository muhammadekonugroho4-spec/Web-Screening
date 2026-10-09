package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3914d {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f23804a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f23805b = false;

    static {
        f23804a = a("libcore.io.Memory");
        if (a("org.robolectric.Robolectric") == null) goto L5;
        boolean r02 = true;
    L6:
        f23805b = r02;
        return;
    L5:
        r02 = false;
        goto L6
    }

    public static Class a(String r02) {
        return Class.forName(r02);
    L4:
        return null;
    }

    public static Class b() {
        return f23804a;
    }

    public static boolean c() {
        if (f23804a != null) goto L5;
        return false;
    L5:
        if (f23805b == true) goto L10;
        return true;
    L10:
        return false;
    }
}
