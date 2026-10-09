package com.facebook.login;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/facebook/login/LoginTargetApp;", "", "", "targetApp", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Companion", "a", "FACEBOOK", "INSTAGRAM", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum LoginTargetApp extends Enum<LoginTargetApp> {
    public static final a Companion = null;
    public static final LoginTargetApp FACEBOOK = null;
    public static final LoginTargetApp INSTAGRAM = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LoginTargetApp[] f36794a = null;
    private final String targetApp;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final LoginTargetApp a(String r6) {
            LoginTargetApp[] r02 = LoginTargetApp.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L9;
            LoginTargetApp r3 = r02[r2];
            if (kotlin.jvm.internal.p.g(r3.toString(), r6) == true) goto L6;
            r2 = r2 + 1;
            goto L3
        L6:
            return r3;
        L9:
            return LoginTargetApp.FACEBOOK;
        }

        public a() {
        }
    }

    static {
        FACEBOOK = new LoginTargetApp("FACEBOOK", 0, "facebook");
        INSTAGRAM = new LoginTargetApp("INSTAGRAM", 1, "instagram");
        f36794a = a();
        Companion = new a(null);
    }

    LoginTargetApp(String r1, int r2, String r3) {
        this.targetApp = r3;
    }

    public static final /* synthetic */ LoginTargetApp[] a() {
        return new LoginTargetApp[]{FACEBOOK, INSTAGRAM};
    }

    public static final LoginTargetApp fromString(String r1) {
        return Companion.a(r1);
    }

    public static LoginTargetApp valueOf(String r1) {
        return (LoginTargetApp) Enum.valueOf(LoginTargetApp.class, r1);
    }

    public static LoginTargetApp[] values() {
        return (LoginTargetApp[]) f36794a.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.targetApp;
    }
}
