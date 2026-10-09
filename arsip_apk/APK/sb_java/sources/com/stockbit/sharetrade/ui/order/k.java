package com.stockbit.sharetrade.ui.order;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.google.firebase.messaging.Constants;
import com.stockbit.domain.model.entity.sharetrade.AutoShareArgs;
import java.io.Serializable;

/* loaded from: classes11.dex */
public final class k implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f137248b = null;

    /* renamed from: a, reason: collision with root package name */
    public final AutoShareArgs f137249a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final k a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(k.class.getClassLoader());
            if (r4.containsKey(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) == false) goto L18;
            if (Parcelable.class.isAssignableFrom(AutoShareArgs.class) == false) goto L7;
        L11:
            AutoShareArgs r42 = (AutoShareArgs) r4.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (r42 == null) goto L16;
            return new k(r42);
        L16:
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(AutoShareArgs.class) == true) goto L11;
            throw new UnsupportedOperationException(AutoShareArgs.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L18:
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f137248b = new a(null);
    }

    public k(AutoShareArgs r2) {
        kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f137249a = r2;
    }

    public static final k fromBundle(Bundle r1) {
        return f137248b.a(r1);
    }

    public final AutoShareArgs a() {
        return this.f137249a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        if (Parcelable.class.isAssignableFrom(AutoShareArgs.class) == false) goto L7;
        AutoShareArgs r1 = this.f137249a;
        kotlin.jvm.internal.p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, r1);
        return r02;
    L7:
        if (Serializable.class.isAssignableFrom(AutoShareArgs.class) == false) goto L11;
        Parcelable r12 = this.f137249a;
        kotlin.jvm.internal.p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (Serializable) r12);
        return r02;
    L11:
        throw new UnsupportedOperationException(AutoShareArgs.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof k) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f137249a, ((k) r4).f137249a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f137249a.hashCode();
    }

    public String toString() {
        return "ShareTradeOrderFragmentArgs(data=" + this.f137249a + ')';
    }
}
