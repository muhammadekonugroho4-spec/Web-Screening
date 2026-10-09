package okio.internal;

import java.util.GregorianCalendar;

/* loaded from: classes3.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final int f182426a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f182427b = null;

    static {
        f182427b = new byte[0];
    }

    public static final long a(int r7, int r8, int r9, int r10, int r11, int r12) {
        GregorianCalendar r02 = new GregorianCalendar();
        r02.set(14, 0);
        r02.set(r7, r8 - 1, r9, r10, r11, r12);
        return r02.getTime().getTime();
    }

    public static final int b() {
        return f182426a;
    }

    public static final byte[] c() {
        return f182427b;
    }
}
