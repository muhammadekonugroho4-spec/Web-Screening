package com.stockbit.chat.ui.searchgroupmember;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.usecase.chat.model.group.SearchGroupMemberArgs;
import java.io.Serializable;

/* loaded from: classes7.dex */
public final class f implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f59260b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f59261c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final SearchGroupMemberArgs f59262a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final f a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(f.class.getClassLoader());
            if (r4.containsKey("groupDetail") == false) goto L18;
            if (Parcelable.class.isAssignableFrom(SearchGroupMemberArgs.class) == false) goto L7;
        L11:
            SearchGroupMemberArgs r42 = (SearchGroupMemberArgs) r4.get("groupDetail");
            if (r42 == null) goto L16;
            return new f(r42);
        L16:
            throw new IllegalArgumentException("Argument \"groupDetail\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(SearchGroupMemberArgs.class) == true) goto L11;
            throw new UnsupportedOperationException(SearchGroupMemberArgs.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L18:
            throw new IllegalArgumentException("Required argument \"groupDetail\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f59260b = new a(null);
        f59261c = 8;
    }

    public f(SearchGroupMemberArgs r2) {
        kotlin.jvm.internal.p.l(r2, "groupDetail");
        this.f59262a = r2;
    }

    public static final f fromBundle(Bundle r1) {
        return f59260b.a(r1);
    }

    public final SearchGroupMemberArgs a() {
        return this.f59262a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof f) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f59262a, ((f) r4).f59262a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f59262a.hashCode();
    }

    public String toString() {
        return "SearchGroupMemberFragmentArgs(groupDetail=" + this.f59262a + ')';
    }
}
