package com.huawei.hms.hatool;

import org.json.JSONObject;

/* loaded from: classes6.dex */
public class f1 extends n {

    /* renamed from: b, reason: collision with root package name */
    private String f39297b;

    /* renamed from: c, reason: collision with root package name */
    private String f39298c;
    private String d;

    /* renamed from: e, reason: collision with root package name */
    private String f39299e;

    /* renamed from: f, reason: collision with root package name */
    protected String f39300f;

    /* renamed from: g, reason: collision with root package name */
    private String f39301g;

    public f1() {
        this.f39297b = "";
        this.f39298c = "";
        this.d = "";
        this.f39299e = "";
        this.f39300f = "";
    }

    @Override // com.huawei.hms.hatool.s
    public JSONObject a() {
        JSONObject r02 = new JSONObject();
        r02.put("androidid", this.f39387a);
        r02.put("oaid", this.f39301g);
        r02.put("uuid", this.f39300f);
        r02.put("upid", this.f39299e);
        r02.put("imei", this.f39297b);
        r02.put("sn", this.f39298c);
        r02.put("udid", this.d);
        return r02;
    }

    public void b(String r1) {
        this.f39297b = r1;
    }

    public void c(String r1) {
        this.f39301g = r1;
    }

    public void d(String r1) {
        this.f39298c = r1;
    }

    public void e(String r1) {
        this.d = r1;
    }

    public void f(String r1) {
        this.f39299e = r1;
    }

    public void g(String r1) {
        this.f39300f = r1;
    }
}
