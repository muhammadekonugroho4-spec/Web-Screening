package com.stockbit.unboxing.ui.detail;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class m implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f154164a;

    /* renamed from: b, reason: collision with root package name */
    public final String f154165b;

    /* renamed from: c, reason: collision with root package name */
    public final String f154166c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final m a(Bundle r6) {
            p.l(r6, "bundle");
            r6.setClassLoader(m.class.getClassLoader());
            String r2 = "";
            if (r6.containsKey("volume") == false) goto L5;
            String r02 = r6.getString("volume");
        L7:
            if (r6.containsKey("volumeName") == false) goto L9;
            String r1 = r6.getString("volumeName");
        L11:
            if (r6.containsKey("source") == false) goto L14;
            r2 = r6.getString("source");
        L14:
            return new m(r02, r1, r2);
        L9:
            r1 = "";
            goto L11
        L5:
            r02 = "";
            goto L7
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public m(String r1, String r2, String r3) {
        this.f154164a = r1;
        this.f154165b = r2;
        this.f154166c = r3;
    }

    public static final m fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final String a() {
        return this.f154166c;
    }

    public final String b() {
        return this.f154164a;
    }

    public final String c() {
        return this.f154165b;
    }

    public final Bundle d() {
        Bundle r02 = new Bundle();
        r02.putString("volume", this.f154164a);
        r02.putString("volumeName", this.f154165b);
        r02.putString("source", this.f154166c);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (p.g(this.f154164a, r52.f154164a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f154165b, r52.f154165b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f154166c, r52.f154166c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f154164a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f154165b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f154166c;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "UnboxingDetailFragmentArgs(volume=" + this.f154164a + ", volumeName=" + this.f154165b + ", source=" + this.f154166c + ')';
    }
}
