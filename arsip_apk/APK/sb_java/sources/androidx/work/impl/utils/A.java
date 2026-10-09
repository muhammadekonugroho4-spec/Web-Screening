package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes4.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public static final String f29541a = null;

    static {
        f29541a = androidx.work.r.i("PackageManagerHelper");
    }

    public static int a(Context r2, String r3) {
        return r2.getPackageManager().getComponentEnabledSetting(new ComponentName(r2, r3));
    }

    public static boolean b(int r02, boolean r1) {
        if (r02 != 0) goto L5;
        return r1;
    L5:
        if (r02 != 1) goto L7;
        return true;
    L7:
        return false;
    }

    public static void c(Context r5, Class r6, boolean r7) {
        String r02 = "disabled";
    L7:
        e = move-exception;
        androidx.work.r r2 = androidx.work.r.e();
        String r3 = f29541a;
        StringBuilder r4 = new StringBuilder();
        r4.append(r6.getName());
        r4.append("could not be ");
        if (r7 == false) goto L22;
        r02 = "enabled";
    L22:
        r4.append(r02);
        r2.b(r3, r4.toString(), e);
        return;
    L4:
        if (r7 != b(a(r5, r6.getName()), false)) goto L9;
        androidx.work.r.e().a(f29541a, "Skipping component enablement for " + r6.getName());     // Catch: Exception -> L7
        return;
    L9:
        PackageManager r22 = r5.getPackageManager();     // Catch: Exception -> L7
        ComponentName r32 = new ComponentName(r5, r6.getName());     // Catch: Exception -> L7
        if (r7 == false) goto L12;
        int r42 = 1;
    L13:
        r22.setComponentEnabledSetting(r32, r42, 1);     // Catch: Exception -> L7
        androidx.work.r r52 = androidx.work.r.e();     // Catch: Exception -> L7
        String r23 = f29541a;     // Catch: Exception -> L7
        StringBuilder r33 = new StringBuilder();     // Catch: Exception -> L7
        r33.append(r6.getName());     // Catch: Exception -> L7
        r33.append(" ");     // Catch: Exception -> L7
        if (r7 == false) goto L16;
        String r43 = "enabled";
    L17:
        r33.append(r43);     // Catch: Exception -> L7
        r52.a(r23, r33.toString());     // Catch: Exception -> L7
        return;
    L16:
        r43 = "disabled";
        goto L17
    L12:
        r42 = 2;
        goto L13
    }
}
