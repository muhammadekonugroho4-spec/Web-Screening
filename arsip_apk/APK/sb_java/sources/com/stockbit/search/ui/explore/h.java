package com.stockbit.search.ui.explore;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class h implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f134460a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f134461b;

    /* renamed from: c, reason: collision with root package name */
    public final String f134462c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final h a(Bundle r6) {
            p.l(r6, "bundle");
            r6.setClassLoader(h.class.getClassLoader());
            String r2 = null;
            if (r6.containsKey("searchTab") == false) goto L5;
            String r02 = r6.getString("searchTab");
        L7:
            if (r6.containsKey("isDeeplinkForeignDomestic") == false) goto L9;
            boolean r1 = r6.getBoolean("isDeeplinkForeignDomestic");
        L11:
            if (r6.containsKey("rankingType") == false) goto L14;
            r2 = r6.getString("rankingType");
        L14:
            return new h(r02, r1, r2);
        L9:
            r1 = false;
            goto L11
        L5:
            r02 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public h(String r1, boolean r2, String r3) {
        this.f134460a = r1;
        this.f134461b = r2;
        this.f134462c = r3;
    }

    public static final h fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final String a() {
        return this.f134460a;
    }

    public final boolean b() {
        return this.f134461b;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        r02.putString("searchTab", this.f134460a);
        r02.putBoolean("isDeeplinkForeignDomestic", this.f134461b);
        r02.putString("rankingType", this.f134462c);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f134460a, r52.f134460a) == true) goto L12;
        return false;
    L12:
        if (this.f134461b == r52.f134461b) goto L15;
        return false;
    L15:
        if (p.g(this.f134462c, r52.f134462c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f134460a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = ((r03 * 31) + Boolean.hashCode(this.f134461b)) * 31;
        String r2 = this.f134462c;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "ExploreFragmentArgs(searchTab=" + this.f134460a + ", isDeeplinkForeignDomestic=" + this.f134461b + ", rankingType=" + this.f134462c + ')';
    }

    public /* synthetic */ h(String r2, boolean r3, String r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = false;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = null;
    L11:
        this(r2, r3, r4);
    }
}
