package com.stockbit.stream.ui.pdfviewer;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class d implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f144605c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f144606a;

    /* renamed from: b, reason: collision with root package name */
    public final String f144607b;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final d a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(d.class.getClassLoader());
            if (r4.containsKey("pdfTitle") == false) goto L19;
            String r02 = r4.getString("pdfTitle");
            if (r02 == null) goto L17;
            if (r4.containsKey("pdfUrl") == false) goto L15;
            String r42 = r4.getString("pdfUrl");
            if (r42 == null) goto L13;
            return new d(r02, r42);
        L13:
            throw new IllegalArgumentException("Argument \"pdfUrl\" is marked as non-null but was passed a null value.");
        L15:
            throw new IllegalArgumentException("Required argument \"pdfUrl\" is missing and does not have an android:defaultValue");
        L17:
            throw new IllegalArgumentException("Argument \"pdfTitle\" is marked as non-null but was passed a null value.");
        L19:
            throw new IllegalArgumentException("Required argument \"pdfTitle\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f144605c = new a(null);
    }

    public d(String r2, String r3) {
        p.l(r2, "pdfTitle");
        p.l(r3, "pdfUrl");
        this.f144606a = r2;
        this.f144607b = r3;
    }

    public static final d fromBundle(Bundle r1) {
        return f144605c.a(r1);
    }

    public final String a() {
        return this.f144606a;
    }

    public final String b() {
        return this.f144607b;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        r02.putString("pdfTitle", this.f144606a);
        r02.putString("pdfUrl", this.f144607b);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f144606a, r52.f144606a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f144607b, r52.f144607b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f144606a.hashCode() * 31) + this.f144607b.hashCode();
    }

    public String toString() {
        return "CommonPdfViewerFragmentArgs(pdfTitle=" + this.f144606a + ", pdfUrl=" + this.f144607b + ')';
    }
}
