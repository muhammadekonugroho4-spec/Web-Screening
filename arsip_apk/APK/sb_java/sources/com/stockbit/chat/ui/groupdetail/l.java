package com.stockbit.chat.ui.groupdetail;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.usecase.chat.model.group.GroupDetailArgs;
import java.io.Serializable;

/* loaded from: classes7.dex */
public final class l implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f56152b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f56153c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GroupDetailArgs f56154a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final l a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(l.class.getClassLoader());
            if (r4.containsKey("groupDetail") == false) goto L18;
            if (Parcelable.class.isAssignableFrom(GroupDetailArgs.class) == false) goto L7;
        L11:
            GroupDetailArgs r42 = (GroupDetailArgs) r4.get("groupDetail");
            if (r42 == null) goto L16;
            return new l(r42);
        L16:
            throw new IllegalArgumentException("Argument \"groupDetail\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(GroupDetailArgs.class) == true) goto L11;
            throw new UnsupportedOperationException(GroupDetailArgs.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L18:
            throw new IllegalArgumentException("Required argument \"groupDetail\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f56152b = new a(null);
        f56153c = 8;
    }

    public l(GroupDetailArgs r2) {
        kotlin.jvm.internal.p.l(r2, "groupDetail");
        this.f56154a = r2;
    }

    public static final l fromBundle(Bundle r1) {
        return f56152b.a(r1);
    }

    public final GroupDetailArgs a() {
        return this.f56154a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof l) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f56154a, ((l) r4).f56154a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f56154a.hashCode();
    }

    public String toString() {
        return "GroupDetailFragmentArgs(groupDetail=" + this.f56154a + ')';
    }
}
