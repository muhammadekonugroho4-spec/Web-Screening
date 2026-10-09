package com.stockbit.chat.ui.leavegroup;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.google.firebase.messaging.Constants;
import com.stockbit.usecase.chat.model.group.LeaveGroupInfoArgs;
import java.io.Serializable;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class j implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f56492b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f56493c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final LeaveGroupInfoArgs f56494a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final j a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(j.class.getClassLoader());
            if (r4.containsKey(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) == false) goto L18;
            if (Parcelable.class.isAssignableFrom(LeaveGroupInfoArgs.class) == false) goto L7;
        L11:
            LeaveGroupInfoArgs r42 = (LeaveGroupInfoArgs) r4.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (r42 == null) goto L16;
            return new j(r42);
        L16:
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(LeaveGroupInfoArgs.class) == true) goto L11;
            throw new UnsupportedOperationException(LeaveGroupInfoArgs.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L18:
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f56492b = new a(null);
        f56493c = 8;
    }

    public j(LeaveGroupInfoArgs r2) {
        p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f56494a = r2;
    }

    public static final j fromBundle(Bundle r1) {
        return f56492b.a(r1);
    }

    public final LeaveGroupInfoArgs a() {
        return this.f56494a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof j) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f56494a, ((j) r4).f56494a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f56494a.hashCode();
    }

    public String toString() {
        return "LeaveGroupFragmentArgs(data=" + this.f56494a + ')';
    }
}
