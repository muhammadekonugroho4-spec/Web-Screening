package com.stockbit.chat.ui.newgroup;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.usecase.chat.model.group.GroupMemberSelectionType;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class z implements InterfaceC4094y {

    /* renamed from: e, reason: collision with root package name */
    public static final a f56902e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final int f56903f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GroupMemberSelectionType f56904a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f56905b;

    /* renamed from: c, reason: collision with root package name */
    public final int f56906c;
    public final String[] d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final z a(Bundle r6) {
            kotlin.jvm.internal.p.l(r6, "bundle");
            r6.setClassLoader(z.class.getClassLoader());
            if (r6.containsKey("screenType") == false) goto L29;
            if (Parcelable.class.isAssignableFrom(GroupMemberSelectionType.class) == false) goto L7;
        L11:
            GroupMemberSelectionType r02 = (GroupMemberSelectionType) r6.get("screenType");
            if (r02 == null) goto L27;
            int r3 = 0;
            if (r6.containsKey("shouldRefreshList") == false) goto L16;
            boolean r1 = r6.getBoolean("shouldRefreshList");
        L18:
            if (r6.containsKey("maxInviteMembers") == false) goto L21;
            r3 = r6.getInt("maxInviteMembers");
        L21:
            if (r6.containsKey("eligibleRequirements") == false) goto L23;
            String[] r62 = r6.getStringArray("eligibleRequirements");
        L25:
            return new z(r02, r1, r3, r62);
        L23:
            r62 = null;
            goto L25
        L16:
            r1 = false;
            goto L18
        L27:
            throw new IllegalArgumentException("Argument \"screenType\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(GroupMemberSelectionType.class) == true) goto L11;
            throw new UnsupportedOperationException(GroupMemberSelectionType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L29:
            throw new IllegalArgumentException("Required argument \"screenType\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f56902e = new a(null);
        f56903f = 8;
    }

    public z(GroupMemberSelectionType r2, boolean r3, int r4, String[] r5) {
        kotlin.jvm.internal.p.l(r2, "screenType");
        this.f56904a = r2;
        this.f56905b = r3;
        this.f56906c = r4;
        this.d = r5;
    }

    public static final z fromBundle(Bundle r1) {
        return f56902e.a(r1);
    }

    public final String[] a() {
        return this.d;
    }

    public final GroupMemberSelectionType b() {
        return this.f56904a;
    }

    public final boolean c() {
        return this.f56905b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof z) == true) goto L8;
        return false;
    L8:
        z r52 = (z) r5;
        if (kotlin.jvm.internal.p.g(this.f56904a, r52.f56904a) == true) goto L12;
        return false;
    L12:
        if (this.f56905b == r52.f56905b) goto L15;
        return false;
    L15:
        if (this.f56906c == r52.f56906c) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((((this.f56904a.hashCode() * 31) + Boolean.hashCode(this.f56905b)) * 31) + Integer.hashCode(this.f56906c)) * 31;
        String[] r1 = this.d;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = Arrays.hashCode(r1);
        goto L7
    }

    public String toString() {
        return "ChatNewGroupSelectionFragmentArgs(screenType=" + this.f56904a + ", shouldRefreshList=" + this.f56905b + ", maxInviteMembers=" + this.f56906c + ", eligibleRequirements=" + Arrays.toString(this.d) + ')';
    }
}
