package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.crashlytics.internal.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/* loaded from: classes6.dex */
public class CommonUtils {
    static final String BUILD_IDS_ARCH_RESOURCE_NAME = "com.google.firebase.crashlytics.build_ids_arch";
    static final String BUILD_IDS_BUILD_ID_RESOURCE_NAME = "com.google.firebase.crashlytics.build_ids_build_id";
    static final String BUILD_IDS_LIB_NAMES_RESOURCE_NAME = "com.google.firebase.crashlytics.build_ids_lib";
    public static final int DEVICE_STATE_BETAOS = 8;
    public static final int DEVICE_STATE_COMPROMISEDLIBRARIES = 32;
    public static final int DEVICE_STATE_DEBUGGERATTACHED = 4;
    public static final int DEVICE_STATE_ISSIMULATOR = 1;
    public static final int DEVICE_STATE_JAILBROKEN = 2;
    public static final int DEVICE_STATE_VENDORINTERNAL = 16;
    private static final String GOLDFISH = "goldfish";
    private static final char[] HEX_VALUES = null;
    static final String LEGACY_MAPPING_FILE_ID_RESOURCE_NAME = "com.crashlytics.android.build_id";
    public static final String LEGACY_SHARED_PREFS_NAME = "com.crashlytics.prefs";
    static final String MAPPING_FILE_ID_RESOURCE_NAME = "com.google.firebase.crashlytics.mapping_file_id";
    private static final String RANCHU = "ranchu";
    private static final String SDK = "sdk";
    private static final String SHA1_INSTANCE = "SHA-1";
    public static final String SHARED_PREFS_NAME = "com.google.firebase.crashlytics";

    public enum Architecture extends Enum<Architecture> {
        private static final /* synthetic */ Architecture[] $VALUES = null;
        public static final Architecture ARM64 = null;
        public static final Architecture ARMV6 = null;
        public static final Architecture ARMV7 = null;
        public static final Architecture ARMV7S = null;
        public static final Architecture ARM_UNKNOWN = null;
        public static final Architecture PPC = null;
        public static final Architecture PPC64 = null;
        public static final Architecture UNKNOWN = null;
        public static final Architecture X86_32 = null;
        public static final Architecture X86_64 = null;
        private static final Map<String, Architecture> matcher = null;

        private static /* synthetic */ Architecture[] $values() {
            return new Architecture[]{X86_32, X86_64, ARM_UNKNOWN, PPC, PPC64, ARMV6, ARMV7, UNKNOWN, ARMV7S, ARM64};
        }

        static {
            Architecture r02 = new Architecture("X86_32", 0);
            X86_32 = r02;
            X86_64 = new Architecture("X86_64", 1);
            ARM_UNKNOWN = new Architecture("ARM_UNKNOWN", 2);
            PPC = new Architecture("PPC", 3);
            PPC64 = new Architecture("PPC64", 4);
            Architecture r1 = new Architecture("ARMV6", 5);
            ARMV6 = r1;
            Architecture r2 = new Architecture("ARMV7", 6);
            ARMV7 = r2;
            UNKNOWN = new Architecture(GrsBaseInfo.CountryCodeSource.UNKNOWN, 7);
            ARMV7S = new Architecture("ARMV7S", 8);
            Architecture r4 = new Architecture("ARM64", 9);
            ARM64 = r4;
            $VALUES = $values();
            HashMap r5 = new HashMap(4);
            matcher = r5;
            r5.put("armeabi-v7a", r2);
            r5.put("armeabi", r1);
            r5.put("arm64-v8a", r4);
            r5.put("x86", r02);
        }

        Architecture(String r1, int r2) {
        }

        public static Architecture getValue() {
            String r02 = Build.CPU_ABI;
            if (TextUtils.isEmpty(r02) == false) goto L6;
            Logger.getLogger().v("Architecture#getValue()::Build.CPU_ABI returned null or empty");
            return UNKNOWN;
        L6:
            String r03 = r02.toLowerCase(Locale.US);
            Architecture r04 = matcher.get(r03);
            if (r04 == null) goto L9;
            return r04;
        L9:
            return UNKNOWN;
        }

        public static Architecture valueOf(String r1) {
            return (Architecture) Enum.valueOf(Architecture.class, r1);
        }

        public static Architecture[] values() {
            return (Architecture[]) $VALUES.clone();
        }
    }

