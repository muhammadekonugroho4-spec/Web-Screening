package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.C2194w;
import androidx.camera.camera2.internal.compat.C;
import androidx.camera.core.impl.D0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class TorchFlashRequiredFor3aUpdateQuirk implements D0 {

    /* renamed from: b, reason: collision with root package name */
    public static final List f4374b = null;

    /* renamed from: a, reason: collision with root package name */
    public final C f4375a;

    static {
        f4374b = Arrays.asList(new String[]{"PIXEL 6A", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7A", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"});
    }

    public TorchFlashRequiredFor3aUpdateQuirk(C r1) {
        this.f4375a = r1;
    }

    public static boolean d(C r1) {
        if (e() == true) goto L5;
        return false;
    L5:
        if (h(r1) == false) goto L10;
        return true;
    L10:
        return false;
    }

    private static boolean e() {
        Iterator r02 = f4374b.iterator();
    L4:
        if (r02.hasNext() == false) goto L9;
        String r1 = (String) r02.next();
        if (Build.MODEL.toUpperCase(Locale.US).equals(r1) == false) goto L4;
        return true;
    L9:
        return false;
    }

    public static boolean f(C r3) {
        if (Build.VERSION.SDK_INT >= 28) goto L6;
        return false;
    L6:
        if (C2194w.F(r3, 5) != 5) goto L9;
        return true;
    L9:
        return false;
    }

    public static boolean h(C r1) {
        if (((Integer) r1.a(CameraCharacteristics.LENS_FACING)).intValue() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean i(C r02) {
        return d(r02);
    }

    public boolean g() {
        return !f(this.f4375a);
    }
}
