package com.stockbit.feature.verification.ui.otp;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.feature.verification.model.VerificationOTPChannelParam;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class b implements InterfaceC4094y {

    /* renamed from: e, reason: collision with root package name */
    public static final a f119029e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final int f119030f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f119031a;

    /* renamed from: b, reason: collision with root package name */
    public final VerificationOTPChannelParam f119032b;

    /* renamed from: c, reason: collision with root package name */
    public final VerificationOTPChannelParam[] f119033c;
    public final boolean d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final b a(Bundle r10) {
            p.l(r10, "bundle");
            r10.setClassLoader(b.class.getClassLoader());
            if (r10.containsKey("showLostPhoneButton") == false) goto L5;
            boolean r02 = r10.getBoolean("showLostPhoneButton");
        L7:
            if (r10.containsKey("verificationToken") == false) goto L44;
            String r1 = r10.getString("verificationToken");
            if (r1 == null) goto L42;
            if (r10.containsKey("defaultChannel") == false) goto L40;
            if (Parcelable.class.isAssignableFrom(VerificationOTPChannelParam.class) == false) goto L15;
        L19:
            VerificationOTPChannelParam r3 = (VerificationOTPChannelParam) r10.get("defaultChannel");
            if (r3 == null) goto L38;
            if (r10.containsKey("availableChannels") == false) goto L36;
            Parcelable[] r102 = r10.getParcelableArray("availableChannels");
            if (r102 == null) goto L29;
            ArrayList r4 = new ArrayList(r102.length);
            int r5 = r102.length;
            int r6 = 0;
        L26:
            if (r6 >= r5) goto L28;
            Parcelable r7 = r102[r6];
            p.j(r7, "null cannot be cast to non-null type com.stockbit.feature.verification.model.VerificationOTPChannelParam");
            r4.add((VerificationOTPChannelParam) r7);
            r6 = r6 + 1;
            goto L26
        L28:
            VerificationOTPChannelParam[] r103 = (VerificationOTPChannelParam[]) r4.toArray(new VerificationOTPChannelParam[0]);
        L30:
            if (r103 == null) goto L34;
            return new b(r1, r3, r103, r02);
        L34:
            throw new IllegalArgumentException("Argument \"availableChannels\" is marked as non-null but was passed a null value.");
        L29:
            r103 = null;
            goto L30
        L36:
            throw new IllegalArgumentException("Required argument \"availableChannels\" is missing and does not have an android:defaultValue");
        L38:
            throw new IllegalArgumentException("Argument \"defaultChannel\" is marked as non-null but was passed a null value.");
        L15:
            if (Serializable.class.isAssignableFrom(VerificationOTPChannelParam.class) == true) goto L19;
            throw new UnsupportedOperationException(VerificationOTPChannelParam.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L40:
            throw new IllegalArgumentException("Required argument \"defaultChannel\" is missing and does not have an android:defaultValue");
        L42:
            throw new IllegalArgumentException("Argument \"verificationToken\" is marked as non-null but was passed a null value.");
        L44:
            throw new IllegalArgumentException("Required argument \"verificationToken\" is missing and does not have an android:defaultValue");
        L5:
            r02 = false;
            goto L7
        }

        public a() {
        }
    }

    static {
        f119029e = new a(null);
        f119030f = 8;
    }

    public b(String r2, VerificationOTPChannelParam r3, VerificationOTPChannelParam[] r4, boolean r5) {
        p.l(r2, "verificationToken");
        p.l(r3, "defaultChannel");
        p.l(r4, "availableChannels");
        this.f119031a = r2;
        this.f119032b = r3;
        this.f119033c = r4;
        this.d = r5;
    }

    public static final b fromBundle(Bundle r1) {
        return f119029e.a(r1);
    }

    public final VerificationOTPChannelParam[] a() {
        return this.f119033c;
    }

    public final VerificationOTPChannelParam b() {
        return this.f119032b;
    }

    public final boolean c() {
        return this.d;
    }

    public final String d() {
        return this.f119031a;
    }

    public final Bundle e() {
        Bundle r02 = new Bundle();
        r02.putBoolean("showLostPhoneButton", this.d);
        r02.putString("verificationToken", this.f119031a);
        if (Parcelable.class.isAssignableFrom(VerificationOTPChannelParam.class) == false) goto L6;
        VerificationOTPChannelParam r1 = this.f119032b;
        p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable("defaultChannel", r1);
    L8:
        r02.putParcelableArray("availableChannels", this.f119033c);
        return r02;
    L6:
        if (Serializable.class.isAssignableFrom(VerificationOTPChannelParam.class) == false) goto L11;
        Parcelable r12 = this.f119032b;
        p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable("defaultChannel", (Serializable) r12);
        goto L8
    L11:
        throw new UnsupportedOperationException(VerificationOTPChannelParam.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f119031a, r52.f119031a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f119032b, r52.f119032b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f119033c, r52.f119033c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f119031a.hashCode() * 31) + this.f119032b.hashCode()) * 31) + Arrays.hashCode(this.f119033c)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "OTPVerificationFragmentArgs(verificationToken=" + this.f119031a + ", defaultChannel=" + this.f119032b + ", availableChannels=" + Arrays.toString(this.f119033c) + ", showLostPhoneButton=" + this.d + ')';
    }
}
