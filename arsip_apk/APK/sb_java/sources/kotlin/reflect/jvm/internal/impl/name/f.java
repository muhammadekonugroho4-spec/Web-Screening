package kotlin.reflect.jvm.internal.impl.name;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final String f179274a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f179275b;

    public f(String r2, boolean r3) {
        if (r2 != null) goto L4;
        a(0);
    L4:
        this.f179274a = r2;
        this.f179275b = r3;
    }

    public static /* synthetic */ void a(int r9) {
        if (r9 == 1) goto L8;
        if (r9 == 2) goto L8;
        if (r9 == 3) goto L8;
        if (r9 == 4) goto L8;
        String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
    L9:
        if (r9 == 1) goto L14;
        if (r9 == 2) goto L14;
        if (r9 == 3) goto L14;
        if (r9 == 4) goto L14;
        int r5 = 3;
    L15:
        Object[] r52 = new Object[r5];
        if (r9 == 1) goto L21;
        if (r9 == 2) goto L21;
        if (r9 == 3) goto L21;
        if (r9 == 4) goto L21;
        r52[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
    L22:
        if (r9 == 1) goto L29;
        if (r9 == 2) goto L28;
        if (r9 == 3) goto L27;
        if (r9 == 4) goto L27;
        r52[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
    L30:
        switch(r9) {
            case 1: goto L36;
            case 2: goto L36;
            case 3: goto L36;
            case 4: goto L36;
            case 5: goto L35;
            case 6: goto L34;
            case 7: goto L33;
            case 8: goto L32;
            default: goto L31;
        };
    L31:
        r52[2] = "<init>";
        goto L36
    L32:
        r52[2] = "guessByFirstCharacter";
        goto L36
    L33:
        r52[2] = "special";
        goto L36
    L34:
        r52[2] = "isValidIdentifier";
        goto L36
    L35:
        r52[2] = "identifier";
    L36:
        String r42 = String.format(r4, r52);
        if (r9 == 1) goto L43;
        if (r9 == 2) goto L43;
        if (r9 == 3) goto L43;
        if (r9 == 4) goto L43;
        throw new IllegalArgumentException(r42);
    L43:
        throw new IllegalStateException(r42);
    L27:
        r52[1] = "asStringStripSpecialMarkers";
        goto L30
    L28:
        r52[1] = "getIdentifier";
        goto L30
    L29:
        r52[1] = "asString";
    L21:
        r52[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
    L14:
        r5 = 2;
    L8:
        r4 = "@NotNull method %s.%s must not return null";
        goto L9
    }

    public static f e(String r1) {
        if (r1 != null) goto L5;
        a(8);
    L5:
        if (r1.startsWith("<") == false) goto L9;
        return j(r1);
    L9:
        return g(r1);
    }

    public static f g(String r2) {
        if (r2 != null) goto L5;
        a(5);
    L5:
        return new f(r2, false);
    }

    public static boolean i(String r4) {
        if (r4 != null) goto L5;
        a(6);
    L5:
        if (r4.isEmpty() == false) goto L7;
    L23:
        return false;
    L7:
        if (r4.startsWith("<") == true) goto L23;
        int r02 = 0;
    L11:
        if (r02 >= r4.length()) goto L21;
        char r2 = r4.charAt(r02);
        if (r2 == '.') goto L20;
        if (r2 == '/') goto L20;
        if (r2 == '\\') goto L20;
        r02 = r02 + 1;
    L20:
        return false;
    L21:
        return true;
    }

    public static f j(String r3) {
        if (r3 != null) goto L5;
        a(7);
    L5:
        if (r3.startsWith("<") == false) goto L9;
        return new f(r3, true);
    L9:
        throw new IllegalArgumentException("special name must start with '<': " + r3);
    }

    public String b() {
        String r02 = this.f179274a;
        if (r02 != null) goto L5;
        a(1);
    L5:
        return r02;
    }

    public int c(f r2) {
        return this.f179274a.compareTo(r2.f179274a);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return c((f) r1);
    }

    public String d() {
        if (this.f179275b == true) goto L9;
        String r02 = b();
        if (r02 != null) goto L7;
        a(2);
    L7:
        return r02;
    L9:
        throw new IllegalStateException("not identifier: " + this);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (this.f179275b == r52.f179275b) goto L12;
        return false;
    L12:
        if (this.f179274a.equals(r52.f179274a) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public boolean h() {
        return this.f179275b;
    }

    public int hashCode() {
        return (this.f179274a.hashCode() * 31) + (this.f179275b ? 1 : 0);
    }

    public String toString() {
        return this.f179274a;
    }
}
