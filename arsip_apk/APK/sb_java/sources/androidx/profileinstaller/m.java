package androidx.profileinstaller;

import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f27156a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f27157b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f27158c = null;
    public static final byte[] d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f27159e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f27160f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f27161g = null;

    static {
        f27156a = new byte[]{48, 49, 53, 0};
        f27157b = new byte[]{48, 49, 48, 0};
        f27158c = new byte[]{48, 48, 57, 0};
        d = new byte[]{48, 48, 53, 0};
        f27159e = new byte[]{48, 48, 49, 0};
        f27160f = new byte[]{48, 48, 49, 0};
        f27161g = new byte[]{48, 48, 50, 0};
    }

    public static String a(byte[] r2) {
        if (Arrays.equals(r2, f27159e) == false) goto L6;
        return ":";
    L6:
        if (Arrays.equals(r2, d) == false) goto L8;
        return ":";
    L8:
        return "!";
    }
}
