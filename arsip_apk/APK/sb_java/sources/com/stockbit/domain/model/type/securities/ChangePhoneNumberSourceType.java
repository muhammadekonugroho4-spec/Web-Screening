package com.stockbit.domain.model.type.securities;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/stockbit/domain/model/type/securities/ChangePhoneNumberSourceType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SETTING_SECURITIES", "REGISTRATION_SECURITIES", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum ChangePhoneNumberSourceType extends Enum<ChangePhoneNumberSourceType> {
    public static final a Companion = null;
    public static final ChangePhoneNumberSourceType REGISTRATION_SECURITIES = null;
    public static final ChangePhoneNumberSourceType SETTING_SECURITIES = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ChangePhoneNumberSourceType[] f86419a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86420b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final ChangePhoneNumberSourceType a(String r6) {
            ChangePhoneNumberSourceType[] r02 = ChangePhoneNumberSourceType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            ChangePhoneNumberSourceType r3 = r02[r2];
            if (p.g(r3.getValue(), r6) == true) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return ChangePhoneNumberSourceType.SETTING_SECURITIES;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        SETTING_SECURITIES = new ChangePhoneNumberSourceType("SETTING_SECURITIES", 0, "SETTING_SECURITIES");
        REGISTRATION_SECURITIES = new ChangePhoneNumberSourceType("REGISTRATION_SECURITIES", 1, "REGISTRATION_SECURITIES");
        ChangePhoneNumberSourceType[] r02 = a();
        f86419a = r02;
        f86420b = b.a(r02);
        Companion = new a(null);
    }

    ChangePhoneNumberSourceType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ ChangePhoneNumberSourceType[] a() {
        return new ChangePhoneNumberSourceType[]{SETTING_SECURITIES, REGISTRATION_SECURITIES};
    }

    public static kotlin.enums.a getEntries() {
        return f86420b;
    }

    public static ChangePhoneNumberSourceType valueOf(String r1) {
        return (ChangePhoneNumberSourceType) Enum.valueOf(ChangePhoneNumberSourceType.class, r1);
    }

    public static ChangePhoneNumberSourceType[] values() {
        return (ChangePhoneNumberSourceType[]) f86419a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
