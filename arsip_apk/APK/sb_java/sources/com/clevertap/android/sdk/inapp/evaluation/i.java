package com.clevertap.android.sdk.inapp.evaluation;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class i {
    public static final TriggerOperator a(JSONObject r1, String r2) {
        p.l(r2, Constants.KEY_KEY);
        if (r1 == null) goto L5;
        int r12 = r1.optInt(r2, TriggerOperator.Equals.getOperatorValue());
    L7:
        return TriggerOperator.Companion.a(r12);
    L5:
        r12 = TriggerOperator.Equals.getOperatorValue();
        goto L7
    }
}
