package com.koushikdutta.async.http.cache;

import android.net.Uri;
import com.google.common.net.HttpHeaders;
import com.koushikdutta.async.http.cache.a;
import com.koushikdutta.async.http.q;
import java.util.Date;

/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f41377a;

    /* renamed from: b, reason: collision with root package name */
    public final c f41378b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41379c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f41380e;

    /* renamed from: f, reason: collision with root package name */
    public int f41381f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f41382g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f41383h;

    /* renamed from: i, reason: collision with root package name */
    public int f41384i;

    /* renamed from: j, reason: collision with root package name */
    public String f41385j;

    /* renamed from: k, reason: collision with root package name */
    public String f41386k;

    /* renamed from: l, reason: collision with root package name */
    public String f41387l;

    /* renamed from: m, reason: collision with root package name */
    public String f41388m;

    /* renamed from: n, reason: collision with root package name */
    public String f41389n;

    /* renamed from: o, reason: collision with root package name */
    public String f41390o;

    /* renamed from: p, reason: collision with root package name */
    public String f41391p;

    /* renamed from: q, reason: collision with root package name */
    public String f41392q;

    /* renamed from: r, reason: collision with root package name */
    public String f41393r;

    public class a implements a.InterfaceC0449a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f41394a;

        public a(d r1) {
            this.f41394a = r1;
        }

        @Override // com.koushikdutta.async.http.cache.a.InterfaceC0449a
        public void a(String r3, String r4) {
            if (r3.equalsIgnoreCase("no-cache") == false) goto L7;
            d.a(this.f41394a, true);
            return;
        L7:
            if (r3.equalsIgnoreCase("max-age") == false) goto L11;
            d.b(this.f41394a, com.koushikdutta.async.http.cache.a.b(r4));
            return;
        L11:
            if (r3.equalsIgnoreCase("max-stale") == false) goto L15;
            d.c(this.f41394a, com.koushikdutta.async.http.cache.a.b(r4));
            return;
        L15:
            if (r3.equalsIgnoreCase("min-fresh") == false) goto L19;
            d.d(this.f41394a, com.koushikdutta.async.http.cache.a.b(r4));
            return;
        L19:
            if (r3.equalsIgnoreCase("only-if-cached") == false) goto L22;
            d.e(this.f41394a, true);
            return;
        }
    }

    public d(Uri r6, c r7) {
        this.d = -1;
        this.f41380e = -1;
        this.f41381f = -1;
        this.f41384i = -1;
        this.f41377a = r6;
        this.f41378b = r7;
        a r62 = new a(this);
        int r02 = 0;
    L4:
        if (r02 >= r7.l()) goto L48;
        String r1 = r7.g(r02);
        String r2 = r7.k(r02);
        if (HttpHeaders.CACHE_CONTROL.equalsIgnoreCase(r1) == false) goto L9;
        com.koushikdutta.async.http.cache.a.a(r2, r62);
    L47:
        r02 = r02 + 1;
        goto L4
    L9:
        if (HttpHeaders.PRAGMA.equalsIgnoreCase(r1) == false) goto L14;
        if (r2.equalsIgnoreCase("no-cache") == false) goto L47;
        this.f41379c = true;
        goto L47
    L14:
        if (HttpHeaders.IF_NONE_MATCH.equalsIgnoreCase(r1) == false) goto L17;
        this.f41392q = r2;
        goto L47
    L17:
        if (HttpHeaders.IF_MODIFIED_SINCE.equalsIgnoreCase(r1) == false) goto L20;
        this.f41391p = r2;
        goto L47
    L20:
        if (HttpHeaders.AUTHORIZATION.equalsIgnoreCase(r1) == false) goto L23;
        this.f41383h = true;
        goto L47
    L23:
        if (HttpHeaders.CONTENT_LENGTH.equalsIgnoreCase(r1) == false) goto L27;
        this.f41384i = Integer.parseInt(r2);     // Catch: NumberFormatException -> L49
        goto L47
    L27:
        if (HttpHeaders.TRANSFER_ENCODING.equalsIgnoreCase(r1) == false) goto L30;
        this.f41385j = r2;
        goto L47
    L30:
        if (HttpHeaders.USER_AGENT.equalsIgnoreCase(r1) == false) goto L33;
        this.f41386k = r2;
        goto L47
    L33:
        if (HttpHeaders.HOST.equalsIgnoreCase(r1) == false) goto L36;
        this.f41387l = r2;
        goto L47
    L36:
        if (HttpHeaders.CONNECTION.equalsIgnoreCase(r1) == false) goto L39;
        this.f41388m = r2;
        goto L47
    L39:
        if (HttpHeaders.ACCEPT_ENCODING.equalsIgnoreCase(r1) == false) goto L42;
        this.f41389n = r2;
        goto L47
    L42:
        if (HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(r1) == false) goto L45;
        this.f41390o = r2;
        goto L47
    L45:
        if (HttpHeaders.PROXY_AUTHORIZATION.equalsIgnoreCase(r1) == false) goto L47;
        this.f41393r = r2;
        goto L47
    }

    public static /* synthetic */ boolean a(d r02, boolean r1) {
        r02.f41379c = r1;
        return r1;
    }

    public static /* synthetic */ int b(d r02, int r1) {
        r02.d = r1;
        return r1;
    }

    public static /* synthetic */ int c(d r02, int r1) {
        r02.f41380e = r1;
        return r1;
    }

    public static /* synthetic */ int d(d r02, int r1) {
        r02.f41381f = r1;
        return r1;
    }

    public static /* synthetic */ boolean e(d r02, boolean r1) {
        r02.f41382g = r1;
        return r1;
    }

    public c f() {
        return this.f41378b;
    }

    public int g() {
        return this.d;
    }

    public int h() {
        return this.f41380e;
    }

    public int i() {
        return this.f41381f;
    }

    public boolean j() {
        return this.f41383h;
    }

    public boolean k() {
        if (this.f41391p == null) goto L5;
        return true;
    L5:
        if (this.f41392q != null) goto L11;
        return false;
    L11:
        return true;
    }

    public boolean l() {
        return this.f41379c;
    }

    public void m(Date r3) {
        if (this.f41391p == null) goto L5;
        this.f41378b.m(HttpHeaders.IF_MODIFIED_SINCE);
    L5:
        String r32 = q.a(r3);
        this.f41378b.a(HttpHeaders.IF_MODIFIED_SINCE, r32);
        this.f41391p = r32;
    }

    public void n(String r3) {
        if (this.f41392q == null) goto L5;
        this.f41378b.m(HttpHeaders.IF_NONE_MATCH);
    L5:
        this.f41378b.a(HttpHeaders.IF_NONE_MATCH, r3);
        this.f41392q = r3;
    }
}
