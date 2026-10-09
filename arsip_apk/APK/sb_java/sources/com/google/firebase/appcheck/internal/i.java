package com.google.firebase.appcheck.internal;

/* loaded from: classes6.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DefaultTokenRefresher f38482a;

    public /* synthetic */ i(DefaultTokenRefresher r1) {
        this.f38482a = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DefaultTokenRefresher.b(this.f38482a);
    }
}
