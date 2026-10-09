package com.stockbit.amendbank.ui.dialog;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.domain.model.type.amendbank.BankState;
import java.io.Serializable;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public final class a implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final C0519a f46252c = null;

    /* renamed from: a, reason: collision with root package name */
    public final BankState f46253a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46254b;

    /* renamed from: com.stockbit.amendbank.ui.dialog.a$a, reason: collision with other inner class name */
    public static final class C0519a {
        public /* synthetic */ C0519a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final a a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(a.class.getClassLoader());
            if (r4.containsKey("bankState") == false) goto L22;
            if (Parcelable.class.isAssignableFrom(BankState.class) == false) goto L7;
        L11:
            BankState r02 = (BankState) r4.get("bankState");
            if (r02 == null) goto L20;
            if (r4.containsKey("maxAccount") == false) goto L16;
            int r42 = r4.getInt("maxAccount");
        L18:
            return new a(r02, r42);
        L16:
            r42 = 3;
            goto L18
        L20:
            throw new IllegalArgumentException("Argument \"bankState\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(BankState.class) == true) goto L11;
            throw new UnsupportedOperationException(BankState.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L22:
            throw new IllegalArgumentException("Required argument \"bankState\" is missing and does not have an android:defaultValue");
        }

        public C0519a() {
        }
    }

    static {
        f46252c = new C0519a(null);
    }

    public a(BankState r2, int r3) {
        p.l(r2, "bankState");
        this.f46253a = r2;
        this.f46254b = r3;
    }

    public static final a fromBundle(Bundle r1) {
        return f46252c.a(r1);
    }

    public final BankState a() {
        return this.f46253a;
    }

    public final int b() {
        return this.f46254b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f46253a == r52.f46253a) goto L12;
        return false;
    L12:
        if (this.f46254b == r52.f46254b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f46253a.hashCode() * 31) + Integer.hashCode(this.f46254b);
    }

    public String toString() {
        return "AmendBankBasicDialogFragmentArgs(bankState=" + this.f46253a + ", maxAccount=" + this.f46254b + ')';
    }
}
