package com.stockbit.liveness.livenessprep;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.domain.model.entity.amendbank.BankAmendData;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class s implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f121160c = null;
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f121161a;

    /* renamed from: b, reason: collision with root package name */
    public final BankAmendData f121162b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final s a(Bundle r5) {
            kotlin.jvm.internal.p.l(r5, "bundle");
            r5.setClassLoader(s.class.getClassLoader());
            if (r5.containsKey("identityImageUrl") == false) goto L9;
            String r02 = r5.getString("identityImageUrl");
            if (r02 != null) goto L11;
            throw new IllegalArgumentException("Argument \"identityImageUrl\" is marked as non-null but was passed a null value.");
        L11:
            if (r5.containsKey("bankAmendData") == true) goto L13;
            BankAmendData r52 = null;
        L22:
            return new s(r02, r52);
        L13:
            if (Parcelable.class.isAssignableFrom(BankAmendData.class) == false) goto L15;
        L19:
            r52 = (BankAmendData) r5.get("bankAmendData");
            goto L22
        L15:
            if (Serializable.class.isAssignableFrom(BankAmendData.class) == true) goto L19;
            throw new UnsupportedOperationException(BankAmendData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L9:
            r02 = "";
            goto L11
        }

        public a() {
        }
    }

    static {
        f121160c = new a(null);
        d = 8;
    }

    public s(String r2, BankAmendData r3) {
        kotlin.jvm.internal.p.l(r2, "identityImageUrl");
        this.f121161a = r2;
        this.f121162b = r3;
    }

    public static final s fromBundle(Bundle r1) {
        return f121160c.a(r1);
    }

    public final BankAmendData a() {
        return this.f121162b;
    }

    public final String b() {
        return this.f121161a;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        r02.putString("identityImageUrl", this.f121161a);
        if (Parcelable.class.isAssignableFrom(BankAmendData.class) == false) goto L7;
        r02.putParcelable("bankAmendData", this.f121162b);
        return r02;
    L7:
        if (Serializable.class.isAssignableFrom(BankAmendData.class) == false) goto L9;
        r02.putSerializable("bankAmendData", (Serializable) this.f121162b);
    L9:
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof s) == true) goto L8;
        return false;
    L8:
        s r52 = (s) r5;
        if (kotlin.jvm.internal.p.g(this.f121161a, r52.f121161a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f121162b, r52.f121162b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = this.f121161a.hashCode() * 31;
        BankAmendData r1 = this.f121162b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "LivenessPreparationFragmentArgs(identityImageUrl=" + this.f121161a + ", bankAmendData=" + this.f121162b + ')';
    }
}
