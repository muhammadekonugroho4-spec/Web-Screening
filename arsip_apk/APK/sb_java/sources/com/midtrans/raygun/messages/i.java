package com.midtrans.raygun.messages;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

/* loaded from: classes6.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public String f42146a;

    /* renamed from: b, reason: collision with root package name */
    public String f42147b;

    /* renamed from: c, reason: collision with root package name */
    public String f42148c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f42149e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f42150f;

    public i(Context r1) {
        this.f42146a = a(r1);
    }

    public final String a(Context r5) {
        monitor-enter(b.class);
        String r1 = this.f42146a;     // Catch: Throwable -> L11
        if (r1 != null) goto L25;
        SharedPreferences r12 = r5.getSharedPreferences("device_id.xml", 0);     // Catch: Throwable -> L11
        String r2 = r12.getString("device_id", null);     // Catch: Throwable -> L11
        if (r2 == null) goto L13;
        String r52 = UUID.fromString(r2).toString();     // Catch: Throwable -> L11
        monitor-exit(b.class);     // Catch: Throwable -> L11
        return r52;
    L13:
        String r53 = Settings.Secure.getString(r5.getContentResolver(), "android_id");     // Catch: Throwable -> L11
    L17:
        e = move-exception;
        throw new RuntimeException(e);     // Catch: Throwable -> L11
    L15:
        if ("9774d56d682e549c".equals(r53) == true) goto L19;
        String r54 = UUID.nameUUIDFromBytes(r53.getBytes("utf8")).toString();     // Catch: Throwable -> L11 UnsupportedEncodingException -> L17
    L20:
        r12.edit().putString("device_id", r54.toString()).commit();     // Catch: Throwable -> L11
        monitor-exit(b.class);     // Catch: Throwable -> L11
        return r54;
    L19:
        r54 = UUID.randomUUID().toString();     // Catch: Throwable -> L11 UnsupportedEncodingException -> L17
        goto L20
    L25:
        monitor-exit(b.class);     // Catch: Throwable -> L11
        return r1;
    L11:
        th = move-exception;
        throw th;
    }

    public i(String r1) {
        this.f42146a = r1;
    }

    public i(j r2, Context r3) {
        if (r2.d() != null) goto L5;
        this.f42146a = a(r3);
    L6:
        this.f42147b = r2.b();
        this.f42148c = r2.c();
        this.d = r2.a();
        this.f42149e = r2.f();
        this.f42150f = r2.e();
        return;
    L5:
        this.f42146a = r2.d();
        goto L6
    }
}
