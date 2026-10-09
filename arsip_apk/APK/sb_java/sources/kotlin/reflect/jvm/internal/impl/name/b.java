package kotlin.reflect.jvm.internal.impl.name;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.sessions.settings.RemoteSettings;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c f179261a;

    /* renamed from: b, reason: collision with root package name */
    public final c f179262b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f179263c;

    static {
    }

    public b(c r2, c r3, boolean r4) {
        if (r2 != null) goto L4;
        a(1);
    L4:
        if (r3 != null) goto L6;
        a(2);
    L6:
        this.f179261a = r2;
        this.f179262b = r3;
        this.f179263c = r4;
    }

    public static /* synthetic */ void a(int r10) {
        if (r10 == 5) goto L9;
        if (r10 == 6) goto L9;
        if (r10 == 7) goto L9;
        if (r10 == 9) goto L9;
        switch(r10) {
            case 13: goto L9;
            case 14: goto L9;
            case 15: goto L9;
            case 16: goto L9;
            default: goto L8;
        };
    L8:
        String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
    L11:
        if (r10 == 5) goto L17;
        if (r10 == 6) goto L17;
        if (r10 == 7) goto L17;
        if (r10 == 9) goto L17;
        switch(r10) {
            case 13: goto L17;
            case 14: goto L17;
            case 15: goto L17;
            case 16: goto L17;
            default: goto L16;
        };
    L16:
        int r6 = 3;
    L18:
        Object[] r62 = new Object[r6];
        switch(r10) {
            case 1: goto L27;
            case 2: goto L26;
            case 3: goto L27;
            case 4: goto L25;
            case 5: goto L24;
            case 6: goto L24;
            case 7: goto L24;
            case 8: goto L23;
            case 9: goto L24;
            case 10: goto L22;
            case 11: goto L21;
            case 12: goto L21;
            case 13: goto L24;
            case 14: goto L24;
            case 15: goto L24;
            case 16: goto L24;
            default: goto L20;
        };
    L20:
        r62[0] = "topLevelFqName";
    L29:
        if (r10 == 5) goto L40;
        if (r10 == 6) goto L39;
        if (r10 == 7) goto L38;
        if (r10 == 9) goto L37;
        switch(r10) {
            case 13: goto L36;
            case 14: goto L36;
            case 15: goto L35;
            case 16: goto L35;
            default: goto L34;
        };
    L34:
        r62[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
    L41:
        switch(r10) {
            case 1: goto L46;
            case 2: goto L46;
            case 3: goto L46;
            case 4: goto L46;
            case 5: goto L47;
            case 6: goto L47;
            case 7: goto L47;
            case 8: goto L45;
            case 9: goto L47;
            case 10: goto L44;
            case 11: goto L43;
            case 12: goto L43;
            case 13: goto L47;
            case 14: goto L47;
            case 15: goto L47;
            case 16: goto L47;
            default: goto L42;
        };
    L42:
        r62[2] = "topLevel";
        goto L47
    L43:
        r62[2] = "fromString";
        goto L47
    L44:
        r62[2] = "startsWith";
        goto L47
    L45:
        r62[2] = "createNestedClassId";
        goto L47
    L46:
        r62[2] = "<init>";
    L47:
        String r42 = String.format(r4, r62);
        if (r10 == 5) goto L55;
        if (r10 == 6) goto L55;
        if (r10 == 7) goto L55;
        if (r10 == 9) goto L55;
        switch(r10) {
            case 13: goto L55;
            case 14: goto L55;
            case 15: goto L55;
            case 16: goto L55;
            default: goto L56;
        };
    L56:
        throw new IllegalArgumentException(r42);
    L55:
        throw new IllegalStateException(r42);
    L35:
        r62[1] = "asFqNameString";
        goto L41
    L36:
        r62[1] = "asString";
        goto L41
    L37:
        r62[1] = "asSingleFqName";
        goto L41
    L38:
        r62[1] = "getShortClassName";
        goto L41
    L39:
        r62[1] = "getRelativeClassName";
        goto L41
    L40:
        r62[1] = "getPackageFqName";
        goto L41
    L21:
        r62[0] = "string";
        goto L29
    L22:
        r62[0] = "segment";
        goto L29
    L23:
        r62[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
        goto L29
    L24:
        r62[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
        goto L29
    L25:
        r62[0] = "topLevelName";
        goto L29
    L26:
        r62[0] = "relativeClassName";
        goto L29
    L27:
        r62[0] = "packageFqName";
    L17:
        r6 = 2;
    L9:
        r4 = "@NotNull method %s.%s must not return null";
        goto L11
    }

    public static b e(String r1) {
        if (r1 != null) goto L5;
        a(11);
    L5:
        return f(r1, false);
    }

    public static b f(String r4, boolean r5) {
        if (r4 != null) goto L4;
        a(12);
    L4:
        int r02 = r4.lastIndexOf(RemoteSettings.FORWARD_SLASH_STRING);
        if (r02 != (-1)) goto L7;
        String r03 = "";
    L9:
        return new b(new c(r03), new c(r4), r5);
    L7:
        String r1 = r4.substring(0, r02).replace('/', '.');
        r4 = r4.substring(r02 + 1);
        r03 = r1;
        goto L9
    }

    public static b m(c r2) {
        if (r2 != null) goto L5;
        a(0);
    L5:
        return new b(r2.e(), r2.g());
    }

    public c b() {
        if (this.f179261a.d() == false) goto L9;
        c r02 = this.f179262b;
        if (r02 != null) goto L7;
        a(9);
    L7:
        return r02;
    L9:
        return new c(this.f179261a.b() + "." + this.f179262b.b());
    }

    public String c() {
        if (this.f179261a.d() == false) goto L8;
        String r02 = this.f179262b.b();
        if (r02 != null) goto L7;
        a(13);
    L7:
        return r02;
    L8:
        String r03 = this.f179261a.b().replace('.', '/') + RemoteSettings.FORWARD_SLASH_STRING + this.f179262b.b();
        if (r03 != null) goto L11;
        a(14);
    L11:
        return r03;
    }

    public b d(f r4) {
        if (r4 != null) goto L5;
        a(8);
    L5:
        return new b(h(), this.f179262b.c(r4), this.f179263c);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L17:
        return false;
    L8:
        if (b.class != r5.getClass()) goto L17;
        b r52 = (b) r5;
        if (this.f179261a.equals(r52.f179261a) == false) goto L17;
        if (this.f179262b.equals(r52.f179262b) == false) goto L17;
        if (this.f179263c != r52.f179263c) goto L17;
        return true;
    }

    public b g() {
        c r02 = this.f179262b.e();
        if (r02.d() == false) goto L7;
        return null;
    L7:
        return new b(h(), r02, this.f179263c);
    }

    public c h() {
        c r02 = this.f179261a;
        if (r02 != null) goto L5;
        a(5);
    L5:
        return r02;
    }

    public int hashCode() {
        return (((this.f179261a.hashCode() * 31) + this.f179262b.hashCode()) * 31) + Boolean.valueOf(this.f179263c).hashCode();
    }

    public c i() {
        c r02 = this.f179262b;
        if (r02 != null) goto L5;
        a(6);
    L5:
        return r02;
    }

    public f j() {
        f r02 = this.f179262b.g();
        if (r02 != null) goto L5;
        a(7);
    L5:
        return r02;
    }

    public boolean k() {
        return this.f179263c;
    }

    public boolean l() {
        return !this.f179262b.e().d();
    }

    public String toString() {
        if (this.f179261a.d() == false) goto L7;
        return RemoteSettings.FORWARD_SLASH_STRING + c();
    L7:
        return c();
    }

    public b(c r2, f r3) {
        if (r2 != null) goto L4;
        a(3);
    L4:
        if (r3 != null) goto L6;
        a(4);
    L6:
        this(r2, c.k(r3), false);
    }
}
