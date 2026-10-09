package com.stockbit.chat.ui.deletemessage;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final C0574a f56002c = null;
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f56003a;

    /* renamed from: b, reason: collision with root package name */
    public final String f56004b;

    /* renamed from: com.stockbit.chat.ui.deletemessage.a$a, reason: collision with other inner class name */
    public static final class C0574a {
        public /* synthetic */ C0574a(i r1) {
            this();
        }

        public final a a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(a.class.getClassLoader());
            if (r4.containsKey("messageIds") == false) goto L15;
            int[] r02 = r4.getIntArray("messageIds");
            if (r02 == null) goto L13;
            if (r4.containsKey("groupId") == false) goto L11;
            return new a(r02, r4.getString("groupId"));
        L11:
            throw new IllegalArgumentException("Required argument \"groupId\" is missing and does not have an android:defaultValue");
        L13:
            throw new IllegalArgumentException("Argument \"messageIds\" is marked as non-null but was passed a null value.");
        L15:
            throw new IllegalArgumentException("Required argument \"messageIds\" is missing and does not have an android:defaultValue");
        }

        public C0574a() {
        }
    }

    static {
        f56002c = new C0574a(null);
        d = 8;
    }

    public a(int[] r2, String r3) {
        p.l(r2, "messageIds");
        this.f56003a = r2;
        this.f56004b = r3;
    }

    public static final a fromBundle(Bundle r1) {
        return f56002c.a(r1);
    }

    public final String a() {
        return this.f56004b;
    }

    public final int[] b() {
        return this.f56003a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f56003a, r52.f56003a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f56004b, r52.f56004b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = Arrays.hashCode(this.f56003a) * 31;
        String r1 = this.f56004b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "DeleteMessageDialogArgs(messageIds=" + Arrays.toString(this.f56003a) + ", groupId=" + this.f56004b + ')';
    }
}
