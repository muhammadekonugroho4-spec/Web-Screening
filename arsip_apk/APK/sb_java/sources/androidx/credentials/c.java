package androidx.credentials;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public class c extends a {
    public c(String r2, Bundle r3) {
        p.l(r2, "type");
        p.l(r3, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        super(r2, r3);
        if (r2.length() <= 0) goto L6;
        return;
    L6:
        throw new IllegalArgumentException("type should not be empty");
    }
}
