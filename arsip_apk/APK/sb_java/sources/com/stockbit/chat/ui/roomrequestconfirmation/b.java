package com.stockbit.chat.ui.roomrequestconfirmation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.google.firebase.messaging.Constants;
import com.stockbit.usecase.chat.model.room.RoomRequestConfirmationArgs;
import java.io.Serializable;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class b implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f59175b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f59176c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final RoomRequestConfirmationArgs f59177a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final b a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(b.class.getClassLoader());
            if (r4.containsKey(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) == false) goto L18;
            if (Parcelable.class.isAssignableFrom(RoomRequestConfirmationArgs.class) == false) goto L7;
        L11:
            RoomRequestConfirmationArgs r42 = (RoomRequestConfirmationArgs) r4.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (r42 == null) goto L16;
            return new b(r42);
        L16:
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(RoomRequestConfirmationArgs.class) == true) goto L11;
            throw new UnsupportedOperationException(RoomRequestConfirmationArgs.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L18:
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f59175b = new a(null);
        f59176c = 8;
    }

    public b(RoomRequestConfirmationArgs r2) {
        p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f59177a = r2;
    }

    public static final b fromBundle(Bundle r1) {
        return f59175b.a(r1);
    }

    public final RoomRequestConfirmationArgs a() {
        return this.f59177a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f59177a, ((b) r4).f59177a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f59177a.hashCode();
    }

    public String toString() {
        return "RoomRequestConfirmationDialogArgs(data=" + this.f59177a + ')';
    }
}
