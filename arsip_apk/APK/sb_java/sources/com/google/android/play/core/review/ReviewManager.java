package com.google.android.play.core.review;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* loaded from: classes5.dex */
public interface ReviewManager {
    Task<Void> launchReviewFlow(Activity r1, ReviewInfo r2);

    Task<ReviewInfo> requestReviewFlow();
}
