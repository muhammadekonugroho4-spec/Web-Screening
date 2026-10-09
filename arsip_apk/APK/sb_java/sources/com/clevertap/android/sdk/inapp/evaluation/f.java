package com.clevertap.android.sdk.inapp.evaluation;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.evaluation.LimitType;
import kotlin.jvm.internal.p;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final LimitType f34176a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34177b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34178c;

    public f(JSONObject r4) {
        p.l(r4, "limitJSON");
        LimitType.a r02 = LimitType.Companion;
        String r1 = r4.optString("type");
        p.k(r1, "optString(...)");
        this.f34176a = r02.a(r1);
        this.f34177b = r4.optInt(Constants.KEY_LIMIT);
        this.f34178c = r4.optInt(Constants.KEY_FREQUENCY);
    }

    public final int a() {
        return this.f34178c;
    }

    public final int b() {
        return this.f34177b;
    }

    public final LimitType c() {
        return this.f34176a;
    }
}
