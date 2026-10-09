package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.AbstractC2209b0;
import androidx.camera.core.impl.D0;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.iab.digitalidentity.sdk.core.model.GoPayPlusCameraConfigKt;
import com.stockbit.protobuf.securities.transactional.datafeed.v1.datafeed.ErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ExcludedSupportedSizesQuirk implements D0 {
    public ExcludedSupportedSizesQuirk() {
    }

    public static boolean l() {
        if ("HUAWEI".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if ("HWANE".equalsIgnoreCase(Build.DEVICE) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean m() {
        if ("OnePlus".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if ("OnePlus6".equalsIgnoreCase(Build.DEVICE) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean n() {
        if ("OnePlus".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if ("OnePlus6T".equalsIgnoreCase(Build.DEVICE) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean o() {
        if ("REDMI".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if ("joyeuse".equalsIgnoreCase(Build.DEVICE) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean p() {
        if ("SAMSUNG".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if ("a05s".equalsIgnoreCase(Build.DEVICE) == true) goto L7;
        return false;
    L7:
        if (Build.MODEL.toUpperCase().contains("SM-A057") == false) goto L13;
        return true;
    L13:
        return false;
    }

    public static boolean q() {
        if ("SAMSUNG".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if ("J7XELTE".equalsIgnoreCase(Build.DEVICE) == true) goto L7;
        return false;
    L7:
        if (Build.VERSION.SDK_INT < 27) goto L13;
        return true;
    L13:
        return false;
    }

    public static boolean r() {
        if ("SAMSUNG".equalsIgnoreCase(Build.BRAND) == true) goto L5;
        return false;
    L5:
        if ("ON7XELTE".equalsIgnoreCase(Build.DEVICE) == true) goto L7;
        return false;
    L7:
        if (Build.VERSION.SDK_INT < 27) goto L13;
        return true;
    L13:
        return false;
    }

    public static boolean s() {
        if (m() == false) goto L5;
        return true;
    L5:
        if (n() == false) goto L7;
        return true;
    L7:
        if (l() == false) goto L9;
        return true;
    L9:
        if (r() == false) goto L11;
        return true;
    L11:
        if (q() == false) goto L13;
        return true;
    L13:
        if (o() == false) goto L15;
        return true;
    L15:
        if (p() == true) goto L26;
        return false;
    L26:
        return true;
    }

    public List d(String r3, int r4) {
        if (m() == false) goto L7;
        return f(r3, r4);
    L7:
        if (n() == false) goto L11;
        return g(r3, r4);
    L11:
        if (l() == false) goto L15;
        return e(r3, r4, null);
    L15:
        if (r() == false) goto L19;
        return k(r3, r4, null);
    L19:
        if (q() == false) goto L23;
        return j(r3, r4, null);
    L23:
        if (o() == false) goto L27;
        return h(r3, r4);
    L27:
        if (p() == true) goto L29;
        AbstractC2209b0.l("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.EMPTY_LIST;
    L29:
        return i(r4);
    }

    public final List e(String r3, int r4, Class r5) {
        ArrayList r02 = new ArrayList();
        if (r3.equals("0") == true) goto L5;
    L10:
        return r02;
    L5:
        if (r4 != 34) goto L7;
    L9:
        r02.add(new Size(720, 720));
        r02.add(new Size(ErrorCode.ERROR_CODE_BAD_REQUEST_VALUE, ErrorCode.ERROR_CODE_BAD_REQUEST_VALUE));
        goto L10
    L7:
        if (r4 == 35) goto L9;
        if (r5 == null) goto L10;
        goto L9
    }

    public final List f(String r3, int r4) {
        ArrayList r02 = new ArrayList();
        if (r3.equals("0") == true) goto L5;
    L7:
        return r02;
    L5:
        if (r4 != 256) goto L7;
        r02.add(new Size(4160, 3120));
        r02.add(new Size(4000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS));
        goto L7
    }

    public final List g(String r3, int r4) {
        ArrayList r02 = new ArrayList();
        if (r3.equals("0") == true) goto L5;
    L7:
        return r02;
    L5:
        if (r4 != 256) goto L7;
        r02.add(new Size(4160, 3120));
        r02.add(new Size(4000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS));
        goto L7
    }

    public final List h(String r3, int r4) {
        ArrayList r02 = new ArrayList();
        if (r3.equals("0") == true) goto L5;
    L7:
        return r02;
    L5:
        if (r4 != 256) goto L7;
        r02.add(new Size(9280, 6944));
        goto L7
    }

    public final List i(int r4) {
        ArrayList r02 = new ArrayList();
        if (r4 != 35) goto L5;
        r02.add(new Size(3840, 2160));
        r02.add(new Size(3264, 2448));
        r02.add(new Size(3200, 2400));
        r02.add(new Size(2688, 1512));
        r02.add(new Size(2592, 1944));
        r02.add(new Size(2592, 1940));
        r02.add(new Size(1920, 1440));
    L5:
        return r02;
    }

    public final List j(String r10, int r11, Class r12) {
        ArrayList r02 = new ArrayList();
        if (r10.equals("0") == false) goto L13;
        if (r11 == 34) goto L10;
        if (r12 != null) goto L10;
        if (r11 != 35) goto L18;
        r02.add(new Size(2048, 1536));
        r02.add(new Size(2048, 1152));
        r02.add(new Size(1920, 1080));
        return r02;
    L18:
        return r02;
    L10:
        r02.add(new Size(4128, 3096));
        r02.add(new Size(4128, 2322));
        r02.add(new Size(3088, 3088));
        r02.add(new Size(3264, 2448));
        r02.add(new Size(3264, 1836));
        r02.add(new Size(2048, 1536));
        r02.add(new Size(2048, 1152));
        r02.add(new Size(1920, 1080));
        return r02;
    L13:
        if (r10.equals(GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A) == false) goto L18;
        if (r11 == 34) goto L17;
        if (r11 == 35) goto L17;
        if (r12 == null) goto L18;
    L17:
        r02.add(new Size(2576, 1932));
        r02.add(new Size(2560, 1440));
        r02.add(new Size(1920, 1920));
        r02.add(new Size(2048, 1536));
        r02.add(new Size(2048, 1152));
        r02.add(new Size(1920, 1080));
        goto L18
    }

    public final List k(String r16, int r17, Class r18) {
        ArrayList r2 = new ArrayList();
        if (r16.equals("0") == false) goto L14;
        if (r17 == 34) goto L11;
        if (r18 != null) goto L11;
        if (r17 != 35) goto L19;
        r2.add(new Size(4128, 2322));
        r2.add(new Size(3088, 3088));
        r2.add(new Size(3264, 2448));
        r2.add(new Size(3264, 1836));
        r2.add(new Size(2048, 1536));
        r2.add(new Size(2048, 1152));
        r2.add(new Size(1920, 1080));
        return r2;
    L19:
        return r2;
    L11:
        r2.add(new Size(4128, 3096));
        r2.add(new Size(4128, 2322));
        r2.add(new Size(3088, 3088));
        r2.add(new Size(3264, 2448));
        r2.add(new Size(3264, 1836));
        r2.add(new Size(2048, 1536));
        r2.add(new Size(2048, 1152));
        r2.add(new Size(1920, 1080));
        return r2;
    L14:
        if (r16.equals(GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A) == false) goto L19;
        if (r17 == 34) goto L18;
        if (r17 == 35) goto L18;
        if (r18 == null) goto L19;
    L18:
        r2.add(new Size(3264, 2448));
        r2.add(new Size(3264, 1836));
        r2.add(new Size(2448, 2448));
        r2.add(new Size(1920, 1920));
        r2.add(new Size(2048, 1536));
        r2.add(new Size(2048, 1152));
        r2.add(new Size(1920, 1080));
        goto L19
    }
}
