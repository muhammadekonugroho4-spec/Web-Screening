package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import com.google.firebase.sessions.settings.RemoteSettings;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f179649a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.reflect.jvm.internal.impl.name.c f179650b;

    public d(String r2) {
        if (r2 != null) goto L4;
        a(5);
    L4:
        this.f179649a = r2;
    }

    public static /* synthetic */ void a(int r10) {
        if (r10 == 3) goto L8;
        if (r10 == 6) goto L8;
        if (r10 == 7) goto L8;
        if (r10 == 8) goto L8;
        String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
    L10:
        if (r10 == 3) goto L15;
        if (r10 == 6) goto L15;
        if (r10 == 7) goto L15;
        if (r10 == 8) goto L15;
        int r6 = 3;
    L16:
        Object[] r62 = new Object[r6];
        switch(r10) {
            case 1: goto L21;
            case 2: goto L20;
            case 3: goto L19;
            case 4: goto L20;
            case 5: goto L18;
            case 6: goto L19;
            case 7: goto L19;
            case 8: goto L19;
            default: goto L18;
        };
    L18:
        r62[0] = "internalName";
    L23:
        if (r10 == 3) goto L31;
        if (r10 == 6) goto L30;
        if (r10 == 7) goto L29;
        if (r10 == 8) goto L28;
        r62[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
    L32:
        switch(r10) {
            case 1: goto L36;
            case 2: goto L35;
            case 3: goto L37;
            case 4: goto L35;
            case 5: goto L34;
            case 6: goto L37;
            case 7: goto L37;
            case 8: goto L37;
            default: goto L33;
        };
    L33:
        r62[2] = "byInternalName";
        goto L37
    L34:
        r62[2] = "<init>";
        goto L37
    L35:
        r62[2] = "byFqNameWithoutInnerClasses";
        goto L37
    L36:
        r62[2] = "byClassId";
    L37:
        String r42 = String.format(r4, r62);
        if (r10 == 3) goto L44;
        if (r10 == 6) goto L44;
        if (r10 == 7) goto L44;
        if (r10 == 8) goto L44;
        throw new IllegalArgumentException(r42);
    L44:
        throw new IllegalStateException(r42);
    L28:
        r62[1] = "getInternalName";
        goto L32
    L29:
        r62[1] = "getPackageFqName";
        goto L32
    L30:
        r62[1] = "getFqNameForClassNameWithoutDollars";
        goto L32
    L31:
        r62[1] = "byFqNameWithoutInnerClasses";
        goto L32
    L19:
        r62[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        goto L23
    L20:
        r62[0] = "fqName";
        goto L23
    L21:
        r62[0] = "classId";
    L15:
        r6 = 2;
    L8:
        r4 = "@NotNull method %s.%s must not return null";
        goto L10
    }

    public static d b(kotlin.reflect.jvm.internal.impl.name.b r5) {
        if (r5 != null) goto L4;
        a(1);
    L4:
        kotlin.reflect.jvm.internal.impl.name.c r02 = r5.h();
        String r52 = r5.i().b().replace('.', '$');
        if (r02.d() == false) goto L9;
        return new d(r52);
    L9:
        return new d(r02.b().replace('.', '/') + RemoteSettings.FORWARD_SLASH_STRING + r52);
    }

    public static d c(kotlin.reflect.jvm.internal.impl.name.c r4) {
        if (r4 != null) goto L4;
        a(2);
    L4:
        d r02 = new d(r4.b().replace('.', '/'));
        r02.f179650b = r4;
        return r02;
    }

    public static d d(String r1) {
        if (r1 != null) goto L5;
        a(0);
    L5:
        return new d(r1);
    }

    public kotlin.reflect.jvm.internal.impl.name.c e() {
        return new kotlin.reflect.jvm.internal.impl.name.c(this.f179649a.replace('/', '.'));
    }

    public boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (getClass() == r3.getClass()) goto L10;
        return false;
    L10:
        return this.f179649a.equals(((d) r3).f179649a);
    }

    public String f() {
        String r02 = this.f179649a;
        if (r02 != null) goto L5;
        a(8);
    L5:
        return r02;
    }

    public kotlin.reflect.jvm.internal.impl.name.c g() {
        int r02 = this.f179649a.lastIndexOf(RemoteSettings.FORWARD_SLASH_STRING);
        if (r02 != (-1)) goto L9;
        kotlin.reflect.jvm.internal.impl.name.c r03 = kotlin.reflect.jvm.internal.impl.name.c.f179264c;
        if (r03 != null) goto L7;
        a(7);
    L7:
        return r03;
    L9:
        return new kotlin.reflect.jvm.internal.impl.name.c(this.f179649a.substring(0, r02).replace('/', '.'));
    }

    public int hashCode() {
        return this.f179649a.hashCode();
    }

    public String toString() {
        return this.f179649a;
    }
}
