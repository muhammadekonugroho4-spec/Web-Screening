package com.stockbit.chat.ui.assignadmin;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.google.firebase.messaging.Constants;
import com.stockbit.usecase.chat.model.group.AssignAdminUIState;
import java.io.Serializable;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class d implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f55677b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f55678c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final AssignAdminUIState f55679a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final d a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(d.class.getClassLoader());
            if (r4.containsKey(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) == false) goto L18;
            if (Parcelable.class.isAssignableFrom(AssignAdminUIState.class) == false) goto L7;
        L11:
            AssignAdminUIState r42 = (AssignAdminUIState) r4.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (r42 == null) goto L16;
            return new d(r42);
        L16:
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(AssignAdminUIState.class) == true) goto L11;
            throw new UnsupportedOperationException(AssignAdminUIState.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L18:
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f55677b = new a(null);
        f55678c = 8;
    }

    public d(AssignAdminUIState r2) {
        p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f55679a = r2;
    }

    public static final d fromBundle(Bundle r1) {
        return f55677b.a(r1);
    }

    public final AssignAdminUIState a() {
        return this.f55679a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof d) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f55679a, ((d) r4).f55679a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f55679a.hashCode();
    }

    public String toString() {
        return "AssignAdminFragmentArgs(data=" + this.f55679a + ')';
    }
}
