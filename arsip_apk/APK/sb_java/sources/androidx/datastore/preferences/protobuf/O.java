package androidx.datastore.preferences.protobuf;

/* loaded from: classes4.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public static final M f23761a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final M f23762b = null;

    static {
        f23761a = c();
        f23762b = new N();
    }

    public static M a() {
        return f23761a;
    }

    public static M b() {
        return f23762b;
    }

    public static M c() {
        return (M) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
    L5:
        return null;
    }
}
