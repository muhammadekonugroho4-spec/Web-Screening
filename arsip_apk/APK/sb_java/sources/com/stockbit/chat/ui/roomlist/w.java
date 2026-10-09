package com.stockbit.chat.ui.roomlist;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes7.dex */
public final class w implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f59040b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f59041a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final w a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(w.class.getClassLoader());
            if (r3.containsKey("imageToShare") == false) goto L5;
            String r32 = r3.getString("imageToShare");
        L7:
            return new w(r32);
        L5:
            r32 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f59040b = new a(null);
    }

    public w(String r1) {
        this.f59041a = r1;
    }

    public static final w fromBundle(Bundle r1) {
        return f59040b.a(r1);
    }

    public final String a() {
        return this.f59041a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("imageToShare", this.f59041a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof w) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f59041a, ((w) r4).f59041a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f59041a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "ChatRoomListFragmentArgs(imageToShare=" + this.f59041a + ')';
    }
}
