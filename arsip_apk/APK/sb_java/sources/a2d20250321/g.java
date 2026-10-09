package a2d20250321;

import aai.liveness.Detector$DetectionFailedType;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static String f1522a;

    /* renamed from: b, reason: collision with root package name */
    public static String f1523b;

    /* renamed from: c, reason: collision with root package name */
    public static String f1524c;
    public static String d;

    /* renamed from: e, reason: collision with root package name */
    public static ai.advance.common.entity.a f1525e;

    /* renamed from: f, reason: collision with root package name */
    public static String f1526f;

    /* renamed from: g, reason: collision with root package name */
    public static String f1527g;

    /* renamed from: h, reason: collision with root package name */
    public static long f1528h;

    /* renamed from: i, reason: collision with root package name */
    public static List f1529i;

    /* renamed from: j, reason: collision with root package name */
    public static List f1530j;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1531a = null;

        static {
            int[] r02 = new int[Detector$DetectionFailedType.values().length];
            f1531a = r02;
            r02[Detector$DetectionFailedType.TIMEOUT.ordinal()] = 1;     // Catch: NoSuchFieldError -> L10
        L16:
            f1531a[Detector$DetectionFailedType.WEAKLIGHT.ordinal()] = 2;     // Catch: NoSuchFieldError -> L11
        L20:
            f1531a[Detector$DetectionFailedType.STRONGLIGHT.ordinal()] = 3;     // Catch: NoSuchFieldError -> L12
        L26:
            f1531a[Detector$DetectionFailedType.MUCHMOTION.ordinal()] = 4;     // Catch: NoSuchFieldError -> L13
        L18:
            f1531a[Detector$DetectionFailedType.FACEMISSING.ordinal()] = 5;     // Catch: NoSuchFieldError -> L14
        L22:
            f1531a[Detector$DetectionFailedType.MULTIPLEFACE.ordinal()] = 6;     // Catch: NoSuchFieldError -> L15
            return;
        }
    }

    public class b implements Comparator {
        public b() {
        }

        public int a(a2d20250321.a r3, a2d20250321.a r4) {
            return Long.compare(r3.f1502b, r4.f1502b);
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object r1, Object r2) {
            return a((a2d20250321.a) r1, (a2d20250321.a) r2);
        }
    }

    static {
        f1529i = new ArrayList();
        f1530j = new ArrayList();
    }

    public static void a(String r02) {
        f1523b = r02;
    }

    public static void b(o r5) {
        if (r5 == null) goto L5;
        f1530j.add(new a2d20250321.a(r5.j(), r5.f1604h, r5.f1605i));
        return;
    }

    public static void c(o0O0O r02) {
        f1526f = r02.name();
    }

    public static void d(Detector$DetectionFailedType r1) {
        if (r1 != null) goto L4;
        return;
    L4:
        switch(a.f1531a[r1.ordinal()]) {
            case 1: goto L13;
            case 2: goto L12;
            case 3: goto L11;
            case 4: goto L10;
            case 5: goto L9;
            case 6: goto L6;
            default: goto L15;
        };
    L6:
        o0O0O r12 = o0O0O.OOOoooooo;
    L7:
        c(r12);
        return;
    L9:
        r12 = o0O0O.OOOOooOOOO;
        goto L7
    L10:
        r12 = o0O0O.OoooOOOoooooo;
        goto L7
    L11:
        r12 = o0O0O.OOOOOoooooooO;
        goto L7
    L12:
        r12 = o0O0O.oOoOOOOOooooo;
        goto L7
    L13:
        r12 = o0O0O.O0OOOoOooo;
        goto L7
    }

    public static void e(String r1) {
        f1529i.add(r1);
    }

    public static void f(String r02, String r1, String r2, ai.advance.common.entity.a r3) {
        d = r2;
        f1522a = r02;
        f1525e = r3;
        f1524c = r1;
    }

    public static void g(String r02) {
        f1526f = r02;
    }

    public static void h() {
        f1526f = null;
        f1522a = null;
        f1524c = null;
        d = null;
        f1525e = null;
        f1530j.clear();
        f1528h = 0;
        f1523b = null;
        f1529i.clear();
        f1527g = null;
    }

    public static List i() {
        Collections.sort(f1530j, new b());
        return f1530j;
    }

    public static String j() {
        if (n() == false) goto L6;
        return null;
    L6:
        String r02 = f1526f;
        if (r02 == null) goto L9;
        return r02;
    L9:
        ai.advance.common.entity.a r03 = f1525e;
        if (r03 == null) goto L16;
        if (TextUtils.isEmpty(r03.f1734a) == true) goto L16;
        return f1525e.f1734a;
    L16:
        return o0O0O.Oo000ooo00.toString();
    }

    public static String k() {
        ai.advance.common.entity.a r02 = f1525e;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.f1737e;
    }

    public static List l() {
        return f1529i;
    }

    public static String m() {
        return d;
    }

    public static boolean n() {
        ai.advance.common.entity.a r02 = f1525e;
        if (r02 != null) goto L7;
        return false;
    L7:
        return r02.f1735b;
    }

    public static void o(String r2) {
        if (f1525e != null) goto L5;
        f1525e = new ai.advance.common.entity.a();
    L5:
        ai.advance.common.entity.a r02 = f1525e;
        if (r02.f1735b == true) goto L9;
        r02.f1737e = r2;
        return;
    }

    public static void p(long r02) {
        f1528h = r02;
    }
}
