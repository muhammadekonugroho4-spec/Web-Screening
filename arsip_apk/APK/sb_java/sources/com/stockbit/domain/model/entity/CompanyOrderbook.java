package com.stockbit.domain.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.midtrans.sdk.corekit.models.snap.EnabledPayment;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bn\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bï\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b#\u0010$J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jò\u0002\u0010\u0085\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001J\u0018\u0010\u0088\u0001\u001a\u00030\u0089\u00012\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u008b\u0001HÖ\u0083\u0004J\f\u0010\u008c\u0001\u001a\u00030\u0087\u0001HÖ\u0081\u0004J\u000b\u0010\u008d\u0001\u001a\u00020\u0003HÖ\u0081\u0004J\u001c\u0010\u008e\u0001\u001a\u00030\u008f\u00012\b\u0010\u0090\u0001\u001a\u00030\u0091\u00012\b\u0010\u0092\u0001\u001a\u00030\u0087\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010&\"\u0004\b0\u0010(R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010&\"\u0004\b2\u0010(R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010&\"\u0004\b6\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010&\"\u0004\b8\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010&\"\u0004\b:\u0010(R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010&\"\u0004\b<\u0010(R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010&\"\u0004\b>\u0010(R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010&\"\u0004\b@\u0010(R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010&\"\u0004\bB\u0010(R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010&\"\u0004\bD\u0010(R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010&\"\u0004\bF\u0010(R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010&\"\u0004\bH\u0010(R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010&\"\u0004\bJ\u0010(R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010&\"\u0004\bT\u0010(R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010&\"\u0004\bV\u0010(R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010&\"\u0004\bX\u0010(R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010&\"\u0004\bZ\u0010(R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010&\"\u0004\b\\\u0010(R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010&\"\u0004\b^\u0010(R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010&\"\u0004\b`\u0010(R\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010&\"\u0004\bb\u0010(R\u001c\u0010!\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010&\"\u0004\bd\u0010(R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010&\"\u0004\bf\u0010(¨\u0006\u0093\u0001"}, d2 = {"Lcom/stockbit/domain/model/entity/CompanyOrderbook;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", "symbol", "symbol_2", "symbol_3", "country", "exchange", NotificationCompat.CATEGORY_STATUS, "lastprice", "previous", "change", "percentage_change", "open", Constants.PRIORITY_HIGH, "low", Constants.KEY_HIDE_CLOSE, "volume", "value", "average", "bid", "Lcom/stockbit/domain/model/entity/CompanyOrderbookBid;", "offer", "Lcom/stockbit/domain/model/entity/CompanyOrderbookOffer;", Constants.KEY_FREQUENCY, "fbuy", "fsell", "fnet", "foreign", "domestic", EnabledPayment.STATUS_UP, EnabledPayment.STATUS_DOWN, "unchanged", "tradeable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/domain/model/entity/CompanyOrderbookBid;Lcom/stockbit/domain/model/entity/CompanyOrderbookOffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getSymbol", "setSymbol", "getSymbol_2", "setSymbol_2", "getSymbol_3", "setSymbol_3", "getCountry", "setCountry", "getExchange", "setExchange", "getStatus", "setStatus", "getLastprice", "setLastprice", "getPrevious", "setPrevious", "getChange", "setChange", "getPercentage_change", "setPercentage_change", "getOpen", "setOpen", "getHigh", "setHigh", "getLow", "setLow", "getClose", "setClose", "getVolume", "setVolume", "getValue", "setValue", "getAverage", "setAverage", "getBid", "()Lcom/stockbit/domain/model/entity/CompanyOrderbookBid;", "setBid", "(Lcom/stockbit/domain/model/entity/CompanyOrderbookBid;)V", "getOffer", "()Lcom/stockbit/domain/model/entity/CompanyOrderbookOffer;", "setOffer", "(Lcom/stockbit/domain/model/entity/CompanyOrderbookOffer;)V", "getFrequency", "setFrequency", "getFbuy", "setFbuy", "getFsell", "setFsell", "getFnet", "setFnet", "getForeign", "setForeign", "getDomestic", "setDomestic", "getUp", "setUp", "getDown", "setDown", "getUnchanged", "setUnchanged", "getTradeable", "setTradeable", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CompanyOrderbook implements Parcelable {
    public static final Parcelable.Creator<CompanyOrderbook> CREATOR = null;

    /* renamed from: A, reason: collision with root package name */
    public String f82311A;

    /* renamed from: B, reason: collision with root package name */
    public String f82312B;

    /* renamed from: C, reason: collision with root package name */
    public String f82313C;

    /* renamed from: D, reason: collision with root package name */
    public String f82314D;

    /* renamed from: a, reason: collision with root package name */
    public String f82315a;

    /* renamed from: b, reason: collision with root package name */
    public String f82316b;

    /* renamed from: c, reason: collision with root package name */
    public String f82317c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f82318e;

    /* renamed from: f, reason: collision with root package name */
    public String f82319f;

    /* renamed from: g, reason: collision with root package name */
    public String f82320g;

    /* renamed from: h, reason: collision with root package name */
    public String f82321h;

    /* renamed from: i, reason: collision with root package name */
    public String f82322i;

    /* renamed from: j, reason: collision with root package name */
    public String f82323j;

    /* renamed from: k, reason: collision with root package name */
    public String f82324k;

    /* renamed from: l, reason: collision with root package name */
    public String f82325l;

    /* renamed from: m, reason: collision with root package name */
    public String f82326m;

    /* renamed from: n, reason: collision with root package name */
    public String f82327n;

    /* renamed from: o, reason: collision with root package name */
    public String f82328o;

    /* renamed from: p, reason: collision with root package name */
    public String f82329p;

    /* renamed from: q, reason: collision with root package name */
    public String f82330q;

    /* renamed from: r, reason: collision with root package name */
    public String f82331r;

    /* renamed from: s, reason: collision with root package name */
    public CompanyOrderbookBid f82332s;

    /* renamed from: t, reason: collision with root package name */
    public CompanyOrderbookOffer f82333t;

    /* renamed from: u, reason: collision with root package name */
    public String f82334u;

    /* renamed from: v, reason: collision with root package name */
    public String f82335v;

    /* renamed from: w, reason: collision with root package name */
    public String f82336w;

    /* renamed from: x, reason: collision with root package name */
    public String f82337x;

    /* renamed from: y, reason: collision with root package name */
    public String f82338y;

    /* renamed from: z, reason: collision with root package name */
    public String f82339z;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final CompanyOrderbook a(Parcel r35) {
            kotlin.jvm.internal.p.l(r35, "parcel");
            String r3 = r35.readString();
            String r4 = r35.readString();
            String r5 = r35.readString();
            String r6 = r35.readString();
            String r7 = r35.readString();
            String r8 = r35.readString();
            String r9 = r35.readString();
            String r10 = r35.readString();
            String r11 = r35.readString();
            String r12 = r35.readString();
            String r13 = r35.readString();
            String r14 = r35.readString();
            String r15 = r35.readString();
            String r16 = r35.readString();
            String r17 = r35.readString();
            String r18 = r35.readString();
            String r19 = r35.readString();
            String r20 = r35.readString();
            if (r35.readInt() != 0) goto L5;
            CompanyOrderbookBid r1 = null;
        L6:
            CompanyOrderbookBid r110 = r1;
            if (r35.readInt() != 0) goto L9;
            CompanyOrderbookBid r21 = r110;
            CompanyOrderbookOffer r111 = null;
        L11:
            return new CompanyOrderbook(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r111, r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString());
        L9:
            r21 = r110;
            r111 = CompanyOrderbookOffer.CREATOR.createFromParcel(r35);
            goto L11
        L5:
            r1 = CompanyOrderbookBid.CREATOR.createFromParcel(r35);
            goto L6
        }

        public final CompanyOrderbook[] b(int r1) {
            return new CompanyOrderbook[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel r1) {
            return a(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int r1) {
            return b(r1);
        }
    }

    static {
        CREATOR = new a();
    }

    public CompanyOrderbook(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, String r14, String r15, String r16, String r17, String r18, CompanyOrderbookBid r19, CompanyOrderbookOffer r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30) {
        this.f82315a = r1;
        this.f82316b = r2;
        this.f82317c = r3;
        this.d = r4;
        this.f82318e = r5;
        this.f82319f = r6;
        this.f82320g = r7;
        this.f82321h = r8;
        this.f82322i = r9;
        this.f82323j = r10;
        this.f82324k = r11;
        this.f82325l = r12;
        this.f82326m = r13;
        this.f82327n = r14;
        this.f82328o = r15;
        this.f82329p = r16;
        this.f82330q = r17;
        this.f82331r = r18;
        this.f82332s = r19;
        this.f82333t = r20;
        this.f82334u = r21;
        this.f82335v = r22;
        this.f82336w = r23;
        this.f82337x = r24;
        this.f82338y = r25;
        this.f82339z = r26;
        this.f82311A = r27;
        this.f82312B = r28;
        this.f82313C = r29;
        this.f82314D = r30;
    }

    public final String a() {
        return this.f82331r;
    }

    public final CompanyOrderbookBid b() {
        return this.f82332s;
    }

    public final String c() {
        return this.f82323j;
    }

    public final String d() {
        return this.f82335v;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f82336w;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CompanyOrderbook) == true) goto L8;
        return false;
    L8:
        CompanyOrderbook r52 = (CompanyOrderbook) r5;
        if (kotlin.jvm.internal.p.g(this.f82315a, r52.f82315a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82316b, r52.f82316b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f82317c, r52.f82317c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f82318e, r52.f82318e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f82319f, r52.f82319f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f82320g, r52.f82320g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f82321h, r52.f82321h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f82322i, r52.f82322i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f82323j, r52.f82323j) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f82324k, r52.f82324k) == true) goto L42;
        return false;
    L42:
        if (kotlin.jvm.internal.p.g(this.f82325l, r52.f82325l) == true) goto L45;
        return false;
    L45:
        if (kotlin.jvm.internal.p.g(this.f82326m, r52.f82326m) == true) goto L48;
        return false;
    L48:
        if (kotlin.jvm.internal.p.g(this.f82327n, r52.f82327n) == true) goto L51;
        return false;
    L51:
        if (kotlin.jvm.internal.p.g(this.f82328o, r52.f82328o) == true) goto L54;
        return false;
    L54:
        if (kotlin.jvm.internal.p.g(this.f82329p, r52.f82329p) == true) goto L57;
        return false;
    L57:
        if (kotlin.jvm.internal.p.g(this.f82330q, r52.f82330q) == true) goto L60;
        return false;
    L60:
        if (kotlin.jvm.internal.p.g(this.f82331r, r52.f82331r) == true) goto L63;
        return false;
    L63:
        if (kotlin.jvm.internal.p.g(this.f82332s, r52.f82332s) == true) goto L66;
        return false;
    L66:
        if (kotlin.jvm.internal.p.g(this.f82333t, r52.f82333t) == true) goto L69;
        return false;
    L69:
        if (kotlin.jvm.internal.p.g(this.f82334u, r52.f82334u) == true) goto L72;
        return false;
    L72:
        if (kotlin.jvm.internal.p.g(this.f82335v, r52.f82335v) == true) goto L75;
        return false;
    L75:
        if (kotlin.jvm.internal.p.g(this.f82336w, r52.f82336w) == true) goto L78;
        return false;
    L78:
        if (kotlin.jvm.internal.p.g(this.f82337x, r52.f82337x) == true) goto L81;
        return false;
    L81:
        if (kotlin.jvm.internal.p.g(this.f82338y, r52.f82338y) == true) goto L84;
        return false;
    L84:
        if (kotlin.jvm.internal.p.g(this.f82339z, r52.f82339z) == true) goto L87;
        return false;
    L87:
        if (kotlin.jvm.internal.p.g(this.f82311A, r52.f82311A) == true) goto L90;
        return false;
    L90:
        if (kotlin.jvm.internal.p.g(this.f82312B, r52.f82312B) == true) goto L93;
        return false;
    L93:
        if (kotlin.jvm.internal.p.g(this.f82313C, r52.f82313C) == true) goto L96;
        return false;
    L96:
        if (kotlin.jvm.internal.p.g(this.f82314D, r52.f82314D) == true) goto L98;
        return false;
    L98:
        return true;
    }

    public final String f() {
        return this.f82326m;
    }

    public final String g() {
        return this.f82327n;
    }

    public final CompanyOrderbookOffer h() {
        return this.f82333t;
    }

    public int hashCode() {
        String r02 = this.f82315a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f82316b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f82317c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f82318e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f82319f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f82320g;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.f82321h;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.f82322i;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.f82323j;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.f82324k;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        String r221 = this.f82325l;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (r014 + r222) * 31;
        String r223 = this.f82326m;
        if (r223 != null) goto L53;
        int r224 = 0;
    L54:
        int r016 = (r015 + r224) * 31;
        String r225 = this.f82327n;
        if (r225 != null) goto L57;
        int r226 = 0;
    L58:
        int r017 = (r016 + r226) * 31;
        String r227 = this.f82328o;
        if (r227 != null) goto L61;
        int r228 = 0;
    L62:
        int r018 = (r017 + r228) * 31;
        String r229 = this.f82329p;
        if (r229 != null) goto L65;
        int r230 = 0;
    L66:
        int r019 = (r018 + r230) * 31;
        String r231 = this.f82330q;
        if (r231 != null) goto L69;
        int r232 = 0;
    L70:
        int r020 = (r019 + r232) * 31;
        String r233 = this.f82331r;
        if (r233 != null) goto L73;
        int r234 = 0;
    L74:
        int r021 = (r020 + r234) * 31;
        CompanyOrderbookBid r235 = this.f82332s;
        if (r235 != null) goto L77;
        int r236 = 0;
    L78:
        int r022 = (r021 + r236) * 31;
        CompanyOrderbookOffer r237 = this.f82333t;
        if (r237 != null) goto L81;
        int r238 = 0;
    L82:
        int r023 = (r022 + r238) * 31;
        String r239 = this.f82334u;
        if (r239 != null) goto L85;
        int r240 = 0;
    L86:
        int r024 = (r023 + r240) * 31;
        String r241 = this.f82335v;
        if (r241 != null) goto L89;
        int r242 = 0;
    L90:
        int r025 = (r024 + r242) * 31;
        String r243 = this.f82336w;
        if (r243 != null) goto L93;
        int r244 = 0;
    L94:
        int r026 = (r025 + r244) * 31;
        String r245 = this.f82337x;
        if (r245 != null) goto L97;
        int r246 = 0;
    L98:
        int r027 = (r026 + r246) * 31;
        String r247 = this.f82338y;
        if (r247 != null) goto L101;
        int r248 = 0;
    L102:
        int r028 = (r027 + r248) * 31;
        String r249 = this.f82339z;
        if (r249 != null) goto L105;
        int r250 = 0;
    L106:
        int r029 = (r028 + r250) * 31;
        String r251 = this.f82311A;
        if (r251 != null) goto L109;
        int r252 = 0;
    L110:
        int r030 = (r029 + r252) * 31;
        String r253 = this.f82312B;
        if (r253 != null) goto L113;
        int r254 = 0;
    L114:
        int r031 = (r030 + r254) * 31;
        String r255 = this.f82313C;
        if (r255 != null) goto L117;
        int r256 = 0;
    L118:
        int r032 = (r031 + r256) * 31;
        String r257 = this.f82314D;
        if (r257 == null) goto L123;
        r1 = r257.hashCode();
    L123:
        return r032 + r1;
    L117:
        r256 = r255.hashCode();
        goto L118
    L113:
        r254 = r253.hashCode();
        goto L114
    L109:
        r252 = r251.hashCode();
        goto L110
    L105:
        r250 = r249.hashCode();
        goto L106
    L101:
        r248 = r247.hashCode();
        goto L102
    L97:
        r246 = r245.hashCode();
        goto L98
    L93:
        r244 = r243.hashCode();
        goto L94
    L89:
        r242 = r241.hashCode();
        goto L90
    L85:
        r240 = r239.hashCode();
        goto L86
    L81:
        r238 = r237.hashCode();
        goto L82
    L77:
        r236 = r235.hashCode();
        goto L78
    L73:
        r234 = r233.hashCode();
        goto L74
    L69:
        r232 = r231.hashCode();
        goto L70
    L65:
        r230 = r229.hashCode();
        goto L66
    L61:
        r228 = r227.hashCode();
        goto L62
    L57:
        r226 = r225.hashCode();
        goto L58
    L53:
        r224 = r223.hashCode();
        goto L54
    L49:
        r222 = r221.hashCode();
        goto L50
    L45:
        r220 = r219.hashCode();
        goto L46
    L41:
        r218 = r217.hashCode();
        goto L42
    L37:
        r216 = r215.hashCode();
        goto L38
    L33:
        r214 = r213.hashCode();
        goto L34
    L29:
        r212 = r211.hashCode();
        goto L30
    L25:
        r210 = r29.hashCode();
        goto L26
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public final String i() {
        return this.f82325l;
    }

    public final String j() {
        return this.f82322i;
    }

    public final String k() {
        return this.f82317c;
    }

    public final String l() {
        return this.f82330q;
    }

    public final String m() {
        return this.f82329p;
    }

    public String toString() {
        return "CompanyOrderbook(id=" + this.f82315a + ", symbol=" + this.f82316b + ", symbol_2=" + this.f82317c + ", symbol_3=" + this.d + ", country=" + this.f82318e + ", exchange=" + this.f82319f + ", status=" + this.f82320g + ", lastprice=" + this.f82321h + ", previous=" + this.f82322i + ", change=" + this.f82323j + ", percentage_change=" + this.f82324k + ", open=" + this.f82325l + ", high=" + this.f82326m + ", low=" + this.f82327n + ", close=" + this.f82328o + ", volume=" + this.f82329p + ", value=" + this.f82330q + ", average=" + this.f82331r + ", bid=" + this.f82332s + ", offer=" + this.f82333t + ", frequency=" + this.f82334u + ", fbuy=" + this.f82335v + ", fsell=" + this.f82336w + ", fnet=" + this.f82337x + ", foreign=" + this.f82338y + ", domestic=" + this.f82339z + ", up=" + this.f82311A + ", down=" + this.f82312B + ", unchanged=" + this.f82313C + ", tradeable=" + this.f82314D + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        kotlin.jvm.internal.p.l(r4, "dest");
        r4.writeString(this.f82315a);
        r4.writeString(this.f82316b);
        r4.writeString(this.f82317c);
        r4.writeString(this.d);
        r4.writeString(this.f82318e);
        r4.writeString(this.f82319f);
        r4.writeString(this.f82320g);
        r4.writeString(this.f82321h);
        r4.writeString(this.f82322i);
        r4.writeString(this.f82323j);
        r4.writeString(this.f82324k);
        r4.writeString(this.f82325l);
        r4.writeString(this.f82326m);
        r4.writeString(this.f82327n);
        r4.writeString(this.f82328o);
        r4.writeString(this.f82329p);
        r4.writeString(this.f82330q);
        r4.writeString(this.f82331r);
        CompanyOrderbookBid r02 = this.f82332s;
        if (r02 != null) goto L5;
        r4.writeInt(0);
    L6:
        CompanyOrderbookOffer r03 = this.f82333t;
        if (r03 != null) goto L9;
        r4.writeInt(0);
    L10:
        r4.writeString(this.f82334u);
        r4.writeString(this.f82335v);
        r4.writeString(this.f82336w);
        r4.writeString(this.f82337x);
        r4.writeString(this.f82338y);
        r4.writeString(this.f82339z);
        r4.writeString(this.f82311A);
        r4.writeString(this.f82312B);
        r4.writeString(this.f82313C);
        r4.writeString(this.f82314D);
        return;
    L9:
        r4.writeInt(1);
        r03.writeToParcel(r4, r5);
        goto L10
    L5:
        r4.writeInt(1);
        r02.writeToParcel(r4, r5);
        goto L6
    }
}
