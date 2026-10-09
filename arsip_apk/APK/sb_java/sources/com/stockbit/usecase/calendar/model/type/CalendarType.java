package com.stockbit.usecase.calendar.model.type;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, d2 = {"Lcom/stockbit/usecase/calendar/model/type/CalendarType;", "", Constants.KEY_KEY, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "DIVIDEND", "STOCK_DIVIDEND", "STOCK_SPLIT", "REVERSE_SPLIT", "RIGHT_ISSUE", "WARRANT", "BONUS", "TENDER_OFFER", "RUPS", "PUBLIC_EXPOSE", "IPO", "Companion", "usecase-calendar"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum CalendarType extends Enum<CalendarType> {
    public static final CalendarType BONUS = null;
    public static final a Companion = null;
    public static final CalendarType DIVIDEND = null;
    public static final CalendarType IPO = null;
    public static final CalendarType PUBLIC_EXPOSE = null;
    public static final CalendarType REVERSE_SPLIT = null;
    public static final CalendarType RIGHT_ISSUE = null;
    public static final CalendarType RUPS = null;
    public static final CalendarType STOCK_DIVIDEND = null;
    public static final CalendarType STOCK_SPLIT = null;
    public static final CalendarType TENDER_OFFER = null;
    public static final CalendarType WARRANT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CalendarType[] f155006a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f155007b = null;
    private final String key;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        DIVIDEND = new CalendarType("DIVIDEND", 0, "dividend");
        STOCK_DIVIDEND = new CalendarType("STOCK_DIVIDEND", 1, "stockdividend");
        STOCK_SPLIT = new CalendarType("STOCK_SPLIT", 2, "stocksplit");
        REVERSE_SPLIT = new CalendarType("REVERSE_SPLIT", 3, "reversesplit");
        RIGHT_ISSUE = new CalendarType("RIGHT_ISSUE", 4, "rightissue");
        WARRANT = new CalendarType("WARRANT", 5, "warrant");
        BONUS = new CalendarType("BONUS", 6, "bonus");
        TENDER_OFFER = new CalendarType("TENDER_OFFER", 7, "tenderoffer");
        RUPS = new CalendarType("RUPS", 8, "rups");
        PUBLIC_EXPOSE = new CalendarType("PUBLIC_EXPOSE", 9, "pubex");
        IPO = new CalendarType("IPO", 10, "IPO");
        CalendarType[] r02 = a();
        f155006a = r02;
        f155007b = b.a(r02);
        Companion = new a(null);
    }

    CalendarType(String r1, int r2, String r3) {
        this.key = r3;
    }

    public static final /* synthetic */ CalendarType[] a() {
        return new CalendarType[]{DIVIDEND, STOCK_DIVIDEND, STOCK_SPLIT, REVERSE_SPLIT, RIGHT_ISSUE, WARRANT, BONUS, TENDER_OFFER, RUPS, PUBLIC_EXPOSE, IPO};
    }

    public static kotlin.enums.a getEntries() {
        return f155007b;
    }

    public static CalendarType valueOf(String r1) {
        return (CalendarType) Enum.valueOf(CalendarType.class, r1);
    }

    public static CalendarType[] values() {
        return (CalendarType[]) f155006a.clone();
    }

    public final String getKey() {
        return this.key;
    }
}
