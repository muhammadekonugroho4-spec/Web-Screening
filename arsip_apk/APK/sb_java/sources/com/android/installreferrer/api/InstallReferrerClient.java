package com.android.installreferrer.api;

import android.content.Context;

/* loaded from: classes4.dex */
public abstract class InstallReferrerClient {

    public static /* synthetic */ class a {
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f31960a;

        public b(Context r1) {
            this.f31960a = r1;
        }

        public InstallReferrerClient a() {
            Context r02 = this.f31960a;
            if (r02 == null) goto L7;
            return new com.android.installreferrer.api.a(r02);
        L7:
            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        public /* synthetic */ b(Context r1, a r2) {
            this(r1);
        }
    }

    public InstallReferrerClient() {
    }

    public static b c(Context r2) {
        return new b(r2, null);
    }

    public abstract void a();

    public abstract ReferrerDetails b();

    public abstract void d(InstallReferrerStateListener r1);
}
