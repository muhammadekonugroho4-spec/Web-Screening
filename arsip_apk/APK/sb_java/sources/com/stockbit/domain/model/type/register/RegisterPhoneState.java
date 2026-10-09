package com.stockbit.domain.model.type.register;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/stockbit/domain/model/type/register/RegisterPhoneState;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "VERIFY_STATUS_SUCCESS", "VERIFY_STATUS_FAIL", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum RegisterPhoneState extends Enum<RegisterPhoneState> {
    public static final a Companion = null;
    public static final RegisterPhoneState VERIFY_STATUS_FAIL = null;
    public static final RegisterPhoneState VERIFY_STATUS_SUCCESS = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ RegisterPhoneState[] f86396a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86397b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        VERIFY_STATUS_SUCCESS = new RegisterPhoneState("VERIFY_STATUS_SUCCESS", 0, "VERIFY_STATUS_SUCCESS");
        VERIFY_STATUS_FAIL = new RegisterPhoneState("VERIFY_STATUS_FAIL", 1, "VERIFY_STATUS_FAIL");
        RegisterPhoneState[] r02 = a();
        f86396a = r02;
        f86397b = b.a(r02);
        Companion = new a(null);
    }

    RegisterPhoneState(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ RegisterPhoneState[] a() {
        return new RegisterPhoneState[]{VERIFY_STATUS_SUCCESS, VERIFY_STATUS_FAIL};
    }

    public static kotlin.enums.a getEntries() {
        return f86397b;
    }

    public static RegisterPhoneState valueOf(String r1) {
        return (RegisterPhoneState) Enum.valueOf(RegisterPhoneState.class, r1);
    }

    public static RegisterPhoneState[] values() {
        return (RegisterPhoneState[]) f86396a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
