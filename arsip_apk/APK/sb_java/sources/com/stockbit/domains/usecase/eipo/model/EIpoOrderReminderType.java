package com.stockbit.domains.usecase.eipo.model;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/stockbit/domains/usecase/eipo/model/EIpoOrderReminderType;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "BOOK_BUILDING_CONFIRMATION", "BOOK_BUILDING_NOT_MATCHED", "OFFERING", "EXTERNAL_BOOK_BUILDING", "EXTERNAL_CONFIRMATION", "Companion", "usecase-eipo"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum EIpoOrderReminderType extends Enum<EIpoOrderReminderType> {
    public static final EIpoOrderReminderType BOOK_BUILDING_CONFIRMATION = null;
    public static final EIpoOrderReminderType BOOK_BUILDING_NOT_MATCHED = null;
    public static final a Companion = null;
    public static final EIpoOrderReminderType EXTERNAL_BOOK_BUILDING = null;
    public static final EIpoOrderReminderType EXTERNAL_CONFIRMATION = null;
    public static final EIpoOrderReminderType NONE = null;
    public static final EIpoOrderReminderType OFFERING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EIpoOrderReminderType[] f88178a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f88179b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        NONE = new EIpoOrderReminderType("NONE", 0);
        BOOK_BUILDING_CONFIRMATION = new EIpoOrderReminderType("BOOK_BUILDING_CONFIRMATION", 1);
        BOOK_BUILDING_NOT_MATCHED = new EIpoOrderReminderType("BOOK_BUILDING_NOT_MATCHED", 2);
        OFFERING = new EIpoOrderReminderType("OFFERING", 3);
        EXTERNAL_BOOK_BUILDING = new EIpoOrderReminderType("EXTERNAL_BOOK_BUILDING", 4);
        EXTERNAL_CONFIRMATION = new EIpoOrderReminderType("EXTERNAL_CONFIRMATION", 5);
        EIpoOrderReminderType[] r02 = a();
        f88178a = r02;
        f88179b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    EIpoOrderReminderType(String r1, int r2) {
    }

    public static final /* synthetic */ EIpoOrderReminderType[] a() {
        return new EIpoOrderReminderType[]{NONE, BOOK_BUILDING_CONFIRMATION, BOOK_BUILDING_NOT_MATCHED, OFFERING, EXTERNAL_BOOK_BUILDING, EXTERNAL_CONFIRMATION};
    }

    public static kotlin.enums.a getEntries() {
        return f88179b;
    }

    public static EIpoOrderReminderType valueOf(String r1) {
        return (EIpoOrderReminderType) Enum.valueOf(EIpoOrderReminderType.class, r1);
    }

    public static EIpoOrderReminderType[] values() {
        return (EIpoOrderReminderType[]) f88178a.clone();
    }
}
