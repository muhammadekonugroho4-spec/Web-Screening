package androidx.glance.appwidget.protobuf;

/* renamed from: androidx.glance.appwidget.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4001y {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC3999w f25118a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC3999w f25119b = null;

    static {
        f25118a = c();
        f25119b = new C4000x();
    }

    public static InterfaceC3999w a() {
        return f25118a;
    }

    public static InterfaceC3999w b() {
        return f25119b;
    }

    public static InterfaceC3999w c() {
        if (S.d == false) goto L8;
        return null;
    L8:
        return (InterfaceC3999w) Class.forName("androidx.glance.appwidget.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
    L7:
        return null;
    }
}
