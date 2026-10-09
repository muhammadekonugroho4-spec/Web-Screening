package com.clevertap.android.sdk;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.iab.digitalidentity.sdk.core.model.GoPayPlusCameraConfigKt;

/* loaded from: classes4.dex */
public class ManifestInfo {

    /* renamed from: r, reason: collision with root package name */
    public static ManifestInfo f33530r;

    /* renamed from: s, reason: collision with root package name */
    public static String f33531s;

    /* renamed from: t, reason: collision with root package name */
    public static String f33532t;

    /* renamed from: u, reason: collision with root package name */
    public static String f33533u;

    /* renamed from: v, reason: collision with root package name */
    public static String f33534v;

    /* renamed from: w, reason: collision with root package name */
    public static String f33535w;

    /* renamed from: x, reason: collision with root package name */
    public static String f33536x;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f33537a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33538b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33539c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f33540e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f33541f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f33542g;

    /* renamed from: h, reason: collision with root package name */
    public final String f33543h;

    /* renamed from: i, reason: collision with root package name */
    public final String f33544i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f33545j;

    /* renamed from: k, reason: collision with root package name */
    public final String f33546k;

    /* renamed from: l, reason: collision with root package name */
    public final String f33547l;

    /* renamed from: m, reason: collision with root package name */
    public final String[] f33548m;

    /* renamed from: n, reason: collision with root package name */
    public final int f33549n;

    /* renamed from: o, reason: collision with root package name */
    public final String f33550o;

    /* renamed from: p, reason: collision with root package name */
    public final String f33551p;

    /* renamed from: q, reason: collision with root package name */
    public final String f33552q;

    public ManifestInfo(Context r5) {
        Bundle r52 = r5.getPackageManager().getApplicationInfo(r5.getPackageName(), 128).metaData;     // Catch: Throwable -> L5
    L6:
        if (r52 != null) goto L9;
        r52 = new Bundle();
    L9:
        if (f33531s != null) goto L12;
        f33531s = a(r52, "CLEVERTAP_ACCOUNT_ID");
    L12:
        if (f33532t != null) goto L15;
        f33532t = a(r52, "CLEVERTAP_TOKEN");
    L15:
        if (f33533u != null) goto L18;
        f33533u = a(r52, "CLEVERTAP_REGION");
    L18:
        if (f33534v != null) goto L21;
        f33534v = a(r52, "CLEVERTAP_PROXY_DOMAIN");
    L21:
        if (f33535w != null) goto L24;
        f33535w = a(r52, "CLEVERTAP_SPIKY_PROXY_DOMAIN");
    L24:
        if (f33536x != null) goto L26;
        f33536x = a(r52, "CLEVERTAP_HANDSHAKE_DOMAIN");
    L26:
        this.f33539c = a(r52, "CLEVERTAP_NOTIFICATION_ICON");
        this.f33537a = GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A.equals(a(r52, "CLEVERTAP_USE_GOOGLE_AD_ID"));
        this.f33538b = GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A.equals(a(r52, "CLEVERTAP_DISABLE_APP_LAUNCHED"));
        this.d = a(r52, "CLEVERTAP_INAPP_EXCLUDE");
        this.f33540e = GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A.equals(a(r52, "CLEVERTAP_SSL_PINNING"));
        this.f33541f = GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A.equals(a(r52, "CLEVERTAP_BACKGROUND_SYNC"));
        this.f33542g = GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A.equals(a(r52, "CLEVERTAP_USE_CUSTOM_ID"));
        String r02 = a(r52, "FCM_SENDER_ID");
        if (r02 == null) goto L29;
        r02 = r02.replace("id:", "");
    L29:
        this.f33543h = r02;
        int r03 = 0;
        int r2 = Integer.parseInt(a(r52, "CLEVERTAP_ENCRYPTION_LEVEL"));     // Catch: Throwable -> L37
        if (r2 >= 0) goto L33;
    L35:
        Logger.v("Supported encryption levels are only 0 and 1. Setting it to 0 by default");     // Catch: Throwable -> L37
    L39:
        this.f33549n = r03;
        this.f33544i = a(r52, "CLEVERTAP_APP_PACKAGE");
        this.f33545j = GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A.equals(a(r52, "CLEVERTAP_BETA"));
        this.f33546k = a(r52, "CLEVERTAP_INTENT_SERVICE");
        this.f33547l = a(r52, "CLEVERTAP_DEFAULT_CHANNEL_ID");
        this.f33548m = v(r52);
        this.f33550o = a(r52, "CLEVERTAP_PROVIDER_1");
        this.f33551p = a(r52, "CLEVERTAP_PROVIDER_2");
        this.f33552q = a(r52, "CLEVERTAP_ENCRYPTION_IN_TRANSIT");
        return;
    L33:
        if (r2 > 1) goto L35;
        r03 = r2;
    L37:
        th = move-exception;
        Logger.v("Unable to parse encryption level from the Manifest, Setting it to 0 by default", th.getCause());
    L5:
        r52 = null;
        goto L6
    }

    public static synchronized ManifestInfo getInstance(Context r2) {
        monitor-enter(ManifestInfo.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (f33530r != null) goto L9;
        f33530r = new ManifestInfo(r2);     // Catch: Throwable -> L7
    L9:
        ManifestInfo r22 = f33530r;     // Catch: Throwable -> L7
        monitor-exit(ManifestInfo.class);
        return r22;
    }

    public final String a(Bundle r2, String r3) {
        Object r22 = r2.get(r3);     // Catch: Throwable -> L8
        if (r22 == null) goto L7;
        return r22.toString();
    L7:
        return null;
    }

    public boolean b() {
        return this.f33545j;
    }

    public String c() {
        return f33531s;
    }

    public String d() {
        Logger.v("ManifestInfo: getAccountRegion called, returning region:" + f33533u);
        return f33533u;
    }

    public String e() {
        return f33532t;
    }

    public String f() {
        return this.f33547l;
    }

    public String g() {
        return this.f33552q;
    }

    public String getIntentServiceName() {
        return this.f33546k;
    }

    public int h() {
        return this.f33549n;
    }

    public String i() {
        return this.d;
    }

    public String j() {
        return this.f33543h;
    }

    public String k() {
        Logger.v("ManifestInfo: getHandshakeDomain called, returning handshakeDomain:" + f33536x);
        return f33536x;
    }

    public String l() {
        return this.f33539c;
    }

    public String m() {
        return this.f33544i;
    }

    public String[] n() {
        return this.f33548m;
    }

    public String o() {
        Logger.v("ManifestInfo: getProxyDomain called, returning proxyDomain:" + f33534v);
        return f33534v;
    }

    public String p() {
        Logger.v("ManifestInfo: getSpikeyProxyDomain called, returning spikeyProxyDomain:" + f33535w);
        return f33535w;
    }

    public String q() {
        return this.f33550o;
    }

    public String r() {
        return this.f33551p;
    }

    public boolean s() {
        return this.f33538b;
    }

    public boolean t() {
        return this.f33541f;
    }

    public boolean u() {
        return this.f33540e;
    }

    public final String[] v(Bundle r2) {
        String r22 = a(r2, Constants.CLEVERTAP_IDENTIFIER);
        if (TextUtils.isEmpty(r22) == true) goto L7;
        return r22.split(Constants.SEPARATOR_COMMA);
    L7:
        return Constants.NULL_STRING_ARRAY;
    }

    public boolean w() {
        return this.f33542g;
    }

    public boolean x() {
        return this.f33537a;
    }
}
