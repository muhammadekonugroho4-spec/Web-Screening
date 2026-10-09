package com.huawei.hms.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.clevertap.android.sdk.Constants;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.huawei.hms.support.log.HMSLog;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes6.dex */
public class ReadApkFileUtil {
    public static final String EMUI10_PK = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAx4nUogUyMCmzHhaEb420yvpw9zBs+ETzE9Qm77bGxl1Iml9JEkBkNTsUWOstLgUBajNhV+BAMVBHKMEdzoQbL5kIHkTgUVM65yewd+5+BhrcB9OQ3LHp+0BN6aLKZh71T4WvsvHFhfhQpShuGWkRkSaVGLFTHxX70kpWLzeZ3RtqiEUNIufPR2SFCH6EmecJ+HdkmBOh603IblCpGxwSWse0fDI98wZBEmV88RFaiYEgyiezLlWvXzqIj6I/xuyd5nGAegjH2y3cmoDE6CubecoB1jf4KdgACXgdiQ4Oc63MfLGTor3l6RCqeUk4APAMtyhK83jc72W1sdXMd/sj2wIDAQAB";
    public static final String EMUI11_PK = "MIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIBigKCAYEAqq2eRTMYr2JHLtvuZzfgPrgU8oatD4Rar9fOD7E00es2VhtB3vTyaT2BvYPUPA/nbkHRPak3EZX77CfWj9tzLgSHJE8XLk9C+2ESkdrxCDA6z7I8X+cBDnA05OlCJeZFjnUbjYB8SP8M3BttdrvqtVPxTkEJhchC7UXnMLaJ3kQ3ZPjN7ubjYzO4rv7EtEpqr2bX+qjnSLIZZuUXraxqfdBuhGDIYq62dNsqiyrhX1mfvA3+43N4ZIs3BdfSYII8BNFmFxf+gyf1aoq386R2kAjHcrfOOhjAbZh+R1OAGLWPCqi3E9nB8EsZkeoTW/oIP6pJvgL3bnxq+1viT2dmZyipMgcx/3N6FJqkd67j/sPMtPlHJuq8/s0silzs13jAw1WBV6tWHFkLGpkWGs8jp50wQtndtY8cCPl2XPGmdPN72agH+zsHuKqr/HOB2TuzzaO8rKlGIDQlzZcCSHB28nnvOyBVN9xzLkbYiLnHfd6bTwzNPeqjWrTnPwKyH3BPAgMBAAE=";
    public static final String KEY_SIGNATURE = "Signature:";
    public static final String KEY_SIGNATURE2 = "Signature2:";
    public static final String KEY_SIGNATURE3 = "Signature3:";

    /* renamed from: a, reason: collision with root package name */
    private static final String f39552a = "ReadApkFileUtil";

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f39553b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f39554c;
    private static String d;

    /* renamed from: e, reason: collision with root package name */
    private static String f39555e;

    /* renamed from: f, reason: collision with root package name */
    private static String f39556f;

    /* renamed from: g, reason: collision with root package name */
    private static String f39557g;

    static {
        f39553b = Pattern.compile("\\s*|\t|\r|\n");
        f39556f = null;
        f39557g = null;
    }

    public ReadApkFileUtil() {
    }

    private static byte[] a(ZipFile r1) {
        return a(r1, "META-INF/MANIFEST.MF");
    }

