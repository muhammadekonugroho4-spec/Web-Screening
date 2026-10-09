package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Comparator;

/* loaded from: classes5.dex */
final class zzn implements Comparator<ActivityTransition> {
    public zzn() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(ActivityTransition r5, ActivityTransition r6) {
        ActivityTransition r52 = r5;
        ActivityTransition r62 = r6;
        Preconditions.checkNotNull(r52);
        Preconditions.checkNotNull(r62);
        int r02 = r52.getActivityType();
        int r1 = r62.getActivityType();
        if (r02 == r1) goto L7;
        if (r02 < r1) goto L6;
        return 1;
    L6:
        return -1;
    L7:
        int r53 = r52.getTransitionType();
        int r63 = r62.getTransitionType();
        if (r53 != r63) goto L11;
        return 0;
    L11:
        if (r53 >= r63) goto L13;
        return -1;
    L13:
        return 1;
    }
}
