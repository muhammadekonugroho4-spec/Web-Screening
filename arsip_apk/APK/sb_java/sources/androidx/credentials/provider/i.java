package androidx.credentials.provider;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;

/* loaded from: classes4.dex */
public class i extends f {

    /* renamed from: e, reason: collision with root package name */
    public static final a f23517e = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f23517e = new a(null);
    }

    public i(String r2, String r3, Bundle r4) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, "type");
        kotlin.jvm.internal.p.l(r4, "candidateQueryData");
        super(r2, r3, r4);
        if (r2.length() <= 0) goto L10;
        if (r3.length() <= 0) goto L8;
        return;
    L8:
        throw new IllegalArgumentException("type should not be empty");
    L10:
        throw new IllegalArgumentException("id should not be empty");
    }
}
