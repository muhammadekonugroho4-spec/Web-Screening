package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.net.NetworkRequest;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class j {
    public static final void a(JobInfo.Builder r1, NetworkRequest r2) {
        p.l(r1, "builder");
        h.a(r1, r2);
    }
}
