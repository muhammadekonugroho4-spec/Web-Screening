package kotlin.reflect.jvm.internal.impl.name;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f179264c = null;

    /* renamed from: a, reason: collision with root package name */
    public final d f179265a;

    /* renamed from: b, reason: collision with root package name */
    public transient c f179266b;

    static {
        f179264c = new c("");
    }

    public c(String r2) {
        if (r2 != null) goto L4;
        a(1);
    L4:
        this.f179265a = new d(r2, this);
    }

    public static /* synthetic */ void a(int r7) {
        switch(r7) {
            case 4: goto L4;
            case 5: goto L4;
            case 6: goto L4;
            case 7: goto L4;
            case 8: goto L3;
            case 9: goto L4;
            case 10: goto L4;
            case 11: goto L4;
            default: goto L3;
        };
    L3:
        String r02 = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
    L6:
        switch(r7) {
            case 4: goto L8;
            case 5: goto L8;
            case 6: goto L8;
            case 7: goto L8;
            case 8: goto L7;
            case 9: goto L8;
            case 10: goto L8;
            case 11: goto L8;
            default: goto L7;
        };
    L7:
        int r2 = 3;
    L9:
        Object[] r22 = new Object[r2];
        switch(r7) {
            case 1: goto L16;
            case 2: goto L16;
            case 3: goto L16;
            case 4: goto L15;
            case 5: goto L15;
            case 6: goto L15;
            case 7: goto L15;
            case 8: goto L14;
            case 9: goto L15;
            case 10: goto L15;
            case 11: goto L15;
            case 12: goto L13;
            case 13: goto L12;
            default: goto L11;
        };
    L11:
        r22[0] = "names";
    L18:
        switch(r7) {
            case 4: goto L25;
            case 5: goto L24;
            case 6: goto L23;
            case 7: goto L23;
            case 8: goto L19;
            case 9: goto L22;
            case 10: goto L21;
            case 11: goto L20;
            default: goto L19;
        };
    L19:
        r22[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
    L26:
        switch(r7) {
            case 1: goto L31;
            case 2: goto L31;
            case 3: goto L31;
            case 4: goto L32;
            case 5: goto L32;
            case 6: goto L32;
            case 7: goto L32;
            case 8: goto L30;
            case 9: goto L32;
            case 10: goto L32;
            case 11: goto L32;
            case 12: goto L29;
            case 13: goto L28;
            default: goto L27;
        };
    L27:
        r22[2] = "fromSegments";
        goto L32
    L28:
        r22[2] = "topLevel";
        goto L32
    L29:
        r22[2] = "startsWith";
        goto L32
    L30:
        r22[2] = "child";
        goto L32
    L31:
        r22[2] = "<init>";
    L32:
        String r03 = String.format(r02, r22);
        switch(r7) {
            case 4: goto L36;
            case 5: goto L36;
            case 6: goto L36;
            case 7: goto L36;
            case 8: goto L37;
            case 9: goto L36;
            case 10: goto L36;
            case 11: goto L36;
            default: goto L37;
        };
    L37:
        throw new IllegalArgumentException(r03);
    L36:
        throw new IllegalStateException(r03);
    L20:
        r22[1] = "pathSegments";
        goto L26
    L21:
        r22[1] = "shortNameOrSpecial";
        goto L26
    L22:
        r22[1] = "shortName";
        goto L26
    L23:
        r22[1] = "parent";
        goto L26
    L24:
        r22[1] = "toUnsafe";
        goto L26
    L25:
        r22[1] = "asString";
        goto L26
    L12:
        r22[0] = "shortName";
        goto L18
    L13:
        r22[0] = "segment";
        goto L18
    L14:
        r22[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
        goto L18
    L15:
        r22[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
        goto L18
    L16:
        r22[0] = "fqName";
        goto L18
    L8:
        r2 = 2;
        goto L9
    L4:
        r02 = "@NotNull method %s.%s must not return null";
        goto L6
    }

    public static c k(f r1) {
        if (r1 != null) goto L5;
        a(13);
    L5:
        return new c(d.m(r1));
    }

    public String b() {
        String r02 = this.f179265a.b();
        if (r02 != null) goto L5;
        a(4);
    L5:
        return r02;
    }

    public c c(f r3) {
        if (r3 != null) goto L5;
        a(8);
    L5:
        return new c(this.f179265a.c(r3), this);
    }

    public boolean d() {
        return this.f179265a.e();
    }

    public c e() {
        c r02 = this.f179266b;
        if (r02 == null) goto L8;
        if (r02 != null) goto L6;
        a(6);
    L6:
        return r02;
    L8:
        if (d() == true) goto L12;
        c r03 = new c(this.f179265a.g());
        this.f179266b = r03;
        return r03;
    L12:
        throw new IllegalStateException("root");
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (this.f179265a.equals(((c) r4).f179265a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public List f() {
        List r02 = this.f179265a.h();
        if (r02 != null) goto L5;
        a(11);
    L5:
        return r02;
    }

    public f g() {
        f r02 = this.f179265a.i();
        if (r02 != null) goto L5;
        a(9);
    L5:
        return r02;
    }

    public f h() {
        f r02 = this.f179265a.j();
        if (r02 != null) goto L5;
        a(10);
    L5:
        return r02;
    }

    public int hashCode() {
        return this.f179265a.hashCode();
    }

    public boolean i(f r2) {
        if (r2 != null) goto L5;
        a(12);
    L5:
        return this.f179265a.k(r2);
    }

    public d j() {
        d r02 = this.f179265a;
        if (r02 != null) goto L5;
        a(5);
    L5:
        return r02;
    }

    public String toString() {
        return this.f179265a.toString();
    }

    public c(d r2) {
        if (r2 != null) goto L4;
        a(2);
    L4:
        this.f179265a = r2;
    }

    public c(d r2, c r3) {
        if (r2 != null) goto L4;
        a(3);
    L4:
        this.f179265a = r2;
        this.f179266b = r3;
    }
}
