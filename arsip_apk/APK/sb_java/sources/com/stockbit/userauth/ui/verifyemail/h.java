package com.stockbit.userauth.ui.verifyemail;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.domain.model.entity.EmailVerificationArg;
import java.io.Serializable;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class h implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f165564b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f165565c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final EmailVerificationArg f165566a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final h a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(h.class.getClassLoader());
            if (r4.containsKey("EXTRA_EMAIL_VERIFICATION") == true) goto L5;
            EmailVerificationArg r42 = null;
        L14:
            return new h(r42);
        L5:
            if (Parcelable.class.isAssignableFrom(EmailVerificationArg.class) == false) goto L7;
        L11:
            r42 = (EmailVerificationArg) r4.get("EXTRA_EMAIL_VERIFICATION");
            goto L14
        L7:
            if (Serializable.class.isAssignableFrom(EmailVerificationArg.class) == true) goto L11;
            throw new UnsupportedOperationException(EmailVerificationArg.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        public a() {
        }
    }

    static {
        f165564b = new a(null);
        f165565c = 8;
    }

    public h(EmailVerificationArg r1) {
        this.f165566a = r1;
    }

    public static final h fromBundle(Bundle r1) {
        return f165564b.a(r1);
    }

    public final EmailVerificationArg a() {
        return this.f165566a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof h) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f165566a, ((h) r4).f165566a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        EmailVerificationArg r02 = this.f165566a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "VerifyEmailFragmentArgs(EXTRAEMAILVERIFICATION=" + this.f165566a + ')';
    }
}
