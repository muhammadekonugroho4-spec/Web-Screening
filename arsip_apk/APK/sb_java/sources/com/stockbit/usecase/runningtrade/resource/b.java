package com.stockbit.usecase.runningtrade.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f159694a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f159694a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159694a, ((a) r4).f159694a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159694a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f159694a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.runningtrade.resource.b$b, reason: collision with other inner class name */
    public static final class C1599b implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1599b f159695a = null;

        static {
            f159695a = new C1599b();
        }

        public C1599b() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1599b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -684187745;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f159696a;

        /* renamed from: b, reason: collision with root package name */
        public final List f159697b;

        /* renamed from: c, reason: collision with root package name */
        public final LocalDate f159698c;

        public c(boolean r2, List r3, LocalDate r4) {
            p.l(r3, "runningTrades");
            p.l(r4, com.clevertap.android.sdk.Constants.KEY_DATE);
            this.f159696a = r2;
            this.f159697b = r3;
            this.f159698c = r4;
        }

        public final LocalDate a() {
            return this.f159698c;
        }

        public final List b() {
            return this.f159697b;
        }

        public final boolean c() {
            return this.f159696a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (this.f159696a == r52.f159696a) goto L12;
            return false;
        L12:
            if (p.g(this.f159697b, r52.f159697b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f159698c, r52.f159698c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f159696a) * 31) + this.f159697b.hashCode()) * 31) + this.f159698c.hashCode();
        }

        public String toString() {
            return "Success(isOpenMarket=" + this.f159696a + ", runningTrades=" + this.f159697b + ", date=" + this.f159698c + ")";
        }
    }
}
