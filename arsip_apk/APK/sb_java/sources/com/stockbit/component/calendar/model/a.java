package com.stockbit.component.calendar.model;

import a.a.a.a.c.f;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.stockbit.component.calendar.c;
import com.stockbit.component.calendar.d;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final C0699a f69613g = null;

    /* renamed from: a, reason: collision with root package name */
    public int f69614a;

    /* renamed from: b, reason: collision with root package name */
    public Calendar f69615b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f69616c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f69617e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f69618f;

    /* renamed from: com.stockbit.component.calendar.model.a$a, reason: collision with other inner class name */
    public static final class C0699a {
        public /* synthetic */ C0699a(i r1) {
            this();
        }

        public C0699a() {
        }
    }

    static {
        f69613g = new C0699a(null);
    }

    public a(Context r3, Calendar r4) {
        p.l(r3, "context");
        p.l(r4, "cal");
        this.d = new ArrayList();
        this.f69617e = new ArrayList();
        this.f69618f = new ArrayList();
        Object r42 = r4.clone();
        p.j(r42, "null cannot be cast to non-null type java.util.Calendar");
        Calendar r43 = (Calendar) r42;
        this.f69615b = r43;
        r43.set(5, 1);
        LayoutInflater r32 = LayoutInflater.from(r3);
        p.k(r32, "from(...)");
        this.f69616c = r32;
        f();
    }

    public final Calendar a() {
        return this.f69615b;
    }

    public final int b() {
        return this.d.size();
    }

    public final Day c(int r2) {
        Object r22 = this.d.get(r2);
        p.k(r22, "get(...)");
        return (Day) r22;
    }

    public final ArrayList d() {
        return this.f69618f;
    }

    public final View e(int r2) {
        Object r22 = this.f69617e.get(r2);
        p.k(r22, "get(...)");
        return (View) r22;
    }

    public final void f() {
        this.d.clear();
        this.f69617e.clear();
        int r02 = this.f69615b.get(1);
        int r2 = this.f69615b.get(2);
        this.f69615b.set(r02, r2, 1);
        int r4 = this.f69615b.getActualMaximum(5);
        int r6 = 1 - ((this.f69615b.get(7) - 1) - this.f69614a);
        int r8 = (((int) Math.ceil(((r4 - r6) + 1) / 7)) * 7) + r6;
    L3:
        if (r6 >= r8) goto L24;
        Calendar r7 = Calendar.getInstance();
        int r10 = 11;
        if (r6 > 0) goto L10;
        if (r2 != 0) goto L8;
        int r11 = r02 - 1;
    L9:
        r7.set(r11, r10, 1);
        int r72 = r7.getActualMaximum(5) + r6;
    L16:
        Day r12 = new Day(r11, r10, r72);
        View r73 = this.f69616c.inflate(d.f69515a, null);
        View r102 = r73.findViewById(c.f69512o);
        p.j(r102, "null cannot be cast to non-null type android.widget.TextView");
        TextView r103 = (TextView) r102;
        View r13 = r73.findViewById(c.f69504g);
        p.j(r13, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView r132 = (ImageView) r13;
        r103.setText(String.valueOf(r12.a()));
        if (r12.b() == this.f69615b.get(2)) goto L20;
        r103.setAlpha(0.3f);
    L20:
        if (this.f69618f.size() > 0) goto L22;
        this.d.add(r12);
        this.f69617e.add(r73);
        r6 = r6 + 1;
        goto L3
    L22:
        Object r03 = this.f69618f.get(0);
        p.k(r03, "get(...)");
        f.a(r03);
        r12.c();
        throw null;
    L8:
        r10 = r2 - 1;
        r11 = r02;
        goto L9
    L10:
        if (r6 <= r4) goto L15;
        if (r2 != 11) goto L13;
        r11 = r02 + 1;
        r10 = 0;
    L14:
        r7.set(r11, r10, 1);
        r72 = r6 - r4;
        goto L16
    L13:
        r10 = r2 + 1;
        r11 = r02;
        goto L14
    L15:
        r11 = r02;
        r10 = r2;
        r72 = r6;
        goto L16
    }

    public final void g(int r1) {
        this.f69614a = r1;
    }

    public final void h(ArrayList r2) {
        p.l(r2, "<set-?>");
        this.f69618f = r2;
    }
}
