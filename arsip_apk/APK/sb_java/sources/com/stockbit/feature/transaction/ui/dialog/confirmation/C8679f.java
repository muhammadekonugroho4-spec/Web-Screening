package com.stockbit.feature.transaction.ui.dialog.confirmation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.domain.model.entity.securities.TransactionConfirmationType;
import java.io.Serializable;

/* renamed from: com.stockbit.feature.transaction.ui.dialog.confirmation.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8679f implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f113403a;

    /* renamed from: b, reason: collision with root package name */
    public final String f113404b;

    /* renamed from: c, reason: collision with root package name */
    public final TransactionConfirmationType f113405c;

    /* renamed from: com.stockbit.feature.transaction.ui.dialog.confirmation.f$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C8679f a(Bundle r6) {
            kotlin.jvm.internal.p.l(r6, "bundle");
            r6.setClassLoader(C8679f.class.getClassLoader());
            if (r6.containsKey("isDayTrade") == false) goto L30;
            boolean r02 = r6.getBoolean("isDayTrade");
            if (r6.containsKey("companyType") == false) goto L28;
            String r1 = r6.getString("companyType");
            if (r1 == null) goto L26;
            if (r6.containsKey("confirmationPage") == false) goto L24;
            if (Parcelable.class.isAssignableFrom(TransactionConfirmationType.class) == false) goto L13;
        L17:
            TransactionConfirmationType r62 = (TransactionConfirmationType) r6.get("confirmationPage");
            if (r62 == null) goto L22;
            return new C8679f(r02, r1, r62);
        L22:
            throw new IllegalArgumentException("Argument \"confirmationPage\" is marked as non-null but was passed a null value.");
        L13:
            if (Serializable.class.isAssignableFrom(TransactionConfirmationType.class) == true) goto L17;
            throw new UnsupportedOperationException(TransactionConfirmationType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L24:
            throw new IllegalArgumentException("Required argument \"confirmationPage\" is missing and does not have an android:defaultValue");
        L26:
            throw new IllegalArgumentException("Argument \"companyType\" is marked as non-null but was passed a null value.");
        L28:
            throw new IllegalArgumentException("Required argument \"companyType\" is missing and does not have an android:defaultValue");
        L30:
            throw new IllegalArgumentException("Required argument \"isDayTrade\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public C8679f(boolean r2, String r3, TransactionConfirmationType r4) {
        kotlin.jvm.internal.p.l(r3, "companyType");
        kotlin.jvm.internal.p.l(r4, "confirmationPage");
        this.f113403a = r2;
        this.f113404b = r3;
        this.f113405c = r4;
    }

    public static final C8679f fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final String a() {
        return this.f113404b;
    }

    public final TransactionConfirmationType b() {
        return this.f113405c;
    }

    public final boolean c() {
        return this.f113403a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C8679f) == true) goto L8;
        return false;
    L8:
        C8679f r52 = (C8679f) r5;
        if (this.f113403a == r52.f113403a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f113404b, r52.f113404b) == true) goto L15;
        return false;
    L15:
        if (this.f113405c == r52.f113405c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f113403a) * 31) + this.f113404b.hashCode()) * 31) + this.f113405c.hashCode();
    }

    public String toString() {
        return "PreviewExchangeFeeBottomSheetArgs(isDayTrade=" + this.f113403a + ", companyType=" + this.f113404b + ", confirmationPage=" + this.f113405c + ')';
    }
}
