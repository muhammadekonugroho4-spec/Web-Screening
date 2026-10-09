package com.stockbit.userauth.ui.smsotp;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.domain.model.type.otp.SmsOTPType;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class t implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f165522b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f165523c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final SmsOTPType f165524a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final t a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(t.class.getClassLoader());
            if (r4.containsKey("smsOtpType") == false) goto L18;
            if (Parcelable.class.isAssignableFrom(SmsOTPType.class) == false) goto L7;
        L11:
            SmsOTPType r42 = (SmsOTPType) r4.get("smsOtpType");
            if (r42 == null) goto L16;
            return new t(r42);
        L16:
            throw new IllegalArgumentException("Argument \"smsOtpType\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(SmsOTPType.class) == true) goto L11;
            throw new UnsupportedOperationException(SmsOTPType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L18:
            throw new IllegalArgumentException("Required argument \"smsOtpType\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f165522b = new a(null);
        f165523c = 8;
    }

    public t(SmsOTPType r2) {
        kotlin.jvm.internal.p.l(r2, "smsOtpType");
        this.f165524a = r2;
    }

    public static final t fromBundle(Bundle r1) {
        return f165522b.a(r1);
    }

    public final SmsOTPType a() {
        return this.f165524a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        if (Parcelable.class.isAssignableFrom(SmsOTPType.class) == false) goto L7;
        SmsOTPType r1 = this.f165524a;
        kotlin.jvm.internal.p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable("smsOtpType", r1);
        return r02;
    L7:
        if (Serializable.class.isAssignableFrom(SmsOTPType.class) == false) goto L11;
        Parcelable r12 = this.f165524a;
        kotlin.jvm.internal.p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable("smsOtpType", (Serializable) r12);
        return r02;
    L11:
        throw new UnsupportedOperationException(SmsOTPType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof t) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f165524a, ((t) r4).f165524a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f165524a.hashCode();
    }

    public String toString() {
        return "SmsOTPFragmentArgs(smsOtpType=" + this.f165524a + ')';
    }
}
