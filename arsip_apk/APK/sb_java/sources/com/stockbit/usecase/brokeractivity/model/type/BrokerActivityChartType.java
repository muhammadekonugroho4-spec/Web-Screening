package com.stockbit.usecase.brokeractivity.model.type;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/stockbit/usecase/brokeractivity/model/type/BrokerActivityChartType;", "", Constants.KEY_TITLE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "VALUE", "VOLUME", "Companion", "usecase-brokeractivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum BrokerActivityChartType extends Enum<BrokerActivityChartType> {
    public static final a Companion = null;
    public static final BrokerActivityChartType VALUE = null;
    public static final BrokerActivityChartType VOLUME = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BrokerActivityChartType[] f154887a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f154888b = null;
    private final String title;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        VALUE = new BrokerActivityChartType("VALUE", 0, "Value");
        VOLUME = new BrokerActivityChartType("VOLUME", 1, "Volume");
        BrokerActivityChartType[] r02 = a();
        f154887a = r02;
        f154888b = b.a(r02);
        Companion = new a(null);
    }

    BrokerActivityChartType(String r1, int r2, String r3) {
        this.title = r3;
    }

    public static final /* synthetic */ BrokerActivityChartType[] a() {
        return new BrokerActivityChartType[]{VALUE, VOLUME};
    }

    public static kotlin.enums.a getEntries() {
        return f154888b;
    }

    public static BrokerActivityChartType valueOf(String r1) {
        return (BrokerActivityChartType) Enum.valueOf(BrokerActivityChartType.class, r1);
    }

    public static BrokerActivityChartType[] values() {
        return (BrokerActivityChartType[]) f154887a.clone();
    }

    public final String getTitle() {
        return this.title;
    }
}
