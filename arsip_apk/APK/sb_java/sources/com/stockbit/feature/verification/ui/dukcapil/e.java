package com.stockbit.feature.verification.ui.dukcapil;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.verification.contract.VerificationEntryMode;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class e implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f118962c = null;

    /* renamed from: a, reason: collision with root package name */
    public final VerificationEntryMode f118963a;

    /* renamed from: b, reason: collision with root package name */
    public final String f118964b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final e a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(e.class.getClassLoader());
            if (r4.containsKey("entryMode") == true) goto L5;
            VerificationEntryMode r02 = VerificationEntryMode.FROM_CHALLENGE;
        L18:
            if (r4.containsKey("verificationToken") == false) goto L24;
            String r42 = r4.getString("verificationToken");
            if (r42 != null) goto L26;
            throw new IllegalArgumentException("Argument \"verificationToken\" is marked as non-null but was passed a null value.");
        L26:
            return new e(r02, r42);
        L24:
            r42 = "";
            goto L26
        L5:
            if (Parcelable.class.isAssignableFrom(VerificationEntryMode.class) == false) goto L7;
        L11:
            r02 = (VerificationEntryMode) r4.get("entryMode");
            if (r02 != null) goto L18;
            throw new IllegalArgumentException("Argument \"entryMode\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(VerificationEntryMode.class) == true) goto L11;
            throw new UnsupportedOperationException(VerificationEntryMode.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        public a() {
        }
    }

    static {
        f118962c = new a(null);
    }

    public e(VerificationEntryMode r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "entryMode");
        kotlin.jvm.internal.p.l(r3, "verificationToken");
        this.f118963a = r2;
        this.f118964b = r3;
    }

    public static final e fromBundle(Bundle r1) {
        return f118962c.a(r1);
    }

    public final VerificationEntryMode a() {
        return this.f118963a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        if (Parcelable.class.isAssignableFrom(VerificationEntryMode.class) == false) goto L6;
        Object r1 = this.f118963a;
        kotlin.jvm.internal.p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable("entryMode", (Parcelable) r1);
    L8:
        r02.putString("verificationToken", this.f118964b);
        return r02;
    L6:
        if (Serializable.class.isAssignableFrom(VerificationEntryMode.class) == false) goto L8;
        VerificationEntryMode r12 = this.f118963a;
        kotlin.jvm.internal.p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable("entryMode", r12);
        goto L8
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (this.f118963a == r52.f118963a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f118964b, r52.f118964b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f118963a.hashCode() * 31) + this.f118964b.hashCode();
    }

    public String toString() {
        return "DukcapilVerificationFragmentArgs(entryMode=" + this.f118963a + ", verificationToken=" + this.f118964b + ')';
    }
}
