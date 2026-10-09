package com.auth0.android.jwt;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f32368a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32369b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f32370c;
    public final Date d;

    /* renamed from: e, reason: collision with root package name */
    public final Date f32371e;

    /* renamed from: f, reason: collision with root package name */
    public final String f32372f;

    /* renamed from: g, reason: collision with root package name */
    public final List f32373g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f32374h;

    public c(String r1, String r2, Date r3, Date r4, Date r5, String r6, List r7, Map r8) {
        this.f32368a = r1;
        this.f32369b = r2;
        this.f32370c = r3;
        this.d = r4;
        this.f32371e = r5;
        this.f32372f = r6;
        this.f32373g = r7;
        this.f32374h = Collections.unmodifiableMap(r8);
    }
}
