package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.net.NetworkRequest;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class h {
    public static /* bridge */ /* synthetic */ JobInfo.Builder a(JobInfo.Builder r02, NetworkRequest r1) {
        return r02.setRequiredNetwork(r1);
    }
}
