package com.facebook.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/facebook/internal/GamingAction;", "", "rawValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "ContextChoose", "JoinTournament", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum GamingAction extends Enum<GamingAction> {
    public static final GamingAction ContextChoose = null;
    public static final GamingAction JoinTournament = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ GamingAction[] f36344a = null;
    private final String rawValue;

    static {
        ContextChoose = new GamingAction("ContextChoose", 0, "context_choose");
        JoinTournament = new GamingAction("JoinTournament", 1, "join_tournament");
        f36344a = a();
    }

    GamingAction(String r1, int r2, String r3) {
        this.rawValue = r3;
    }

    public static final /* synthetic */ GamingAction[] a() {
        return new GamingAction[]{ContextChoose, JoinTournament};
    }

    public static GamingAction valueOf(String r1) {
        return (GamingAction) Enum.valueOf(GamingAction.class, r1);
    }

    public static GamingAction[] values() {
        return (GamingAction[]) f36344a.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
