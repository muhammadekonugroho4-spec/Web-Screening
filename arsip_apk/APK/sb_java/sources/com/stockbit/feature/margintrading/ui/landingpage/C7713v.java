package com.stockbit.feature.margintrading.ui.landingpage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.usecase.margintrading.model.MarginTradingActivationUIState;
import java.io.Serializable;

/* renamed from: com.stockbit.feature.margintrading.ui.landingpage.v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7713v implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f99858b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f99859c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final MarginTradingActivationUIState f99860a;

    /* renamed from: com.stockbit.feature.margintrading.ui.landingpage.v$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C7713v a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(C7713v.class.getClassLoader());
            if (r4.containsKey("marginTradingInformation") == false) goto L14;
            if (Parcelable.class.isAssignableFrom(MarginTradingActivationUIState.class) == true) goto L12;
            if (Serializable.class.isAssignableFrom(MarginTradingActivationUIState.class) == true) goto L12;
            throw new UnsupportedOperationException(MarginTradingActivationUIState.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L12:
            return new C7713v((MarginTradingActivationUIState) r4.get("marginTradingInformation"));
        L14:
            throw new IllegalArgumentException("Required argument \"marginTradingInformation\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f99858b = new a(null);
        f99859c = 8;
    }

    public C7713v(MarginTradingActivationUIState r1) {
        this.f99860a = r1;
    }

    public static final C7713v fromBundle(Bundle r1) {
        return f99858b.a(r1);
    }

    public final MarginTradingActivationUIState a() {
        return this.f99860a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        if (Parcelable.class.isAssignableFrom(MarginTradingActivationUIState.class) == false) goto L7;
        r02.putParcelable("marginTradingInformation", (Parcelable) this.f99860a);
        return r02;
    L7:
        if (Serializable.class.isAssignableFrom(MarginTradingActivationUIState.class) == false) goto L11;
        r02.putSerializable("marginTradingInformation", this.f99860a);
        return r02;
    L11:
        throw new UnsupportedOperationException(MarginTradingActivationUIState.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C7713v) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f99860a, ((C7713v) r4).f99860a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        MarginTradingActivationUIState r02 = this.f99860a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "MarginTradingLandingPageComposeFragmentArgs(marginTradingInformation=" + this.f99860a + ')';
    }
}
