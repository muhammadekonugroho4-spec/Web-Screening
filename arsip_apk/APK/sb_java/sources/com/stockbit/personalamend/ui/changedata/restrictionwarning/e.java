package com.stockbit.personalamend.ui.changedata.restrictionwarning;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.usecase.personalamend.model.ChangeTokenReqTypeUIState;
import java.io.Serializable;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class e implements InterfaceC4094y {

    /* renamed from: e, reason: collision with root package name */
    public static final a f125508e = null;

    /* renamed from: a, reason: collision with root package name */
    public final ChangeTokenReqTypeUIState f125509a;

    /* renamed from: b, reason: collision with root package name */
    public final String f125510b;

    /* renamed from: c, reason: collision with root package name */
    public final String f125511c;
    public final String d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final e a(Bundle r6) {
            p.l(r6, "bundle");
            r6.setClassLoader(e.class.getClassLoader());
            if (r6.containsKey("changeRequestType") == false) goto L33;
            if (Parcelable.class.isAssignableFrom(ChangeTokenReqTypeUIState.class) == false) goto L7;
        L11:
            ChangeTokenReqTypeUIState r02 = (ChangeTokenReqTypeUIState) r6.get("changeRequestType");
            if (r02 == null) goto L31;
            String r3 = null;
            if (r6.containsKey("changePhoneSource") == false) goto L16;
            String r1 = r6.getString("changePhoneSource");
        L18:
            if (r6.containsKey("changeEmailSource") == false) goto L21;
            r3 = r6.getString("changeEmailSource");
        L21:
            if (r6.containsKey("value") == false) goto L29;
            String r62 = r6.getString("value");
            if (r62 == null) goto L27;
            return new e(r02, r62, r1, r3);
        L27:
            throw new IllegalArgumentException("Argument \"value\" is marked as non-null but was passed a null value.");
        L29:
            throw new IllegalArgumentException("Required argument \"value\" is missing and does not have an android:defaultValue");
        L16:
            r1 = null;
            goto L18
        L31:
            throw new IllegalArgumentException("Argument \"changeRequestType\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(ChangeTokenReqTypeUIState.class) == true) goto L11;
            throw new UnsupportedOperationException(ChangeTokenReqTypeUIState.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L33:
            throw new IllegalArgumentException("Required argument \"changeRequestType\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f125508e = new a(null);
    }

    public e(ChangeTokenReqTypeUIState r2, String r3, String r4, String r5) {
        p.l(r2, "changeRequestType");
        p.l(r3, "value");
        this.f125509a = r2;
        this.f125510b = r3;
        this.f125511c = r4;
        this.d = r5;
    }

    public static final e fromBundle(Bundle r1) {
        return f125508e.a(r1);
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f125511c;
    }

    public final ChangeTokenReqTypeUIState c() {
        return this.f125509a;
    }

    public final String d() {
        return this.f125510b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (this.f125509a == r52.f125509a) goto L12;
        return false;
    L12:
        if (p.g(this.f125510b, r52.f125510b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f125511c, r52.f125511c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f125509a.hashCode() * 31) + this.f125510b.hashCode()) * 31;
        String r1 = this.f125511c;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.d;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "RestrictionWarningDialogArgs(changeRequestType=" + this.f125509a + ", value=" + this.f125510b + ", changePhoneSource=" + this.f125511c + ", changeEmailSource=" + this.d + ')';
    }
}
