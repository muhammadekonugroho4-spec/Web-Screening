package com.stockbit.amendbank.ui.uploadidentity;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.domain.model.entity.amendbank.BankAmendData;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class k implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f46475b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f46476c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final BankAmendData f46477a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final k a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(k.class.getClassLoader());
            if (r4.containsKey("bankAmendData") == true) goto L5;
            BankAmendData r42 = null;
        L14:
            return new k(r42);
        L5:
            if (Parcelable.class.isAssignableFrom(BankAmendData.class) == false) goto L7;
        L11:
            r42 = (BankAmendData) r4.get("bankAmendData");
            goto L14
        L7:
            if (Serializable.class.isAssignableFrom(BankAmendData.class) == true) goto L11;
            throw new UnsupportedOperationException(BankAmendData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        public a() {
        }
    }

    static {
        f46475b = new a(null);
        f46476c = 8;
    }

    public k(BankAmendData r1) {
        this.f46477a = r1;
    }

    public static final k fromBundle(Bundle r1) {
        return f46475b.a(r1);
    }

    public final BankAmendData a() {
        return this.f46477a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof k) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f46477a, ((k) r4).f46477a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        BankAmendData r02 = this.f46477a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "AmendBankUploadIdentityFragmentArgs(bankAmendData=" + this.f46477a + ')';
    }
}
