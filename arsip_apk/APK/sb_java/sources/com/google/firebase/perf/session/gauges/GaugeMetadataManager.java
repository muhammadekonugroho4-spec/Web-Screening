package com.google.firebase.perf.session.gauges;

import android.app.ActivityManager;
import android.content.Context;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Utils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
class GaugeMetadataManager {
    private static final AndroidLogger logger = null;
    private final ActivityManager activityManager;
    private final Context appContext;
    private final ActivityManager.MemoryInfo memoryInfo;
    private final Runtime runtime;

    static {
        logger = AndroidLogger.getInstance();
    }

    public GaugeMetadataManager(Context r2) {
        this(Runtime.getRuntime(), r2);
    }

    public int getDeviceRamSizeKb() {
        return Utils.saturatedIntCast(StorageUnit.BYTES.toKilobytes(this.memoryInfo.totalMem));
    }

    public int getMaxAppJavaHeapMemoryKb() {
        return Utils.saturatedIntCast(StorageUnit.BYTES.toKilobytes(this.runtime.maxMemory()));
    }

    public int getMaxEncouragedAppJavaHeapMemoryKb() {
        return Utils.saturatedIntCast(StorageUnit.MEGABYTES.toKilobytes(this.activityManager.getMemoryClass()));
    }

    public int readTotalRAM(String r7) {
        BufferedReader r2 = new BufferedReader(new FileReader(r7));     // Catch: NumberFormatException -> L17 IOException -> L19
    L31:
        String r3 = r2.readLine();     // Catch: Throwable -> L12
        if (r3 == null) goto L21;
        if (r3.startsWith("MemTotal") == false) goto L31;
        Matcher r32 = Pattern.compile("\\d+").matcher(r3);     // Catch: Throwable -> L12
        if (r32.find() == false) goto L14;
        int r33 = Integer.parseInt(r32.group());     // Catch: Throwable -> L12
    L15:
        r2.close();     // Catch: NumberFormatException -> L17 IOException -> L19
        return r33;
    L14:
        r33 = 0;
        goto L15
    L21:
        r2.close();     // Catch: NumberFormatException -> L17 IOException -> L19
    L30:
        return 0;
    L12:
        th = move-exception;
        r2.close();     // Catch: Throwable -> L25
    L27:
        throw th;     // Catch: NumberFormatException -> L17 IOException -> L19
    L25:
        th = move-exception;
        th.addSuppressed(th);     // Catch: NumberFormatException -> L17 IOException -> L19
    L19:
        e = move-exception;
        logger.warn("Unable to read '" + r7 + "' file: " + e.getMessage());
    L17:
        e = move-exception;
        logger.warn("Unable to parse '" + r7 + "' file: " + e.getMessage());
        goto L30
    }

    public GaugeMetadataManager(Runtime r1, Context r2) {
        this.runtime = r1;
        this.appContext = r2;
        ActivityManager r12 = (ActivityManager) r2.getSystemService("activity");
        this.activityManager = r12;
        ActivityManager.MemoryInfo r22 = new ActivityManager.MemoryInfo();
        this.memoryInfo = r22;
        r12.getMemoryInfo(r22);
    }
}
