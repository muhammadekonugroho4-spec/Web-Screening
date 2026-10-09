package com.koushikdutta.async.http;

import android.net.Uri;
import android.util.Log;
import com.google.common.net.HttpHeaders;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.koushikdutta.async.AsyncSSLException;
import java.util.Locale;

/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public String f41472a;

    /* renamed from: b, reason: collision with root package name */
    public String f41473b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f41474c;
    public Headers d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f41475e;

    /* renamed from: f, reason: collision with root package name */
    public com.koushikdutta.async.http.body.a f41476f;

    /* renamed from: g, reason: collision with root package name */
    public int f41477g;

    /* renamed from: h, reason: collision with root package name */
    public String f41478h;

    /* renamed from: i, reason: collision with root package name */
    public int f41479i;

    /* renamed from: j, reason: collision with root package name */
    public String f41480j;

    /* renamed from: k, reason: collision with root package name */
    public int f41481k;

    /* renamed from: l, reason: collision with root package name */
    public long f41482l;

    public class a implements u {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f41483a;

        public a(e r1) {
            this.f41483a = r1;
        }

        public String toString() {
            e r02 = this.f41483a;
            if (r02.f41478h != null) goto L5;
            String r03 = r02.j();
            if (r03 != null) goto L9;
        L10:
            r03 = RemoteSettings.FORWARD_SLASH_STRING;
        L11:
            String r1 = this.f41483a.o().getEncodedQuery();
            if (r1 == null) goto L17;
            if (r1.length() == 0) goto L17;
            r03 = r03 + "?" + r1;
        L17:
            return String.format(Locale.ENGLISH, "%s %s %s", new Object[]{e.a(this.f41483a), r03, e.b(this.f41483a)});
        L9:
            if (r03.length() != 0) goto L11;
        L5:
            return String.format(Locale.ENGLISH, "%s %s %s", new Object[]{e.a(r02), this.f41483a.o(), e.b(this.f41483a)});
        }
    }

    public e(Uri r2, String r3) {
        this(r2, r3, null);
    }

    public static /* synthetic */ String a(e r02) {
        return r02.f41473b;
    }

    public static /* synthetic */ String b(e r02) {
        return r02.f41472a;
    }

    public static String e() {
        String r02 = System.getProperty("http.agent");
        if (r02 == null) goto L6;
        return r02;
    L6:
        return "Java" + System.getProperty("java.version");
    }

    public static void w(Headers r3, Uri r4) {
        if (r4 == null) goto L8;
        String r02 = r4.getHost();
        if (r4.getPort() == (-1)) goto L6;
        r02 = r02 + ":" + r4.getPort();
    L6:
        if (r02 == null) goto L8;
        r3.g(HttpHeaders.HOST, r02);
    L8:
        r3.g(HttpHeaders.USER_AGENT, e());
        r3.g(HttpHeaders.ACCEPT_ENCODING, "gzip, deflate");
        r3.g(HttpHeaders.CONNECTION, "keep-alive");
        r3.g(HttpHeaders.ACCEPT, "*/*");
    }

    public void c(String r1, int r2) {
        this.f41478h = r1;
        this.f41479i = r2;
    }

    public com.koushikdutta.async.http.body.a d() {
        return this.f41476f;
    }

    public boolean f() {
        return this.f41475e;
    }

    public Headers g() {
        return this.d;
    }

    public final String h(String r5) {
        long r2 = 0;
        if (this.f41482l == 0) goto L6;
        r2 = System.currentTimeMillis() - this.f41482l;
    L6:
        return String.format(Locale.ENGLISH, "(%d ms) %s: %s", new Object[]{Long.valueOf(r2), o(), r5});
    }

    public String i() {
        return this.f41473b;
    }

    public String j() {
        return o().getEncodedPath();
    }

    public String k() {
        return this.f41478h;
    }

    public int l() {
        return this.f41479i;
    }

    public u m() {
        return new a(this);
    }

    public int n() {
        return this.f41477g;
    }

    public Uri o() {
        return this.f41474c;
    }

    public boolean p() {
        return true;
    }

    public void q(String r4) {
        String r02 = this.f41480j;
        if (r02 != null) goto L6;
        return;
    L6:
        if (this.f41481k <= 3) goto L8;
        return;
    L8:
        Log.d(r02, h(r4));
    }

    public void r(String r4, Exception r5) {
        String r02 = this.f41480j;
        if (r02 != null) goto L6;
        return;
    L6:
        if (this.f41481k <= 6) goto L8;
        return;
    L8:
        Log.e(r02, h(r4));
        Log.e(this.f41480j, r5.getMessage(), r5);
    }

    public void s(String r4) {
        String r02 = this.f41480j;
        if (r02 != null) goto L6;
        return;
    L6:
        if (this.f41481k <= 4) goto L8;
        return;
    L8:
        Log.i(r02, h(r4));
    }

    public void t(String r4) {
        String r02 = this.f41480j;
        if (r02 != null) goto L6;
        return;
    L6:
        if (this.f41481k <= 2) goto L8;
        return;
    L8:
        Log.v(r02, h(r4));
    }

    public String toString() {
        Headers r02 = this.d;
        if (r02 != null) goto L7;
        return super.toString();
    L7:
        return r02.h(this.f41474c.toString());
    }

    public void u(AsyncSSLException r1) {
    }

    public void v(com.koushikdutta.async.http.body.a r1) {
        this.f41476f = r1;
    }

    public e x(boolean r1) {
        this.f41475e = r1;
        return this;
    }

    public void y(String r1, int r2) {
        this.f41480j = r1;
        this.f41481k = r2;
    }

    public e z(int r1) {
        this.f41477g = r1;
        return this;
    }

    public e(Uri r2, String r3, Headers r4) {
        this.f41472a = "HTTP/1.1";
        this.d = new Headers();
        this.f41475e = true;
        this.f41477g = 30000;
        this.f41479i = -1;
        this.f41473b = r3;
        this.f41474c = r2;
        if (r4 != null) goto L5;
        this.d = new Headers();
    L6:
        if (r4 != null) goto L9;
        w(this.d, r2);
        return;
    L9:
        return;
    L5:
        this.d = r4;
        goto L6
    }
}
