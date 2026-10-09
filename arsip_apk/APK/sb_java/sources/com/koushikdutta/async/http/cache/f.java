package com.koushikdutta.async.http.cache;

import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import com.google.common.net.HttpHeaders;
import com.iab.digitalidentity.sdk.core.model.GoPayPlusCameraConfigKt;
import com.koushikdutta.async.http.cache.a;
import com.koushikdutta.async.http.q;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f41436a;

    /* renamed from: b, reason: collision with root package name */
    public final c f41437b;

    /* renamed from: c, reason: collision with root package name */
    public Date f41438c;
    public Date d;

    /* renamed from: e, reason: collision with root package name */
    public Date f41439e;

    /* renamed from: f, reason: collision with root package name */
    public long f41440f;

    /* renamed from: g, reason: collision with root package name */
    public long f41441g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f41442h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f41443i;

    /* renamed from: j, reason: collision with root package name */
    public int f41444j;

    /* renamed from: k, reason: collision with root package name */
    public int f41445k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f41446l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f41447m;

    /* renamed from: n, reason: collision with root package name */
    public String f41448n;

    /* renamed from: o, reason: collision with root package name */
    public int f41449o;

    /* renamed from: p, reason: collision with root package name */
    public Set f41450p;

    /* renamed from: q, reason: collision with root package name */
    public String f41451q;

    /* renamed from: r, reason: collision with root package name */
    public String f41452r;

    /* renamed from: s, reason: collision with root package name */
    public long f41453s;

    /* renamed from: t, reason: collision with root package name */
    public String f41454t;

    /* renamed from: u, reason: collision with root package name */
    public String f41455u;

    /* renamed from: v, reason: collision with root package name */
    public String f41456v;

    public class a implements a.InterfaceC0449a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f41457a;

        public a(f r1) {
            this.f41457a = r1;
        }

        @Override // com.koushikdutta.async.http.cache.a.InterfaceC0449a
        public void a(String r3, String r4) {
            if (r3.equalsIgnoreCase("no-cache") == false) goto L7;
            f.a(this.f41457a, true);
            return;
        L7:
            if (r3.equalsIgnoreCase("no-store") == false) goto L11;
            f.b(this.f41457a, true);
            return;
        L11:
            if (r3.equalsIgnoreCase("max-age") == false) goto L15;
            f.c(this.f41457a, com.koushikdutta.async.http.cache.a.b(r4));
            return;
        L15:
            if (r3.equalsIgnoreCase("s-maxage") == false) goto L19;
            f.d(this.f41457a, com.koushikdutta.async.http.cache.a.b(r4));
            return;
        L19:
            if (r3.equalsIgnoreCase("public") == false) goto L23;
            f.e(this.f41457a, true);
            return;
        L23:
            if (r3.equalsIgnoreCase("must-revalidate") == false) goto L26;
            f.f(this.f41457a, true);
            return;
        }
    }

    public f(Uri r9, c r10) {
        this.f41444j = -1;
        this.f41445k = -1;
        this.f41449o = -1;
        this.f41450p = Collections.EMPTY_SET;
        this.f41453s = -1;
        this.f41436a = r9;
        this.f41437b = r10;
        a r92 = new a(this);
        int r1 = 0;
    L4:
        if (r1 >= r10.l()) goto L62;
        String r2 = r10.g(r1);
        String r3 = r10.k(r1);
        if (HttpHeaders.CACHE_CONTROL.equalsIgnoreCase(r2) == false) goto L9;
        com.koushikdutta.async.http.cache.a.a(r3, r92);
    L61:
        r1 = r1 + 1;
        goto L4
    L9:
        if (HttpHeaders.DATE.equalsIgnoreCase(r2) == false) goto L12;
        this.f41438c = q.b(r3);
        goto L61
    L12:
        if (HttpHeaders.EXPIRES.equalsIgnoreCase(r2) == false) goto L15;
        this.f41439e = q.b(r3);
        goto L61
    L15:
        if (HttpHeaders.LAST_MODIFIED.equalsIgnoreCase(r2) == false) goto L18;
        this.d = q.b(r3);
        goto L61
    L18:
        if (HttpHeaders.ETAG.equalsIgnoreCase(r2) == false) goto L21;
        this.f41448n = r3;
        goto L61
    L21:
        if (HttpHeaders.PRAGMA.equalsIgnoreCase(r2) == false) goto L26;
        if (r3.equalsIgnoreCase("no-cache") == false) goto L61;
        this.f41442h = true;
        goto L61
    L26:
        if (HttpHeaders.AGE.equalsIgnoreCase(r2) == false) goto L29;
        this.f41449o = com.koushikdutta.async.http.cache.a.b(r3);
        goto L61
    L29:
        if (HttpHeaders.VARY.equalsIgnoreCase(r2) == false) goto L37;
        if (this.f41450p.isEmpty() == false) goto L33;
        this.f41450p = new TreeSet(String.CASE_INSENSITIVE_ORDER);
    L33:
        String[] r22 = r3.split(Constants.SEPARATOR_COMMA);
        int r32 = r22.length;
        int r4 = 0;
    L34:
        if (r4 >= r32) goto L61;
        this.f41450p.add(r22[r4].trim().toLowerCase(Locale.US));
        r4 = r4 + 1;
        goto L34
    L37:
        if (HttpHeaders.CONTENT_ENCODING.equalsIgnoreCase(r2) == false) goto L40;
        this.f41451q = r3;
        goto L61
    L40:
        if (HttpHeaders.TRANSFER_ENCODING.equalsIgnoreCase(r2) == false) goto L43;
        this.f41452r = r3;
        goto L61
    L43:
        if (HttpHeaders.CONTENT_LENGTH.equalsIgnoreCase(r2) == false) goto L47;
        this.f41453s = Long.parseLong(r3);     // Catch: NumberFormatException -> L63
        goto L61
    L47:
        if (HttpHeaders.CONNECTION.equalsIgnoreCase(r2) == false) goto L50;
        this.f41454t = r3;
        goto L61
    L50:
        if (HttpHeaders.PROXY_AUTHENTICATE.equalsIgnoreCase(r2) == false) goto L53;
        this.f41455u = r3;
        goto L61
    L53:
        if (HttpHeaders.WWW_AUTHENTICATE.equalsIgnoreCase(r2) == false) goto L56;
        this.f41456v = r3;
        goto L61
    L56:
        if ("X-Android-Sent-Millis".equalsIgnoreCase(r2) == false) goto L59;
        this.f41440f = Long.parseLong(r3);
        goto L61
    L59:
        if ("X-Android-Received-Millis".equalsIgnoreCase(r2) == false) goto L61;
        this.f41441g = Long.parseLong(r3);
        goto L61
    }

    public static /* synthetic */ boolean a(f r02, boolean r1) {
        r02.f41442h = r1;
        return r1;
    }

    public static /* synthetic */ boolean b(f r02, boolean r1) {
        r02.f41443i = r1;
        return r1;
    }

    public static /* synthetic */ int c(f r02, int r1) {
        r02.f41444j = r1;
        return r1;
    }

    public static /* synthetic */ int d(f r02, int r1) {
        r02.f41445k = r1;
        return r1;
    }

    public static /* synthetic */ boolean e(f r02, boolean r1) {
        r02.f41446l = r1;
        return r1;
    }

    public static /* synthetic */ boolean f(f r02, boolean r1) {
        r02.f41447m = r1;
        return r1;
    }

    public static boolean n(String r1) {
        if (r1.equalsIgnoreCase(HttpHeaders.CONNECTION) == false) goto L5;
        return false;
    L5:
        if (r1.equalsIgnoreCase(HttpHeaders.KEEP_ALIVE) == false) goto L7;
        return false;
    L7:
        if (r1.equalsIgnoreCase(HttpHeaders.PROXY_AUTHENTICATE) == false) goto L9;
        return false;
    L9:
        if (r1.equalsIgnoreCase(HttpHeaders.PROXY_AUTHORIZATION) == false) goto L11;
        return false;
    L11:
        if (r1.equalsIgnoreCase(HttpHeaders.TE) == false) goto L13;
        return false;
    L13:
        if (r1.equalsIgnoreCase("Trailers") == false) goto L15;
        return false;
    L15:
        if (r1.equalsIgnoreCase(HttpHeaders.TRANSFER_ENCODING) == false) goto L17;
        return false;
    L17:
        if (r1.equalsIgnoreCase(HttpHeaders.UPGRADE) == true) goto L28;
        return true;
    L28:
        return false;
    }

    public ResponseSource g(long r9, d r11) {
        if (m(r11) == true) goto L7;
        return ResponseSource.NETWORK;
    L7:
        if (r11.l() == true) goto L53;
        if (r11.k() == true) goto L53;
        long r92 = i(r9);
        long r02 = j();
        if (r11.g() == (-1)) goto L14;
        r02 = Math.min(r02, TimeUnit.SECONDS.toMillis(r11.g()));
    L14:
        long r4 = 0;
        if (r11.i() == (-1)) goto L17;
        long r6 = TimeUnit.SECONDS.toMillis(r11.i());
    L19:
        if (this.f41447m == true) goto L24;
        if (r11.h() == (-1)) goto L24;
        r4 = TimeUnit.SECONDS.toMillis(r11.h());
    L24:
        if (this.f41442h == true) goto L37;
        long r62 = r6 + r92;
        if (r62 >= (r4 + r02)) goto L37;
        if (r62 < r02) goto L31;
        this.f41437b.a(HttpHeaders.WARNING, "110 HttpURLConnection \"Response is stale\"");
    L31:
        if (r92 <= Constants.ONE_DAY_IN_MILLIS) goto L36;
        if (o() == false) goto L36;
        this.f41437b.a(HttpHeaders.WARNING, "113 HttpURLConnection \"Heuristic expiration\"");
    L36:
        return ResponseSource.CACHE;
    L37:
        String r93 = this.f41448n;
        if (r93 == null) goto L40;
        r11.n(r93);
    L47:
        if (r11.k() == false) goto L51;
        return ResponseSource.CONDITIONAL_CACHE;
    L51:
        return ResponseSource.NETWORK;
    L40:
        Date r94 = this.d;
        if (r94 == null) goto L43;
        r11.m(r94);
        goto L47
    L43:
        Date r95 = this.f41438c;
        if (r95 == null) goto L47;
        r11.m(r95);
        goto L47
    L17:
        r6 = 0;
    L53:
        return ResponseSource.NETWORK;
    }

    public f h(f r7) {
        c r02 = new c();
        int r1 = 0;
        int r2 = 0;
    L4:
        if (r2 >= this.f41437b.l()) goto L17;
        String r3 = this.f41437b.g(r2);
        String r4 = this.f41437b.k(r2);
        if (r3.equals(HttpHeaders.WARNING) == false) goto L11;
        if (r4.startsWith(GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A) == false) goto L11;
    L15:
        r2 = r2 + 1;
    L11:
        if (n(r3) == true) goto L13;
    L14:
        r02.a(r3, r4);
        goto L15
    L13:
        if (r7.f41437b.e(r3) != null) goto L15;
    L17:
        if (r1 >= r7.f41437b.l()) goto L23;
        String r22 = r7.f41437b.g(r1);
        if (n(r22) == false) goto L21;
        r02.a(r22, r7.f41437b.k(r1));
    L21:
        r1 = r1 + 1;
        goto L17
    L23:
        return new f(this.f41436a, r02);
    }

    public final long i(long r8) {
        Date r02 = this.f41438c;
        long r1 = 0;
        if (r02 == null) goto L5;
        r1 = Math.max(0, this.f41441g - r02.getTime());
    L5:
        int r03 = this.f41449o;
        if (r03 == (-1)) goto L8;
        r1 = Math.max(r1, TimeUnit.SECONDS.toMillis(r03));
    L8:
        long r3 = this.f41441g;
        return (r1 + (r3 - this.f41440f)) + (r8 - r3);
    }

    public final long j() {
        int r02 = this.f41444j;
        if (r02 == (-1)) goto L7;
        return TimeUnit.SECONDS.toMillis(r02);
    L7:
        if (this.f41439e == null) goto L17;
        Date r03 = this.f41438c;
        if (r03 == null) goto L11;
        long r3 = r03.getTime();
    L12:
        long r5 = this.f41439e.getTime() - r3;
        if (r5 <= 0) goto L15;
        return r5;
    L15:
        return 0;
    L11:
        r3 = this.f41441g;
        goto L12
    L17:
        if (this.d != null) goto L19;
    L28:
        return 0;
    L19:
        if (this.f41436a.getEncodedQuery() != null) goto L28;
        Date r04 = this.f41438c;
        if (r04 == null) goto L23;
        long r32 = r04.getTime();
    L24:
        long r33 = r32 - this.d.getTime();
        if (r33 <= 0) goto L28;
        return r33 / 10;
    L23:
        r32 = this.f41440f;
        goto L24
    }

    public c k() {
        return this.f41437b;
    }

    public Set l() {
        return this.f41450p;
    }

    public boolean m(d r4) {
        int r02 = this.f41437b.h();
        if (r02 == 200) goto L14;
        if (r02 == 203) goto L14;
        if (r02 == 300) goto L14;
        if (r02 == 301) goto L14;
        if (r02 == 410) goto L14;
        return false;
    L14:
        if (r4.j() == false) goto L23;
        if (this.f41446l == true) goto L23;
        if (this.f41447m == true) goto L23;
        if (this.f41445k != (-1)) goto L23;
        return false;
    L23:
        if (this.f41443i == false) goto L25;
        return false;
    L25:
        return true;
    }

    public final boolean o() {
        if (this.f41444j == (-1)) goto L5;
        return false;
    L5:
        if (this.f41439e != null) goto L10;
        return true;
    L10:
        return false;
    }

    public void p(long r3, long r5) {
        this.f41440f = r3;
        this.f41437b.a("X-Android-Sent-Millis", Long.toString(r3));
        this.f41441g = r5;
        this.f41437b.a("X-Android-Received-Millis", Long.toString(r5));
    }

    public boolean q(f r6) {
        if (r6.f41437b.h() != 304) goto L6;
        return true;
    L6:
        if (this.d == null) goto L12;
        Date r62 = r6.d;
        if (r62 != null) goto L10;
        return false;
    L10:
        if (r62.getTime() >= this.d.getTime()) goto L15;
        return true;
    L15:
        return false;
    L12:
        return false;
    }

    public boolean r(Map r4, Map r5) {
        Iterator r02 = this.f41450p.iterator();
    L4:
        if (r02.hasNext() == false) goto L9;
        String r1 = (String) r02.next();
        if (b.a(r4.get(r1), r5.get(r1)) == true) goto L4;
        return false;
    L9:
        return true;
    }
}
