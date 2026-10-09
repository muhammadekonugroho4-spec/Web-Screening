package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import com.clevertap.android.sdk.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public class m implements k {
    public static final Bitmap.Config[] d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f32701e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f32702f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f32703g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f32704h = null;

    /* renamed from: a, reason: collision with root package name */
    public final c f32705a;

    /* renamed from: b, reason: collision with root package name */
    public final g f32706b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f32707c;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32708a = null;

        static {
            int[] r02 = new int[Bitmap.Config.values().length];
            f32708a = r02;
            r02[Bitmap.Config.ARGB_8888.ordinal()] = 1;     // Catch: NoSuchFieldError -> L8
        L12:
            f32708a[Bitmap.Config.RGB_565.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
        L14:
            f32708a[Bitmap.Config.ARGB_4444.ordinal()] = 3;     // Catch: NoSuchFieldError -> L10
        L18:
            f32708a[Bitmap.Config.ALPHA_8.ordinal()] = 4;     // Catch: NoSuchFieldError -> L11
            return;
        }
    }

    public static final class b implements l {

        /* renamed from: a, reason: collision with root package name */
        public final c f32709a;

        /* renamed from: b, reason: collision with root package name */
        public int f32710b;

        /* renamed from: c, reason: collision with root package name */
        public Bitmap.Config f32711c;

        public b(c r1) {
            this.f32709a = r1;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
        public void a() {
            this.f32709a.c(this);
        }

        public void b(int r1, Bitmap.Config r2) {
            this.f32710b = r1;
            this.f32711c = r2;
        }

        public boolean equals(Object r4) {
            if ((r4 instanceof b) == false) goto L10;
            b r42 = (b) r4;
            if (this.f32710b != r42.f32710b) goto L10;
            if (com.bumptech.glide.util.l.d(this.f32711c, r42.f32711c) == false) goto L10;
            return true;
        L10:
            return false;
        }

        public int hashCode() {
            int r02 = this.f32710b * 31;
            Bitmap.Config r1 = this.f32711c;
            if (r1 == null) goto L5;
            int r12 = r1.hashCode();
        L7:
            return r02 + r12;
        L5:
            r12 = 0;
            goto L7
        }

        public String toString() {
            return m.h(this.f32710b, this.f32711c);
        }
    }

    public static class c extends com.bumptech.glide.load.engine.bitmap_recycle.c {
        public c() {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.c
        public /* bridge */ /* synthetic */ l a() {
            return d();
        }

        public b d() {
            return new b(this);
        }

        public b e(int r2, Bitmap.Config r3) {
            b r02 = (b) b();
            r02.b(r2, r3);
            return r02;
        }
    }

    static {
        Bitmap.Config[] r02 = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        r02[r02.length - 1] = Bitmap.Config.RGBA_F16;
        d = r02;
        f32701e = r02;
        f32702f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f32703g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f32704h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public m() {
        this.f32705a = new c();
        this.f32706b = new g();
        this.f32707c = new HashMap();
    }

    public static String h(int r2, Bitmap.Config r3) {
        return Constants.AES_PREFIX + r2 + "](" + r3 + ")";
    }

    public static Bitmap.Config[] i(Bitmap.Config r2) {
        if (Bitmap.Config.RGBA_F16.equals(r2) == true) goto L5;
        int r02 = a.f32708a[r2.ordinal()];
        if (r02 == 1) goto L23;
        if (r02 == 2) goto L21;
        if (r02 == 3) goto L19;
        if (r02 == 4) goto L17;
        return new Bitmap.Config[]{r2};
    L17:
        return f32704h;
    L19:
        return f32703g;
    L21:
        return f32702f;
    L23:
        return d;
    L5:
        return f32701e;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.k
    public String a(int r1, int r2, Bitmap.Config r3) {
        return h(com.bumptech.glide.util.l.g(r1, r2, r3), r3);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.k
    public int b(Bitmap r1) {
        return com.bumptech.glide.util.l.h(r1);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.k
    public void c(Bitmap r4) {
        int r02 = com.bumptech.glide.util.l.h(r4);
        b r03 = this.f32705a.e(r02, r4.getConfig());
        this.f32706b.d(r03, r4);
        NavigableMap r42 = j(r4.getConfig());
        Integer r1 = (Integer) r42.get(Integer.valueOf(r03.f32710b));
        Integer r04 = Integer.valueOf(r03.f32710b);
        int r2 = 1;
        if (r1 == null) goto L6;
        r2 = 1 + r1.intValue();
    L6:
        r42.put(r04, Integer.valueOf(r2));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.k
    public Bitmap d(int r3, int r4, Bitmap.Config r5) {
        b r02 = g(com.bumptech.glide.util.l.g(r3, r4, r5), r5);
        Bitmap r1 = (Bitmap) this.f32706b.a(r02);
        if (r1 == null) goto L5;
        f(Integer.valueOf(r02.f32710b), r1);
        r1.reconfigure(r3, r4, r5);
    L5:
        return r1;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.k
    public String e(Bitmap r2) {
        return h(com.bumptech.glide.util.l.h(r2), r2.getConfig());
    }

    public final void f(Integer r4, Bitmap r5) {
        NavigableMap r02 = j(r5.getConfig());
        Integer r1 = (Integer) r02.get(r4);
        if (r1 == null) goto L11;
        if (r1.intValue() != 1) goto L8;
        r02.remove(r4);
        return;
    L8:
        r02.put(r4, Integer.valueOf(r1.intValue() - 1));
        return;
    L11:
        throw new NullPointerException("Tried to decrement empty size, size: " + r4 + ", removed: " + e(r5) + ", this: " + this);
    }

    public final b g(int r9, Bitmap.Config r10) {
        b r02 = this.f32705a.e(r9, r10);
        Bitmap.Config[] r1 = i(r10);
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L18;
        Bitmap.Config r4 = r1[r3];
        Integer r5 = (Integer) j(r4).ceilingKey(Integer.valueOf(r9));
        if (r5 == null) goto L17;
        if (r5.intValue() > (r9 * 8)) goto L17;
        if (r5.intValue() != r9) goto L15;
        if (r4 != null) goto L14;
        if (r10 == null) goto L18;
    L14:
        if (r4.equals(r10) == true) goto L18;
    L15:
        this.f32705a.c(r02);
        return this.f32705a.e(r5.intValue(), r4);
    L17:
        r3 = r3 + 1;
    L18:
        return r02;
    }

    public final NavigableMap j(Bitmap.Config r3) {
        NavigableMap r02 = (NavigableMap) this.f32707c.get(r3);
        if (r02 != null) goto L6;
        TreeMap r03 = new TreeMap();
        this.f32707c.put(r3, r03);
        return r03;
    L6:
        return r02;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.k
    public Bitmap removeLast() {
        Bitmap r02 = (Bitmap) this.f32706b.f();
        if (r02 == null) goto L5;
        f(Integer.valueOf(com.bumptech.glide.util.l.h(r02)), r02);
    L5:
        return r02;
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append("SizeConfigStrategy{groupedMap=");
        r02.append(this.f32706b);
        r02.append(", sortedSizes=(");
        Iterator r1 = this.f32707c.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L7;
        Map.Entry r2 = (Map.Entry) r1.next();
        r02.append(r2.getKey());
        r02.append('[');
        r02.append(r2.getValue());
        r02.append("], ");
        goto L4
    L7:
        if (this.f32707c.isEmpty() == true) goto L9;
        r02.replace(r02.length() - 2, r02.length(), "");
    L9:
        r02.append(")}");
        return r02.toString();
    }
}
