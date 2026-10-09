package com.stockbit.domain.model.type;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/stockbit/domain/model/type/VerifyEmailSource;", "", "<init>", "(Ljava/lang/String;I)V", "CHANGE_SETTING", "OPENING_ACCOUNT", "REGISTRATION_EMAIL_PASSWORD", "REGISTRATION_SOCIAL_MEDIA", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum VerifyEmailSource extends Enum<VerifyEmailSource> {
    public static final VerifyEmailSource CHANGE_SETTING = null;
    public static final a Companion = null;
    public static final VerifyEmailSource OPENING_ACCOUNT = null;
    public static final VerifyEmailSource REGISTRATION_EMAIL_PASSWORD = null;
    public static final VerifyEmailSource REGISTRATION_SOCIAL_MEDIA = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ VerifyEmailSource[] f86266a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86267b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        CHANGE_SETTING = new VerifyEmailSource("CHANGE_SETTING", 0);
        OPENING_ACCOUNT = new VerifyEmailSource("OPENING_ACCOUNT", 1);
        REGISTRATION_EMAIL_PASSWORD = new VerifyEmailSource("REGISTRATION_EMAIL_PASSWORD", 2);
        REGISTRATION_SOCIAL_MEDIA = new VerifyEmailSource("REGISTRATION_SOCIAL_MEDIA", 3);
        VerifyEmailSource[] r02 = a();
        f86266a = r02;
        f86267b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    VerifyEmailSource(String r1, int r2) {
    }

    public static final /* synthetic */ VerifyEmailSource[] a() {
        return new VerifyEmailSource[]{CHANGE_SETTING, OPENING_ACCOUNT, REGISTRATION_EMAIL_PASSWORD, REGISTRATION_SOCIAL_MEDIA};
    }

    public static kotlin.enums.a getEntries() {
        return f86267b;
    }

    public static VerifyEmailSource valueOf(String r1) {
        return (VerifyEmailSource) Enum.valueOf(VerifyEmailSource.class, r1);
    }

    public static VerifyEmailSource[] values() {
        return (VerifyEmailSource[]) f86266a.clone();
    }
}
