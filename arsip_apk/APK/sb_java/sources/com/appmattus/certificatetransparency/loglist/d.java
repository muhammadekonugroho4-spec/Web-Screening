package com.appmattus.certificatetransparency.loglist;

import com.appmattus.certificatetransparency.loglist.g;
import com.clevertap.android.sdk.Constants;
import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.p;
import kotlinx.serialization.SerializationException;

/* loaded from: classes4.dex */
public interface d {

    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final Instant f32318a;

        /* renamed from: b, reason: collision with root package name */
        public final d f32319b;

        public a(Instant r2, d r3) {
            p.l(r2, "timestamp");
            p.l(r3, "networkResult");
            this.f32318a = r2;
            this.f32319b = r3;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f32318a, r52.f32318a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f32319b, r52.f32319b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f32318a.hashCode() * 31) + this.f32319b.hashCode();
        }

        public String toString() {
            return "DisableChecks(timestamp=" + this.f32318a + ", networkResult=" + this.f32319b + ')';
        }
    }

    public interface b extends d {

        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            public final SerializationException f32320a;

            public a(SerializationException r2) {
                p.l(r2, "exception");
                this.f32320a = r2;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof a) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f32320a, ((a) r4).f32320a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f32320a.hashCode();
            }

            public String toString() {
                return "log-list.json badly formatted with " + com.appmattus.certificatetransparency.internal.utils.c.a(this.f32320a);
            }
        }

        /* renamed from: com.appmattus.certificatetransparency.loglist.d$b$b, reason: collision with other inner class name */
        public static final class C0310b implements b {

            /* renamed from: a, reason: collision with root package name */
            public static final C0310b f32321a = null;

            static {
                f32321a = new C0310b();
            }

            public C0310b() {
            }

            public String toString() {
                return "log-list.json failed to load";
            }
        }

        public static final class c implements b {

            /* renamed from: a, reason: collision with root package name */
            public final d f32322a;

            public c(d r2) {
                p.l(r2, "networkResult");
                this.f32322a = r2;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof c) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f32322a, ((c) r4).f32322a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f32322a.hashCode();
            }

            public String toString() {
                return "log-list.json from server is older than 70 days old";
            }
        }

        /* renamed from: com.appmattus.certificatetransparency.loglist.d$b$d, reason: collision with other inner class name */
        public static final class C0311d implements b {

            /* renamed from: a, reason: collision with root package name */
            public final Exception f32323a;

            public C0311d(Exception r2) {
                p.l(r2, "exception");
                this.f32323a = r2;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C0311d) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f32323a, ((C0311d) r4).f32323a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f32323a.hashCode();
            }

            public String toString() {
                return "log-list.zip failed to load with " + com.appmattus.certificatetransparency.internal.utils.c.a(this.f32323a);
            }
        }

        public static final class e implements b {

            /* renamed from: a, reason: collision with root package name */
            public final Exception f32324a;

            /* renamed from: b, reason: collision with root package name */
            public final String f32325b;

            public e(Exception r2, String r3) {
                p.l(r2, "exception");
                p.l(r3, Constants.KEY_KEY);
                this.f32324a = r2;
                this.f32325b = r3;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof e) == true) goto L8;
                return false;
            L8:
                e r52 = (e) r5;
                if (p.g(this.f32324a, r52.f32324a) == true) goto L12;
                return false;
            L12:
                if (p.g(this.f32325b, r52.f32325b) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                return (this.f32324a.hashCode() * 31) + this.f32325b.hashCode();
            }

            public String toString() {
                return "Public key for log server " + this.f32325b + " cannot be used with " + com.appmattus.certificatetransparency.internal.utils.c.a(this.f32324a);
            }
        }

        public static final class f implements b {

            /* renamed from: a, reason: collision with root package name */
            public static final f f32326a = null;

            static {
                f32326a = new f();
            }

            public f() {
            }

            public String toString() {
                return "log-list.json contains no log servers";
            }
        }

        public static final class g implements b {

            /* renamed from: a, reason: collision with root package name */
            public final g.a f32327a;

            public g(g.a r2) {
                p.l(r2, "signatureResult");
                this.f32327a = r2;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof g) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f32327a, ((g) r4).f32327a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f32327a.hashCode();
            }

            public String toString() {
                return "SignatureVerificationFailed(signatureResult=" + this.f32327a + ')';
            }
        }
    }

    public interface c extends d {

        public static final class a implements c {

            /* renamed from: a, reason: collision with root package name */
            public final Instant f32328a;

            /* renamed from: b, reason: collision with root package name */
            public final List f32329b;

            /* renamed from: c, reason: collision with root package name */
            public final c f32330c;

            public a(Instant r2, List r3, c r4) {
                p.l(r2, "timestamp");
                p.l(r3, "servers");
                p.l(r4, "networkResult");
                this.f32328a = r2;
                this.f32329b = r3;
                this.f32330c = r4;
            }

            @Override // com.appmattus.certificatetransparency.loglist.d.c
            public List a() {
                return this.f32329b;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof a) == true) goto L8;
                return false;
            L8:
                a r52 = (a) r5;
                if (p.g(this.f32328a, r52.f32328a) == true) goto L12;
                return false;
            L12:
                if (p.g(this.f32329b, r52.f32329b) == true) goto L15;
                return false;
            L15:
                if (p.g(this.f32330c, r52.f32330c) == true) goto L17;
                return false;
            L17:
                return true;
            }

            @Override // com.appmattus.certificatetransparency.loglist.d.c
            public Instant getTimestamp() {
                return this.f32328a;
            }

            public int hashCode() {
                return (((this.f32328a.hashCode() * 31) + this.f32329b.hashCode()) * 31) + this.f32330c.hashCode();
            }

            public String toString() {
                return "StaleNetworkUsingCachedData(timestamp=" + this.f32328a + ", servers=" + this.f32329b + ", networkResult=" + this.f32330c + ')';
            }
        }

        public static final class b implements c {

            /* renamed from: a, reason: collision with root package name */
            public final Instant f32331a;

            /* renamed from: b, reason: collision with root package name */
            public final List f32332b;

            public b(Instant r2, List r3) {
                p.l(r2, "timestamp");
                p.l(r3, "servers");
                this.f32331a = r2;
                this.f32332b = r3;
            }

            @Override // com.appmattus.certificatetransparency.loglist.d.c
            public List a() {
                return this.f32332b;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof b) == true) goto L8;
                return false;
            L8:
                b r52 = (b) r5;
                if (p.g(this.f32331a, r52.f32331a) == true) goto L12;
                return false;
            L12:
                if (p.g(this.f32332b, r52.f32332b) == true) goto L14;
                return false;
            L14:
                return true;
            }

            @Override // com.appmattus.certificatetransparency.loglist.d.c
            public Instant getTimestamp() {
                return this.f32331a;
            }

            public int hashCode() {
                return (this.f32331a.hashCode() * 31) + this.f32332b.hashCode();
            }

            public String toString() {
                return "StaleNetworkUsingNetworkData(timestamp=" + this.f32331a + ", servers=" + this.f32332b + ')';
            }
        }

        /* renamed from: com.appmattus.certificatetransparency.loglist.d$c$c, reason: collision with other inner class name */
        public static final class C0312c implements c {

            /* renamed from: a, reason: collision with root package name */
            public final Instant f32333a;

            /* renamed from: b, reason: collision with root package name */
            public final List f32334b;

            public C0312c(Instant r2, List r3) {
                p.l(r2, "timestamp");
                p.l(r3, "servers");
                this.f32333a = r2;
                this.f32334b = r3;
            }

            @Override // com.appmattus.certificatetransparency.loglist.d.c
            public List a() {
                return this.f32334b;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof C0312c) == true) goto L8;
                return false;
            L8:
                C0312c r52 = (C0312c) r5;
                if (p.g(this.f32333a, r52.f32333a) == true) goto L12;
                return false;
            L12:
                if (p.g(this.f32334b, r52.f32334b) == true) goto L14;
                return false;
            L14:
                return true;
            }

            @Override // com.appmattus.certificatetransparency.loglist.d.c
            public Instant getTimestamp() {
                return this.f32333a;
            }

            public int hashCode() {
                return (this.f32333a.hashCode() * 31) + this.f32334b.hashCode();
            }

            public String toString() {
                return "Success(timestamp=" + this.f32333a + ", servers=" + this.f32334b + ')';
            }
        }

        List a();

        Instant getTimestamp();
    }
}
