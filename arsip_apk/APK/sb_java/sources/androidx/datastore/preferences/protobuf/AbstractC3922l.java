package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3922l {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f23868a = null;

    static {
        f23868a = c();
    }

    public static C3923m a() {
        if (f23868a == null) goto L7;
        return b("getEmptyRegistry");
    L7:
        return C3923m.f23871e;
    }

    public static final C3923m b(String r2) {
        return (C3923m) f23868a.getDeclaredMethod(r2, null).invoke(null, null);
    }

    public static Class c() {
        return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
    L4:
        return null;
    }
}
