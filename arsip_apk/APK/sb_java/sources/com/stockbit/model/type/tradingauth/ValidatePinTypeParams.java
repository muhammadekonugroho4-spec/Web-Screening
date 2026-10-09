package com.stockbit.model.type.tradingauth;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/model/type/tradingauth/ValidatePinTypeParams;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CHANGE_PIN", "LOGIN_BIOMETRIC", "CASH_WITHDRAWAL", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum ValidatePinTypeParams extends Enum<ValidatePinTypeParams> {
    public static final ValidatePinTypeParams CASH_WITHDRAWAL = null;
    public static final ValidatePinTypeParams CHANGE_PIN = null;
    public static final a Companion = null;
    public static final ValidatePinTypeParams LOGIN_BIOMETRIC = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ValidatePinTypeParams[] f122249a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122250b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        CHANGE_PIN = new ValidatePinTypeParams("CHANGE_PIN", 0, "change_pin");
        LOGIN_BIOMETRIC = new ValidatePinTypeParams("LOGIN_BIOMETRIC", 1, "login_biometric");
        CASH_WITHDRAWAL = new ValidatePinTypeParams("CASH_WITHDRAWAL", 2, "cash_withdrawal");
        ValidatePinTypeParams[] r02 = a();
        f122249a = r02;
        f122250b = b.a(r02);
        Companion = new a(null);
    }

    ValidatePinTypeParams(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ ValidatePinTypeParams[] a() {
        return new ValidatePinTypeParams[]{CHANGE_PIN, LOGIN_BIOMETRIC, CASH_WITHDRAWAL};
    }

    public static kotlin.enums.a getEntries() {
        return f122250b;
    }

    public static ValidatePinTypeParams valueOf(String r1) {
        return (ValidatePinTypeParams) Enum.valueOf(ValidatePinTypeParams.class, r1);
    }

    public static ValidatePinTypeParams[] values() {
        return (ValidatePinTypeParams[]) f122249a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
