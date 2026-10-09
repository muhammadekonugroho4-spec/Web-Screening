package com.stockbit.model.entity.screener;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import com.stockbit.calendar.CalendarEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003Jw\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0014\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010:\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010;\u001a\u00020\u0005HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001e\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u001e\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014¨\u0006<"}, d2 = {"Lcom/stockbit/model/entity/screener/ScreenerTemplateRequest;", "", "orderCol", "", "sequence", "", "screenerId", "universe", "save", AppMeasurementSdk.ConditionalUserProperty.NAME, "filters", CalendarEntryPoint.KEY_PAGE_DETAIL, "orderType", "type", Constants.KEY_LIMIT, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", "getOrderCol", "()I", "setOrderCol", "(I)V", "getSequence", "()Ljava/lang/String;", "setSequence", "(Ljava/lang/String;)V", "getScreenerId", "setScreenerId", "getUniverse", "setUniverse", "getSave", "setSave", "getName", "setName", "getFilters", "setFilters", "getPage", "setPage", "getOrderType", "setOrderType", "getType", "setType", "getLimit", "setLimit", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ScreenerTemplateRequest {

    @SerializedName("filters")
    private String filters;

    @SerializedName(Constants.KEY_LIMIT)
    private int limit;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private String name;

    @SerializedName("ordercol")
    private int orderCol;

    @SerializedName("ordertype")
    private String orderType;

    @SerializedName(CalendarEntryPoint.KEY_PAGE_DETAIL)
    private int page;

    @SerializedName("save")
    private String save;

    @SerializedName("screenerid")
    private String screenerId;

    @SerializedName("sequence")
    private String sequence;

    @SerializedName("type")
    private String type;

    @SerializedName("universe")
    private String universe;

    public ScreenerTemplateRequest(int r2, String r3, String r4, String r5, String r6, String r7, String r8, int r9, String r10, String r11, int r12) {
        p.l(r3, "sequence");
        p.l(r4, "screenerId");
        p.l(r5, "universe");
        p.l(r6, "save");
        p.l(r7, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r8, "filters");
        p.l(r10, "orderType");
        p.l(r11, "type");
        this.orderCol = r2;
        this.sequence = r3;
        this.screenerId = r4;
        this.universe = r5;
        this.save = r6;
        this.name = r7;
        this.filters = r8;
        this.page = r9;
        this.orderType = r10;
        this.type = r11;
        this.limit = r12;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ScreenerTemplateRequest) == true) goto L8;
        return false;
    L8:
        ScreenerTemplateRequest r52 = (ScreenerTemplateRequest) r5;
        if (this.orderCol == r52.orderCol) goto L12;
        return false;
    L12:
        if (p.g(this.sequence, r52.sequence) == true) goto L15;
        return false;
    L15:
        if (p.g(this.screenerId, r52.screenerId) == true) goto L18;
        return false;
    L18:
        if (p.g(this.universe, r52.universe) == true) goto L21;
        return false;
    L21:
        if (p.g(this.save, r52.save) == true) goto L24;
        return false;
    L24:
        if (p.g(this.name, r52.name) == true) goto L27;
        return false;
    L27:
        if (p.g(this.filters, r52.filters) == true) goto L30;
        return false;
    L30:
        if (this.page == r52.page) goto L33;
        return false;
    L33:
        if (p.g(this.orderType, r52.orderType) == true) goto L36;
        return false;
    L36:
        if (p.g(this.type, r52.type) == true) goto L39;
        return false;
    L39:
        if (this.limit == r52.limit) goto L41;
        return false;
    L41:
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.orderCol) * 31) + this.sequence.hashCode()) * 31) + this.screenerId.hashCode()) * 31) + this.universe.hashCode()) * 31) + this.save.hashCode()) * 31) + this.name.hashCode()) * 31) + this.filters.hashCode()) * 31) + Integer.hashCode(this.page)) * 31) + this.orderType.hashCode()) * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.limit);
    }

    public String toString() {
        return "ScreenerTemplateRequest(orderCol=" + this.orderCol + ", sequence=" + this.sequence + ", screenerId=" + this.screenerId + ", universe=" + this.universe + ", save=" + this.save + ", name=" + this.name + ", filters=" + this.filters + ", page=" + this.page + ", orderType=" + this.orderType + ", type=" + this.type + ", limit=" + this.limit + ')';
    }
}
