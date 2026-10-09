package com.android.installreferrer.api;

import android.os.Bundle;

/* loaded from: classes4.dex */
public class ReferrerDetails {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f31961a;

    public ReferrerDetails(Bundle r1) {
        this.f31961a = r1;
    }

    public long a() {
        return this.f31961a.getLong("install_begin_timestamp_seconds");
    }

    public String b() {
        return this.f31961a.getString("install_referrer");
    }

    public long c() {
        return this.f31961a.getLong("referrer_click_timestamp_seconds");
    }
}
