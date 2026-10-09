package ai.advance.common.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static int f1747a;

    /* renamed from: b, reason: collision with root package name */
    public static int f1748b;

    /* renamed from: c, reason: collision with root package name */
    public static int f1749c;
    public static int d;

    /* renamed from: e, reason: collision with root package name */
    public static int f1750e;

    /* renamed from: f, reason: collision with root package name */
    public static float f1751f;

    /* renamed from: g, reason: collision with root package name */
    public static float f1752g;

    /* renamed from: h, reason: collision with root package name */
    public static float f1753h;

    /* renamed from: i, reason: collision with root package name */
    public static float f1754i;

    /* renamed from: j, reason: collision with root package name */
    public static float f1755j;

    /* renamed from: k, reason: collision with root package name */
    public static float f1756k;

    /* renamed from: l, reason: collision with root package name */
    public static float f1757l;

    /* renamed from: m, reason: collision with root package name */
    public static float f1758m;

    static {
    }

    public static void a(Context r5) {
        DisplayMetrics r52 = Resources.getSystem().getDisplayMetrics();
        float r02 = r52.density;
        f1752g = r02;
        f1747a = (int) (35.0f * r02);
        int r1 = r52.widthPixels;
        d = r1;
        int r2 = r52.heightPixels;
        f1750e = r2;
        f1748b = r1;
        f1749c = r2;
        f1751f = r52.densityDpi;
        float r53 = 30.0f * r02;
        f1755j = r53;
        f1756k = r53;
        float r3 = 50.0f * r02;
        f1757l = r3;
        float r03 = r02 * 40.0f;
        f1758m = r03;
        f1753h = (r1 - r53) - r53;
        f1754i = (r2 - r3) - r03;
    }
}
