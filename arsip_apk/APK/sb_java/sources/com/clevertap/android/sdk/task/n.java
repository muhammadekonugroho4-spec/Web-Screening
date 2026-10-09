package com.clevertap.android.sdk.task;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class n extends e {

    /* renamed from: b, reason: collision with root package name */
    public final k f34920b;

    public n(Executor r1, k r2) {
        super(r1);
        this.f34920b = r2;
    }

    public static /* synthetic */ void b(n r02, Object r1) {
        r02.f34920b.onSuccess(r1);
    }

    @Override // com.clevertap.android.sdk.task.e
    public void a(final Object r3) {
        this.f34905a.execute(new m(this, r3));
    }
}
