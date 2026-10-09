package com.huawei.secure.android.common.ssl.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.primitives.UnsignedBytes;
import com.huawei.hms.common.PackageConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f39606a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f39607b = null;

    static {
        f39606a = Uri.parse("content://com.huawei.hwid");
        f39607b = new String[]{"B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05", "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539"};
    }

    public static int a(String r3) {
        if (TextUtils.isEmpty(r3) == false) goto L5;
        return -1;
    L5:
        File r02 = new File(r3);
        if (r02.exists() == false) goto L10;
        f.f("BksUtil", "The directory  has already exists");
        return 1;
    L10:
        if (r02.mkdirs() == false) goto L13;
        f.b("BksUtil", "create directory  success");
        return 0;
    L13:
        f.d("BksUtil", "create directory  failed");
        return -1;
    }

    public static String b(Context r1) {
        return r1.createDeviceProtectedStorageContext().getFilesDir() + File.separator + "aegis";
    }

    public static String c(byte[] r6) {
        if (r6 != null) goto L4;
        return "";
    L4:
        if (r6.length == 0) goto L19;
        StringBuilder r02 = new StringBuilder();
        int r1 = r6.length;
        int r2 = 0;
    L7:
        if (r2 >= r1) goto L13;
        String r3 = Integer.toHexString(r6[r2] & UnsignedBytes.MAX_VALUE);
        if (r3.length() != 1) goto L11;
        r02.append('0');
    L11:
        r02.append(r3);
        r2 = r2 + 1;
        goto L7
    L13:
        return r02.toString();
    L19:
        return "";
    }

    public static void d(InputStream r6, Context r7) {
        if (r6 == null) goto L30;
        if (r7 == null) goto L40;
        String r72 = b(r7);
        if (new File(r72).exists() == true) goto L9;
        a(r72);
    L9:
        File r1 = new File(r72, "hmsrootcas.bks");
        if (r1.exists() == false) goto L12;
        r1.delete();
    L12:
        FileOutputStream r73 = null;
        f.e("BksUtil", "write output stream ");     // Catch: IOException -> L31 Throwable -> L27
        FileOutputStream r2 = new FileOutputStream(r1);     // Catch: IOException -> L31 Throwable -> L27
        byte[] r12 = new byte[2048];     // Catch: Throwable -> L20 IOException -> L24
    L16:
        int r4 = r6.read(r12, 0, 2048);     // Catch: Throwable -> L20 IOException -> L24
        if (r4 == (-1)) goto L22;
        r2.write(r12, 0, r4);     // Catch: Throwable -> L20 IOException -> L24
        goto L16
    L22:
        e.c(r2);
        return;
    L24:
        r73 = r2;
    L20:
        th = th;
        r73 = r2;
    L28:
        e.c(r73);
        throw th;
    L27:
        th = th;
    L25:
        f.d("BksUtil", " IOException");     // Catch: Throwable -> L27
        e.c(r73);
        return;
    L40:
        return;
    }

    public static byte[] e(Context r3, String r4) {
        if (r3 != null) goto L5;
    L21:
        Log.e("BksUtil", "packageName is null or context is null");
        return new byte[0];
    L5:
        if (TextUtils.isEmpty(r4) == true) goto L21;
        PackageManager r32 = r3.getPackageManager();     // Catch: Exception -> L13 PackageManager.NameNotFoundException -> L15
        if (r32 == null) goto L20;
        PackageInfo r33 = r32.getPackageInfo(r4, 64);     // Catch: Exception -> L13 PackageManager.NameNotFoundException -> L15
        if (r33 == null) goto L20;
        return r33.signatures[0].toByteArray();
    L20:
        return new byte[0];
    L15:
        e = move-exception;
        Log.e("BksUtil", "PackageManager.NameNotFoundException : " + e.getMessage());
    L13:
        e = move-exception;
        Log.e("BksUtil", "get pm exception : " + e.getMessage());
        goto L20
    }

    public static String f(Context r1) {
        return b(r1) + File.separator + "hmsrootcas.bks";
    }

    public static String g(byte[] r2) {
        if (r2 != null) goto L9;
        return "";
    L9:
        MessageDigest r1 = MessageDigest.getInstance("SHA-256");     // Catch: NoSuchAlgorithmException -> L7
        r1.update(r2);     // Catch: NoSuchAlgorithmException -> L7
        return c(r1.digest());
    L7:
        f.d("BksUtil", "inputstraem exception");
        return "";
    }

    public static boolean h(Context r02, String r1) {
        return "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539".equalsIgnoreCase(j(e(r02, r1)));
    }

    public static boolean i(String r10) {
        if (TextUtils.isEmpty(r10) == false) goto L5;
        return false;
    L5:
        f.e("BksUtil", "hms version code is : " + r10);
        String[] r102 = r10.split("\\.");
        String[] r02 = "4.0.2.300".split("\\.");
        int r3 = r102.length;
        int r4 = r02.length;
        int r5 = Math.max(r3, r4);
        int r6 = 0;
    L7:
        if (r6 >= r5) goto L26;
        if (r6 < r3) goto L27;
        int r8 = 0;
    L13:
        if (r6 >= r4) goto L20;
        int r9 = Integer.parseInt(r02[r6]);     // Catch: Exception -> L10
    L21:
        if (r8 < r9) goto L22;
        if (r8 > r9) goto L24;
        r6 = r6 + 1;
        goto L7
    L24:
        return true;
    L22:
        return false;
    L20:
        r9 = 0;
        goto L21
    L27:
        r8 = Integer.parseInt(r102[r6]);     // Catch: Exception -> L10
    L10:
        e = move-exception;
        f.d("BksUtil", " exception : " + e.getMessage());
        if (r6 >= r4) goto L19;
        return false;
    L19:
        return true;
    L26:
        return true;
    }

    public static String j(byte[] r3) {
        if (r3 != null) goto L5;
    L11:
        return "";
    L5:
        if (r3.length == 0) goto L11;
        return c(MessageDigest.getInstance("SHA-256").digest(r3));
    L9:
        e = move-exception;
        Log.e("BksUtil", "NoSuchAlgorithmException" + e.getMessage());
        goto L11
    }

    public static boolean k(Context r1) {
        return new File(b(r1) + File.separator + "hmsrootcas.bks").exists();
    }

    public static boolean l(Context r5, String r6) {
        byte[] r52 = e(r5, r6);
        String[] r62 = f39607b;
        int r02 = r62.length;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L9;
        if (r62[r2].equalsIgnoreCase(j(r52)) == true) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    public static synchronized InputStream m(Context r9) {
        monitor-enter(a.class);
        f.e("BksUtil", "get bks from tss begin");     // Catch: Throwable -> L7
        if (r9 == null) goto L9;
        c.b(r9);     // Catch: Throwable -> L7
    L9:
        Context r92 = c.a();     // Catch: Throwable -> L7
        InputStream r1 = null;
        if (r92 != null) goto L15;
        f.d("BksUtil", "context is null");     // Catch: Throwable -> L7
        monitor-exit(a.class);
        return null;
    L15:
        if (i(g.a("com.huawei.hwid")) == true) goto L22;
        if (i(g.a(PackageConstants.SERVICES_PACKAGE_ALL_SCENE)) == true) goto L22;
        f.d("BksUtil", "hms version code is too low : " + g.a("com.huawei.hwid"));     // Catch: Throwable -> L7
        monitor-exit(a.class);
        return null;
    L22:
        if (l(r92, "com.huawei.hwid") == false) goto L24;
    L28:
        ByteArrayOutputStream r2 = new ByteArrayOutputStream();     // Catch: Throwable -> L7
        InputStream r3 = r92.getContentResolver().openInputStream(Uri.withAppendedPath(f39606a, "files/hmsrootcas.bks"));     // Catch: Throwable -> L53 Exception -> L55
    L69:
        byte[] r4 = new byte[1024];     // Catch: Throwable -> L35 Exception -> L37
    L32:
        int r5 = r3.read(r4);     // Catch: Throwable -> L35 Exception -> L37
        if (r5 <= (-1)) goto L39;
        r2.write(r4, 0, r5);     // Catch: Throwable -> L35 Exception -> L37
        goto L32
    L39:
        r2.flush();     // Catch: Throwable -> L35 Exception -> L37
        InputStream r42 = new ByteArrayInputStream(r2.toByteArray());     // Catch: Throwable -> L35 Exception -> L37
        String r12 = h.a("bks_hash", "", r92);     // Catch: Throwable -> L46 Exception -> L48
        String r52 = g(r2.toByteArray());     // Catch: Throwable -> L46 Exception -> L48
        if (k(r92) == true) goto L43;
    L50:
        f.e("BksUtil", "update bks and sp");     // Catch: Throwable -> L46 Exception -> L48
        d(r42, r92);     // Catch: Throwable -> L46 Exception -> L48
        h.c("bks_hash", r52, r92);     // Catch: Throwable -> L46 Exception -> L48
    L51:
        e.b(r3);     // Catch: Throwable -> L7
        e.c(r2);     // Catch: Throwable -> L7
        e.b(r42);     // Catch: Throwable -> L7
    L60:
        InputStream r93 = n(r92);     // Catch: Throwable -> L7
        monitor-exit(a.class);
        return r93;
    L43:
        if (r12.equals(r52) == false) goto L50;
        f.e("BksUtil", "bks not update");     // Catch: Throwable -> L46 Exception -> L48
    L48:
        e = move-exception;
        e = e;
        r1 = r42;
    L58:
        f.d("BksUtil", "Get bks from HMS_VERSION_CODE exception : No content provider" + e.getMessage());     // Catch: Throwable -> L35
        e.b(r3);     // Catch: Throwable -> L7
        e.c(r2);     // Catch: Throwable -> L7
        e.b(r1);     // Catch: Throwable -> L7
    L46:
        th = th;
    L64:
        e.b(r3);     // Catch: Throwable -> L7
        e.c(r2);     // Catch: Throwable -> L7
        e.b(r42);     // Catch: Throwable -> L7
        throw th;     // Catch: Throwable -> L7
    L37:
        e = e;
    L35:
        th = th;
        InputStream r8 = r3;
        InputStream r32 = r1;
        r1 = r8;
    L63:
        r42 = r32;
        r3 = r1;
    L55:
        e = e;
        r3 = null;
    L53:
        th = th;
        r32 = null;
        goto L63
    L24:
        if (h(r92, PackageConstants.SERVICES_PACKAGE_ALL_SCENE) == true) goto L28;
        f.d("BksUtil", "hms sign error");     // Catch: Throwable -> L7
        monitor-exit(a.class);
        return null;
    L7:
        th = move-exception;
        throw th;
    }

    public static InputStream n(Context r2) {
        if (k(r2) == false) goto L12;
        f.e("BksUtil", "getFilesBksIS ");
        return new FileInputStream(f(r2));
    L7:
        f.d("BksUtil", "FileNotFoundExceptio: ");
        return null;
    L12:
        return null;
    }
}