    static {
        HEX_VALUES = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};
    }

    public CommonUtils() {
    }

    public static long calculateFreeRamInBytes(Context r2) {
        ActivityManager.MemoryInfo r02 = new ActivityManager.MemoryInfo();
        ((ActivityManager) r2.getSystemService("activity")).getMemoryInfo(r02);
        return r02.availMem;
    }

    public static synchronized long calculateTotalRamInBytes(Context r3) {
        monitor-enter(CommonUtils.class);
        ActivityManager.MemoryInfo r1 = new ActivityManager.MemoryInfo();     // Catch: Throwable -> L7
        ((ActivityManager) r3.getSystemService("activity")).getMemoryInfo(r1);     // Catch: Throwable -> L7
        long r12 = r1.totalMem;     // Catch: Throwable -> L7
        monitor-exit(CommonUtils.class);
        return r12;
    L7:
        th = move-exception;
        throw th;
    }

    public static long calculateUsedDiskSpaceInBytes(String r7) {
        long r1 = new StatFs(r7).getBlockSize();
        return (r0.getBlockCount() * r1) - (r1 * r0.getAvailableBlocks());
    }

    @SuppressLint({"MissingPermission"})
    public static boolean canTryConnection(Context r2) {
        if (checkPermission(r2, "android.permission.ACCESS_NETWORK_STATE") == false) goto L11;
        NetworkInfo r22 = ((ConnectivityManager) r2.getSystemService("connectivity")).getActiveNetworkInfo();
        if (r22 != null) goto L7;
        return false;
    L7:
        if (r22.isConnectedOrConnecting() == false) goto L12;
        return true;
    L12:
        return false;
    L11:
        return true;
    }

    public static boolean checkPermission(Context r02, String r1) {
        if (r02.checkCallingOrSelfPermission(r1) != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static void closeOrLog(Closeable r1, String r2) {
        if (r1 == null) goto L10;
        r1.close();     // Catch: IOException -> L5
        return;
    L5:
        e = move-exception;
        Logger.getLogger().e(r2, e);
        return;
    }

    public static void closeQuietly(Closeable r02) {
        if (r02 != null) goto L9;
        return;
    L9:
        r02.close();     // Catch: RuntimeException -> L5 Exception -> L8
        return;
    L5:
        e = move-exception;
        throw e;
    }

    public static String createInstanceIdFrom(String... r7) {
        if (r7 != null) goto L5;
    L21:
        return null;
    L5:
        if (r7.length == 0) goto L21;
        ArrayList r1 = new ArrayList();
        int r2 = r7.length;
        int r3 = 0;
    L8:
        if (r3 >= r2) goto L13;
        String r4 = r7[r3];
        if (r4 == null) goto L12;
        r1.add(r4.replace("-", "").toLowerCase(Locale.US));
    L12:
        r3 = r3 + 1;
        goto L8
    L13:
        Collections.sort(r1);
        StringBuilder r72 = new StringBuilder();
        Iterator r12 = r1.iterator();
    L15:
        if (r12.hasNext() == false) goto L17;
        r72.append((String) r12.next());
        goto L15
    L17:
        String r73 = r72.toString();
        if (r73.length() <= 0) goto L21;
        return sha1(r73);
    }

    public static boolean getBooleanResourceValue(Context r2, String r3, boolean r4) {
        if (r2 == null) goto L13;
        Resources r02 = r2.getResources();
        if (r02 == null) goto L13;
        int r1 = getResourcesIdentifier(r2, r3, "bool");
        if (r1 > 0) goto L8;
        int r32 = getResourcesIdentifier(r2, r3, "string");
        if (r32 <= 0) goto L13;
        return Boolean.parseBoolean(r2.getString(r32));
    L8:
        return r02.getBoolean(r1);
    L13:
        return r4;
    }

    public static List<BuildIdInfo> getBuildIdInfo(Context r8) {
        ArrayList r02 = new ArrayList();
        int r1 = getResourcesIdentifier(r8, BUILD_IDS_LIB_NAMES_RESOURCE_NAME, "array");
        int r3 = getResourcesIdentifier(r8, BUILD_IDS_ARCH_RESOURCE_NAME, "array");
        int r2 = getResourcesIdentifier(r8, BUILD_IDS_BUILD_ID_RESOURCE_NAME, "array");
        if (r1 == 0) goto L19;
        if (r3 == 0) goto L19;
        if (r2 == 0) goto L19;
        String[] r12 = r8.getResources().getStringArray(r1);
        String[] r32 = r8.getResources().getStringArray(r3);
        String[] r82 = r8.getResources().getStringArray(r2);
        if (r12.length == r82.length) goto L10;
    L17:
        Logger.getLogger().d(String.format("Lengths did not match: %d %d %d", new Object[]{Integer.valueOf(r12.length), Integer.valueOf(r32.length), Integer.valueOf(r82.length)}));
        return r02;
    L10:
        if (r32.length != r82.length) goto L17;
        int r22 = 0;
    L14:
        if (r22 >= r82.length) goto L16;
        r02.add(new BuildIdInfo(r12[r22], r32[r22], r82[r22]));
        r22 = r22 + 1;
        goto L14
    L16:
        return r02;
    L19:
        Logger.getLogger().d(String.format("Could not find resources: %d %d %d", new Object[]{Integer.valueOf(r1), Integer.valueOf(r3), Integer.valueOf(r2)}));
        return r02;
    }

    public static int getCpuArchitectureInt() {
        return Architecture.getValue().ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int getDeviceState() {
        boolean r02 = isEmulator();
        ?? r03 = r02;
        if (isRooted() == false) goto L6;
        r03 = (r02 ? 1 : 0) | 2;
    L6:
        if (isDebuggerAttached() == true) goto L8;
        return r03;
    L8:
        return r03 | 4;
    }

    public static SharedPreferences getLegacySharedPrefs(Context r2) {
        return r2.getSharedPreferences(LEGACY_SHARED_PREFS_NAME, 0);
    }

    public static String getMappingFileId(Context r2) {
        int r02 = getResourcesIdentifier(r2, MAPPING_FILE_ID_RESOURCE_NAME, "string");
        if (r02 != 0) goto L5;
        r02 = getResourcesIdentifier(r2, LEGACY_MAPPING_FILE_ID_RESOURCE_NAME, "string");
    L5:
        if (r02 != 0) goto L7;
        return null;
    L7:
        return r2.getResources().getString(r02);
    }

    public static boolean getProximitySensorEnabled(Context r2) {
        if (isEmulator() == false) goto L6;
        return false;
    L6:
        if (((SensorManager) r2.getSystemService("sensor")).getDefaultSensor(8) == null) goto L9;
        return true;
    L9:
        return false;
    }

    public static String getResourcePackageName(Context r2) {
        int r02 = r2.getApplicationContext().getApplicationInfo().icon;
        if (r02 <= 0) goto L12;
        String r03 = r2.getResources().getResourcePackageName(r02);     // Catch: Resources.NotFoundException -> L9
        if (Constants.KEY_ANDROID.equals(r03) == false) goto L8;
        return r2.getPackageName();
    L8:
        return r03;
    L10:
        return r2.getPackageName();
    L12:
        return r2.getPackageName();
    }

    public static int getResourcesIdentifier(Context r1, String r2, String r3) {
        return r1.getResources().getIdentifier(r2, r3, getResourcePackageName(r1));
    }

    public static SharedPreferences getSharedPrefs(Context r2) {
        return r2.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    private static String hash(String r02, String r1) {
        return hash(r02.getBytes(), r1);
    }

    public static String hexify(byte[] r6) {
        char[] r02 = new char[r6.length * 2];
        int r1 = 0;
    L4:
        if (r1 >= r6.length) goto L7;
        byte r2 = r6[r1];
        int r3 = r2 & UnsignedBytes.MAX_VALUE;
        int r4 = r1 * 2;
        char[] r5 = HEX_VALUES;
        r02[r4] = r5[r3 >>> 4];
        r02[r4 + 1] = r5[r2 & Ascii.SI];
        r1 = r1 + 1;
        goto L4
    L7:
        return new String(r02);
    }

    public static boolean isAppDebuggable(Context r02) {
        if ((r02.getApplicationInfo().flags & 2) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean isDebuggerAttached() {
        if (Debug.isDebuggerConnected() == false) goto L5;
        return true;
    L5:
        if (Debug.waitingForDebugger() == true) goto L11;
        return false;
    L11:
        return true;
    }

    public static boolean isEmulator() {
        if (Build.PRODUCT.contains(SDK) == true) goto L11;
        String r02 = Build.HARDWARE;
        if (r02.contains(GOLDFISH) == false) goto L7;
        return true;
    L7:
        if (r02.contains(RANCHU) == true) goto L14;
        return false;
    L14:
        return true;
    L11:
        return true;
    }

    @Deprecated
    public static boolean isLoggingEnabled(Context r02) {
        return false;
    }

    public static boolean isRooted() {
        boolean r02 = isEmulator();
        String r1 = Build.TAGS;
        if (r02 == true) goto L9;
        if (r1 == null) goto L9;
        if (r1.contains("test-keys") == false) goto L9;
        return true;
    L9:
        if (new File("/system/app/Superuser.apk").exists() == false) goto L11;
        return true;
    L11:
        File r12 = new File("/system/xbin/su");
        if (r02 == false) goto L14;
        return false;
    L14:
        if (r12.exists() == false) goto L18;
        return true;
    L18:
        return false;
    }

    public static boolean nullSafeEquals(String r02, String r1) {
        if (r02 != null) goto L9;
        if (r1 != null) goto L6;
        return true;
    L6:
        return false;
    L9:
        return r02.equals(r1);
    }

    public static String padWithZerosToMaxIntWidth(int r2) {
        if (r2 < 0) goto L6;
        return String.format(Locale.US, "%1$10s", new Object[]{Integer.valueOf(r2)}).replace(' ', '0');
    L6:
        throw new IllegalArgumentException("value must be zero or greater");
    }

    public static String sha1(String r1) {
        return hash(r1, SHA1_INSTANCE);
    }

    public static String streamToString(InputStream r1) {
        Scanner r12 = new Scanner(r1).useDelimiter("\\A");
        if (r12.hasNext() == true) goto L5;
        return "";
    L5:
        return r12.next();
    }

    private static String hash(byte[] r3, String r4) {
        MessageDigest r42 = MessageDigest.getInstance(r4);     // Catch: NoSuchAlgorithmException -> L5
        r42.update(r3);
        return hexify(r42.digest());
    L5:
        e = move-exception;
        Logger.getLogger().e("Could not create hashing algorithm: " + r4 + ", returning empty string.", e);
        return "";
    }
}
