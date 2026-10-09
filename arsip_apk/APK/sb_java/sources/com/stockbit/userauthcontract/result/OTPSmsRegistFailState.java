package com.stockbit.userauthcontract.result;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/userauthcontract/result/OTPSmsRegistFailState;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "STATE_OPEN_SUPPORT", "STATE_LOGIN", "STATE_INPUT_ANOTHER", "Companion", "userauth-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum OTPSmsRegistFailState extends Enum<OTPSmsRegistFailState> {
    public static final a Companion = null;
    public static final OTPSmsRegistFailState STATE_INPUT_ANOTHER = null;
    public static final OTPSmsRegistFailState STATE_LOGIN = null;
    public static final OTPSmsRegistFailState STATE_OPEN_SUPPORT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OTPSmsRegistFailState[] f165701a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f165702b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        STATE_OPEN_SUPPORT = new OTPSmsRegistFailState("STATE_OPEN_SUPPORT", 0, "STATE_OPEN_SUPPORT");
        STATE_LOGIN = new OTPSmsRegistFailState("STATE_LOGIN", 1, "STATE_LOGIN");
        STATE_INPUT_ANOTHER = new OTPSmsRegistFailState("STATE_INPUT_ANOTHER", 2, "STATE_INPUT_ANOTHER");
        OTPSmsRegistFailState[] r02 = a();
        f165701a = r02;
        f165702b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    OTPSmsRegistFailState(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ OTPSmsRegistFailState[] a() {
        return new OTPSmsRegistFailState[]{STATE_OPEN_SUPPORT, STATE_LOGIN, STATE_INPUT_ANOTHER};
    }

    public static kotlin.enums.a getEntries() {
        return f165702b;
    }

    public static OTPSmsRegistFailState valueOf(String r1) {
        return (OTPSmsRegistFailState) Enum.valueOf(OTPSmsRegistFailState.class, r1);
    }

    public static OTPSmsRegistFailState[] values() {
        return (OTPSmsRegistFailState[]) f165701a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
