package com.stockbit.chat.ui.attachment;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes7.dex */
public final class m implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f55772c = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f55773a;

    /* renamed from: b, reason: collision with root package name */
    public final int f55774b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final m a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(m.class.getClassLoader());
            if (r4.containsKey("activeAttachment") == false) goto L11;
            int r02 = r4.getInt("activeAttachment");
            if (r4.containsKey("bottomSheetHeight") == false) goto L9;
            return new m(r02, r4.getInt("bottomSheetHeight"));
        L9:
            throw new IllegalArgumentException("Required argument \"bottomSheetHeight\" is missing and does not have an android:defaultValue");
        L11:
            throw new IllegalArgumentException("Required argument \"activeAttachment\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f55772c = new a(null);
    }

    public m(int r1, int r2) {
        this.f55773a = r1;
        this.f55774b = r2;
    }

    public static final m fromBundle(Bundle r1) {
        return f55772c.a(r1);
    }

    public final int a() {
        return this.f55773a;
    }

    public final int b() {
        return this.f55774b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (this.f55773a == r52.f55773a) goto L12;
        return false;
    L12:
        if (this.f55774b == r52.f55774b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f55773a) * 31) + Integer.hashCode(this.f55774b);
    }

    public String toString() {
        return "AttachmentSearchDialogArgs(activeAttachment=" + this.f55773a + ", bottomSheetHeight=" + this.f55774b + ')';
    }
}
