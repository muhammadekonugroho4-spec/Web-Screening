package androidx.legacy.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import com.clevertap.android.sdk.Constants;

@Deprecated
/* loaded from: classes4.dex */
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {
    private static final String EXTRA_WAKE_LOCK_ID = "androidx.contentpager.content.wakelockid";
    private static int mNextId;
    private static final SparseArray<PowerManager.WakeLock> sActiveWakeLocks = null;

    static {
        sActiveWakeLocks = new SparseArray();
        mNextId = 1;
    }

    public WakefulBroadcastReceiver() {
    }

    public static boolean completeWakefulIntent(Intent r5) {
        int r52 = r5.getIntExtra(EXTRA_WAKE_LOCK_ID, 0);
        if (r52 != 0) goto L5;
        return false;
    L5:
        SparseArray<PowerManager.WakeLock> r02 = sActiveWakeLocks;
        monitor-enter(r02);
        PowerManager.WakeLock r1 = r02.get(r52);     // Catch: Throwable -> L12
        if (r1 == null) goto L14;
        r1.release();     // Catch: Throwable -> L12
        r02.remove(r52);     // Catch: Throwable -> L12
        monitor-exit(r02);     // Catch: Throwable -> L12
        return true;
    L14:
        Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + r52);     // Catch: Throwable -> L12
        monitor-exit(r02);     // Catch: Throwable -> L12
        return true;
    L12:
        th = move-exception;
        throw th;
    }

    public static ComponentName startWakefulService(Context r5, Intent r6) {
        SparseArray<PowerManager.WakeLock> r02 = sActiveWakeLocks;
        monitor-enter(r02);
        int r1 = mNextId;     // Catch: Throwable -> L7
        int r2 = r1 + 1;     // Catch: Throwable -> L7
        mNextId = r2;     // Catch: Throwable -> L7
        if (r2 > 0) goto L9;
        mNextId = 1;     // Catch: Throwable -> L7
    L9:
        r6.putExtra(EXTRA_WAKE_LOCK_ID, r1);     // Catch: Throwable -> L7
        ComponentName r62 = r5.startService(r6);     // Catch: Throwable -> L7
        if (r62 == null) goto L12;
        PowerManager.WakeLock r52 = ((PowerManager) r5.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + r62.flattenToShortString());     // Catch: Throwable -> L7
        r52.setReferenceCounted(false);     // Catch: Throwable -> L7
        r52.acquire(Constants.ONE_MIN_IN_MILLIS);     // Catch: Throwable -> L7
        r02.put(r1, r52);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r62;
    L12:
        monitor-exit(r02);     // Catch: Throwable -> L7
        return null;
    L7:
        th = move-exception;
        throw th;
    }
}
