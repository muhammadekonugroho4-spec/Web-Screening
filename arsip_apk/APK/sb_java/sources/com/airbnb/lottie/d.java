package com.airbnb.lottie;

import android.graphics.Rect;
import androidx.collection.C2361z;
import androidx.collection.h0;
import com.airbnb.lottie.model.layer.Layer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final m f31086a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f31087b;

    /* renamed from: c, reason: collision with root package name */
    public Map f31088c;
    public Map d;

    /* renamed from: e, reason: collision with root package name */
    public Map f31089e;

    /* renamed from: f, reason: collision with root package name */
    public List f31090f;

    /* renamed from: g, reason: collision with root package name */
    public h0 f31091g;

    /* renamed from: h, reason: collision with root package name */
    public C2361z f31092h;

    /* renamed from: i, reason: collision with root package name */
    public List f31093i;

    /* renamed from: j, reason: collision with root package name */
    public Rect f31094j;

    /* renamed from: k, reason: collision with root package name */
    public float f31095k;

    /* renamed from: l, reason: collision with root package name */
    public float f31096l;

    /* renamed from: m, reason: collision with root package name */
    public float f31097m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f31098n;

    /* renamed from: o, reason: collision with root package name */
    public int f31099o;

    public d() {
        this.f31086a = new m();
        this.f31087b = new HashSet();
        this.f31099o = 0;
    }

    public void a(String r2) {
        com.airbnb.lottie.utils.d.c(r2);
        this.f31087b.add(r2);
    }

    public Rect b() {
        return this.f31094j;
    }

    public h0 c() {
        return this.f31091g;
    }

    public float d() {
        return (long) ((e() / this.f31097m) * 1000.0f);
    }

    public float e() {
        return this.f31096l - this.f31095k;
    }

    public float f() {
        return this.f31096l;
    }

    public Map g() {
        return this.f31089e;
    }

    public float h(float r3) {
        return com.airbnb.lottie.utils.g.k(this.f31095k, this.f31096l, r3);
    }

    public float i() {
        return this.f31097m;
    }

    public Map j() {
        return this.d;
    }

    public List k() {
        return this.f31093i;
    }

    public com.airbnb.lottie.model.g l(String r5) {
        int r02 = this.f31090f.size();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L8;
        com.airbnb.lottie.model.g r2 = (com.airbnb.lottie.model.g) this.f31090f.get(r1);
        if (r2.a(r5) == true) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return r2;
    L8:
        return null;
    }

    public int m() {
        return this.f31099o;
    }

    public m n() {
        return this.f31086a;
    }

    public List o(String r2) {
        return (List) this.f31088c.get(r2);
    }

    public float p() {
        return this.f31095k;
    }

    public boolean q() {
        return this.f31098n;
    }

    public boolean r() {
        return !this.d.isEmpty();
    }

    public void s(int r2) {
        this.f31099o += r2;
    }

    public void t(Rect r1, float r2, float r3, float r4, List r5, C2361z r6, Map r7, Map r8, h0 r9, Map r10, List r11) {
        this.f31094j = r1;
        this.f31095k = r2;
        this.f31096l = r3;
        this.f31097m = r4;
        this.f31093i = r5;
        this.f31092h = r6;
        this.f31088c = r7;
        this.d = r8;
        this.f31091g = r9;
        this.f31089e = r10;
        this.f31090f = r11;
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder("LottieComposition:\n");
        Iterator r1 = this.f31093i.iterator();
    L4:
        if (r1.hasNext() == false) goto L7;
        r02.append(((Layer) r1.next()).y("\t"));
        goto L4
    L7:
        return r02.toString();
    }

    public Layer u(long r2) {
        return (Layer) this.f31092h.e(r2);
    }

    public void v(boolean r1) {
        this.f31098n = r1;
    }

    public void w(boolean r2) {
        this.f31086a.b(r2);
    }
}
