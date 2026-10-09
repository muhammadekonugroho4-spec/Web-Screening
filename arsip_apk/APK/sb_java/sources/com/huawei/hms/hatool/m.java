package com.huawei.hms.hatool;

/* loaded from: classes6.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private k f39380a;

    /* renamed from: b, reason: collision with root package name */
    private k f39381b;

    /* renamed from: c, reason: collision with root package name */
    private k f39382c;
    private k d;

    public m(String r1) {
    }

    public k a() {
        return this.f39382c;
    }

    public k b() {
        return this.f39380a;
    }

    public k c() {
        return this.f39381b;
    }

    public k d() {
        return this.d;
    }

    public k a(String r3) {
        if (r3.equals("oper") == false) goto L7;
        return c();
    L7:
        if (r3.equals("maint") == false) goto L11;
        return b();
    L11:
        if (r3.equals("diffprivacy") == false) goto L15;
        return a();
    L15:
        if (r3.equals("preins") == true) goto L17;
        z.f("hmsSdk", "HiAnalyticsInstData.getConfig(type): wrong type: " + r3);
        return null;
    L17:
        return d();
    }

    public void b(k r1) {
        this.f39381b = r1;
    }

    public void a(k r1) {
        this.f39380a = r1;
    }
}
