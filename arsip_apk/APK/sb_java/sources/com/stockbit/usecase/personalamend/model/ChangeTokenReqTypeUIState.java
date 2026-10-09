package com.stockbit.usecase.personalamend.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/usecase/personalamend/model/ChangeTokenReqTypeUIState;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "UNSPECIFIED", "EDIT", "OPEN", "usecase-personal-amend"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum ChangeTokenReqTypeUIState extends Enum<ChangeTokenReqTypeUIState> {
    public static final ChangeTokenReqTypeUIState EDIT = null;
    public static final ChangeTokenReqTypeUIState OPEN = null;
    public static final ChangeTokenReqTypeUIState UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ChangeTokenReqTypeUIState[] f159006a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f159007b = null;
    private final String value;

    static {
        UNSPECIFIED = new ChangeTokenReqTypeUIState("UNSPECIFIED", 0, "CHANGE_TOKEN_REQ_TYPE_UNSPECIFIED");
        EDIT = new ChangeTokenReqTypeUIState("EDIT", 1, "CHANGE_TOKEN_REQ_TYPE_EDIT");
        OPEN = new ChangeTokenReqTypeUIState("OPEN", 2, "CHANGE_TOKEN_REQ_TYPE_OPEN");
        ChangeTokenReqTypeUIState[] r02 = a();
        f159006a = r02;
        f159007b = kotlin.enums.b.a(r02);
    }

    ChangeTokenReqTypeUIState(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ ChangeTokenReqTypeUIState[] a() {
        return new ChangeTokenReqTypeUIState[]{UNSPECIFIED, EDIT, OPEN};
    }

    public static kotlin.enums.a getEntries() {
        return f159007b;
    }

    public static ChangeTokenReqTypeUIState valueOf(String r1) {
        return (ChangeTokenReqTypeUIState) Enum.valueOf(ChangeTokenReqTypeUIState.class, r1);
    }

    public static ChangeTokenReqTypeUIState[] values() {
        return (ChangeTokenReqTypeUIState[]) f159006a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
