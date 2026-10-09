package androidx.privacysandbox.ads.adservices.internal;

import android.os.Build;
import androidx.activity.result.contract.f;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f27105a = null;

    /* renamed from: androidx.privacysandbox.ads.adservices.internal.a$a, reason: collision with other inner class name */
    public static final class C0235a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0235a f27106a = null;

        static {
            f27106a = new C0235a();
        }

        public C0235a() {
        }

        public final int a() {
            return f.a(1000000);
        }
    }

    static {
        f27105a = new a();
    }

    public a() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 30) goto L5;
        return 0;
    L5:
        return C0235a.f27106a.a();
    }
}
