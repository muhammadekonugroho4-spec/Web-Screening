package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.WallTime;

@Module
/* loaded from: classes4.dex */
public abstract class SchedulingConfigModule {
    public SchedulingConfigModule() {
    }

    @Provides
    public static SchedulerConfig config(@WallTime Clock r02) {
        return SchedulerConfig.getDefault(r02);
    }
}
