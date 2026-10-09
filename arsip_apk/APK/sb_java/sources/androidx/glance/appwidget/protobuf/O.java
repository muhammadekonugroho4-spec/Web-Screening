package androidx.glance.appwidget.protobuf;

/* loaded from: classes4.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public static final M f25021a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final M f25022b = null;

    static {
        f25021a = c();
        f25022b = new N();
    }

    public static M a() {
        return f25021a;
    }

    public static M b() {
        return f25022b;
    }

    public static M c() {
        if (S.d == false) goto L8;
        return null;
    L8:
        return (M) Class.forName("androidx.glance.appwidget.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
    L7:
        return null;
    }
}
