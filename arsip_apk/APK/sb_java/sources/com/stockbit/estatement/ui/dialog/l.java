package com.stockbit.estatement.ui.dialog;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import java.util.Arrays;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class l implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f91599c = null;
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String[] f91600a;

    /* renamed from: b, reason: collision with root package name */
    public final String f91601b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final l a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(l.class.getClassLoader());
            if (r4.containsKey("EXTRA_LIST_YEARS") == false) goto L15;
            String[] r02 = r4.getStringArray("EXTRA_LIST_YEARS");
            if (r4.containsKey("EXTRA_SELECTED_YEAR") == false) goto L13;
            String r42 = r4.getString("EXTRA_SELECTED_YEAR");
            if (r42 == null) goto L11;
            return new l(r02, r42);
        L11:
            throw new IllegalArgumentException("Argument \"EXTRA_SELECTED_YEAR\" is marked as non-null but was passed a null value.");
        L13:
            throw new IllegalArgumentException("Required argument \"EXTRA_SELECTED_YEAR\" is missing and does not have an android:defaultValue");
        L15:
            throw new IllegalArgumentException("Required argument \"EXTRA_LIST_YEARS\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f91599c = new a(null);
        d = 8;
    }

    public l(String[] r2, String r3) {
        p.l(r3, "EXTRASELECTEDYEAR");
        this.f91600a = r2;
        this.f91601b = r3;
    }

    public static final l fromBundle(Bundle r1) {
        return f91599c.a(r1);
    }

    public final String[] a() {
        return this.f91600a;
    }

    public final String b() {
        return this.f91601b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (p.g(this.f91600a, r52.f91600a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f91601b, r52.f91601b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String[] r02 = this.f91600a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + this.f91601b.hashCode();
    L5:
        r03 = Arrays.hashCode(r02);
        goto L7
    }

    public String toString() {
        return "TaxReportPeriodDialogArgs(EXTRALISTYEARS=" + Arrays.toString(this.f91600a) + ", EXTRASELECTEDYEAR=" + this.f91601b + ')';
    }
}
