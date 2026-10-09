package com.stockbit.explore.ui.people;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.explore.contract.DiscoverFriendTab;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class C implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f91761b = null;

    /* renamed from: a, reason: collision with root package name */
    public final DiscoverFriendTab f91762a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(C.class.getClassLoader());
            if (r4.containsKey("activeTabSuggestion") == false) goto L18;
            if (Parcelable.class.isAssignableFrom(DiscoverFriendTab.class) == false) goto L7;
        L11:
            DiscoverFriendTab r42 = (DiscoverFriendTab) r4.get("activeTabSuggestion");
            if (r42 == null) goto L16;
            return new C(r42);
        L16:
            throw new IllegalArgumentException("Argument \"activeTabSuggestion\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(DiscoverFriendTab.class) == true) goto L11;
            throw new UnsupportedOperationException(DiscoverFriendTab.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L18:
            throw new IllegalArgumentException("Required argument \"activeTabSuggestion\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f91761b = new a(null);
    }

    public C(DiscoverFriendTab r2) {
        kotlin.jvm.internal.p.l(r2, "activeTabSuggestion");
        this.f91762a = r2;
    }

    public static final C fromBundle(Bundle r1) {
        return f91761b.a(r1);
    }

    public final DiscoverFriendTab a() {
        return this.f91762a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        if (Parcelable.class.isAssignableFrom(DiscoverFriendTab.class) == false) goto L7;
        Object r1 = this.f91762a;
        kotlin.jvm.internal.p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable("activeTabSuggestion", (Parcelable) r1);
        return r02;
    L7:
        if (Serializable.class.isAssignableFrom(DiscoverFriendTab.class) == false) goto L11;
        DiscoverFriendTab r12 = this.f91762a;
        kotlin.jvm.internal.p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable("activeTabSuggestion", r12);
        return r02;
    L11:
        throw new UnsupportedOperationException(DiscoverFriendTab.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C) == true) goto L9;
        return false;
    L9:
        if (this.f91762a == ((C) r4).f91762a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f91762a.hashCode();
    }

    public String toString() {
        return "SuggestionUserFragmentArgs(activeTabSuggestion=" + this.f91762a + ')';
    }
}
