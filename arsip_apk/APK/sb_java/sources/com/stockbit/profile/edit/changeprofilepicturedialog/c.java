package com.stockbit.profile.edit.changeprofilepicturedialog;

/* loaded from: classes10.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f127393a;

        /* renamed from: b, reason: collision with root package name */
        public final String f127394b;

        static {
        }

        public a(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, "userName");
            kotlin.jvm.internal.p.l(r3, "avatarUrl");
            super(null);
            this.f127393a = r2;
            this.f127394b = r3;
        }

        public final String a() {
            return this.f127394b;
        }

        public final String b() {
            return this.f127393a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f127393a, r52.f127393a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f127394b, r52.f127394b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f127393a.hashCode() * 31) + this.f127394b.hashCode();
        }

        public String toString() {
            return "SuccessUpdateProfilePicture(userName=" + this.f127393a + ", avatarUrl=" + this.f127394b + ')';
        }
    }

    static {
    }

    public /* synthetic */ c(kotlin.jvm.internal.i r1) {
        this();
    }

    public c() {
    }
}
