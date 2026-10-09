package com.huawei.hms.hatool;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.iab.digitalidentity.sdk.core.model.GoPayPlusCameraConfigKt;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class g1 extends o {

    /* renamed from: g, reason: collision with root package name */
    private String f39308g;

    public g1() {
        this.f39308g = "";
    }

    @Override // com.huawei.hms.hatool.s
    public JSONObject a() {
        JSONObject r02 = new JSONObject();
        r02.put("protocol_version", GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A);
        r02.put("compress_mode", GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A);
        r02.put("serviceid", this.d);
        r02.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, this.f39393a);
        r02.put("hmac", this.f39308g);
        r02.put("chifer", this.f39397f);
        r02.put("timestamp", this.f39394b);
        r02.put("servicetag", this.f39395c);
        r02.put("requestid", this.f39396e);
        return r02;
    }

    public void g(String r1) {
        this.f39308g = r1;
    }
}
