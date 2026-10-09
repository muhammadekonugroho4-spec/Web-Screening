package com.facebook.login;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/login/DefaultAudience;", "", "nativeProtocolAudience", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getNativeProtocolAudience", "()Ljava/lang/String;", "NONE", "ONLY_ME", "FRIENDS", "EVERYONE", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum DefaultAudience extends Enum<DefaultAudience> {
    public static final DefaultAudience EVERYONE = null;
    public static final DefaultAudience FRIENDS = null;
    public static final DefaultAudience NONE = null;
    public static final DefaultAudience ONLY_ME = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DefaultAudience[] f36705a = null;
    private final String nativeProtocolAudience;

    static {
        NONE = new DefaultAudience("NONE", 0, null);
        ONLY_ME = new DefaultAudience("ONLY_ME", 1, "only_me");
        FRIENDS = new DefaultAudience("FRIENDS", 2, "friends");
        EVERYONE = new DefaultAudience("EVERYONE", 3, "everyone");
        f36705a = a();
    }

    DefaultAudience(String r1, int r2, String r3) {
        this.nativeProtocolAudience = r3;
    }

    public static final /* synthetic */ DefaultAudience[] a() {
        return new DefaultAudience[]{NONE, ONLY_ME, FRIENDS, EVERYONE};
    }

    public static DefaultAudience valueOf(String r1) {
        return (DefaultAudience) Enum.valueOf(DefaultAudience.class, r1);
    }

    public static DefaultAudience[] values() {
        return (DefaultAudience[]) f36705a.clone();
    }

    public final String getNativeProtocolAudience() {
        return this.nativeProtocolAudience;
    }
}
