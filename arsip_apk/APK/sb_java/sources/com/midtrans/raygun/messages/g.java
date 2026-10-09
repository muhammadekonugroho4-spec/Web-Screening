package com.midtrans.raygun.messages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes6.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public String f42135a;

    /* renamed from: b, reason: collision with root package name */
    public h f42136b;

    public g() {
        this.f42136b = new h();
        SimpleDateFormat r02 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        r02.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.f42135a = r02.format(Calendar.getInstance().getTime());
    }

    public h a() {
        return this.f42136b;
    }
}
