package com.stockbit.estatement.ui;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final c f91567a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f91568a;

        /* renamed from: b, reason: collision with root package name */
        public final int f91569b;

        public a(String r2) {
            p.l(r2, "EXTRAMESSAGE");
            this.f91568a = r2;
            this.f91569b = com.stockbit.estatement.c.f91455a;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("EXTRA_MESSAGE", this.f91568a);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f91569b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f91568a, ((a) r4).f91568a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f91568a.hashCode();
        }

        public String toString() {
            return "ActionEstatementFragmentToEstatementSendEmailSuccessDialog(EXTRAMESSAGE=" + this.f91568a + ')';
        }
    }

    /* renamed from: com.stockbit.estatement.ui.b$b, reason: collision with other inner class name */
    public static final class C0872b implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f91570a;

        /* renamed from: b, reason: collision with root package name */
        public final String f91571b;

        /* renamed from: c, reason: collision with root package name */
        public final int f91572c;

        public C0872b(String[] r2, String r3) {
            p.l(r3, "EXTRASELECTEDYEAR");
            this.f91570a = r2;
            this.f91571b = r3;
            this.f91572c = com.stockbit.estatement.c.f91456b;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putStringArray("EXTRA_LIST_YEARS", this.f91570a);
            r02.putString("EXTRA_SELECTED_YEAR", this.f91571b);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f91572c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0872b) == true) goto L8;
            return false;
        L8:
            C0872b r52 = (C0872b) r5;
            if (p.g(this.f91570a, r52.f91570a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f91571b, r52.f91571b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            String[] r02 = this.f91570a;
            if (r02 != null) goto L5;
            int r03 = 0;
        L7:
            return (r03 * 31) + this.f91571b.hashCode();
        L5:
            r03 = Arrays.hashCode(r02);
            goto L7
        }

        public String toString() {
            return "ActionEstatementFragmentToEstatementTaxReportPeriodDialog(EXTRALISTYEARS=" + Arrays.toString(this.f91570a) + ", EXTRASELECTEDYEAR=" + this.f91571b + ')';
        }
    }

    public static final class c {
        public /* synthetic */ c(i r1) {
            this();
        }

        public final InterfaceC4081o0 a(String r2) {
            p.l(r2, "EXTRAMESSAGE");
            return new a(r2);
        }

        public final InterfaceC4081o0 b(String[] r2, String r3) {
            p.l(r3, "EXTRASELECTEDYEAR");
            return new C0872b(r2, r3);
        }

        public c() {
        }
    }

    static {
        f91567a = new c(null);
    }
}
