package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.IllegalFormatException;
import org.json.JSONException;

/* loaded from: classes6.dex */
public class Logger {
    private static final boolean DEBUG = false;
    private static final int MAX_STACK_DEEP_LENGTH = 20;
    private static final int MAX_STACK_DEEP_LENGTH_NORMAL = 8;
    private static final String SPLIT = "|";
    private static final String TAG = "NetworkKit_Logger";
    private static final String TAG_NETWORKKIT_PRE = "NetworkKit_";
    private static final String TAG_NETWORK_SDK_PRE = "NetworkSdk_";
    private static ExtLogger extLogger = null;
    private static boolean kitPrint = true;

    /* renamed from: com.huawei.hms.framework.common.Logger$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class ThrowableWrapper extends Throwable {
        private static final long serialVersionUID = 7129050843360571879L;
        private String message;
        private Throwable ownerThrowable;
        private Throwable thisCause;

        public /* synthetic */ ThrowableWrapper(Throwable r1, AnonymousClass1 r2) {
            this(r1);
        }

        public static /* synthetic */ void access$100(ThrowableWrapper r02, Throwable r1) {
            r02.setCause(r1);
        }

        private void setCause(Throwable r1) {
            this.thisCause = r1;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            Throwable r02 = this.thisCause;
            if (r02 != this) goto L6;
            return null;
        L6:
            return r02;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public void setMessage(String r1) {
            this.message = r1;
        }

        @Override // java.lang.Throwable
        public String toString() {
            Throwable r02 = this.ownerThrowable;
            if (r02 != null) goto L6;
            return "";
        L6:
            String r03 = r02.getClass().getName();
            if (this.message == null) goto L14;
            String r04 = r03 + ": ";
            if (this.message.startsWith(r04) == false) goto L13;
            return this.message;
        L13:
            return r04 + this.message;
        L14:
            return r03;
        }

        private ThrowableWrapper(Throwable r4) {
            this.ownerThrowable = r4;
            StackTraceElement[] r02 = r4.getStackTrace();
            if ((r4 instanceof IOException) == false) goto L5;
        L8:
            int r1 = 8;
        L10:
            if (r02.length <= r1) goto L12;
            setStackTrace((StackTraceElement[]) Arrays.copyOf(r02, r1));
        L13:
            setMessage(StringUtils.anonymizeMessage(r4.getMessage()));
            return;
        L12:
            setStackTrace(r02);
            goto L13
        L5:
            if ((r4 instanceof JSONException) == true) goto L8;
            r1 = 20;
            goto L10
        }
    }

    static {
    }

    public Logger() {
    }

    private static String complexAppTag(String r2) {
        return TAG_NETWORK_SDK_PRE + r2;
    }

    private static String complexMsg(String r1, int r2) {
        if (TextUtils.isEmpty(r1) == true) goto L7;
        return getCallMethodInfo(r2) + "|" + r1;
    L7:
        return getCallMethodInfo(r2);
    }

    private static String complexTag(String r2) {
        return TAG_NETWORKKIT_PRE + r2;
    }

    @SuppressLint({"LogTagMismatch"})
    public static void d(String r1, Object r2) {
        println(3, r1, r2);
    }

    public static void e(String r1, Object r2) {
        println(6, r1, r2);
    }

    private static void extLogPrintln(int r1, String r2, String r3) {
        if (r1 != 2) goto L5;
        extLogger.v(r2, r3);
        return;
    L5:
        if (r1 != 3) goto L7;
        extLogger.d(r2, r3);
        return;
    L7:
        if (r1 != 4) goto L9;
        extLogger.i(r2, r3);
        return;
    L9:
        if (r1 != 5) goto L11;
        extLogger.w(r2, r3);
        return;
    L11:
        if (r1 == 6) goto L13;
        return;
    L13:
        extLogger.e(r2, r3);
    }

    private static String getCallMethodInfo(int r3) {
        StackTraceElement[] r02 = Thread.currentThread().getStackTrace();
        if (r02.length <= r3) goto L6;
        StackTraceElement r32 = r02[r3];
        return Thread.currentThread().getName() + "|" + r32.getFileName() + "|" + r32.getClassName() + "|" + r32.getMethodName() + "|" + r32.getLineNumber();
    L6:
        return "";
    }

