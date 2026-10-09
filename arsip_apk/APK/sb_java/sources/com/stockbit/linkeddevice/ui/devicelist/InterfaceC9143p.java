package com.stockbit.linkeddevice.ui.devicelist;

import com.clevertap.android.sdk.Constants;

/* renamed from: com.stockbit.linkeddevice.ui.devicelist.p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC9143p {

    /* renamed from: com.stockbit.linkeddevice.ui.devicelist.p$a */
    public static final class a implements InterfaceC9143p {

        /* renamed from: a, reason: collision with root package name */
        public final String f121014a;

        /* renamed from: b, reason: collision with root package name */
        public final String f121015b;

        static {
        }

        public a(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, Constants.KEY_TITLE);
            kotlin.jvm.internal.p.l(r3, "message");
            this.f121014a = r2;
            this.f121015b = r3;
        }

        public final String a() {
            return this.f121015b;
        }

        public final String b() {
            return this.f121014a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f121014a, r52.f121014a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f121015b, r52.f121015b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f121014a.hashCode() * 31) + this.f121015b.hashCode();
        }

        public String toString() {
            return "ShowTemporaryBlockedDialog(title=" + this.f121014a + ", message=" + this.f121015b + ')';
        }
    }
}
