package androidx.credentials.provider;

import android.os.Bundle;

/* loaded from: classes4.dex */
public class c extends a {
    public c(String r2, Bundle r3, l r4) {
        kotlin.jvm.internal.p.l(r2, "type");
        kotlin.jvm.internal.p.l(r3, "candidateQueryData");
        super(r2, r3, r4);
        if (r2.length() <= 0) goto L6;
        return;
    L6:
        throw new IllegalArgumentException("type should not be empty");
    }
}
