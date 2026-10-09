package com.stockbit.unboxing.ui.reader.dialog;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import java.io.Serializable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class a implements InterfaceC4094y {

    /* renamed from: e, reason: collision with root package name */
    public static final C1392a f154272e = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f154273a;

    /* renamed from: b, reason: collision with root package name */
    public final int f154274b;

    /* renamed from: c, reason: collision with root package name */
    public final String f154275c;
    public final Uri d;

    /* renamed from: com.stockbit.unboxing.ui.reader.dialog.a$a, reason: collision with other inner class name */
    public static final class C1392a {
        public /* synthetic */ C1392a(i r1) {
            this();
        }

        public final a a(Bundle r7) {
            p.l(r7, "bundle");
            r7.setClassLoader(a.class.getClassLoader());
            if (r7.containsKey("currentPage") == false) goto L30;
            int r02 = r7.getInt("currentPage");
            if (r7.containsKey("totalPage") == false) goto L28;
            int r1 = r7.getInt("totalPage");
            if (r7.containsKey("pdfName") == false) goto L26;
            String r2 = r7.getString("pdfName");
            if (r2 == null) goto L24;
            if (r7.containsKey("pdfData") == true) goto L13;
            Uri r72 = null;
        L22:
            return new a(r02, r1, r2, r72);
        L13:
            if (Parcelable.class.isAssignableFrom(Uri.class) == false) goto L15;
        L19:
            r72 = (Uri) r7.get("pdfData");
            goto L22
        L15:
            if (Serializable.class.isAssignableFrom(Uri.class) == true) goto L19;
            throw new UnsupportedOperationException(Uri.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L24:
            throw new IllegalArgumentException("Argument \"pdfName\" is marked as non-null but was passed a null value.");
        L26:
            throw new IllegalArgumentException("Required argument \"pdfName\" is missing and does not have an android:defaultValue");
        L28:
            throw new IllegalArgumentException("Required argument \"totalPage\" is missing and does not have an android:defaultValue");
        L30:
            throw new IllegalArgumentException("Required argument \"currentPage\" is missing and does not have an android:defaultValue");
        }

        public C1392a() {
        }
    }

    static {
        f154272e = new C1392a(null);
    }

    public a(int r2, int r3, String r4, Uri r5) {
        p.l(r4, "pdfName");
        this.f154273a = r2;
        this.f154274b = r3;
        this.f154275c = r4;
        this.d = r5;
    }

    public static final a fromBundle(Bundle r1) {
        return f154272e.a(r1);
    }

    public final int a() {
        return this.f154273a;
    }

    public final Uri b() {
        return this.d;
    }

    public final String c() {
        return this.f154275c;
    }

    public final int d() {
        return this.f154274b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f154273a == r52.f154273a) goto L12;
        return false;
    L12:
        if (this.f154274b == r52.f154274b) goto L15;
        return false;
    L15:
        if (p.g(this.f154275c, r52.f154275c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((((Integer.hashCode(this.f154273a) * 31) + Integer.hashCode(this.f154274b)) * 31) + this.f154275c.hashCode()) * 31;
        Uri r1 = this.d;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "UnboxingJumpToPageDialogArgs(currentPage=" + this.f154273a + ", totalPage=" + this.f154274b + ", pdfName=" + this.f154275c + ", pdfData=" + this.d + ')';
    }
}
