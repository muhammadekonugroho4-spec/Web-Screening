package com.stockbit.unboxing.ui.reader;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class k implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f154284a;

    /* renamed from: b, reason: collision with root package name */
    public final String f154285b;

    /* renamed from: c, reason: collision with root package name */
    public final String f154286c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final k a(Bundle r5) {
            p.l(r5, "bundle");
            r5.setClassLoader(k.class.getClassLoader());
            if (r5.containsKey("pdfUrl") == false) goto L5;
            String r02 = r5.getString("pdfUrl");
        L7:
            if (r5.containsKey("volume") == false) goto L23;
            String r1 = r5.getString("volume");
            if (r1 == null) goto L21;
            if (r5.containsKey("volumeName") == false) goto L19;
            String r52 = r5.getString("volumeName");
            if (r52 == null) goto L17;
            return new k(r1, r52, r02);
        L17:
            throw new IllegalArgumentException("Argument \"volumeName\" is marked as non-null but was passed a null value.");
        L19:
            throw new IllegalArgumentException("Required argument \"volumeName\" is missing and does not have an android:defaultValue");
        L21:
            throw new IllegalArgumentException("Argument \"volume\" is marked as non-null but was passed a null value.");
        L23:
            throw new IllegalArgumentException("Required argument \"volume\" is missing and does not have an android:defaultValue");
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

    public k(String r2, String r3, String r4) {
        p.l(r2, "volume");
        p.l(r3, "volumeName");
        this.f154284a = r2;
        this.f154285b = r3;
        this.f154286c = r4;
    }

    public static final k fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final String a() {
        return this.f154286c;
    }

    public final String b() {
        return this.f154284a;
    }

    public final String c() {
        return this.f154285b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (p.g(this.f154284a, r52.f154284a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f154285b, r52.f154285b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f154286c, r52.f154286c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f154284a.hashCode() * 31) + this.f154285b.hashCode()) * 31;
        String r1 = this.f154286c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "UnboxingReaderFragmentArgs(volume=" + this.f154284a + ", volumeName=" + this.f154285b + ", pdfUrl=" + this.f154286c + ')';
    }
}
