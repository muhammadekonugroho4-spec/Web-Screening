package io.sentry;

import com.google.firebase.perf.FirebasePerformance;

/* loaded from: classes3.dex */
public enum ProfileLifecycle extends Enum<ProfileLifecycle> {
    private static final /* synthetic */ ProfileLifecycle[] $VALUES = null;
    public static final ProfileLifecycle MANUAL = null;
    public static final ProfileLifecycle TRACE = null;

    private static /* synthetic */ ProfileLifecycle[] $values() {
        return new ProfileLifecycle[]{MANUAL, TRACE};
    }

    static {
        MANUAL = new ProfileLifecycle("MANUAL", 0);
        TRACE = new ProfileLifecycle(FirebasePerformance.HttpMethod.TRACE, 1);
        $VALUES = $values();
    }

    ProfileLifecycle(String r1, int r2) {
    }

    public static ProfileLifecycle valueOf(String r1) {
        return (ProfileLifecycle) Enum.valueOf(ProfileLifecycle.class, r1);
    }

    public static ProfileLifecycle[] values() {
        return (ProfileLifecycle[]) $VALUES.clone();
    }
}