    @TargetApi(19)
    private static void b(byte[] r5) {
        if (r5 != null) goto L5;
        HMSLog.e(f39552a, "manifest is null！");
        return;
    L5:
        StringBuffer r02 = new StringBuffer();
        BufferedReader r1 = null;
        f39554c = null;
        d = null;
        f39555e = null;
        ByteArrayInputStream r2 = new ByteArrayInputStream(r5);     // Catch: Throwable -> L34 Exception -> L36
        BufferedReader r52 = new BufferedReader(new InputStreamReader(r2, StandardCharsets.UTF_8));     // Catch: Throwable -> L32 Exception -> L44
        goto L45
    L49:
        String r12 = a(r52);     // Catch: Throwable -> L16 Exception -> L31
    L9:
        if (r12 == null) goto L29;
        if (r12.length() == 0) goto L28;
        if (r12.startsWith("ApkHash:") == false) goto L19;
        f39556f = a(r12.substring(r12.indexOf(":") + 1));     // Catch: Throwable -> L16 Exception -> L31
    L19:
        if (r12.startsWith(KEY_SIGNATURE) == true) goto L20;
        if (r12.startsWith(KEY_SIGNATURE2) == true) goto L23;
        if (r12.startsWith(KEY_SIGNATURE3) == true) goto L26;
        r02.append(r12);     // Catch: Throwable -> L16 Exception -> L31
        r02.append("\r\n");     // Catch: Throwable -> L16 Exception -> L31
        goto L28
    L26:
        f39555e = a(r12.substring(r12.indexOf(":") + 1));     // Catch: Throwable -> L16 Exception -> L31
        r12 = a(r52);     // Catch: Throwable -> L16 Exception -> L31
        goto L9
    L23:
        d = a(r12.substring(r12.indexOf(":") + 1));     // Catch: Throwable -> L16 Exception -> L31
        r12 = a(r52);     // Catch: Throwable -> L16 Exception -> L31
        goto L9
    L20:
        f39554c = a(r12.substring(r12.indexOf(":") + 1));     // Catch: Throwable -> L16 Exception -> L31
        r12 = a(r52);     // Catch: Throwable -> L16 Exception -> L31
    L28:
        r12 = a(r52);     // Catch: Throwable -> L16 Exception -> L31
        goto L9
    L29:
        f39557g = r02.toString();     // Catch: Throwable -> L16 Exception -> L31
    L39:
        IOUtils.closeQuietly(r2);
        IOUtils.closeQuietly(r52);
        return;
    L31:
        r1 = r52;
    L16:
        Throwable th = th;
        r1 = r52;
    L42:
        IOUtils.closeQuietly(r2);
        IOUtils.closeQuietly(r1);
        throw th;
    L32:
        th = move-exception;
        th = th;
    L45:
        HMSLog.e(f39552a, "loadApkCert Exception!");     // Catch: Throwable -> L41
        r52 = r1;
    L41:
        th = th;
        goto L42
    L36:
        r2 = null;
    L34:
        th = move-exception;
        th = th;
        r2 = null;
        goto L42
    }

