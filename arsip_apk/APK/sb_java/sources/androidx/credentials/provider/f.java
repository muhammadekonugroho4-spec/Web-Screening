package androidx.credentials.provider;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;

/* loaded from: classes4.dex */
public abstract class f {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f23511a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23512b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f23513c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final f a(String r2, String r3, Bundle r4) {
            kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
            kotlin.jvm.internal.p.l(r3, "type");
            kotlin.jvm.internal.p.l(r4, "candidateQueryData");
            if (kotlin.jvm.internal.p.g(r3, "android.credentials.TYPE_PASSWORD_CREDENTIAL") == false) goto L7;
            return j.f23518f.a(r4, r2);
        L7:
            if (kotlin.jvm.internal.p.g(r3, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL") == false) goto L11;
            return k.f23520g.a(r4, r2);
        L11:
            return new i(r2, r3, r4);
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public f(String r2, String r3, Bundle r4) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, "type");
        kotlin.jvm.internal.p.l(r4, "candidateQueryData");
        this.f23511a = r2;
        this.f23512b = r3;
        this.f23513c = r4;
    }
}
