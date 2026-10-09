package com.clevertap.android.sdk.utils;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public interface e {

    /* renamed from: a, reason: collision with root package name */
    public static final b f34940a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final e f34941b = null;

    public static final class a implements e {
        public a() {
        }

        @Override // com.clevertap.android.sdk.utils.e
        public int a() {
            return (int) (currentTimeMillis() / 1000);
        }

        @Override // com.clevertap.android.sdk.utils.e
        public Date b() {
            return new Date();
        }

        @Override // com.clevertap.android.sdk.utils.e
        public long c() {
            return TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis());
        }

        @Override // com.clevertap.android.sdk.utils.e
        public long currentTimeMillis() {
            return System.currentTimeMillis();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f34942a = null;

        static {
            f34942a = new b();
        }

        public b() {
        }
    }

    static {
        f34940a = b.f34942a;
        f34941b = new a();
    }

    int a();

    Date b();

    long c();

    long currentTimeMillis();
}
