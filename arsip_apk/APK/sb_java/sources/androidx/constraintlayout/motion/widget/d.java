package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: f, reason: collision with root package name */
    public static int f21812f = -1;

    /* renamed from: a, reason: collision with root package name */
    public int f21813a;

    /* renamed from: b, reason: collision with root package name */
    public int f21814b;

    /* renamed from: c, reason: collision with root package name */
    public String f21815c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f21816e;

    static {
    }

    public d() {
        int r02 = f21812f;
        this.f21813a = r02;
        this.f21814b = r02;
        this.f21815c = null;
    }

    public abstract void a(HashMap r1);

    public abstract d b();

    public d c(d r2) {
        this.f21813a = r2.f21813a;
        this.f21814b = r2.f21814b;
        this.f21815c = r2.f21815c;
        this.d = r2.d;
        this.f21816e = r2.f21816e;
        return this;
    }

    public abstract void d(HashSet r1);

    public abstract void e(Context r1, AttributeSet r2);

    public boolean f(String r2) {
        String r02 = this.f21815c;
        if (r02 == null) goto L8;
        if (r2 != null) goto L7;
        return false;
    L7:
        return r2.matches(r02);
    L8:
        return false;
    }

    public void g(int r1) {
        this.f21813a = r1;
    }

    public void h(HashMap r1) {
    }

    public d i(int r1) {
        this.f21814b = r1;
        return this;
    }

    public boolean j(Object r2) {
        if ((r2 instanceof Boolean) == false) goto L7;
        return ((Boolean) r2).booleanValue();
    L7:
        return Boolean.parseBoolean(r2.toString());
    }

    public float k(Object r2) {
        if ((r2 instanceof Float) == false) goto L7;
        return ((Float) r2).floatValue();
    L7:
        return Float.parseFloat(r2.toString());
    }

    public int l(Object r2) {
        if ((r2 instanceof Integer) == false) goto L7;
        return ((Integer) r2).intValue();
    L7:
        return Integer.parseInt(r2.toString());
    }
}
