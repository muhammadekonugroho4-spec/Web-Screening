package com.huawei.hms.framework.common;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes6.dex */
public class AssetsUtil {
    private static final ExecutorService EXECUTOR_SERVICE = null;
    private static final int GET_SP_TIMEOUT = 5;
    private static final String TAG = "AssetsUtil";
    private static final String THREAD_NAME = "AssetsUtil_Operate";

    static {
        EXECUTOR_SERVICE = ExecutorsUtils.newSingleThreadExecutor(THREAD_NAME);
    }

    public AssetsUtil() {
    }

    public static String[] list(final Context r5, final String r6) {
        if (r5 != null) goto L6;
        Logger.w(TAG, "context is null");
        return new String[0];
    L6:
        FutureTask r2 = new FutureTask(new AnonymousClass1(r5, r6));
        EXECUTOR_SERVICE.execute(r2);
        String[] r62 = (String[]) r2.get(5, TimeUnit.SECONDS);     // Catch: Throwable -> L10 ExecutionException -> L12 InterruptedException -> L14 Exception -> L16 TimeoutException -> L19
        r2.cancel(true);
        return r62;
    L10:
        th = move-exception;
        r2.cancel(true);
        throw th;
    L19:
        Logger.w(TAG, "get local config files from sp task timed out");     // Catch: Throwable -> L10
        String[] r63 = new String[0];     // Catch: Throwable -> L10
        r2.cancel(true);
        return r63;
    L16:
        Logger.w(TAG, "get local config files from sp task occur unknown Exception");     // Catch: Throwable -> L10
        String[] r64 = new String[0];     // Catch: Throwable -> L10
        r2.cancel(true);
        return r64;
    L14:
        e = move-exception;
        Logger.w(TAG, "get local config files from sp task interrupted", e);     // Catch: Throwable -> L10
        String[] r65 = new String[0];     // Catch: Throwable -> L10
        r2.cancel(true);
        return r65;
    L12:
        e = move-exception;
        Logger.w(TAG, "get local config files from sp task failed", e);     // Catch: Throwable -> L10
        String[] r66 = new String[0];     // Catch: Throwable -> L10
        r2.cancel(true);
        return r66;
    }

    public static InputStream open(Context r2, String r3) throws IOException {
        if (r2 != null) goto L12;
        Logger.w(TAG, "context is null");
        return null;
    L12:
        return r2.getAssets().open(r3);
    L9:
        e = move-exception;
        Logger.e(TAG, "AssetManager has been destroyed", e);
        return null;
    }
}
