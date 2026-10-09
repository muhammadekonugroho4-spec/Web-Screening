package androidx.camera.extensions.internal;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public static d f6133b;

    /* renamed from: a, reason: collision with root package name */
    public final h f6134a;

    static {
        f6133b = new d("1.5.0");
    }

    public d(String r1) {
        this.f6134a = h.j(r1);
    }

    public static d a() {
        return f6133b;
    }

    public static boolean c(h r2) {
        if (a().f6134a.a(r2.g(), r2.h()) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    public h b() {
        return this.f6134a;
    }

    public String d() {
        return this.f6134a.toString();
    }
}
