package com.stockbit.domain.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

@Metadata(d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0003\b\u0081\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bû\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\"\u0010#J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jþ\u0002\u0010\u0083\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001J\u0018\u0010\u0086\u0001\u001a\u00030\u0087\u00012\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u0001HÖ\u0083\u0004J\f\u0010\u008a\u0001\u001a\u00030\u0085\u0001HÖ\u0081\u0004J\u000b\u0010\u008b\u0001\u001a\u00020\u0003HÖ\u0081\u0004J\u001c\u0010\u008c\u0001\u001a\u00030\u008d\u00012\b\u0010\u008e\u0001\u001a\u00030\u008f\u00012\b\u0010\u0090\u0001\u001a\u00030\u0085\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010%\"\u0004\b/\u0010'R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010%\"\u0004\b1\u0010'R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010%\"\u0004\b5\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010%\"\u0004\b7\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010%\"\u0004\b9\u0010'R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010%\"\u0004\b;\u0010'R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010%\"\u0004\b=\u0010'R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010%\"\u0004\b?\u0010'R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010%\"\u0004\bA\u0010'R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010%\"\u0004\bC\u0010'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010%\"\u0004\bE\u0010'R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010%\"\u0004\bG\u0010'R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010%\"\u0004\bI\u0010'R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010%\"\u0004\bK\u0010'R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010%\"\u0004\bM\u0010'R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010%\"\u0004\bO\u0010'R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010%\"\u0004\bQ\u0010'R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010%\"\u0004\bS\u0010'R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010%\"\u0004\bU\u0010'R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010%\"\u0004\bW\u0010'R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010%\"\u0004\bY\u0010'R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010%\"\u0004\b[\u0010'R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010%\"\u0004\b]\u0010'R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010%\"\u0004\b_\u0010'R\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010%\"\u0004\ba\u0010'R\u001c\u0010!\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010%\"\u0004\bc\u0010'¨\u0006\u0091\u0001"}, d2 = {"Lcom/stockbit/domain/model/entity/CompanyOrderbookOffer;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.PRICE, "", "price1", "volume1", "queue1", "price2", "volume2", "queue2", "price3", "volume3", "queue3", "price4", "volume4", "queue4", "price5", "volume5", "queue5", "price6", "volume6", "queue6", "price7", "volume7", "queue7", "price8", "volume8", "queue8", "price9", "volume9", "queue9", "price10", "volume10", "queue10", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPrice", "()Ljava/lang/String;", "setPrice", "(Ljava/lang/String;)V", "getPrice1", "setPrice1", "getVolume1", "setVolume1", "getQueue1", "setQueue1", "getPrice2", "setPrice2", "getVolume2", "setVolume2", "getQueue2", "setQueue2", "getPrice3", "setPrice3", "getVolume3", "setVolume3", "getQueue3", "setQueue3", "getPrice4", "setPrice4", "getVolume4", "setVolume4", "getQueue4", "setQueue4", "getPrice5", "setPrice5", "getVolume5", "setVolume5", "getQueue5", "setQueue5", "getPrice6", "setPrice6", "getVolume6", "setVolume6", "getQueue6", "setQueue6", "getPrice7", "setPrice7", "getVolume7", "setVolume7", "getQueue7", "setQueue7", "getPrice8", "setPrice8", "getVolume8", "setVolume8", "getQueue8", "setQueue8", "getPrice9", "setPrice9", "getVolume9", "setVolume9", "getQueue9", "setQueue9", "getPrice10", "setPrice10", "getVolume10", "setVolume10", "getQueue10", "setQueue10", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CompanyOrderbookOffer implements Parcelable {
    public static final Parcelable.Creator<CompanyOrderbookOffer> CREATOR = null;

    /* renamed from: A, reason: collision with root package name */
    public String f82370A;

    /* renamed from: B, reason: collision with root package name */
    public String f82371B;

    /* renamed from: C, reason: collision with root package name */
    public String f82372C;

    /* renamed from: D, reason: collision with root package name */
    public String f82373D;

    /* renamed from: E, reason: collision with root package name */
    public String f82374E;

    /* renamed from: a, reason: collision with root package name */
    public String f82375a;

    /* renamed from: b, reason: collision with root package name */
    public String f82376b;

    /* renamed from: c, reason: collision with root package name */
    public String f82377c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f82378e;

    /* renamed from: f, reason: collision with root package name */
    public String f82379f;

    /* renamed from: g, reason: collision with root package name */
    public String f82380g;

    /* renamed from: h, reason: collision with root package name */
    public String f82381h;

    /* renamed from: i, reason: collision with root package name */
    public String f82382i;

    /* renamed from: j, reason: collision with root package name */
    public String f82383j;

    /* renamed from: k, reason: collision with root package name */
    public String f82384k;

    /* renamed from: l, reason: collision with root package name */
    public String f82385l;

    /* renamed from: m, reason: collision with root package name */
    public String f82386m;

    /* renamed from: n, reason: collision with root package name */
    public String f82387n;

    /* renamed from: o, reason: collision with root package name */
    public String f82388o;

    /* renamed from: p, reason: collision with root package name */
    public String f82389p;

    /* renamed from: q, reason: collision with root package name */
    public String f82390q;

    /* renamed from: r, reason: collision with root package name */
    public String f82391r;

    /* renamed from: s, reason: collision with root package name */
    public String f82392s;

    /* renamed from: t, reason: collision with root package name */
    public String f82393t;

    /* renamed from: u, reason: collision with root package name */
    public String f82394u;

    /* renamed from: v, reason: collision with root package name */
    public String f82395v;

    /* renamed from: w, reason: collision with root package name */
    public String f82396w;

    /* renamed from: x, reason: collision with root package name */
    public String f82397x;

    /* renamed from: y, reason: collision with root package name */
    public String f82398y;

    /* renamed from: z, reason: collision with root package name */
    public String f82399z;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final CompanyOrderbookOffer a(Parcel r34) {
            kotlin.jvm.internal.p.l(r34, "parcel");
            return new CompanyOrderbookOffer(r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString(), r34.readString());
        }

        public final CompanyOrderbookOffer[] b(int r1) {
            return new CompanyOrderbookOffer[r1];
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

    public CompanyOrderbookOffer(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, String r14, String r15, String r16, String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31) {
        this.f82375a = r1;
        this.f82376b = r2;
        this.f82377c = r3;
        this.d = r4;
        this.f82378e = r5;
        this.f82379f = r6;
        this.f82380g = r7;
        this.f82381h = r8;
        this.f82382i = r9;
        this.f82383j = r10;
        this.f82384k = r11;
        this.f82385l = r12;
        this.f82386m = r13;
        this.f82387n = r14;
        this.f82388o = r15;
        this.f82389p = r16;
        this.f82390q = r17;
        this.f82391r = r18;
        this.f82392s = r19;
        this.f82393t = r20;
        this.f82394u = r21;
        this.f82395v = r22;
        this.f82396w = r23;
        this.f82397x = r24;
        this.f82398y = r25;
        this.f82399z = r26;
        this.f82370A = r27;
        this.f82371B = r28;
        this.f82372C = r29;
        this.f82373D = r30;
        this.f82374E = r31;
    }

    public final String A() {
        return this.f82391r;
    }

    public final String B() {
        return this.f82394u;
    }

    public final String C() {
        return this.f82397x;
    }

    public final String D() {
        return this.f82370A;
    }

    public final String a() {
        return this.f82376b;
    }

    public final String b() {
        return this.f82372C;
    }

    public final String c() {
        return this.f82378e;
    }

    public final String d() {
        return this.f82381h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f82384k;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CompanyOrderbookOffer) == true) goto L8;
        return false;
    L8:
        CompanyOrderbookOffer r52 = (CompanyOrderbookOffer) r5;
        if (kotlin.jvm.internal.p.g(this.f82375a, r52.f82375a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82376b, r52.f82376b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f82377c, r52.f82377c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f82378e, r52.f82378e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f82379f, r52.f82379f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f82380g, r52.f82380g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f82381h, r52.f82381h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f82382i, r52.f82382i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f82383j, r52.f82383j) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f82384k, r52.f82384k) == true) goto L42;
        return false;
    L42:
        if (kotlin.jvm.internal.p.g(this.f82385l, r52.f82385l) == true) goto L45;
        return false;
    L45:
        if (kotlin.jvm.internal.p.g(this.f82386m, r52.f82386m) == true) goto L48;
        return false;
    L48:
        if (kotlin.jvm.internal.p.g(this.f82387n, r52.f82387n) == true) goto L51;
        return false;
    L51:
        if (kotlin.jvm.internal.p.g(this.f82388o, r52.f82388o) == true) goto L54;
        return false;
    L54:
        if (kotlin.jvm.internal.p.g(this.f82389p, r52.f82389p) == true) goto L57;
        return false;
    L57:
        if (kotlin.jvm.internal.p.g(this.f82390q, r52.f82390q) == true) goto L60;
        return false;
    L60:
        if (kotlin.jvm.internal.p.g(this.f82391r, r52.f82391r) == true) goto L63;
        return false;
    L63:
        if (kotlin.jvm.internal.p.g(this.f82392s, r52.f82392s) == true) goto L66;
        return false;
    L66:
        if (kotlin.jvm.internal.p.g(this.f82393t, r52.f82393t) == true) goto L69;
        return false;
    L69:
        if (kotlin.jvm.internal.p.g(this.f82394u, r52.f82394u) == true) goto L72;
        return false;
    L72:
        if (kotlin.jvm.internal.p.g(this.f82395v, r52.f82395v) == true) goto L75;
        return false;
    L75:
        if (kotlin.jvm.internal.p.g(this.f82396w, r52.f82396w) == true) goto L78;
        return false;
    L78:
        if (kotlin.jvm.internal.p.g(this.f82397x, r52.f82397x) == true) goto L81;
        return false;
    L81:
        if (kotlin.jvm.internal.p.g(this.f82398y, r52.f82398y) == true) goto L84;
        return false;
    L84:
        if (kotlin.jvm.internal.p.g(this.f82399z, r52.f82399z) == true) goto L87;
        return false;
    L87:
        if (kotlin.jvm.internal.p.g(this.f82370A, r52.f82370A) == true) goto L90;
        return false;
    L90:
        if (kotlin.jvm.internal.p.g(this.f82371B, r52.f82371B) == true) goto L93;
        return false;
    L93:
        if (kotlin.jvm.internal.p.g(this.f82372C, r52.f82372C) == true) goto L96;
        return false;
    L96:
        if (kotlin.jvm.internal.p.g(this.f82373D, r52.f82373D) == true) goto L99;
        return false;
    L99:
        if (kotlin.jvm.internal.p.g(this.f82374E, r52.f82374E) == true) goto L101;
        return false;
    L101:
        return true;
    }

    public final String f() {
        return this.f82387n;
    }

    public final String g() {
        return this.f82390q;
    }

    public final String h() {
        return this.f82393t;
    }

    public int hashCode() {
        String r02 = this.f82375a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f82376b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f82377c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f82378e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f82379f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f82380g;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.f82381h;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.f82382i;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.f82383j;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.f82384k;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        String r221 = this.f82385l;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (r014 + r222) * 31;
        String r223 = this.f82386m;
        if (r223 != null) goto L53;
        int r224 = 0;
    L54:
        int r016 = (r015 + r224) * 31;
        String r225 = this.f82387n;
        if (r225 != null) goto L57;
        int r226 = 0;
    L58:
        int r017 = (r016 + r226) * 31;
        String r227 = this.f82388o;
        if (r227 != null) goto L61;
        int r228 = 0;
    L62:
        int r018 = (r017 + r228) * 31;
        String r229 = this.f82389p;
        if (r229 != null) goto L65;
        int r230 = 0;
    L66:
        int r019 = (r018 + r230) * 31;
        String r231 = this.f82390q;
        if (r231 != null) goto L69;
        int r232 = 0;
    L70:
        int r020 = (r019 + r232) * 31;
        String r233 = this.f82391r;
        if (r233 != null) goto L73;
        int r234 = 0;
    L74:
        int r021 = (r020 + r234) * 31;
        String r235 = this.f82392s;
        if (r235 != null) goto L77;
        int r236 = 0;
    L78:
        int r022 = (r021 + r236) * 31;
        String r237 = this.f82393t;
        if (r237 != null) goto L81;
        int r238 = 0;
    L82:
        int r023 = (r022 + r238) * 31;
        String r239 = this.f82394u;
        if (r239 != null) goto L85;
        int r240 = 0;
    L86:
        int r024 = (r023 + r240) * 31;
        String r241 = this.f82395v;
        if (r241 != null) goto L89;
        int r242 = 0;
    L90:
        int r025 = (r024 + r242) * 31;
        String r243 = this.f82396w;
        if (r243 != null) goto L93;
        int r244 = 0;
    L94:
        int r026 = (r025 + r244) * 31;
        String r245 = this.f82397x;
        if (r245 != null) goto L97;
        int r246 = 0;
    L98:
        int r027 = (r026 + r246) * 31;
        String r247 = this.f82398y;
        if (r247 != null) goto L101;
        int r248 = 0;
    L102:
        int r028 = (r027 + r248) * 31;
        String r249 = this.f82399z;
        if (r249 != null) goto L105;
        int r250 = 0;
    L106:
        int r029 = (r028 + r250) * 31;
        String r251 = this.f82370A;
        if (r251 != null) goto L109;
        int r252 = 0;
    L110:
        int r030 = (r029 + r252) * 31;
        String r253 = this.f82371B;
        if (r253 != null) goto L113;
        int r254 = 0;
    L114:
        int r031 = (r030 + r254) * 31;
        String r255 = this.f82372C;
        if (r255 != null) goto L117;
        int r256 = 0;
    L118:
        int r032 = (r031 + r256) * 31;
        String r257 = this.f82373D;
        if (r257 != null) goto L121;
        int r258 = 0;
    L122:
        int r033 = (r032 + r258) * 31;
        String r259 = this.f82374E;
        if (r259 == null) goto L127;
        r1 = r259.hashCode();
    L127:
        return r033 + r1;
    L121:
        r258 = r257.hashCode();
        goto L122
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
        return this.f82396w;
    }

    public final String j() {
        return this.f82399z;
    }

    public final String k() {
        return this.d;
    }

    public final String l() {
        return this.f82374E;
    }

    public final String m() {
        return this.f82380g;
    }

    public final String n() {
        return this.f82383j;
    }

    public final String o() {
        return this.f82386m;
    }

    public final String p() {
        return this.f82389p;
    }

    public final String q() {
        return this.f82392s;
    }

    public final String r() {
        return this.f82395v;
    }

    public final String s() {
        return this.f82398y;
    }

    public final String t() {
        return this.f82371B;
    }

    public String toString() {
        return "CompanyOrderbookOffer(price=" + this.f82375a + ", price1=" + this.f82376b + ", volume1=" + this.f82377c + ", queue1=" + this.d + ", price2=" + this.f82378e + ", volume2=" + this.f82379f + ", queue2=" + this.f82380g + ", price3=" + this.f82381h + ", volume3=" + this.f82382i + ", queue3=" + this.f82383j + ", price4=" + this.f82384k + ", volume4=" + this.f82385l + ", queue4=" + this.f82386m + ", price5=" + this.f82387n + ", volume5=" + this.f82388o + ", queue5=" + this.f82389p + ", price6=" + this.f82390q + ", volume6=" + this.f82391r + ", queue6=" + this.f82392s + ", price7=" + this.f82393t + ", volume7=" + this.f82394u + ", queue7=" + this.f82395v + ", price8=" + this.f82396w + ", volume8=" + this.f82397x + ", queue8=" + this.f82398y + ", price9=" + this.f82399z + ", volume9=" + this.f82370A + ", queue9=" + this.f82371B + ", price10=" + this.f82372C + ", volume10=" + this.f82373D + ", queue10=" + this.f82374E + ')';
    }

    public final String u() {
        return this.f82377c;
    }

    public final String v() {
        return this.f82373D;
    }

    public final String w() {
        return this.f82379f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        kotlin.jvm.internal.p.l(r1, "dest");
        r1.writeString(this.f82375a);
        r1.writeString(this.f82376b);
        r1.writeString(this.f82377c);
        r1.writeString(this.d);
        r1.writeString(this.f82378e);
        r1.writeString(this.f82379f);
        r1.writeString(this.f82380g);
        r1.writeString(this.f82381h);
        r1.writeString(this.f82382i);
        r1.writeString(this.f82383j);
        r1.writeString(this.f82384k);
        r1.writeString(this.f82385l);
        r1.writeString(this.f82386m);
        r1.writeString(this.f82387n);
        r1.writeString(this.f82388o);
        r1.writeString(this.f82389p);
        r1.writeString(this.f82390q);
        r1.writeString(this.f82391r);
        r1.writeString(this.f82392s);
        r1.writeString(this.f82393t);
        r1.writeString(this.f82394u);
        r1.writeString(this.f82395v);
        r1.writeString(this.f82396w);
        r1.writeString(this.f82397x);
        r1.writeString(this.f82398y);
        r1.writeString(this.f82399z);
        r1.writeString(this.f82370A);
        r1.writeString(this.f82371B);
        r1.writeString(this.f82372C);
        r1.writeString(this.f82373D);
        r1.writeString(this.f82374E);
    }

    public final String x() {
        return this.f82382i;
    }

    public final String y() {
        return this.f82385l;
    }

    public final String z() {
        return this.f82388o;
    }
}
