package com.stockbit.unboxing.ui.reader;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4081o0;
import java.io.Serializable;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final b f154287a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final int f154288a;

        /* renamed from: b, reason: collision with root package name */
        public final int f154289b;

        /* renamed from: c, reason: collision with root package name */
        public final String f154290c;
        public final Uri d;

        /* renamed from: e, reason: collision with root package name */
        public final int f154291e;

        public a(int r2, int r3, String r4, Uri r5) {
            p.l(r4, "pdfName");
            this.f154288a = r2;
            this.f154289b = r3;
            this.f154290c = r4;
            this.d = r5;
            this.f154291e = com.stockbit.unboxing.c.f153963c;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putInt("currentPage", this.f154288a);
            r02.putInt("totalPage", this.f154289b);
            r02.putString("pdfName", this.f154290c);
            if (Parcelable.class.isAssignableFrom(Uri.class) == false) goto L7;
            r02.putParcelable("pdfData", this.d);
            return r02;
        L7:
            if (Serializable.class.isAssignableFrom(Uri.class) == false) goto L9;
            r02.putSerializable("pdfData", (Serializable) this.d);
        L9:
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f154291e;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f154288a == r52.f154288a) goto L12;
            return false;
        L12:
            if (this.f154289b == r52.f154289b) goto L15;
            return false;
        L15:
            if (p.g(this.f154290c, r52.f154290c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            int r02 = ((((Integer.hashCode(this.f154288a) * 31) + Integer.hashCode(this.f154289b)) * 31) + this.f154290c.hashCode()) * 31;
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
            return "ActionUnboxingReaderFragmentToUnboxingJumpToPageDialog(currentPage=" + this.f154288a + ", totalPage=" + this.f154289b + ", pdfName=" + this.f154290c + ", pdfData=" + this.d + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(int r2, int r3, String r4, Uri r5) {
            p.l(r4, "pdfName");
            return new a(r2, r3, r4, r5);
        }

        public b() {
        }
    }

    static {
        f154287a = new b(null);
    }
}
