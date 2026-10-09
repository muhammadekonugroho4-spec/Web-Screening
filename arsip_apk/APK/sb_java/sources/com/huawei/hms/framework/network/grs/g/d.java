package com.huawei.hms.framework.network.grs.g;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class d {

    /* renamed from: o, reason: collision with root package name */
    private static final String f39225o = "d";

    /* renamed from: a, reason: collision with root package name */
    private Map<String, List<String>> f39226a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f39227b;

    /* renamed from: c, reason: collision with root package name */
    private int f39228c;
    private long d;

    /* renamed from: e, reason: collision with root package name */
    private long f39229e;

    /* renamed from: f, reason: collision with root package name */
    private long f39230f;

    /* renamed from: g, reason: collision with root package name */
    private String f39231g;

    /* renamed from: h, reason: collision with root package name */
    private int f39232h;

    /* renamed from: i, reason: collision with root package name */
    private int f39233i;

    /* renamed from: j, reason: collision with root package name */
    private String f39234j;

    /* renamed from: k, reason: collision with root package name */
    private long f39235k;

    /* renamed from: l, reason: collision with root package name */
    private String f39236l;

    /* renamed from: m, reason: collision with root package name */
    private Exception f39237m;

    /* renamed from: n, reason: collision with root package name */
    private String f39238n;

    public d(int r4, Map<String, List<String>> r5, byte[] r6, long r7) {
        this.f39232h = 2;
        this.f39233i = ConnectionResult.RESOLUTION_REQUIRED;
        this.f39234j = "";
        this.f39235k = 0;
        this.f39236l = "";
        this.f39228c = r4;
        this.f39226a = r5;
        this.f39227b = ByteBuffer.wrap(r6).array();
        this.d = r7;
        s();
    }

    private void p() {
        if (m() == false) goto L7;
        Logger.i(f39225o, "GRSSDK get httpcode{304} not any changed.");
        c(1);
        return;
    L7:
        if (o() == true) goto L55;
        Logger.i(f39225o, "GRSSDK parse server body all failed.");
        c(2);
        return;
    L55:
        JSONObject r8 = new JSONObject(StringUtils.byte2Str(this.f39227b));     // Catch: JSONException -> L15
        if (r8.has("isSuccess") == false) goto L18;
        if (r8.getInt("isSuccess") == 1) goto L21;
    L22:
        int r3 = 2;
    L26:
        if (r3 != 1) goto L28;
    L30:
        c(r3);     // Catch: JSONException -> L15
        String r5 = "";
        if (r3 == 1) goto L45;
        if (r3 == 0) goto L45;
        if (r8.has("errorCode") == false) goto L38;
        int r02 = r8.getInt("errorCode");     // Catch: JSONException -> L15
    L39:
        b(r02);     // Catch: JSONException -> L15
        if (r8.has("errorDesc") == false) goto L42;
        r5 = r8.getString("errorDesc");     // Catch: JSONException -> L15
    L42:
        d(r5);     // Catch: JSONException -> L15
        return;
    L38:
        r02 = ConnectionResult.RESOLUTION_REQUIRED;
    L45:
        if (r8.has("services") == false) goto L47;
        String r1 = r8.getJSONObject("services").toString();     // Catch: JSONException -> L15
    L48:
        f(r1);     // Catch: JSONException -> L15
        if (r8.has("errorList") == false) goto L51;
        r5 = r8.getJSONObject("errorList").toString();     // Catch: JSONException -> L15
    L51:
        e(r5);     // Catch: JSONException -> L15
        return;
    L47:
        r1 = "";
        goto L48
    L28:
        if (r8.has("services") == false) goto L30;
        r3 = 0;
    L21:
        r3 = 1;
        goto L26
    L18:
        if (r8.has("resultCode") == true) goto L20;
        Logger.e(f39225o, "sth. wrong because server errorcode's key.");     // Catch: JSONException -> L15
        r3 = -1;
        goto L26
    L20:
        if (r8.getInt("resultCode") != 0) goto L22;
    L15:
        e = move-exception;
        Logger.w(f39225o, "GrsResponse GrsResponse(String result) JSONException: %s", new Object[]{StringUtils.anonymizeMessage(e.getMessage())});
        c(2);
    }

    private void q() {
        if (o() == false) goto L5;
    L9:
        Map<String, String> r02 = r();
        if (r02.size() > 0) goto L27;
        Logger.w(f39225o, "parseHeader {headers.size() <= 0}");
        return;
    L27:
    L18:
        e = move-exception;
        Logger.w(f39225o, "parseHeader catch JSONException: %s", new Object[]{StringUtils.anonymizeMessage(e.getMessage())});
        return;
    L14:
        if (o() == false) goto L16;
    L20:
        b(r02);     // Catch: JSONException -> L18
        a(r02);     // Catch: JSONException -> L18
    L22:
        if (n() == false) goto L29;
        c(r02);     // Catch: JSONException -> L18
        return;
    L29:
        return;
    L16:
        if (m() == false) goto L22;
    L5:
        if (n() == true) goto L9;
        if (m() == true) goto L9;
    }

    private Map<String, String> r() {
        HashMap r02 = new HashMap(16);
        Map<String, List<String>> r1 = this.f39226a;
        if (r1 != null) goto L5;
    L15:
        Logger.v(f39225o, "parseRespHeaders {respHeaders == null} or {respHeaders.size() <= 0}");
        return r02;
    L5:
        if (r1.size() <= 0) goto L15;
        Iterator<Map.Entry<String, List<String>>> r12 = this.f39226a.entrySet().iterator();
    L9:
        if (r12.hasNext() == false) goto L14;
        Map.Entry<String, List<String>> r2 = r12.next();
        String r3 = r2.getKey();
        Iterator<String> r22 = r2.getValue().iterator();
    L12:
        if (r22.hasNext() == false) goto L9;
        r02.put(r3, r22.next());
        goto L12
    L14:
        return r02;
    }

    private void s() {
        q();
        p();
    }

    public String a() {
        return this.f39234j;
    }

    public int b() {
        return this.f39228c;
    }

    public int c() {
        return this.f39233i;
    }

    public Exception d() {
        return this.f39237m;
    }

    public String e() {
        return this.f39236l;
    }

    public int f() {
        return this.f39232h;
    }

    public long g() {
        return this.f39230f;
    }

    public long h() {
        return this.f39229e;
    }

    public long i() {
        return this.d;
    }

    public String j() {
        return this.f39231g;
    }

    public long k() {
        return this.f39235k;
    }

    public String l() {
        return this.f39238n;
    }

    public boolean m() {
        if (this.f39228c != 304) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean n() {
        if (this.f39228c != 503) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean o() {
        if (this.f39228c != 200) goto L6;
        return true;
    L6:
        return false;
    }

    public d(Exception r4, long r5) {
        this.f39228c = 0;
        this.f39232h = 2;
        this.f39233i = ConnectionResult.RESOLUTION_REQUIRED;
        this.f39234j = "";
        this.f39235k = 0;
        this.f39236l = "";
        this.f39237m = r4;
        this.d = r5;
    }

    private void b(int r1) {
        this.f39233i = r1;
    }

    private void c(int r1) {
        this.f39232h = r1;
    }

    private void d(String r1) {
    }

    private void e(String r1) {
    }

    private void f(String r1) {
        this.f39231g = r1;
    }

    public void a(int r1) {
    }

    private void c(long r1) {
        this.f39235k = r1;
    }

    public void a(long r1) {
        this.f39230f = r1;
    }

    public void b(long r1) {
        this.f39229e = r1;
    }

    private void c(String r1) {
        this.f39234j = r1;
    }

    public void a(String r1) {
        this.f39236l = r1;
    }

    public void b(String r1) {
        this.f39238n = r1;
    }

    private void a(Map<String, String> r3) {
        if (r3.containsKey(HttpHeaders.ETAG) == false) goto L10;
        String r32 = r3.get(HttpHeaders.ETAG);
        if (TextUtils.isEmpty(r32) == true) goto L8;
        Logger.i(f39225o, "success get Etag from server");
        a(r32);
        return;
    L8:
        Logger.i(f39225o, "The Response Heads Etag is Empty");
        return;
    L10:
        Logger.i(f39225o, "Response Heads has not Etag");
    }

    private void b(Map<String, String> r9) {
        if (r9.containsKey(HttpHeaders.CACHE_CONTROL) == false) goto L19;
        String r92 = r9.get(HttpHeaders.CACHE_CONTROL);
        if (TextUtils.isEmpty(r92) == false) goto L7;
    L34:
        long r02 = 0;
    L36:
        if (r02 > 0) goto L38;
    L39:
        r02 = 86400;
    L40:
        long r03 = r02 * 1000;
        Logger.i(f39225o, "convert expireTime{%s}", new Object[]{Long.valueOf(r03)});
        c(String.valueOf(r03 + System.currentTimeMillis()));
        return;
    L38:
        if (r02 <= 2592000) goto L40;
    L7:
        if (r92.contains("max-age=") == false) goto L34;
        r02 = Long.parseLong(r92.substring(r92.indexOf("max-age=") + 8));     // Catch: NumberFormatException -> L15
    L13:
        e = e;
    L17:
        Logger.w(f39225o, "getExpireTime addHeadersToResult NumberFormatException", e);
        goto L36
    L11:
        Logger.v(f39225o, "Cache-Control value{%s}", new Object[]{Long.valueOf(r02)});     // Catch: NumberFormatException -> L13
    L15:
        e = e;
        r02 = 0;
        goto L17
    L19:
        if (r9.containsKey(HttpHeaders.EXPIRES) == false) goto L33;
        String r04 = r9.get(HttpHeaders.EXPIRES);
        Logger.v(f39225o, "expires is{%s}", new Object[]{r04});
        SimpleDateFormat r1 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss 'GMT'", Locale.ROOT);
        if (r9.containsKey(HttpHeaders.DATE) == false) goto L23;
        String r93 = r9.get(HttpHeaders.DATE);
    L46:
        Date r05 = r1.parse(r04);     // Catch: ParseException -> L27
        if (TextUtils.isEmpty(r93) == false) goto L29;
        Date r94 = new Date();     // Catch: ParseException -> L27
    L30:
        r02 = (r05.getTime() - r94.getTime()) / 1000;     // Catch: ParseException -> L27
        goto L36
    L29:
        r94 = r1.parse(r93);     // Catch: ParseException -> L27
    L27:
        e = move-exception;
        Logger.w(f39225o, "getExpireTime ParseException.", e);
        goto L34
    L23:
        r93 = null;
        goto L46
    L33:
        Logger.i(f39225o, "response headers neither contains Cache-Control nor Expires.");
        goto L34
    }

    private void c(Map<String, String> r5) {
        if (r5.containsKey(HttpHeaders.RETRY_AFTER) == false) goto L10;
        String r52 = r5.get(HttpHeaders.RETRY_AFTER);
        if (TextUtils.isEmpty(r52) == true) goto L10;
        long r02 = Long.parseLong(r52);     // Catch: NumberFormatException -> L8
    L11:
        long r03 = r02 * 1000;
        Logger.v(f39225o, "convert retry-afterTime{%s}", new Object[]{Long.valueOf(r03)});
        c(r03);
        return;
    L8:
        e = move-exception;
        Logger.w(f39225o, "getRetryAfter addHeadersToResult NumberFormatException", e);
    L10:
        r02 = 0;
        goto L11
    }
}
