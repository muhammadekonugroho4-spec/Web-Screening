package com.google.firebase.installations;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
final class AwaitListener implements OnCompleteListener<Void> {
    private final CountDownLatch latch;

    public AwaitListener() {
        this.latch = new CountDownLatch(1);
    }

    public boolean await(long r2, TimeUnit r4) throws InterruptedException {
        return this.latch.await(r2, r4);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task<Void> r1) {
        this.latch.countDown();
    }

    public void onSuccess() {
        this.latch.countDown();
    }
}
