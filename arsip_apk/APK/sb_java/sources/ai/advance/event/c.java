package ai.advance.event;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.android.SystemUtils;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: a, reason: collision with root package name */
    public static String f1789a = "advtn.tk";

    static {
    }

    public static String c(Context r1) {
        return Settings.Secure.getString(r1.getContentResolver(), "android_id");
    }

    public static String d(Context r2) {
        if (a.b(r2, "android.permission.READ_PHONE_STATE") == false) goto L9;
        String r22 = ((TelephonyManager) r2.getSystemService("phone")).getDeviceId();     // Catch: Exception -> L10
        if (r22 != null) goto L8;
        return SystemUtils.UNKNOWN;
    L8:
        return r22;
    L9:
        return SystemUtils.UNKNOWN;
    }

    public static String e(Context r1) {
        return ((TelephonyManager) r1.getSystemService("phone")).getImei();
    L4:
        return null;
    }

    public static String f(Context r8) {
        StringBuilder r1 = new StringBuilder();
        String r2 = c(r8);
        String r3 = d(r8);
        String r4 = f.f(r8);
        String r5 = e(r8);
        if (TextUtils.isEmpty(r5) == true) goto L6;
    L17:
        r1.append(r2 + "_" + r5 + "_" + r3 + "_" + r4);     // Catch: Exception -> L23
        goto L18
    L6:
        if (TextUtils.isEmpty(r2) == false) goto L17;
        if (SystemUtils.UNKNOWN.equals(r3) == false) goto L17;
        if ("02:00:00:00:00:00".equals(r4) == false) goto L17;
        byte[] r02 = MessageDigest.getInstance("MD5").digest((i().toString() + System.currentTimeMillis()).getBytes());     // Catch: Exception -> L23
        int r22 = r02.length;     // Catch: Exception -> L23
        int r32 = 0;
    L12:
        if (r32 >= r22) goto L18;
        String r42 = Integer.toHexString(r02[r32] & UnsignedBytes.MAX_VALUE);     // Catch: Exception -> L23
        if (r42.length() != 1) goto L16;
        r42 = "0" + r42;     // Catch: Exception -> L23
    L16:
        r1.append(r42);     // Catch: Exception -> L23
        r32 = r32 + 1;     // Catch: Exception -> L23
    L18:
        String r03 = r1.toString();
        if (TextUtils.isEmpty(r03) == false) goto L25;
        r03 = "random2-" + UUID.randomUUID().toString();
    L25:
        r8.deleteFile(f1789a);     // Catch: Exception -> L24
        r8.openFileOutput(f1789a, 0).write(r03.getBytes());     // Catch: Exception -> L24
    L22:
        return r03;
    }

    public static String g(Context r4) {
        FileInputStream r42 = r4.openFileInput(f1789a);     // Catch: Exception -> L8
        ByteArrayOutputStream r02 = new ByteArrayOutputStream(Math.max(UserMetadata.MAX_INTERNAL_KEY_SIZE, r42.available()));     // Catch: Exception -> L8
        byte[] r1 = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];     // Catch: Exception -> L8
    L3:
        int r2 = r42.read(r1);     // Catch: Exception -> L8
        if (r2 < 0) goto L6;
        r02.write(r1, 0, r2);     // Catch: Exception -> L8
        goto L3
    L6:
        return new String(r02.toByteArray());
    L8:
        return null;
    }

    public static String h(Context r2) {
        String r02 = g(r2);
        if (TextUtils.isEmpty(r02) == true) goto L5;
        return r02;
    L5:
        return f(r2);
    }

    public static JSONObject i() {
        JSONObject r02 = new JSONObject();
        r02.put("brand", Build.BRAND);     // Catch: Exception -> L5
        r02.put("ABI", Build.CPU_ABI);     // Catch: Exception -> L5
        r02.put("CPU", Build.HARDWARE);     // Catch: Exception -> L5
        r02.put(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, Build.DISPLAY);     // Catch: Exception -> L5
        r02.put("manufacturer", Build.MANUFACTURER);     // Catch: Exception -> L5
        r02.put("model", Build.MODEL);     // Catch: Exception -> L5
        r02.put("androidVersion", Build.VERSION.SDK_INT);     // Catch: Exception -> L5
    L4:
        return r02;
    }
}
