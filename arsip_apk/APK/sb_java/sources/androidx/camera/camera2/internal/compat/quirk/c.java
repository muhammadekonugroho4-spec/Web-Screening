package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.p;
import kotlin.text.y;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f4379a = null;

    static {
        f4379a = new c();
    }

    public c() {
    }

    public static final boolean d() {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
    L6:
        String r02 = Build.HARDWARE;
        p.k(r02, "HARDWARE");
        Locale r3 = Locale.ROOT;
        String r4 = r02.toLowerCase(r3);
        p.k(r4, "toLowerCase(...)");
        if (y.a0(r4, "ums", false, 2, null) == false) goto L9;
    L14:
        return true;
    L9:
        if (f4379a.c() == false) goto L13;
        p.k(r02, "HARDWARE");
        String r03 = r02.toLowerCase(r3);
        p.k(r03, "toLowerCase(...)");
        if (y.a0(r03, "sp", false, 2, null) == true) goto L14;
    L13:
        return false;
    L5:
        if (y.J("Spreadtrum", b.a(), true) == true) goto L14;
        goto L6
    }

    public final boolean a(String r2, String r3) {
        return y.J(r2, r3, true);
    }

    public final boolean b(String r3) {
        String r02 = Build.MANUFACTURER;
        p.k(r02, "MANUFACTURER");
        if (a(r02, r3) == true) goto L9;
        String r03 = Build.BRAND;
        p.k(r03, "BRAND");
        if (a(r03, r3) == true) goto L11;
        return false;
    L11:
        return true;
    L9:
        return true;
    }

    public final boolean c() {
        return b("Itel");
    }
}
