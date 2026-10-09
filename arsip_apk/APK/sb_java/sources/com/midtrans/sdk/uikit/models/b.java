package com.midtrans.sdk.uikit.models;

import com.midtrans.sdk.corekit.models.snap.BanksPointResponse;

/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public String f42766a;

    /* renamed from: b, reason: collision with root package name */
    public BanksPointResponse f42767b;

    /* renamed from: c, reason: collision with root package name */
    public float f42768c;

    public b() {
        this.f42768c = 0.0f;
    }

    public String a() {
        return this.f42766a;
    }

    public float b() {
        return this.f42768c;
    }

    public void c(BanksPointResponse r1, String r2) {
        this.f42767b = r1;
        this.f42766a = r2;
    }

    public void d(float r1) {
        this.f42768c = r1;
    }
}
