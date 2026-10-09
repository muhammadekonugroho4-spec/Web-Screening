package com.stockbit.usecase.globalsetting.model;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, d2 = {"Lcom/stockbit/usecase/globalsetting/model/GlobalSettingFeatureType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NONE", "FEATURE_ID_TRADING_LIMIT", "FEATURE_ID_AUTO_ORDER", "FEATURE_ID_DAY_TRADE", "FEATURE_ID_MULTIPLE_PORTFOLIO", "FEATURE_ID_TRAILING_STOP", "FEATURE_ID_CASH_SWEEP", "FEATURE_ID_MARGIN_TRADING_TNC", "FEATURE_ID_MARGIN_TRADING_AGREEMENT", "FEATURE_ID_NEGO_IN_APP", "FEATURE_ID_EXT_COMMUNITY_BIBIT_PLUS_LEADER_AGREEMENT", "FEATURE_ID_EXT_COMMUNITY_BIBIT_PLUS_MEMBER_AGREEMENT", "Companion", "usecase-global-setting"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum GlobalSettingFeatureType extends Enum<GlobalSettingFeatureType> {
    public static final a Companion = null;
    public static final GlobalSettingFeatureType FEATURE_ID_AUTO_ORDER = null;
    public static final GlobalSettingFeatureType FEATURE_ID_CASH_SWEEP = null;
    public static final GlobalSettingFeatureType FEATURE_ID_DAY_TRADE = null;
    public static final GlobalSettingFeatureType FEATURE_ID_EXT_COMMUNITY_BIBIT_PLUS_LEADER_AGREEMENT = null;
    public static final GlobalSettingFeatureType FEATURE_ID_EXT_COMMUNITY_BIBIT_PLUS_MEMBER_AGREEMENT = null;
    public static final GlobalSettingFeatureType FEATURE_ID_MARGIN_TRADING_AGREEMENT = null;
    public static final GlobalSettingFeatureType FEATURE_ID_MARGIN_TRADING_TNC = null;
    public static final GlobalSettingFeatureType FEATURE_ID_MULTIPLE_PORTFOLIO = null;
    public static final GlobalSettingFeatureType FEATURE_ID_NEGO_IN_APP = null;
    public static final GlobalSettingFeatureType FEATURE_ID_TRADING_LIMIT = null;
    public static final GlobalSettingFeatureType FEATURE_ID_TRAILING_STOP = null;
    public static final GlobalSettingFeatureType NONE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ GlobalSettingFeatureType[] f158031a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f158032b = null;
    private final int value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final GlobalSettingFeatureType a(int r4) {
            Iterator<E> r02 = GlobalSettingFeatureType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (((GlobalSettingFeatureType) r1).getValue() != r4) goto L4;
        L10:
            return (GlobalSettingFeatureType) r1;
        L8:
            r1 = null;
            goto L10
        }

        public a() {
        }
    }

    static {
        NONE = new GlobalSettingFeatureType("NONE", 0, 0);
        FEATURE_ID_TRADING_LIMIT = new GlobalSettingFeatureType("FEATURE_ID_TRADING_LIMIT", 1, 1);
        FEATURE_ID_AUTO_ORDER = new GlobalSettingFeatureType("FEATURE_ID_AUTO_ORDER", 2, 2);
        FEATURE_ID_DAY_TRADE = new GlobalSettingFeatureType("FEATURE_ID_DAY_TRADE", 3, 3);
        FEATURE_ID_MULTIPLE_PORTFOLIO = new GlobalSettingFeatureType("FEATURE_ID_MULTIPLE_PORTFOLIO", 4, 4);
        FEATURE_ID_TRAILING_STOP = new GlobalSettingFeatureType("FEATURE_ID_TRAILING_STOP", 5, 5);
        FEATURE_ID_CASH_SWEEP = new GlobalSettingFeatureType("FEATURE_ID_CASH_SWEEP", 6, 6);
        FEATURE_ID_MARGIN_TRADING_TNC = new GlobalSettingFeatureType("FEATURE_ID_MARGIN_TRADING_TNC", 7, 7);
        FEATURE_ID_MARGIN_TRADING_AGREEMENT = new GlobalSettingFeatureType("FEATURE_ID_MARGIN_TRADING_AGREEMENT", 8, 8);
        FEATURE_ID_NEGO_IN_APP = new GlobalSettingFeatureType("FEATURE_ID_NEGO_IN_APP", 9, 10);
        FEATURE_ID_EXT_COMMUNITY_BIBIT_PLUS_LEADER_AGREEMENT = new GlobalSettingFeatureType("FEATURE_ID_EXT_COMMUNITY_BIBIT_PLUS_LEADER_AGREEMENT", 10, 12);
        FEATURE_ID_EXT_COMMUNITY_BIBIT_PLUS_MEMBER_AGREEMENT = new GlobalSettingFeatureType("FEATURE_ID_EXT_COMMUNITY_BIBIT_PLUS_MEMBER_AGREEMENT", 11, 13);
        GlobalSettingFeatureType[] r02 = a();
        f158031a = r02;
        f158032b = b.a(r02);
        Companion = new a(null);
    }

    GlobalSettingFeatureType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ GlobalSettingFeatureType[] a() {
        return new GlobalSettingFeatureType[]{NONE, FEATURE_ID_TRADING_LIMIT, FEATURE_ID_AUTO_ORDER, FEATURE_ID_DAY_TRADE, FEATURE_ID_MULTIPLE_PORTFOLIO, FEATURE_ID_TRAILING_STOP, FEATURE_ID_CASH_SWEEP, FEATURE_ID_MARGIN_TRADING_TNC, FEATURE_ID_MARGIN_TRADING_AGREEMENT, FEATURE_ID_NEGO_IN_APP, FEATURE_ID_EXT_COMMUNITY_BIBIT_PLUS_LEADER_AGREEMENT, FEATURE_ID_EXT_COMMUNITY_BIBIT_PLUS_MEMBER_AGREEMENT};
    }

    public static kotlin.enums.a getEntries() {
        return f158032b;
    }

    public static GlobalSettingFeatureType valueOf(String r1) {
        return (GlobalSettingFeatureType) Enum.valueOf(GlobalSettingFeatureType.class, r1);
    }

    public static GlobalSettingFeatureType[] values() {
        return (GlobalSettingFeatureType[]) f158031a.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
