package com.stockbit.chat.ui.room.group;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.usecase.chat.model.group.GroupRoomData;
import java.io.Serializable;

/* loaded from: classes7.dex */
public final class Q implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f58384c = null;
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GroupRoomData f58385a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58386b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final Q a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(Q.class.getClassLoader());
            if (r4.containsKey("groupData") == false) goto L22;
            if (Parcelable.class.isAssignableFrom(GroupRoomData.class) == false) goto L7;
        L11:
            GroupRoomData r02 = (GroupRoomData) r4.get("groupData");
            if (r02 == null) goto L20;
            if (r4.containsKey("isFromDeeplink") == false) goto L16;
            boolean r42 = r4.getBoolean("isFromDeeplink");
        L18:
            return new Q(r02, r42);
        L16:
            r42 = false;
            goto L18
        L20:
            throw new IllegalArgumentException("Argument \"groupData\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(GroupRoomData.class) == true) goto L11;
            throw new UnsupportedOperationException(GroupRoomData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L22:
            throw new IllegalArgumentException("Required argument \"groupData\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f58384c = new a(null);
        d = 8;
    }

    public Q(GroupRoomData r2, boolean r3) {
        kotlin.jvm.internal.p.l(r2, "groupData");
        this.f58385a = r2;
        this.f58386b = r3;
    }

    public static final Q fromBundle(Bundle r1) {
        return f58384c.a(r1);
    }

    public final GroupRoomData a() {
        return this.f58385a;
    }

    public final boolean b() {
        return this.f58386b;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        if (Parcelable.class.isAssignableFrom(GroupRoomData.class) == false) goto L6;
        Object r1 = this.f58385a;
        kotlin.jvm.internal.p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable("groupData", (Parcelable) r1);
    L8:
        r02.putBoolean("isFromDeeplink", this.f58386b);
        return r02;
    L6:
        if (Serializable.class.isAssignableFrom(GroupRoomData.class) == false) goto L11;
        GroupRoomData r12 = this.f58385a;
        kotlin.jvm.internal.p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable("groupData", r12);
        goto L8
    L11:
        throw new UnsupportedOperationException(GroupRoomData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Q) == true) goto L8;
        return false;
    L8:
        Q r52 = (Q) r5;
        if (kotlin.jvm.internal.p.g(this.f58385a, r52.f58385a) == true) goto L12;
        return false;
    L12:
        if (this.f58386b == r52.f58386b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f58385a.hashCode() * 31) + Boolean.hashCode(this.f58386b);
    }

    public String toString() {
        return "ChatGroupRoomFragmentArgs(groupData=" + this.f58385a + ", isFromDeeplink=" + this.f58386b + ')';
    }
}
