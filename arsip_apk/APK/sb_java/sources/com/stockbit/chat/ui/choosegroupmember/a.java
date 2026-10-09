package com.stockbit.chat.ui.choosegroupmember;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a implements InterfaceC4094y {

    /* renamed from: f, reason: collision with root package name */
    public static final C0572a f55893f = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f55894a;

    /* renamed from: b, reason: collision with root package name */
    public final int f55895b;

    /* renamed from: c, reason: collision with root package name */
    public final int f55896c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final String f55897e;

    /* renamed from: com.stockbit.chat.ui.choosegroupmember.a$a, reason: collision with other inner class name */
    public static final class C0572a {
        public /* synthetic */ C0572a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final a a(Bundle r9) {
            p.l(r9, "bundle");
            r9.setClassLoader(a.class.getClassLoader());
            if (r9.containsKey("groupId") == false) goto L24;
            int r3 = r9.getInt("groupId");
            if (r9.containsKey("roomId") == false) goto L22;
            int r4 = r9.getInt("roomId");
            if (r9.containsKey("memberId") == false) goto L20;
            int r5 = r9.getInt("memberId");
            if (r9.containsKey("isGroupAdmin") == false) goto L18;
            boolean r6 = r9.getBoolean("isGroupAdmin");
            if (r9.containsKey(Constants.MessagePayloadKeys.FROM) == false) goto L14;
            String r92 = r9.getString(Constants.MessagePayloadKeys.FROM);
        L16:
            return new a(r3, r4, r5, r6, r92);
        L14:
            r92 = null;
            goto L16
        L18:
            throw new IllegalArgumentException("Required argument \"isGroupAdmin\" is missing and does not have an android:defaultValue");
        L20:
            throw new IllegalArgumentException("Required argument \"memberId\" is missing and does not have an android:defaultValue");
        L22:
            throw new IllegalArgumentException("Required argument \"roomId\" is missing and does not have an android:defaultValue");
        L24:
            throw new IllegalArgumentException("Required argument \"groupId\" is missing and does not have an android:defaultValue");
        }

        public C0572a() {
        }
    }

    static {
        f55893f = new C0572a(null);
    }

    public a(int r1, int r2, int r3, boolean r4, String r5) {
        this.f55894a = r1;
        this.f55895b = r2;
        this.f55896c = r3;
        this.d = r4;
        this.f55897e = r5;
    }

    public static final a fromBundle(Bundle r1) {
        return f55893f.a(r1);
    }

    public final String a() {
        return this.f55897e;
    }

    public final int b() {
        return this.f55894a;
    }

    public final int c() {
        return this.f55896c;
    }

    public final int d() {
        return this.f55895b;
    }

    public final boolean e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f55894a == r52.f55894a) goto L12;
        return false;
    L12:
        if (this.f55895b == r52.f55895b) goto L15;
        return false;
    L15:
        if (this.f55896c == r52.f55896c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f55897e, r52.f55897e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int r02 = ((((((Integer.hashCode(this.f55894a) * 31) + Integer.hashCode(this.f55895b)) * 31) + Integer.hashCode(this.f55896c)) * 31) + Boolean.hashCode(this.d)) * 31;
        String r1 = this.f55897e;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "ChooseGroupMemberDialogFragmentArgs(groupId=" + this.f55894a + ", roomId=" + this.f55895b + ", memberId=" + this.f55896c + ", isGroupAdmin=" + this.d + ", from=" + this.f55897e + ')';
    }
}
