package com.clevertap.android.sdk.network.http;

import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f34687a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f34688b;

    /* renamed from: c, reason: collision with root package name */
    public final String f34689c;

    public b(Uri r2, Map r3, String r4) {
        p.l(r2, "url");
        p.l(r3, "headers");
        this.f34687a = r2;
        this.f34688b = r3;
        this.f34689c = r4;
    }

    public final String a() {
        return this.f34689c;
    }

    public final Map b() {
        return this.f34688b;
    }

    public final Uri c() {
        return this.f34687a;
    }
}