    private static Throwable getNewThrowable(Throwable r4) {
        if (isLoggable(3) == false) goto L5;
        return r4;
    L5:
        AnonymousClass1 r02 = null;
        if (r4 != null) goto L8;
        return null;
    L8:
        ThrowableWrapper r1 = new ThrowableWrapper(r4, r02);
        Throwable r42 = r4.getCause();
        ThrowableWrapper r2 = r1;
    L9:
        if (r42 == null) goto L11;
        ThrowableWrapper r3 = new ThrowableWrapper(r42, r02);
        ThrowableWrapper.access$100(r2, r3);
        r42 = r42.getCause();
        r2 = r3;
        goto L9
    L11:
        return r1;
    }

    @SuppressLint({"LogTagMismatch"})
    public static void i(String r1, Object r2) {
        println(4, r1, r2);
    }

    private static boolean isAPPLoggable(int r1) {
        if (extLogger != null) goto L5;
        return false;
    L5:
        if (r1 < 3) goto L10;
        return true;
    L10:
        return false;
    }

    private static boolean isKitLoggable(int r1) {
        if (kitPrint == true) goto L5;
        return false;
    L5:
        if (isLoggable(r1) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean isLoggable(int r1) {
        return Log.isLoggable(TAG_NETWORKKIT_PRE, r1);
    }

    private static int logPrintln(int r3, String r4, String r5) {
        if (isAPPLoggable(r3) == false) goto L6;
        extLogPrintln(r3, complexAppTag(r4), complexMsg(r5, 7));
    L6:
        if (isKitLoggable(r3) == true) goto L8;
        return 1;
    L8:
        return Log.println(r3, complexTag(r4), complexMsg(r5, 7));
    }

    public static void println(int r1, String r2, Object r3) {
        if (r1 >= 3) goto L5;
        return;
    L5:
        if (r3 != null) goto L7;
        String r32 = "null";
    L8:
        logPrintln(r1, r2, r32);
        return;
    L7:
        r32 = r3.toString();
        goto L8
    }

    public static void setExtLogger(ExtLogger r2, boolean r3) {
        extLogger = r2;
        kitPrint = r3;
        i(TAG, "logger = " + r2 + r3);
    }

    public static void v(String r1, String r2, Object... r3) {
        println(2, r1, r2, r3);
    }

    public static void w(String r1, Object r2) {
        println(5, r1, r2);
    }

    @SuppressLint({"LogTagMismatch"})
    public static void d(String r1, String r2, Object... r3) {
        println(3, r1, r2, r3);
    }

    public static void e(String r1, String r2, Object... r3) {
        println(6, r1, r2, r3);
    }

    @SuppressLint({"LogTagMismatch"})
    public static void i(String r1, String r2, Object... r3) {
        println(4, r1, r2, r3);
    }

    public static void println(int r1, String r2, String r3, Object... r4) {
        if (r1 >= 3) goto L6;
        return;
    L6:
        if (r3 != null) goto L14;
        Log.w(TAG, "format is null, not log");
        return;
    L14:
        logPrintln(r1, r2, StringUtils.format(r3, r4));     // Catch: IllegalFormatException -> L11
        return;
    L11:
        e = move-exception;
        w(TAG, "log format error" + r3, e);
    }

    public static void v(String r1, Object r2) {
        println(2, r1, r2);
    }

    public static void w(String r1, String r2, Object... r3) {
        println(5, r1, r2, r3);
    }

    public static void e(String r5, String r6, Throwable r7) {
        if (isAPPLoggable(6) == false) goto L6;
        extLogger.e(complexAppTag(r5), complexMsg(r6, 5), getNewThrowable(r7));
    L6:
        if (kitPrint == false) goto L9;
        Log.e(complexTag(r5), complexMsg(r6, 5), getNewThrowable(r7));
        return;
    }

    public static void w(String r5, String r6, Throwable r7) {
        if (isAPPLoggable(5) == false) goto L6;
        extLogger.w(complexAppTag(r5), complexMsg(r6, 5), getNewThrowable(r7));
    L6:
        if (kitPrint == false) goto L9;
        Log.w(complexTag(r5), complexMsg(r6, 5), getNewThrowable(r7));
        return;
    }
}
