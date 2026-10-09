package com.stockbit.feature.trusteddevice.ui.login.approvalexpired;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.feature.trusteddevice.contract.PromptType;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class e implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f118337b = null;

    /* renamed from: a, reason: collision with root package name */
    public final PromptType f118338a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final e a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(e.class.getClassLoader());
            if (r4.containsKey("type") == true) goto L5;
            PromptType r42 = PromptType.NEW_LOGIN;
        L18:
            return new e(r42);
        L5:
            if (Parcelable.class.isAssignableFrom(PromptType.class) == false) goto L7;
        L11:
            r42 = (PromptType) r4.get("type");
            if (r42 != null) goto L18;
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(PromptType.class) == true) goto L11;
            throw new UnsupportedOperationException(PromptType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        public a() {
        }
    }

    static {
        f118337b = new a(null);
    }

    public e(PromptType r2) {
        kotlin.jvm.internal.p.l(r2, "type");
        this.f118338a = r2;
    }

    public static final e fromBundle(Bundle r1) {
        return f118337b.a(r1);
    }

    public final PromptType a() {
        return this.f118338a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof e) == true) goto L9;
        return false;
    L9:
        if (this.f118338a == ((e) r4).f118338a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f118338a.hashCode();
    }

    public String toString() {
        return "LoginApprovalExpiredFragmentArgs(type=" + this.f118338a + ')';
    }
}
