package com.huawei.hms.hatool;

import android.os.Build;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class h1 extends p {

    /* renamed from: f, reason: collision with root package name */
    String f39309f;

    /* renamed from: g, reason: collision with root package name */
    String f39310g;

    /* renamed from: h, reason: collision with root package name */
    private String f39311h;

    public h1() {
    }

    @Override // com.huawei.hms.hatool.s
    public JSONObject a() {
        JSONObject r02 = new JSONObject();
        r02.put("_rom_ver", this.f39311h);
        r02.put("_emui_ver", this.f39398a);
        r02.put("_model", Build.MODEL);
        r02.put("_mcc", this.f39309f);
        r02.put("_mnc", this.f39310g);
        r02.put("_package_name", this.f39399b);
        r02.put("_app_ver", this.f39400c);
        r02.put("_lib_ver", "2.2.0.313");
        r02.put("_channel", this.d);
        r02.put("_lib_name", "hianalytics");
        r02.put("_oaid_tracking_flag", this.f39401e);
        return r02;
    }

    public void f(String r1) {
        this.f39309f = r1;
    }

    public void g(String r1) {
        this.f39310g = r1;
    }

    public void h(String r1) {
        this.f39311h = r1;
    }
}
