package com.stockbit.onboarding.ui.main;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class f implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f123848c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f123849a;

    /* renamed from: b, reason: collision with root package name */
    public final String f123850b;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final f a(Bundle r5) {
            p.l(r5, "bundle");
            r5.setClassLoader(f.class.getClassLoader());
            String r2 = null;
            if (r5.containsKey("titleMessage") == false) goto L5;
            String r02 = r5.getString("titleMessage");
        L7:
            if (r5.containsKey("subtitleMessage") == false) goto L10;
            r2 = r5.getString("subtitleMessage");
        L10:
            return new f(r02, r2);
        L5:
            r02 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f123848c = new a(null);
    }

    public f(String r1, String r2) {
        this.f123849a = r1;
        this.f123850b = r2;
    }

    public static final f fromBundle(Bundle r1) {
        return f123848c.a(r1);
    }

    public final String a() {
        return this.f123850b;
    }

    public final String b() {
        return this.f123849a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f123849a, r52.f123849a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f123850b, r52.f123850b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f123849a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f123850b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "WelcomeProhibitedDialogArgs(titleMessage=" + this.f123849a + ", subtitleMessage=" + this.f123850b + ')';
    }
}
