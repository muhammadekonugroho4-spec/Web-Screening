package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f22957a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int f22958b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f22959c = 0;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f22960e = 0;

    /* renamed from: androidx.core.os.a$a, reason: collision with other inner class name */
    public static final class C0165a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0165a f22961a = null;

        static {
            f22961a = new C0165a();
        }

        public C0165a() {
        }

        public final int a(int r1) {
            return SdkExtensions.getExtensionVersion(r1);
        }
    }

    static {
        f22957a = new a();
        int r02 = Build.VERSION.SDK_INT;
        int r1 = 0;
        if (r02 < 30) goto L5;
        int r3 = C0165a.f22961a.a(30);
    L6:
        f22958b = r3;
        if (r02 < 30) goto L9;
        int r32 = C0165a.f22961a.a(31);
    L10:
        f22959c = r32;
        if (r02 < 30) goto L13;
        int r33 = C0165a.f22961a.a(33);
    L14:
        d = r33;
        if (r02 < 30) goto L17;
        r1 = C0165a.f22961a.a(1000000);
    L17:
        f22960e = r1;
        return;
    L13:
        r33 = 0;
        goto L14
    L9:
        r32 = 0;
        goto L10
    L5:
        r3 = 0;
        goto L6
    }

    public a() {
    }

    public static final boolean a(String r4, String r5) {
        p.l(r4, "codename");
        p.l(r5, "buildCodename");
        if (p.g("REL", r5) == false) goto L5;
        return false;
    L5:
        Integer r02 = b(r5);
        Integer r2 = b(r4);
        if (r02 == null) goto L12;
        if (r2 == null) goto L12;
        if (r02.intValue() < r2.intValue()) goto L11;
        return true;
    L11:
        return false;
    L12:
        if (r02 != null) goto L18;
        if (r2 != null) goto L18;
        Locale r03 = Locale.ROOT;
        String r52 = r5.toUpperCase(r03);
        p.k(r52, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String r42 = r4.toUpperCase(r03);
        p.k(r42, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (r52.compareTo(r42) < 0) goto L17;
        return true;
    L17:
        return false;
    L18:
        if (r02 == null) goto L20;
        return true;
    L20:
        return false;
    }

    public static final Integer b(String r1) {
        String r12 = r1.toUpperCase(Locale.ROOT);
        p.k(r12, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (p.g(r12, "BAKLAVA") == true) goto L5;
        return null;
    L5:
        return 0;
    }

    public static final boolean c() {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 < 33) goto L5;
        return true;
    L5:
        if (r02 < 32) goto L9;
        String r03 = Build.VERSION.CODENAME;
        p.k(r03, "CODENAME");
        if (a("Tiramisu", r03) == true) goto L14;
        return false;
    L14:
        return true;
    L9:
        return false;
    }

    public static final boolean d() {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 < 35) goto L5;
        return true;
    L5:
        if (r02 < 34) goto L9;
        String r03 = Build.VERSION.CODENAME;
        p.k(r03, "CODENAME");
        if (a("VanillaIceCream", r03) == true) goto L14;
        return false;
    L14:
        return true;
    L9:
        return false;
    }
}
