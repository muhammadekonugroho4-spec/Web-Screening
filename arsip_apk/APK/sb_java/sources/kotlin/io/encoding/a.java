package kotlin.io.encoding;

import kotlin.collections.AbstractC11772p;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f177473a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f177474b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f177475c = null;
    public static final int[] d = null;

    static {
        byte[] r02 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f177473a = r02;
        int[] r2 = new int[256];
        AbstractC11772p.C(r2, -1, 0, 0, 6, null);
        r2[61] = -2;
        int r5 = r02.length;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
    L3:
        if (r7 >= r5) goto L5;
        r2[r02[r7]] = r8;
        r7 = r7 + 1;
        r8 = r8 + 1;
        goto L3
    L5:
        f177474b = r2;
        byte[] r03 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        f177475c = r03;
        int[] r72 = new int[256];
        AbstractC11772p.C(r72, -1, 0, 0, 6, null);
        r72[61] = -2;
        int r1 = r03.length;
        int r22 = 0;
    L6:
        if (r6 >= r1) goto L8;
        r72[r03[r6]] = r22;
        r6 = r6 + 1;
        r22 = r22 + 1;
        goto L6
    L8:
        d = r72;
    }

    public static final /* synthetic */ int[] a() {
        return f177474b;
    }

    public static final /* synthetic */ byte[] b() {
        return f177473a;
    }

    public static final /* synthetic */ int[] c() {
        return d;
    }

    public static final /* synthetic */ byte[] d() {
        return f177475c;
    }
}
