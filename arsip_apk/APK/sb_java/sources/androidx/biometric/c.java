package androidx.biometric;

import java.util.Arrays;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f3731a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f3732b;

    public c(int r1, CharSequence r2) {
        this.f3731a = r1;
        this.f3732b = r2;
    }

    public static String a(CharSequence r02) {
        if (r02 != null) goto L4;
        return null;
    L4:
        return r02.toString();
    }

    public int b() {
        return this.f3731a;
    }

    public CharSequence c() {
        return this.f3732b;
    }

    public final boolean d(CharSequence r2) {
        String r02 = a(this.f3732b);
        String r22 = a(r2);
        if (r02 != null) goto L5;
        if (r22 != null) goto L5;
        return true;
    L5:
        if (r02 != null) goto L7;
        return false;
    L7:
        if (r02.equals(r22) == false) goto L13;
        return true;
    L13:
        return false;
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof c) == false) goto L10;
        c r42 = (c) r4;
        if (this.f3731a != r42.f3731a) goto L10;
        if (d(r42.f3732b) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3731a), a(this.f3732b)});
    }
}
