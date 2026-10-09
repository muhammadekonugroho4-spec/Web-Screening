package com.stockbit.usecase.personalamend.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stockbit/usecase/personalamend/model/ChangeTokenTypeUIState;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "UNSPECIFIED", "EMAIL", "PHONE", "PASSWORD", "BANK", "usecase-personal-amend"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum ChangeTokenTypeUIState extends Enum<ChangeTokenTypeUIState> {
    public static final ChangeTokenTypeUIState BANK = null;
    public static final ChangeTokenTypeUIState EMAIL = null;
    public static final ChangeTokenTypeUIState PASSWORD = null;
    public static final ChangeTokenTypeUIState PHONE = null;
    public static final ChangeTokenTypeUIState UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ChangeTokenTypeUIState[] f159008a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f159009b = null;
    private final String value;

    static {
        UNSPECIFIED = new ChangeTokenTypeUIState("UNSPECIFIED", 0, "CHANGE_TOKEN_TYPE_UNSPECIFIED");
        EMAIL = new ChangeTokenTypeUIState("EMAIL", 1, "CHANGE_TOKEN_TYPE_EMAIL");
        PHONE = new ChangeTokenTypeUIState("PHONE", 2, "CHANGE_TOKEN_TYPE_PHONE");
        PASSWORD = new ChangeTokenTypeUIState("PASSWORD", 3, "CHANGE_TOKEN_TYPE_PASSWORD");
        BANK = new ChangeTokenTypeUIState("BANK", 4, "CHANGE_TOKEN_TYPE_BANK");
        ChangeTokenTypeUIState[] r02 = a();
        f159008a = r02;
        f159009b = kotlin.enums.b.a(r02);
    }

    ChangeTokenTypeUIState(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ ChangeTokenTypeUIState[] a() {
        return new ChangeTokenTypeUIState[]{UNSPECIFIED, EMAIL, PHONE, PASSWORD, BANK};
    }

    public static kotlin.enums.a getEntries() {
        return f159009b;
    }

    public static ChangeTokenTypeUIState valueOf(String r1) {
        return (ChangeTokenTypeUIState) Enum.valueOf(ChangeTokenTypeUIState.class, r1);
    }

    public static ChangeTokenTypeUIState[] values() {
        return (ChangeTokenTypeUIState[]) f159008a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
