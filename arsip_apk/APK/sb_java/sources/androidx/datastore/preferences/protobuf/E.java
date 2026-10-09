package androidx.datastore.preferences.protobuf;

/* loaded from: classes4.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final C f23724a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final C f23725b = null;

    static {
        f23724a = c();
        f23725b = new D();
    }

    public static C a() {
        return f23724a;
    }

    public static C b() {
        return f23725b;
    }

    public static C c() {
        return (C) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
    L5:
        return null;
    }
}
