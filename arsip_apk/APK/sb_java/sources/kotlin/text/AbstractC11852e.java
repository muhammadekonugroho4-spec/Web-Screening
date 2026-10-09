package kotlin.text;

/* renamed from: kotlin.text.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11852e {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f180377a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f180378b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f180379c = null;
    public static final long[] d = null;

    static {
        int[] r1 = new int[256];
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r3 >= 256) goto L6;
        r1[r3] = "0123456789abcdef".charAt(r3 & 15) | ("0123456789abcdef".charAt(r3 >> 4) << '\b');
        r3 = r3 + 1;
        goto L4
    L6:
        f180377a = r1;
        int[] r12 = new int[256];
        int r32 = 0;
    L8:
        if (r32 >= 256) goto L10;
        r12[r32] = "0123456789ABCDEF".charAt(r32 & 15) | ("0123456789ABCDEF".charAt(r32 >> 4) << '\b');
        r32 = r32 + 1;
        goto L8
    L10:
        f180378b = r12;
        int[] r13 = new int[256];
        int r33 = 0;
    L11:
        if (r33 >= 256) goto L13;
        r13[r33] = -1;
        r33 = r33 + 1;
        goto L11
    L13:
        int r34 = 0;
        int r6 = 0;
    L15:
        if (r34 >= "0123456789abcdef".length()) goto L17;
        r13["0123456789abcdef".charAt(r34)] = r6;
        r34 = r34 + 1;
        r6 = r6 + 1;
        goto L15
    L17:
        int r35 = 0;
        int r62 = 0;
    L19:
        if (r35 >= "0123456789ABCDEF".length()) goto L21;
        r13["0123456789ABCDEF".charAt(r35)] = r62;
        r35 = r35 + 1;
        r62 = r62 + 1;
        goto L19
    L21:
        f180379c = r13;
        long[] r14 = new long[256];
        int r36 = 0;
    L22:
        if (r36 >= 256) goto L24;
        r14[r36] = -1;
        r36 = r36 + 1;
        goto L22
    L24:
        int r02 = 0;
        int r37 = 0;
    L26:
        if (r02 >= "0123456789abcdef".length()) goto L28;
        r14["0123456789abcdef".charAt(r02)] = r37;
        r02 = r02 + 1;
        r37 = r37 + 1;
        goto L26
    L28:
        int r03 = 0;
    L30:
        if (r2 >= "0123456789ABCDEF".length()) goto L32;
        r14["0123456789ABCDEF".charAt(r2)] = r03;
        r2 = r2 + 1;
        r03 = r03 + 1;
        goto L30
    L32:
        d = r14;
    }

    public static final /* synthetic */ long[] a() {
        return d;
    }

    public static final int[] b() {
        return f180377a;
    }
}
