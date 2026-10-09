package com.stockbit.domain.model.entity.chat.message;

import kotlin.Metadata;
import kotlin.e;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/domain/model/entity/chat/message/FormatMessageEventType;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT_FORMAT_REGULAR", "TEXT_FORMAT_BOLD", "TEXT_FORMAT_ITALIC", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@e
/* loaded from: classes8.dex */
public enum FormatMessageEventType extends Enum<FormatMessageEventType> {
    public static final FormatMessageEventType TEXT_FORMAT_BOLD = null;
    public static final FormatMessageEventType TEXT_FORMAT_ITALIC = null;
    public static final FormatMessageEventType TEXT_FORMAT_REGULAR = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FormatMessageEventType[] f82645a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f82646b = null;

    static {
        TEXT_FORMAT_REGULAR = new FormatMessageEventType("TEXT_FORMAT_REGULAR", 0);
        TEXT_FORMAT_BOLD = new FormatMessageEventType("TEXT_FORMAT_BOLD", 1);
        TEXT_FORMAT_ITALIC = new FormatMessageEventType("TEXT_FORMAT_ITALIC", 2);
        FormatMessageEventType[] r02 = a();
        f82645a = r02;
        f82646b = b.a(r02);
    }

    FormatMessageEventType(String r1, int r2) {
    }

    public static final /* synthetic */ FormatMessageEventType[] a() {
        return new FormatMessageEventType[]{TEXT_FORMAT_REGULAR, TEXT_FORMAT_BOLD, TEXT_FORMAT_ITALIC};
    }

    public static a getEntries() {
        return f82646b;
    }

    public static FormatMessageEventType valueOf(String r1) {
        return (FormatMessageEventType) Enum.valueOf(FormatMessageEventType.class, r1);
    }

    public static FormatMessageEventType[] values() {
        return (FormatMessageEventType[]) f82645a.clone();
    }
}
