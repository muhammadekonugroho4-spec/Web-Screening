package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public class k1 {

    /* renamed from: a, reason: collision with root package name */
    private String f39358a;

    /* renamed from: b, reason: collision with root package name */
    public m f39359b;

    public k1(String r3) {
        this.f39358a = r3;
        this.f39359b = new m(r3);
        i.c().a(this.f39358a, this.f39359b);
    }

    private k b(int r2) {
        if (r2 == 0) goto L18;
        if (r2 == 1) goto L16;
        if (r2 == 2) goto L14;
        if (r2 == 3) goto L12;
        return null;
    L12:
        return this.f39359b.a();
    L14:
        return this.f39359b.d();
    L16:
        return this.f39359b.b();
    L18:
        return this.f39359b.c();
    }

    private boolean c(int r5) {
        if (r5 == 2) goto L5;
        k r02 = b(r5);
        if (r02 != null) goto L13;
    L16:
        String r52 = "verifyURL(): URL check failed. type: " + r5;
    L7:
        z.e("hmsSdk", r52);
        return false;
    L13:
        if (TextUtils.isEmpty(r02.h()) == true) goto L16;
        return true;
    L5:
        if ("_default_config_tag".equals(this.f39358a) == true) goto L9;
        r52 = "verifyURL(): type: preins. Only default config can report Pre-install data.";
        goto L7
    L9:
        return true;
    }

    public void a(int r3) {
        z.d("hmsSdk", "onReport. TAG: " + this.f39358a + ", TYPE: " + r3);
        j1.a().a(this.f39358a, r3);
    }

    public void a(int r4, String r5, LinkedHashMap<String, String> r6) {
        z.d("hmsSdk", "onEvent. TAG: " + this.f39358a + ", TYPE: " + r4 + ", eventId : " + r5);
        if (t0.a(r5) == false) goto L5;
    L12:
        z.e("hmsSdk", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f39358a + ", TYPE: " + r4);
        return;
    L5:
        if (c(r4) == false) goto L12;
        if (t0.a(r6) == true) goto L10;
        z.e("hmsSdk", "onEvent() parameter mapValue will be cleared.TAG: " + this.f39358a + ", TYPE: " + r4);
        r6 = null;
    L10:
        j1.a().a(this.f39358a, r4, r5, r6);
    }

    public void b(int r4, String r5, LinkedHashMap<String, String> r6) {
        z.d("hmsSdk", "onStreamEvent. TAG: " + this.f39358a + ", TYPE: " + r4 + ", eventId : " + r5);
        if (t0.a(r5) == false) goto L5;
    L12:
        z.e("hmsSdk", "onStreamEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f39358a + ", TYPE: " + r4);
        return;
    L5:
        if (c(r4) == false) goto L12;
        if (t0.a(r6) == true) goto L10;
        z.e("hmsSdk", "onStreamEvent() parameter mapValue will be cleared.TAG: " + this.f39358a + ", TYPE: " + r4);
        r6 = null;
    L10:
        j1.a().b(this.f39358a, r4, r5, r6);
    }

    public void a(Context r4, String r5, String r6) {
        z.d("hmsSdk", "onEvent(context). TAG: " + this.f39358a + ", eventId : " + r5);
        if (r4 != null) goto L7;
        z.e("hmsSdk", "context is null in onevent ");
        return;
    L7:
        if (t0.a(r5) == false) goto L9;
    L16:
        z.e("hmsSdk", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f39358a);
        return;
    L9:
        if (c(0) == false) goto L16;
        if (t0.a("value", r6, 65536) == true) goto L14;
        z.e("hmsSdk", "onEvent() parameter VALUE is overlong, content will be cleared.TAG: " + this.f39358a);
        r6 = "";
    L14:
        j1.a().a(this.f39358a, r4, r5, r6);
    }

    public void b(k r3) {
        z.c("hmsSdk", "HiAnalyticsInstanceImpl.setOperConf() is executed.TAG: " + this.f39358a);
        if (r3 != null) goto L6;
        this.f39359b.b(null);
        z.e("hmsSdk", "HiAnalyticsInstanceImpl.setOperConf(): config for oper is null!");
        return;
    L6:
        this.f39359b.b(r3);
    }

    public void a(k r3) {
        z.c("hmsSdk", "HiAnalyticsInstanceImpl.setMaintConf() is executed.TAG : " + this.f39358a);
        if (r3 != null) goto L6;
        z.e("hmsSdk", "HiAnalyticsInstanceImpl.setMaintConf(): config for maint is null!");
        this.f39359b.a(null);
        return;
    L6:
        this.f39359b.a(r3);
    }
}
