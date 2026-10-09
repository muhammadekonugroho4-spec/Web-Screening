package androidx.credentials.provider;

import android.content.pm.SigningInfo;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* loaded from: classes4.dex */
public final class l {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f23523a;

    /* renamed from: b, reason: collision with root package name */
    public final SigningInfo f23524b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23525c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public l(String r2, SigningInfo r3, String r4) {
        kotlin.jvm.internal.p.l(r2, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        kotlin.jvm.internal.p.l(r3, "signingInfo");
        this.f23523a = r2;
        this.f23524b = r3;
        this.f23525c = r4;
        if (r2.length() <= 0) goto L6;
        return;
    L6:
        throw new IllegalArgumentException("packageName must not be empty");
    }
}
