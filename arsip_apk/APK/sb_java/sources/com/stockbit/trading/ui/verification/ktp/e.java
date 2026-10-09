package com.stockbit.trading.ui.verification.ktp;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.domain.model.type.KtpConfirmationType;
import java.io.Serializable;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class e implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final KtpConfirmationType f148873a;

    /* renamed from: b, reason: collision with root package name */
    public final String f148874b;

    /* renamed from: c, reason: collision with root package name */
    public final String f148875c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final e a(Bundle r5) {
            p.l(r5, "bundle");
            r5.setClassLoader(e.class.getClassLoader());
            if (r5.containsKey("validateKtpConfirmationType") == false) goto L26;
            if (Parcelable.class.isAssignableFrom(KtpConfirmationType.class) == false) goto L7;
        L11:
            KtpConfirmationType r02 = (KtpConfirmationType) r5.get("validateKtpConfirmationType");
            if (r02 == null) goto L24;
            if (r5.containsKey("changeToken") == false) goto L16;
            String r1 = r5.getString("changeToken");
        L18:
            if (r5.containsKey("extraFrom") == false) goto L20;
            String r52 = r5.getString("extraFrom");
        L22:
            return new e(r02, r1, r52);
        L20:
            r52 = null;
            goto L22
        L16:
            r1 = "";
            goto L18
        L24:
            throw new IllegalArgumentException("Argument \"validateKtpConfirmationType\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(KtpConfirmationType.class) == true) goto L11;
            throw new UnsupportedOperationException(KtpConfirmationType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L26:
            throw new IllegalArgumentException("Required argument \"validateKtpConfirmationType\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public e(KtpConfirmationType r2, String r3, String r4) {
        p.l(r2, "validateKtpConfirmationType");
        this.f148873a = r2;
        this.f148874b = r3;
        this.f148875c = r4;
    }

    public static final e fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final String a() {
        return this.f148874b;
    }

    public final String b() {
        return this.f148875c;
    }

    public final KtpConfirmationType c() {
        return this.f148873a;
    }

    public final Bundle d() {
        Bundle r02 = new Bundle();
        if (Parcelable.class.isAssignableFrom(KtpConfirmationType.class) == false) goto L6;
        KtpConfirmationType r1 = this.f148873a;
        p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable("validateKtpConfirmationType", r1);
    L8:
        r02.putString("changeToken", this.f148874b);
        r02.putString("extraFrom", this.f148875c);
        return r02;
    L6:
        if (Serializable.class.isAssignableFrom(KtpConfirmationType.class) == false) goto L11;
        Parcelable r12 = this.f148873a;
        p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable("validateKtpConfirmationType", (Serializable) r12);
        goto L8
    L11:
        throw new UnsupportedOperationException(KtpConfirmationType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f148873a, r52.f148873a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f148874b, r52.f148874b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f148875c, r52.f148875c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = this.f148873a.hashCode() * 31;
        String r1 = this.f148874b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f148875c;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "SecuritiesKtpConfirmationFragmentArgs(validateKtpConfirmationType=" + this.f148873a + ", changeToken=" + this.f148874b + ", extraFrom=" + this.f148875c + ')';
    }

    public /* synthetic */ e(KtpConfirmationType r1, String r2, String r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = null;
    L8:
        this(r1, r2, r3);
    }
}
