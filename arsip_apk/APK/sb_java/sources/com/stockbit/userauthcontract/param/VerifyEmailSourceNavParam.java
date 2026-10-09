package com.stockbit.userauthcontract.param;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/stockbit/userauthcontract/param/VerifyEmailSourceNavParam;", "", "<init>", "(Ljava/lang/String;I)V", "CHANGE_SETTING", "OPENING_ACCOUNT", "REGISTRATION_EMAIL_PASSWORD", "REGISTRATION_SOCIAL_MEDIA", "Companion", "userauth-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum VerifyEmailSourceNavParam extends Enum<VerifyEmailSourceNavParam> {
    public static final VerifyEmailSourceNavParam CHANGE_SETTING = null;
    public static final a Companion = null;
    public static final VerifyEmailSourceNavParam OPENING_ACCOUNT = null;
    public static final VerifyEmailSourceNavParam REGISTRATION_EMAIL_PASSWORD = null;
    public static final VerifyEmailSourceNavParam REGISTRATION_SOCIAL_MEDIA = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ VerifyEmailSourceNavParam[] f165593a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f165594b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        CHANGE_SETTING = new VerifyEmailSourceNavParam("CHANGE_SETTING", 0);
        OPENING_ACCOUNT = new VerifyEmailSourceNavParam("OPENING_ACCOUNT", 1);
        REGISTRATION_EMAIL_PASSWORD = new VerifyEmailSourceNavParam("REGISTRATION_EMAIL_PASSWORD", 2);
        REGISTRATION_SOCIAL_MEDIA = new VerifyEmailSourceNavParam("REGISTRATION_SOCIAL_MEDIA", 3);
        VerifyEmailSourceNavParam[] r02 = a();
        f165593a = r02;
        f165594b = b.a(r02);
        Companion = new a(null);
    }

    VerifyEmailSourceNavParam(String r1, int r2) {
    }

    public static final /* synthetic */ VerifyEmailSourceNavParam[] a() {
        return new VerifyEmailSourceNavParam[]{CHANGE_SETTING, OPENING_ACCOUNT, REGISTRATION_EMAIL_PASSWORD, REGISTRATION_SOCIAL_MEDIA};
    }

    public static kotlin.enums.a getEntries() {
        return f165594b;
    }

    public static VerifyEmailSourceNavParam valueOf(String r1) {
        return (VerifyEmailSourceNavParam) Enum.valueOf(VerifyEmailSourceNavParam.class, r1);
    }

    public static VerifyEmailSourceNavParam[] values() {
        return (VerifyEmailSourceNavParam[]) f165593a.clone();
    }
}
