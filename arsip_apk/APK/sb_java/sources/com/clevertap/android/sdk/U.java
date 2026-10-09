package com.clevertap.android.sdk;

import android.app.Activity;
import android.location.Location;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class U extends S {

    /* renamed from: B, reason: collision with root package name */
    public static boolean f33587B = false;

    /* renamed from: C, reason: collision with root package name */
    public static WeakReference f33588C;

    /* renamed from: D, reason: collision with root package name */
    public static int f33589D;

    /* renamed from: E, reason: collision with root package name */
    public static int f33590E;

    /* renamed from: A, reason: collision with root package name */
    public boolean f33591A;

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f33592a;

    /* renamed from: b, reason: collision with root package name */
    public long f33593b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33594c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public String f33595e;

    /* renamed from: f, reason: collision with root package name */
    public int f33596f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f33597g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f33598h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f33599i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f33600j;

    /* renamed from: k, reason: collision with root package name */
    public int f33601k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f33602l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f33603m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f33604n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f33605o;

    /* renamed from: p, reason: collision with root package name */
    public int f33606p;

    /* renamed from: q, reason: collision with root package name */
    public Location f33607q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f33608r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f33609s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f33610t;

    /* renamed from: u, reason: collision with root package name */
    public HashMap f33611u;

    /* renamed from: v, reason: collision with root package name */
    public long f33612v;

    /* renamed from: w, reason: collision with root package name */
    public String f33613w;

    /* renamed from: x, reason: collision with root package name */
    public String f33614x;

    /* renamed from: y, reason: collision with root package name */
    public String f33615y;

    /* renamed from: z, reason: collision with root package name */
    public JSONObject f33616z;

    static {
    }

    public U() {
        this.f33593b = 0;
        this.f33594c = false;
        this.d = new Object();
        this.f33595e = null;
        this.f33596f = 0;
        this.f33597g = false;
        this.f33598h = true;
        this.f33599i = false;
        this.f33600j = false;
        this.f33601k = 0;
        this.f33602l = false;
        this.f33603m = false;
        this.f33604n = false;
        this.f33606p = 0;
        this.f33607q = null;
        this.f33610t = new Object();
        this.f33611u = new HashMap();
        this.f33612v = 0;
        this.f33613w = null;
        this.f33614x = null;
        this.f33615y = null;
        this.f33616z = null;
        this.f33591A = false;
    }

    public static void J(int r02) {
        f33589D = r02;
    }

    public static void K(boolean r02) {
        f33587B = r02;
    }

    public static void Q(Activity r2) {
        if (r2 != null) goto L6;
        f33588C = null;
        return;
    L6:
        if (r2.getLocalClassName().contains("InAppNotificationActivity") == true) goto L9;
        f33588C = new WeakReference(r2);
        return;
    }

    public static void Y(int r02) {
        f33590E = r02;
    }

    public static int e() {
        return f33589D;
    }

    public static Activity i() {
        WeakReference r02 = f33588C;
        if (r02 != null) goto L7;
        return null;
    L7:
        return (Activity) r02.get();
    }

    public static String j() {
        Activity r02 = i();
        if (r02 != null) goto L5;
        return null;
    L5:
        return r02.getLocalClassName();
    }

    public static int n() {
        return f33590E;
    }

    public static void w() {
        f33589D++;
    }

    public static boolean x() {
        return f33587B;
    }

    public boolean A() {
        Object r02 = this.f33610t;
        monitor-enter(r02);
        boolean r1 = this.f33597g;     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public boolean B() {
        return this.f33599i;
    }

    public boolean C() {
        return this.f33600j;
    }

    public boolean D() {
        return this.f33602l;
    }

    public boolean E() {
        return this.f33604n;
    }

    public boolean F() {
        return this.f33608r;
    }

    public boolean G() {
        return this.f33605o;
    }

    public boolean H() {
        return this.f33591A;
    }

    public boolean I() {
        return this.f33609s;
    }

    public void L(Activity r2) {
        this.f33592a = new WeakReference(r2);
    }

    public void M(long r1) {
        this.f33593b = r1;
    }

    public void N(boolean r2) {
        Object r02 = this.d;
        monitor-enter(r02);
        this.f33594c = r2;     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void O(boolean r1) {
        this.f33603m = r1;
    }

    public synchronized void P(String r2) {
        monitor-enter(this);
    L7:
        th = move-exception;
        throw th;
    L4:
        if (this.f33615y != null) goto L9;
        this.f33615y = r2;     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
    }

    public void R(int r1) {
        this.f33596f = r1;
    }

    public void S(boolean r2) {
        Object r02 = this.f33610t;
        monitor-enter(r02);
        this.f33597g = r2;     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void T(String r2, int r3) {
        this.f33611u.put(r2, Integer.valueOf(r3));
    }

    public void U(boolean r2) {
        Object r02 = this.f33610t;
        monitor-enter(r02);
        this.f33598h = r2;     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void V(boolean r1) {
        this.f33599i = r1;
    }

    public void W(boolean r1) {
        this.f33600j = r1;
    }

    public void X(int r1) {
        this.f33601k = r1;
    }

    public void Z(boolean r1) {
        this.f33602l = r1;
    }

    public synchronized void a() {
        monitor-enter(this);
        this.f33615y = null;     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void a0(int r1) {
        this.f33606p = r1;
    }

    public synchronized void b() {
        monitor-enter(this);
        this.f33614x = null;     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void b0(boolean r1) {
        this.f33604n = r1;
    }

    public synchronized void c() {
        monitor-enter(this);
        this.f33613w = null;     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public synchronized void c0(String r2) {
        monitor-enter(this);
    L7:
        th = move-exception;
        throw th;
    L4:
        if (this.f33614x != null) goto L9;
        this.f33614x = r2;     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
    }

    public synchronized void d() {
        monitor-enter(this);
        this.f33616z = null;     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void d0(boolean r1) {
        this.f33605o = r1;
    }

    public void e0(long r1) {
        this.f33612v = r1;
    }

    public HashMap f() {
        return this.f33611u;
    }

    public void f0(boolean r1) {
        this.f33591A = r1;
    }

    public long g() {
        return this.f33593b;
    }

    public synchronized void g0(String r2) {
        monitor-enter(this);
    L7:
        th = move-exception;
        throw th;
    L4:
        if (this.f33613w != null) goto L9;
        this.f33613w = r2;     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
    }

    public synchronized String h() {
        monitor-enter(this);
        String r02 = this.f33615y;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r02;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized void h0(JSONObject r2) {
        monitor-enter(this);
    L7:
        th = move-exception;
        throw th;
    L4:
        if (this.f33616z != null) goto L9;
        this.f33616z = r2;     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
    }

    public int k() {
        return this.f33596f;
    }

    public boolean l() {
        Object r02 = this.f33610t;
        monitor-enter(r02);
        boolean r1 = this.f33598h;     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public int m() {
        return this.f33601k;
    }

    public int o() {
        return this.f33606p;
    }

    public Location p() {
        return this.f33607q;
    }

    public synchronized String q() {
        monitor-enter(this);
        String r02 = this.f33614x;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r02;
    L6:
        th = move-exception;
        throw th;
    }

    public long r() {
        return this.f33612v;
    }

    public String s() {
        return this.f33595e;
    }

    public synchronized String t() {
        monitor-enter(this);
        String r02 = this.f33613w;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r02;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized JSONObject u() {
        monitor-enter(this);
        JSONObject r02 = this.f33616z;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r02;
    L6:
        th = move-exception;
        throw th;
    }

    public boolean v() {
        if (this.f33596f <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean y() {
        Object r02 = this.d;
        monitor-enter(r02);
        boolean r1 = this.f33594c;     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public boolean z() {
        return this.f33603m;
    }
}
