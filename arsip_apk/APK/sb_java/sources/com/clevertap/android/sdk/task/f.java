package com.clevertap.android.sdk.task;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class f extends e {

    /* renamed from: b, reason: collision with root package name */
    public final j f34906b;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f34907a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f34908b;

        public a(f r1, Object r2) {
            this.f34908b = r1;
            this.f34907a = r2;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.b(this.f34908b).a(this.f34907a);
        }
    }

    public f(Executor r1, j r2) {
        super(r1);
        this.f34906b = r2;
    }

    public static /* synthetic */ j b(f r02) {
        return r02.f34906b;
    }

    @Override // com.clevertap.android.sdk.task.e
    public void a(Object r3) {
        this.f34905a.execute(new a(this, r3));
    }
}
