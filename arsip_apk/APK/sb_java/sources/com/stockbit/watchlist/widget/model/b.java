package com.stockbit.watchlist.widget.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f171572a = null;

        static {
            f171572a = new a();
        }

        public a() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -274210749;
        }

        public String toString() {
            return "Empty";
        }
    }

    /* renamed from: com.stockbit.watchlist.widget.model.b$b, reason: collision with other inner class name */
    public static final class C1783b implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f171573a;

        static {
        }

        public C1783b(String r1) {
            this.f171573a = r1;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1783b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f171573a, ((C1783b) r4).f171573a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f171573a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.f171573a + ')';
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f171574a = null;

        static {
            f171574a = new c();
        }

        public c() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 436950706;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f171575a = null;

        static {
            f171575a = new d();
        }

        public d() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof d) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1337043863;
        }

        public String toString() {
            return "NeedLogin";
        }
    }

    public static final class e implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final e f171576a = null;

        static {
            f171576a = new e();
        }

        public e() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof e) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 2137384747;
        }

        public String toString() {
            return "NeedSecuritiesLogin";
        }
    }

    public static final class f implements b {

        /* renamed from: a, reason: collision with root package name */
        public final List f171577a;

        /* renamed from: b, reason: collision with root package name */
        public final String f171578b;

        /* renamed from: c, reason: collision with root package name */
        public final String f171579c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final long f171580e;

        static {
        }

        public f(List r2, String r3, String r4, String r5, long r6) {
            p.l(r2, FirebaseAnalytics.Param.ITEMS);
            p.l(r3, CrashHianalyticsData.TIME);
            p.l(r4, "shortTime");
            p.l(r5, "watchlistName");
            this.f171577a = r2;
            this.f171578b = r3;
            this.f171579c = r4;
            this.d = r5;
            this.f171580e = r6;
        }

        public static /* synthetic */ f b(f r02, List r1, String r2, String r3, String r4, long r5, int r7, Object r8) {
            if ((r7 & 1) == 0) goto L6;
            r1 = r02.f171577a;
        L6:
            if ((r7 & 2) == 0) goto L9;
            r2 = r02.f171578b;
        L9:
            if ((r7 & 4) == 0) goto L12;
            r3 = r02.f171579c;
        L12:
            if ((r7 & 8) == 0) goto L15;
            r4 = r02.d;
        L15:
            if ((r7 & 16) == 0) goto L17;
            r5 = r02.f171580e;
        L17:
            long r72 = r5;
            String r52 = r3;
            String r6 = r4;
            return r02.a(r1, r2, r52, r6, r72);
        }

        public final f a(List r9, String r10, String r11, String r12, long r13) {
            p.l(r9, FirebaseAnalytics.Param.ITEMS);
            p.l(r10, CrashHianalyticsData.TIME);
            p.l(r11, "shortTime");
            p.l(r12, "watchlistName");
            return new f(r9, r10, r11, r12, r13);
        }

        public final List c() {
            return this.f171577a;
        }

        public final long d() {
            return this.f171580e;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof f) == true) goto L8;
            return false;
        L8:
            f r82 = (f) r8;
            if (p.g(this.f171577a, r82.f171577a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f171578b, r82.f171578b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f171579c, r82.f171579c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r82.d) == true) goto L21;
            return false;
        L21:
            if (this.f171580e == r82.f171580e) goto L23;
            return false;
        L23:
            return true;
        }

        public int hashCode() {
            return (((((((this.f171577a.hashCode() * 31) + this.f171578b.hashCode()) * 31) + this.f171579c.hashCode()) * 31) + this.d.hashCode()) * 31) + Long.hashCode(this.f171580e);
        }

        public String toString() {
            return "Success(items=" + this.f171577a + ", time=" + this.f171578b + ", shortTime=" + this.f171579c + ", watchlistName=" + this.d + ", lastUpdatedElapsed=" + this.f171580e + ')';
        }
    }
}