    public static String bytesToString(byte[] r6) {
        if (r6 != null) goto L5;
        return null;
    L5:
        char[] r02 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};
        char[] r1 = new char[r6.length * 2];
        int r2 = 0;
    L7:
        if (r2 >= r6.length) goto L10;
        byte r3 = r6[r2];
        int r5 = r2 * 2;
        r1[r5] = r02[(r3 & UnsignedBytes.MAX_VALUE) >>> 4];
        r1[r5 + 1] = r02[r3 & Ascii.SI];
        r2 = r2 + 1;
        goto L7
    L10:
        return String.valueOf(r1);
    }

    private static boolean c() {
    L7:
        e = move-exception;
        HMSLog.i(f39552a, "verifyMDMSignatureV3 MDM verify Exception!:" + e.getMessage());
    L12:
        return false;
    L4:
        if (a(Base64.decode(EMUI11_PK, 0), a(f39557g, "SHA-384"), b(f39555e), "SHA384withRSA") == false) goto L9;
        HMSLog.i(f39552a, "verifyMDMSignatureV3 verify successful!");     // Catch: Exception -> L7
        return true;
    L9:
        HMSLog.i(f39552a, "verifyMDMSignatureV3 verify failure!");     // Catch: Exception -> L7
        goto L12
    }

    public static boolean checkSignature() {
        if (f39555e == null) goto L7;
        return c();
    L7:
        if (d == null) goto L11;
        return b();
    L11:
        if (f39554c != null) goto L13;
        return false;
    L13:
        return a();
    }

    public static String getHmsPath(Context r2) {
        return r2.getPackageManager().getApplicationInfo("com.huawei.hwid", 128).sourceDir;
    L4:
        HMSLog.e(f39552a, "HMS is not found!");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @TargetApi(19)
    public static boolean isCertFound(String r6) {
        boolean r2 = false;
        ZipFile r3 = null;
        ZipFile r32 = null;
        ZipFile r33 = null;
        ZipFile r4 = new ZipFile(r6);     // Catch: Throwable -> L21 Exception -> L23
    L13:
        e = e;
        r33 = r4;
    L24:
        HMSLog.e(f39552a, "isCertFound Exception!" + e.getMessage());     // Catch: Throwable -> L21
        r3 = r33;
        if (r33 == null) goto L43;
        r33.close();     // Catch: IOException -> L28
        r3 = r33;
    L28:
        e = move-exception;
        String r02 = f39552a;
        StringBuilder r34 = new StringBuilder();
        r34.append("zipFile.close Exception!");
        r34.append(e.getMessage());
        HMSLog.e(r02, r34.toString());
        r3 = r34;
    L43:
        return r2;
    L11:
        th = th;
        r3 = r4;
    L31:
        if (r3 != null) goto L39;
    L36:
        throw th;
    L39:
        r3.close();     // Catch: IOException -> L34
    L34:
        e = move-exception;
        HMSLog.e(f39552a, "zipFile.close Exception!" + e.getMessage());
        goto L36
    L5:
        if (r4.getEntry("META-INF/HUAWEI.CER") == null) goto L7;
        boolean r62 = true;
    L8:
        if (r62 == false) goto L41;
        b(a(r4, "META-INF/HUAWEI.CER"));     // Catch: Throwable -> L11 Exception -> L13
    L41:
        r4.close();     // Catch: IOException -> L17
    L19:
        r2 = r62;
        r3 = r32;
    L17:
        e = move-exception;
        String r22 = f39552a;
        StringBuilder r35 = new StringBuilder();
        r35.append("zipFile.close Exception!");
        r35.append(e.getMessage());
        HMSLog.e(r22, r35.toString());
        r32 = r35;
        goto L19
    L7:
        r62 = false;
    L21:
        th = th;
    L23:
        e = e;
        goto L24
    }

    public static boolean verifyApkHash(String r5) {
        ZipFile r1 = null;
        ZipFile r2 = new ZipFile(r5);     // Catch: Throwable -> L26 Exception -> L28
        byte[] r52 = a(r2);     // Catch: Throwable -> L7 Exception -> L9
        ArrayList<String> r12 = a(r52);     // Catch: Throwable -> L7 Exception -> L9
        if (r12 == null) goto L11;
        r52 = a(r12);     // Catch: Throwable -> L7 Exception -> L9
    L11:
        MessageDigest r13 = MessageDigest.getInstance("SHA-256");     // Catch: Throwable -> L7 Exception -> L9
        r13.update(r52);     // Catch: Throwable -> L7 Exception -> L9
        String r53 = bytesToString(r13.digest());     // Catch: Throwable -> L7 Exception -> L9
        String r14 = f39556f;     // Catch: Throwable -> L7 Exception -> L9
        if (r14 == null) goto L47;
        if (r14.equals(r53) == false) goto L47;
        r2.close();     // Catch: Exception -> L18
        return true;
    L18:
        e = move-exception;
        HMSLog.i(f39552a, "close stream Exception!" + e.getMessage());
        return true;
    L47:
        r2.close();     // Catch: Exception -> L23
        return false;
    L23:
        e = move-exception;
        HMSLog.i(f39552a, "close stream Exception!" + e.getMessage());
        return false;
    L9:
        e = e;
        r1 = r2;
    L29:
        HMSLog.i(f39552a, "verifyApkHash Exception!" + e.getMessage());     // Catch: Throwable -> L26
        if (r1 == null) goto L57;
        r1.close();     // Catch: Exception -> L33
        return false;
    L33:
        e = move-exception;
        HMSLog.i(f39552a, "close stream Exception!" + e.getMessage());
        return false;
    L57:
        return false;
    L7:
        th = th;
        r1 = r2;
    L37:
        if (r1 != null) goto L45;
    L42:
        throw th;
    L45:
        r1.close();     // Catch: Exception -> L40
    L40:
        e = move-exception;
        HMSLog.i(f39552a, "close stream Exception!" + e.getMessage());
    L28:
        e = e;
    L26:
        th = th;
        goto L37
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.BufferedOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v5 */
    private static byte[] a(ZipFile r7, String r8) {
        ZipEntry r82 = r7.getEntry(r8);
        OutputStream r02 = null;
        if (r82 != null) goto L54;
        return null;
    L54:
        InputStream r72 = r7.getInputStream(r82);     // Catch: Throwable -> L38 Exception -> L41
        if (r72 != null) goto L58;
        IOUtils.closeQuietly(r72);
        IOUtils.closeQuietly(null);
        IOUtils.closeQuietly(null);
        IOUtils.closeQuietly(null);
        return null;
    L58:
        BufferedInputStream r83 = new BufferedInputStream(r72);     // Catch: Throwable -> L34 Exception -> L36
    L56:
        byte[] r2 = new byte[4096];     // Catch: Throwable -> L27 Exception -> L29
        ByteArrayOutputStream r3 = new ByteArrayOutputStream();     // Catch: Throwable -> L27 Exception -> L29
    L60:
        ?? r4 = new BufferedOutputStream(r3);     // Catch: Throwable -> L23 Exception -> L25
    L51:
        int r6 = r83.read(r2, 0, 4096);     // Catch: Exception -> L17 Throwable -> L47
    L15:
        if (r6 <= 0) goto L19;
        r4.write(r2, 0, r6);     // Catch: Exception -> L17 Throwable -> L47
        r6 = r83.read(r2, 0, 4096);     // Catch: Exception -> L17 Throwable -> L47
        goto L15
    L19:
        r4.flush();     // Catch: Exception -> L17 Throwable -> L47
        byte[] r03 = r3.toByteArray();     // Catch: Exception -> L17 Throwable -> L47
        IOUtils.closeQuietly(r72);
        IOUtils.closeQuietly(r83);
        IOUtils.closeQuietly(r3);
        IOUtils.closeQuietly(r4);
        return r03;
    L17:
        Exception e2 = e;
        r4 = r4;
    L44:
        HMSLog.i(f39552a, "getManifestBytes Exception!" + e2.getMessage());     // Catch: Throwable -> L47
        IOUtils.closeQuietly(r72);
        IOUtils.closeQuietly(r83);
        IOUtils.closeQuietly(r3);
        IOUtils.closeQuietly(r4);
        return null;
    L47:
        th = move-exception;
        Throwable th = th;
        r02 = r4;
    L49:
        IOUtils.closeQuietly(r72);
        IOUtils.closeQuietly(r83);
        IOUtils.closeQuietly(r3);
        IOUtils.closeQuietly(r02);
        throw th;
    L25:
        e2 = e;
        r4 = 0;
    L23:
        th = th;
    L29:
        e2 = e;
        r3 = null;
    L33:
        r4 = r3;
    L27:
        th = th;
        r3 = null;
    L36:
        e = move-exception;
        e2 = e;
    L43:
        r83 = null;
        r3 = null;
    L34:
        Throwable th2 = th;
    L40:
        th = th2;
        r83 = null;
        r3 = null;
        goto L49
    L41:
        e = move-exception;
        e2 = e;
        r72 = null;
    L38:
        th = move-exception;
        th2 = th;
        r72 = null;
        goto L40
    }

    @TargetApi(19)
    private static ArrayList<String> a(byte[] r5) {
        if (r5 != null) goto L6;
        HMSLog.e(f39552a, "manifest is null！");
        return null;
    L6:
        ArrayList<String> r1 = new ArrayList();
        ByteArrayInputStream r2 = new ByteArrayInputStream(r5);     // Catch: IOException -> L34
        BufferedReader r52 = new BufferedReader(new InputStreamReader(r2, StandardCharsets.UTF_8));     // Catch: Throwable -> L14
        if (a(r52, r1) == true) goto L16;
        r52.close();     // Catch: Throwable -> L14
        r2.close();     // Catch: IOException -> L34
        return null;
    L16:
        r52.close();     // Catch: Throwable -> L14
        r2.close();     // Catch: IOException -> L34
        return r1;
    L19:
        th = move-exception;
        throw th;     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        r52.close();     // Catch: Throwable -> L24
    L26:
        throw th;     // Catch: Throwable -> L14
    L24:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        throw th;     // Catch: Throwable -> L28
    L28:
        th = move-exception;
        r2.close();     // Catch: Throwable -> L31
    L33:
        throw th;     // Catch: IOException -> L34
    L31:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L34
    L34:
        HMSLog.e(f39552a, "getManifestLinesArrary IOException!");
        return null;
    }

    private static boolean b() {
    L7:
        e = move-exception;
        HMSLog.i(f39552a, "verifyMDMSignatureV2 MDM verify Exception!:" + e.getMessage());
    L12:
        return false;
    L4:
        if (a(Base64.decode(EMUI10_PK, 0), a(f39557g, "SHA-256"), b(d), "SHA256withRSA") == false) goto L9;
        HMSLog.i(f39552a, "verifyMDMSignatureV2 verify successful!");     // Catch: Exception -> L7
        return true;
    L9:
        HMSLog.i(f39552a, "verifyMDMSignatureV2 verify failure!");     // Catch: Exception -> L7
        goto L12
    }

    private static byte[] b(String r7) {
        int r1 = 0;
        if (TextUtils.isEmpty(r7) == true) goto L5;
        int r02 = r7.length();
        if ((r02 % 2) != 0) goto L9;
        int r2 = r02 / 2;
    L10:
        byte[] r22 = new byte[r2];
    L11:
        if (r1 >= r02) goto L17;
        int r3 = r1 + 1;
        if (r3 >= r02) goto L15;
        r22[r1 / 2] = (byte) ((Character.digit(r7.charAt(r1), 16) << 4) + Character.digit(r7.charAt(r3), 16));
    L16:
        r1 = r1 + 2;
        goto L11
    L15:
        r22[r1 / 2] = (byte) (Character.digit(r7.charAt(r1), 16) << 4);
        goto L16
    L17:
        return r22;
    L9:
        r2 = (r02 / 2) + 1;
        goto L10
    L5:
        return new byte[0];
    }

    @TargetApi(19)
    private static byte[] a(ArrayList<String> r7) {
        ByteArrayOutputStream r02 = new ByteArrayOutputStream();
        BufferedWriter r1 = new BufferedWriter(new OutputStreamWriter(r02, StandardCharsets.UTF_8));
        Collections.sort(r7);     // Catch: Throwable -> L8 Exception -> L10
        int r2 = r7.size();     // Catch: Throwable -> L8 Exception -> L10
        int r4 = 0;
    L4:
        if (r4 >= r2) goto L12;
        String r5 = r7.get(r4);     // Catch: Throwable -> L8 Exception -> L10
        r1.write(r5, 0, r5.length());     // Catch: Throwable -> L8 Exception -> L10
        r1.write("\r\n", 0, 2);     // Catch: Throwable -> L8 Exception -> L10
        r4 = r4 + 1;     // Catch: Throwable -> L8 Exception -> L10
        goto L4
    L12:
        r1.flush();     // Catch: Throwable -> L8 Exception -> L10
    L15:
        IOUtils.closeQuietly(r02);
        IOUtils.closeQuietly(r1);
        return r02.toByteArray();
    L8:
        th = move-exception;
        IOUtils.closeQuietly(r02);
        IOUtils.closeQuietly(r1);
        throw th;
    L10:
        e = move-exception;
        HMSLog.i(f39552a, "getManifestBytesbySorted Exception!" + e.getMessage());     // Catch: Throwable -> L8
        goto L15
    }

    private static boolean a(BufferedReader r4, ArrayList<String> r5) throws IOException {
        String r02 = a(r4);
        boolean r1 = false;
    L3:
        if (r02 == null) goto L18;
        if (r02.equals("Name: META-INF/HUAWEI.CER") == false) goto L15;
        String r12 = a(r4);
    L8:
        if (r12 == null) goto L12;
        if (r12.startsWith("Name:") == true) goto L11;
        r12 = a(r4);
        goto L8
    L11:
        r02 = r12;
    L12:
        r1 = true;
    L15:
        if (r02.length() == 0) goto L17;
        r5.add(r02);
    L17:
        r02 = a(r4);
        goto L3
    L18:
        return r1;
    }

    private static String a(BufferedReader r6) throws IOException {
        if (r6 != null) goto L5;
        return null;
    L5:
        int r1 = r6.read();
        if (r1 != (-1)) goto L8;
        return null;
    L8:
        StringBuilder r02 = new StringBuilder(10);
    L9:
        if (r1 == (-1)) goto L18;
        char r12 = (char) r1;
        if (r12 == '\n') goto L18;
        if (r02.length() >= 4096) goto L17;
        r02.append(r12);
        r1 = r6.read();
        goto L9
    L17:
        throw new IOException("cert line is too long!");
    L18:
        String r62 = r02.toString();
        if (r62.isEmpty() == false) goto L21;
        return r62;
    L21:
        if (r62.endsWith("\r") == true) goto L23;
        return r62;
    L23:
        return r62.substring(0, r62.length() - 1);
    }

    private static boolean a() {
    L8:
        e = move-exception;
        HMSLog.i(f39552a, "verifyMDMSignatureV1 MDM verify Exception!:" + e.getMessage());
        return false;
    L3:
        if (a(b("30820122300d06092a864886f70d01010105000382010f003082010a0282010100a3d269348ac59923f65e8111c337605e29a1d1bc54fa96c1445050dd14d8d63b10f9f0230bb87ef348183660bedcabfdec045e235ed96935799fcdb4af5c97717ff3b0954eaf1b723225b3a00f81cbd67ce6dc5a4c07f7741ad3bf1913a480c6e267ab1740f409edd2dc33c8b718a8e30e56d9a93f321723c1d0c9ea62115f996812ceef186954595e39a19b74245542c407f7dddb1d12e6eedcfc0bd7cd945ef7255ad0fc9e796258e0fb5e52a23013d15033a32b4071b65f3f924ae5c5761e22327b4d2ae60f4158a5eb15565ba079de29b81540f5fbb3be101a95357f367fc661d797074ff3826950029c52223e4594673a24a334cae62d63b838ba3df9770203010001"), a(f39557g, "SHA-256"), b(f39554c), "SHA256withRSA") == false) goto L6;
        HMSLog.i(f39552a, "verifyMDMSignatureV1 verify successful!");     // Catch: Exception -> L8
        return true;
    L6:
        HMSLog.i(f39552a, "verifyMDMSignatureV1 verify failure!");     // Catch: Exception -> L8
        return false;
    }

    private static boolean a(byte[] r2, byte[] r3, byte[] r4, String r5) throws Exception {
        Signature r52 = Signature.getInstance(r5);
        r52.initVerify(KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(r2)));
        r52.update(r3);
        return r52.verify(r4);
    }

    @TargetApi(19)
    private static byte[] a(String r1, String r2) throws Exception {
        MessageDigest r22 = MessageDigest.getInstance(r2);
        r22.update(r1.getBytes(StandardCharsets.UTF_8.name()));
        return r22.digest();
    }

    private static String a(String r2) {
        if (r2 != null) goto L5;
        return "";
    L5:
        return f39553b.matcher(r2).replaceAll("");
    }
}
