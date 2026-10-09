package androidx.camera.core.impl.utils;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f5601e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f5602f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f5603g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f5604h = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f5605a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5606b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5607c;
    public final byte[] d;

    static {
        f5601e = StandardCharsets.US_ASCII;
        f5602f = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f5603g = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f5604h = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
    }

    public g(int r7, int r8, byte[] r9) {
        this(r7, r8, -1, r9);
    }

    public static g a(String r5) {
        if (r5.length() == 1) goto L5;
    L10:
        byte[] r52 = r5.getBytes(f5601e);
        return new g(1, r52.length, r52);
    L5:
        if (r5.charAt(0) < '0') goto L10;
        if (r5.charAt(0) > '1') goto L10;
        return new g(1, 1, new byte[]{(byte) (r5.charAt(0) - '0')});
    }

    public static g b(double[] r5, ByteOrder r6) {
        ByteBuffer r02 = ByteBuffer.wrap(new byte[f5603g[12] * r5.length]);
        r02.order(r6);
        int r62 = r5.length;
        int r2 = 0;
    L3:
        if (r2 >= r62) goto L6;
        r02.putDouble(r5[r2]);
        r2 = r2 + 1;
        goto L3
    L6:
        return new g(12, r5.length, r02.array());
    }

    public static g c(int[] r4, ByteOrder r5) {
        ByteBuffer r02 = ByteBuffer.wrap(new byte[f5603g[9] * r4.length]);
        r02.order(r5);
        int r52 = r4.length;
        int r2 = 0;
    L3:
        if (r2 >= r52) goto L6;
        r02.putInt(r4[r2]);
        r2 = r2 + 1;
        goto L3
    L6:
        return new g(9, r4.length, r02.array());
    }

    public static g d(j[] r6, ByteOrder r7) {
        ByteBuffer r02 = ByteBuffer.wrap(new byte[f5603g[10] * r6.length]);
        r02.order(r7);
        int r72 = r6.length;
        int r2 = 0;
    L3:
        if (r2 >= r72) goto L6;
        j r3 = r6[r2];
        r02.putInt((int) r3.b());
        r02.putInt((int) r3.a());
        r2 = r2 + 1;
        goto L3
    L6:
        return new g(10, r6.length, r02.array());
    }

    public static g e(String r3) {
        byte[] r32 = (r3 + 0).getBytes(f5601e);
        return new g(2, r32.length, r32);
    }

    public static g f(long r2, ByteOrder r4) {
        return g(new long[]{r2}, r4);
    }

    public static g g(long[] r5, ByteOrder r6) {
        ByteBuffer r02 = ByteBuffer.wrap(new byte[f5603g[4] * r5.length]);
        r02.order(r6);
        int r62 = r5.length;
        int r2 = 0;
    L3:
        if (r2 >= r62) goto L6;
        r02.putInt((int) r5[r2]);
        r2 = r2 + 1;
        goto L3
    L6:
        return new g(4, r5.length, r02.array());
    }

    public static g h(j[] r6, ByteOrder r7) {
        ByteBuffer r02 = ByteBuffer.wrap(new byte[f5603g[5] * r6.length]);
        r02.order(r7);
        int r72 = r6.length;
        int r2 = 0;
    L3:
        if (r2 >= r72) goto L6;
        j r3 = r6[r2];
        r02.putInt((int) r3.b());
        r02.putInt((int) r3.a());
        r2 = r2 + 1;
        goto L3
    L6:
        return new g(5, r6.length, r02.array());
    }

    public static g i(int[] r4, ByteOrder r5) {
        ByteBuffer r02 = ByteBuffer.wrap(new byte[f5603g[3] * r4.length]);
        r02.order(r5);
        int r52 = r4.length;
        int r2 = 0;
    L3:
        if (r2 >= r52) goto L6;
        r02.putShort((short) r4[r2]);
        r2 = r2 + 1;
        goto L3
    L6:
        return new g(3, r4.length, r02.array());
    }

    public int j() {
        return f5603g[this.f5605a] * this.f5606b;
    }

    public String toString() {
        return "(" + f5602f[this.f5605a] + ", data length:" + this.d.length + ")";
    }

    public g(int r1, int r2, long r3, byte[] r5) {
        this.f5605a = r1;
        this.f5606b = r2;
        this.f5607c = r3;
        this.d = r5;
    }
}
