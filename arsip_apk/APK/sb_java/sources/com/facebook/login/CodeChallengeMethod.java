package com.facebook.login;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/login/CodeChallengeMethod;", "", "s", "", "(Ljava/lang/String;ILjava/lang/String;)V", "S256", "PLAIN", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum CodeChallengeMethod extends Enum<CodeChallengeMethod> {
    public static final CodeChallengeMethod PLAIN = null;
    public static final CodeChallengeMethod S256 = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CodeChallengeMethod[] f36640a = null;

    static {
        S256 = new CodeChallengeMethod("S256", 0, "S256");
        PLAIN = new CodeChallengeMethod("PLAIN", 1, "plain");
        f36640a = a();
    }

    CodeChallengeMethod(String r1, int r2, String r3) {
    }

    public static final /* synthetic */ CodeChallengeMethod[] a() {
        return new CodeChallengeMethod[]{S256, PLAIN};
    }

    public static CodeChallengeMethod valueOf(String r1) {
        return (CodeChallengeMethod) Enum.valueOf(CodeChallengeMethod.class, r1);
    }

    public static CodeChallengeMethod[] values() {
        return (CodeChallengeMethod[]) f36640a.clone();
    }
}
