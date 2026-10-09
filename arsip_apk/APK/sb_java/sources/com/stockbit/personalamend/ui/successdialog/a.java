package com.stockbit.personalamend.ui.successdialog;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final C1148a f126900c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f126901a;

    /* renamed from: b, reason: collision with root package name */
    public final String f126902b;

    /* renamed from: com.stockbit.personalamend.ui.successdialog.a$a, reason: collision with other inner class name */
    public static final class C1148a {
        public /* synthetic */ C1148a(i r1) {
            this();
        }

        public final a a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(a.class.getClassLoader());
            if (r4.containsKey(Constants.KEY_TITLE) == false) goto L19;
            String r02 = r4.getString(Constants.KEY_TITLE);
            if (r02 == null) goto L17;
            if (r4.containsKey("description") == false) goto L15;
            String r42 = r4.getString("description");
            if (r42 == null) goto L13;
            return new a(r02, r42);
        L13:
            throw new IllegalArgumentException("Argument \"description\" is marked as non-null but was passed a null value.");
        L15:
            throw new IllegalArgumentException("Required argument \"description\" is missing and does not have an android:defaultValue");
        L17:
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        L19:
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }

        public C1148a() {
        }
    }

    static {
        f126900c = new C1148a(null);
    }

    public a(String r2, String r3) {
        p.l(r2, Constants.KEY_TITLE);
        p.l(r3, "description");
        this.f126901a = r2;
        this.f126902b = r3;
    }

    public static final a fromBundle(Bundle r1) {
        return f126900c.a(r1);
    }

    public final String a() {
        return this.f126902b;
    }

    public final String b() {
        return this.f126901a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f126901a, r52.f126901a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f126902b, r52.f126902b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f126901a.hashCode() * 31) + this.f126902b.hashCode();
    }

    public String toString() {
        return "AmendSuccessDialogArgs(title=" + this.f126901a + ", description=" + this.f126902b + ')';
    }
}
