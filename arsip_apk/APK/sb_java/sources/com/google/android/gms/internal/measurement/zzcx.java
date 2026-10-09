package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.UserHandle;
import android.util.Log;
import com.google.common.base.Preconditions;
import java.lang.reflect.Method;

@TargetApi(24)
/* loaded from: classes5.dex */
public final class zzcx {
    private static final Method zza = null;
    private static final Method zzb = null;
    private final JobScheduler zzc;

    static {
        zza = zzc();
        zzb = zzb();
    }

    private zzcx(JobScheduler r1) {
        this.zzc = r1;
    }

    private static int zza() {
        Method r02 = zzb;
        if (r02 != null) goto L17;
    L16:
        return 0;
    L17:
        Integer r03 = (Integer) r02.invoke(UserHandle.class, null);     // Catch: Throwable -> L8 IllegalAccessException -> L10
        if (r03 == null) goto L12;
        return r03.intValue();
    L12:
        return 0;
    L8:
        e = move-exception;
        if (Log.isLoggable("JobSchedulerCompat", 6) == false) goto L16;
        Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
        goto L16
    }

    private static Method zzb() {
        return UserHandle.class.getDeclaredMethod("myUserId", null);
    L6:
        if (Log.isLoggable("JobSchedulerCompat", 6) == false) goto L8;
        Log.e("JobSchedulerCompat", "No myUserId method available");
    L8:
        return null;
    }

    private static Method zzc() {
        return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, String.class, Integer.TYPE, String.class});
    L6:
        if (Log.isLoggable("JobSchedulerCompat", 6) == false) goto L12;
        Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
        return null;
    L12:
        return null;
    }

    private final int zza(JobInfo r3, String r4, int r5, String r6) {
        Method r02 = zza;
        if (r02 == null) goto L16;
        Integer r42 = (Integer) r02.invoke(this.zzc, new Object[]{r3, r4, Integer.valueOf(r5), r6});     // Catch: Throwable -> L8 IllegalAccessException -> L10
        if (r42 == null) goto L12;
        return r42.intValue();
    L12:
        return 0;
    L8:
        e = move-exception;
        Log.e(r6, "error calling scheduleAsPackage", e);
    L16:
        return this.zzc.schedule(r3);
    }

    public static int zza(Context r2, JobInfo r3, String r4, String r5) {
        JobScheduler r02 = (JobScheduler) Preconditions.checkNotNull((JobScheduler) r2.getSystemService("jobscheduler"));
        if (zza == null) goto L10;
        if (r2.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) goto L10;
        return new zzcx(r02).zza(r3, r4, zza(), r5);
    L10:
        return r02.schedule(r3);
    }
}
