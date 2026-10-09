package com.stockbit.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.common.primitives.Ints;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0003\b\u0085\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b#\u0010$J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008a\u0003\u0010\u0087\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001J\u0018\u0010\u008a\u0001\u001a\u00030\u008b\u00012\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008d\u0001HÖ\u0083\u0004J\f\u0010\u008e\u0001\u001a\u00030\u0089\u0001HÖ\u0081\u0004J\u000b\u0010\u008f\u0001\u001a\u00020\u0003HÖ\u0081\u0004J\u001c\u0010\u0090\u0001\u001a\u00030\u0091\u00012\b\u0010\u0092\u0001\u001a\u00030\u0093\u00012\b\u0010\u0094\u0001\u001a\u00030\u0089\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010&\"\u0004\b0\u0010(R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010&\"\u0004\b2\u0010(R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010&\"\u0004\b6\u0010(R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010&\"\u0004\b8\u0010(R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010&\"\u0004\b:\u0010(R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010&\"\u0004\b<\u0010(R \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010&\"\u0004\b>\u0010(R \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010&\"\u0004\b@\u0010(R \u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010&\"\u0004\bB\u0010(R \u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010&\"\u0004\bD\u0010(R \u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010&\"\u0004\bF\u0010(R \u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010&\"\u0004\bH\u0010(R \u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010&\"\u0004\bJ\u0010(R \u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010&\"\u0004\bL\u0010(R \u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010&\"\u0004\bN\u0010(R \u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010&\"\u0004\bP\u0010(R \u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010&\"\u0004\bR\u0010(R \u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010&\"\u0004\bT\u0010(R \u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010&\"\u0004\bV\u0010(R \u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010&\"\u0004\bX\u0010(R \u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010&\"\u0004\bZ\u0010(R \u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010&\"\u0004\b\\\u0010(R \u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010&\"\u0004\b^\u0010(R \u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010&\"\u0004\b`\u0010(R \u0010 \u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010&\"\u0004\bb\u0010(R \u0010!\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010&\"\u0004\bd\u0010(R \u0010\"\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010&\"\u0004\bf\u0010(¨\u0006\u0095\u0001"}, d2 = {"Lcom/stockbit/model/entity/CompanyOrderbookBidResponseData;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.PRICE, "", "volume", "price1", "volume1", "que_num1", "price2", "volume2", "que_num2", "price3", "volume3", "que_num3", "price4", "volume4", "que_num4", "price5", "volume5", "que_num5", "price6", "volume6", "que_num6", "price7", "volume7", "que_num7", "price8", "volume8", "que_num8", "price9", "volume9", "que_num9", "price10", "volume10", "que_num10", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPrice", "()Ljava/lang/String;", "setPrice", "(Ljava/lang/String;)V", "getVolume", "setVolume", "getPrice1", "setPrice1", "getVolume1", "setVolume1", "getQue_num1", "setQue_num1", "getPrice2", "setPrice2", "getVolume2", "setVolume2", "getQue_num2", "setQue_num2", "getPrice3", "setPrice3", "getVolume3", "setVolume3", "getQue_num3", "setQue_num3", "getPrice4", "setPrice4", "getVolume4", "setVolume4", "getQue_num4", "setQue_num4", "getPrice5", "setPrice5", "getVolume5", "setVolume5", "getQue_num5", "setQue_num5", "getPrice6", "setPrice6", "getVolume6", "setVolume6", "getQue_num6", "setQue_num6", "getPrice7", "setPrice7", "getVolume7", "setVolume7", "getQue_num7", "setQue_num7", "getPrice8", "setPrice8", "getVolume8", "setVolume8", "getQue_num8", "setQue_num8", "getPrice9", "setPrice9", "getVolume9", "setVolume9", "getQue_num9", "setQue_num9", "getPrice10", "setPrice10", "getVolume10", "setVolume10", "getQue_num10", "setQue_num10", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CompanyOrderbookBidResponseData implements Parcelable {
    public static final Parcelable.Creator<CompanyOrderbookBidResponseData> CREATOR = null;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private String price;

    @SerializedName("price1")
    private String price1;

    @SerializedName("price10")
    private String price10;

    @SerializedName("price2")
    private String price2;

    @SerializedName("price3")
    private String price3;

    @SerializedName("price4")
    private String price4;

    @SerializedName("price5")
    private String price5;

    @SerializedName("price6")
    private String price6;

    @SerializedName("price7")
    private String price7;

    @SerializedName("price8")
    private String price8;

    @SerializedName("price9")
    private String price9;

    @SerializedName("que_num1")
    private String que_num1;

    @SerializedName("que_num10")
    private String que_num10;

    @SerializedName("que_num2")
    private String que_num2;

    @SerializedName("que_num3")
    private String que_num3;

    @SerializedName("que_num4")
    private String que_num4;

    @SerializedName("que_num5")
    private String que_num5;

    @SerializedName("que_num6")
    private String que_num6;

    @SerializedName("que_num7")
    private String que_num7;

    @SerializedName("que_num8")
    private String que_num8;

    @SerializedName("que_num9")
    private String que_num9;

    @SerializedName("volume")
    private String volume;

    @SerializedName("volume1")
    private String volume1;

    @SerializedName("volume10")
    private String volume10;

    @SerializedName("volume2")
    private String volume2;

    @SerializedName("volume3")
    private String volume3;

    @SerializedName("volume4")
    private String volume4;

    @SerializedName("volume5")
    private String volume5;

    @SerializedName("volume6")
    private String volume6;

    @SerializedName("volume7")
    private String volume7;

    @SerializedName("volume8")
    private String volume8;

    @SerializedName("volume9")
    private String volume9;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final CompanyOrderbookBidResponseData a(Parcel r35) {
            p.l(r35, "parcel");
            return new CompanyOrderbookBidResponseData(r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString(), r35.readString());
        }

        public final CompanyOrderbookBidResponseData[] b(int r1) {
            return new CompanyOrderbookBidResponseData[r1];
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

    public CompanyOrderbookBidResponseData() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        String r16 = null;
        String r17 = null;
        String r18 = null;
        String r19 = null;
        String r20 = null;
        String r21 = null;
        String r22 = null;
        String r23 = null;
        String r24 = null;
        String r25 = null;
        String r26 = null;
        String r27 = null;
        String r28 = null;
        String r29 = null;
        String r30 = null;
        String r31 = null;
        String r32 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, -1, null);
    }

    public final String A() {
        return this.volume5;
    }

    public final String B() {
        return this.volume6;
    }

    public final String C() {
        return this.volume7;
    }

    public final String D() {
        return this.volume8;
    }

    public final String E() {
        return this.volume9;
    }

    public final String a() {
        return this.price;
    }

    public final String b() {
        return this.price1;
    }

    public final String c() {
        return this.price10;
    }

    public final String d() {
        return this.price2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.price3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CompanyOrderbookBidResponseData) == true) goto L8;
        return false;
    L8:
        CompanyOrderbookBidResponseData r52 = (CompanyOrderbookBidResponseData) r5;
        if (p.g(this.price, r52.price) == true) goto L12;
        return false;
    L12:
        if (p.g(this.volume, r52.volume) == true) goto L15;
        return false;
    L15:
        if (p.g(this.price1, r52.price1) == true) goto L18;
        return false;
    L18:
        if (p.g(this.volume1, r52.volume1) == true) goto L21;
        return false;
    L21:
        if (p.g(this.que_num1, r52.que_num1) == true) goto L24;
        return false;
    L24:
        if (p.g(this.price2, r52.price2) == true) goto L27;
        return false;
    L27:
        if (p.g(this.volume2, r52.volume2) == true) goto L30;
        return false;
    L30:
        if (p.g(this.que_num2, r52.que_num2) == true) goto L33;
        return false;
    L33:
        if (p.g(this.price3, r52.price3) == true) goto L36;
        return false;
    L36:
        if (p.g(this.volume3, r52.volume3) == true) goto L39;
        return false;
    L39:
        if (p.g(this.que_num3, r52.que_num3) == true) goto L42;
        return false;
    L42:
        if (p.g(this.price4, r52.price4) == true) goto L45;
        return false;
    L45:
        if (p.g(this.volume4, r52.volume4) == true) goto L48;
        return false;
    L48:
        if (p.g(this.que_num4, r52.que_num4) == true) goto L51;
        return false;
    L51:
        if (p.g(this.price5, r52.price5) == true) goto L54;
        return false;
    L54:
        if (p.g(this.volume5, r52.volume5) == true) goto L57;
        return false;
    L57:
        if (p.g(this.que_num5, r52.que_num5) == true) goto L60;
        return false;
    L60:
        if (p.g(this.price6, r52.price6) == true) goto L63;
        return false;
    L63:
        if (p.g(this.volume6, r52.volume6) == true) goto L66;
        return false;
    L66:
        if (p.g(this.que_num6, r52.que_num6) == true) goto L69;
        return false;
    L69:
        if (p.g(this.price7, r52.price7) == true) goto L72;
        return false;
    L72:
        if (p.g(this.volume7, r52.volume7) == true) goto L75;
        return false;
    L75:
        if (p.g(this.que_num7, r52.que_num7) == true) goto L78;
        return false;
    L78:
        if (p.g(this.price8, r52.price8) == true) goto L81;
        return false;
    L81:
        if (p.g(this.volume8, r52.volume8) == true) goto L84;
        return false;
    L84:
        if (p.g(this.que_num8, r52.que_num8) == true) goto L87;
        return false;
    L87:
        if (p.g(this.price9, r52.price9) == true) goto L90;
        return false;
    L90:
        if (p.g(this.volume9, r52.volume9) == true) goto L93;
        return false;
    L93:
        if (p.g(this.que_num9, r52.que_num9) == true) goto L96;
        return false;
    L96:
        if (p.g(this.price10, r52.price10) == true) goto L99;
        return false;
    L99:
        if (p.g(this.volume10, r52.volume10) == true) goto L102;
        return false;
    L102:
        if (p.g(this.que_num10, r52.que_num10) == true) goto L104;
        return false;
    L104:
        return true;
    }

    public final String f() {
        return this.price4;
    }

    public final String g() {
        return this.price5;
    }

    public final String h() {
        return this.price6;
    }

    public int hashCode() {
        String r02 = this.price;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.volume;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.price1;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.volume1;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.que_num1;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.price2;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.volume2;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.que_num2;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.price3;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.volume3;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.que_num3;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        String r221 = this.price4;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (r014 + r222) * 31;
        String r223 = this.volume4;
        if (r223 != null) goto L53;
        int r224 = 0;
    L54:
        int r016 = (r015 + r224) * 31;
        String r225 = this.que_num4;
        if (r225 != null) goto L57;
        int r226 = 0;
    L58:
        int r017 = (r016 + r226) * 31;
        String r227 = this.price5;
        if (r227 != null) goto L61;
        int r228 = 0;
    L62:
        int r018 = (r017 + r228) * 31;
        String r229 = this.volume5;
        if (r229 != null) goto L65;
        int r230 = 0;
    L66:
        int r019 = (r018 + r230) * 31;
        String r231 = this.que_num5;
        if (r231 != null) goto L69;
        int r232 = 0;
    L70:
        int r020 = (r019 + r232) * 31;
        String r233 = this.price6;
        if (r233 != null) goto L73;
        int r234 = 0;
    L74:
        int r021 = (r020 + r234) * 31;
        String r235 = this.volume6;
        if (r235 != null) goto L77;
        int r236 = 0;
    L78:
        int r022 = (r021 + r236) * 31;
        String r237 = this.que_num6;
        if (r237 != null) goto L81;
        int r238 = 0;
    L82:
        int r023 = (r022 + r238) * 31;
        String r239 = this.price7;
        if (r239 != null) goto L85;
        int r240 = 0;
    L86:
        int r024 = (r023 + r240) * 31;
        String r241 = this.volume7;
        if (r241 != null) goto L89;
        int r242 = 0;
    L90:
        int r025 = (r024 + r242) * 31;
        String r243 = this.que_num7;
        if (r243 != null) goto L93;
        int r244 = 0;
    L94:
        int r026 = (r025 + r244) * 31;
        String r245 = this.price8;
        if (r245 != null) goto L97;
        int r246 = 0;
    L98:
        int r027 = (r026 + r246) * 31;
        String r247 = this.volume8;
        if (r247 != null) goto L101;
        int r248 = 0;
    L102:
        int r028 = (r027 + r248) * 31;
        String r249 = this.que_num8;
        if (r249 != null) goto L105;
        int r250 = 0;
    L106:
        int r029 = (r028 + r250) * 31;
        String r251 = this.price9;
        if (r251 != null) goto L109;
        int r252 = 0;
    L110:
        int r030 = (r029 + r252) * 31;
        String r253 = this.volume9;
        if (r253 != null) goto L113;
        int r254 = 0;
    L114:
        int r031 = (r030 + r254) * 31;
        String r255 = this.que_num9;
        if (r255 != null) goto L117;
        int r256 = 0;
    L118:
        int r032 = (r031 + r256) * 31;
        String r257 = this.price10;
        if (r257 != null) goto L121;
        int r258 = 0;
    L122:
        int r033 = (r032 + r258) * 31;
        String r259 = this.volume10;
        if (r259 != null) goto L125;
        int r260 = 0;
    L126:
        int r034 = (r033 + r260) * 31;
        String r261 = this.que_num10;
        if (r261 == null) goto L131;
        r1 = r261.hashCode();
    L131:
        return r034 + r1;
    L125:
        r260 = r259.hashCode();
        goto L126
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
        return this.price7;
    }

    public final String j() {
        return this.price8;
    }

    public final String k() {
        return this.price9;
    }

    public final String l() {
        return this.que_num1;
    }

    public final String m() {
        return this.que_num10;
    }

    public final String n() {
        return this.que_num2;
    }

    public final String o() {
        return this.que_num3;
    }

    public final String p() {
        return this.que_num4;
    }

    public final String q() {
        return this.que_num5;
    }

    public final String r() {
        return this.que_num6;
    }

    public final String s() {
        return this.que_num7;
    }

    public final String t() {
        return this.que_num8;
    }

    public String toString() {
        return "CompanyOrderbookBidResponseData(price=" + this.price + ", volume=" + this.volume + ", price1=" + this.price1 + ", volume1=" + this.volume1 + ", que_num1=" + this.que_num1 + ", price2=" + this.price2 + ", volume2=" + this.volume2 + ", que_num2=" + this.que_num2 + ", price3=" + this.price3 + ", volume3=" + this.volume3 + ", que_num3=" + this.que_num3 + ", price4=" + this.price4 + ", volume4=" + this.volume4 + ", que_num4=" + this.que_num4 + ", price5=" + this.price5 + ", volume5=" + this.volume5 + ", que_num5=" + this.que_num5 + ", price6=" + this.price6 + ", volume6=" + this.volume6 + ", que_num6=" + this.que_num6 + ", price7=" + this.price7 + ", volume7=" + this.volume7 + ", que_num7=" + this.que_num7 + ", price8=" + this.price8 + ", volume8=" + this.volume8 + ", que_num8=" + this.que_num8 + ", price9=" + this.price9 + ", volume9=" + this.volume9 + ", que_num9=" + this.que_num9 + ", price10=" + this.price10 + ", volume10=" + this.volume10 + ", que_num10=" + this.que_num10 + ')';
    }

    public final String u() {
        return this.que_num9;
    }

    public final String v() {
        return this.volume1;
    }

    public final String w() {
        return this.volume10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.price);
        r1.writeString(this.volume);
        r1.writeString(this.price1);
        r1.writeString(this.volume1);
        r1.writeString(this.que_num1);
        r1.writeString(this.price2);
        r1.writeString(this.volume2);
        r1.writeString(this.que_num2);
        r1.writeString(this.price3);
        r1.writeString(this.volume3);
        r1.writeString(this.que_num3);
        r1.writeString(this.price4);
        r1.writeString(this.volume4);
        r1.writeString(this.que_num4);
        r1.writeString(this.price5);
        r1.writeString(this.volume5);
        r1.writeString(this.que_num5);
        r1.writeString(this.price6);
        r1.writeString(this.volume6);
        r1.writeString(this.que_num6);
        r1.writeString(this.price7);
        r1.writeString(this.volume7);
        r1.writeString(this.que_num7);
        r1.writeString(this.price8);
        r1.writeString(this.volume8);
        r1.writeString(this.que_num8);
        r1.writeString(this.price9);
        r1.writeString(this.volume9);
        r1.writeString(this.que_num9);
        r1.writeString(this.price10);
        r1.writeString(this.volume10);
        r1.writeString(this.que_num10);
    }

    public final String x() {
        return this.volume2;
    }

    public final String y() {
        return this.volume3;
    }

    public final String z() {
        return this.volume4;
    }

    public CompanyOrderbookBidResponseData(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, String r14, String r15, String r16, String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32) {
        this.price = r1;
        this.volume = r2;
        this.price1 = r3;
        this.volume1 = r4;
        this.que_num1 = r5;
        this.price2 = r6;
        this.volume2 = r7;
        this.que_num2 = r8;
        this.price3 = r9;
        this.volume3 = r10;
        this.que_num3 = r11;
        this.price4 = r12;
        this.volume4 = r13;
        this.que_num4 = r14;
        this.price5 = r15;
        this.volume5 = r16;
        this.que_num5 = r17;
        this.price6 = r18;
        this.volume6 = r19;
        this.que_num6 = r20;
        this.price7 = r21;
        this.volume7 = r22;
        this.que_num7 = r23;
        this.price8 = r24;
        this.volume8 = r25;
        this.que_num8 = r26;
        this.price9 = r27;
        this.volume9 = r28;
        this.que_num9 = r29;
        this.price10 = r30;
        this.volume10 = r31;
        this.que_num10 = r32;
    }

    public /* synthetic */ CompanyOrderbookBidResponseData(String r34, String r35, String r36, String r37, String r38, String r39, String r40, String r41, String r42, String r43, String r44, String r45, String r46, String r47, String r48, String r49, String r50, String r51, String r52, String r53, String r54, String r55, String r56, String r57, String r58, String r59, String r60, String r61, String r62, String r63, String r64, String r65, int r66, i r67) {
        if ((r66 & 1) == 0) goto L5;
        String r1 = null;
    L7:
        if ((r66 & 2) == 0) goto L9;
        String r3 = null;
    L11:
        if ((r66 & 4) == 0) goto L13;
        String r4 = null;
    L15:
        if ((r66 & 8) == 0) goto L17;
        String r5 = null;
    L19:
        if ((r66 & 16) == 0) goto L21;
        String r6 = null;
    L23:
        if ((r66 & 32) == 0) goto L25;
        String r7 = null;
    L27:
        if ((r66 & 64) == 0) goto L29;
        String r8 = null;
    L31:
        if ((r66 & 128) == 0) goto L33;
        String r9 = null;
    L35:
        if ((r66 & 256) == 0) goto L37;
        String r10 = null;
    L39:
        if ((r66 & 512) == 0) goto L41;
        String r11 = null;
    L43:
        if ((r66 & 1024) == 0) goto L45;
        String r12 = null;
    L47:
        if ((r66 & 2048) == 0) goto L49;
        String r13 = null;
    L51:
        if ((r66 & 4096) == 0) goto L53;
        String r14 = null;
    L55:
        if ((r66 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = null;
    L59:
        if ((r66 & 16384) == 0) goto L61;
        String r2 = null;
    L63:
        if ((r66 & 32768) == 0) goto L65;
        String r16 = null;
    L67:
        if ((r66 & 65536) == 0) goto L69;
        String r17 = null;
    L71:
        if ((r66 & 131072) == 0) goto L73;
        String r18 = null;
    L75:
        if ((r66 & 262144) == 0) goto L77;
        String r19 = null;
    L79:
        if ((r66 & 524288) == 0) goto L81;
        String r20 = null;
    L83:
        if ((r66 & 1048576) == 0) goto L85;
        String r21 = null;
    L87:
        if ((r66 & 2097152) == 0) goto L89;
        String r22 = null;
    L91:
        if ((r66 & 4194304) == 0) goto L93;
        String r23 = null;
    L95:
        if ((r66 & 8388608) == 0) goto L97;
        String r24 = null;
    L99:
        if ((r66 & 16777216) == 0) goto L101;
        String r25 = null;
    L103:
        if ((r66 & 33554432) == 0) goto L105;
        String r26 = null;
    L107:
        if ((r66 & 67108864) == 0) goto L109;
        String r27 = null;
    L111:
        if ((r66 & 134217728) == 0) goto L113;
        String r28 = null;
    L115:
        if ((r66 & 268435456) == 0) goto L117;
        String r29 = null;
    L119:
        if ((r66 & 536870912) == 0) goto L121;
        String r30 = null;
    L123:
        if ((r66 & Ints.MAX_POWER_OF_TWO) == 0) goto L125;
        String r31 = null;
    L127:
        if ((r66 & Integer.MIN_VALUE) == 0) goto L130;
        String r662 = null;
    L131:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r662);
        return;
    L130:
        r662 = r65;
        goto L131
    L125:
        r31 = r64;
        goto L127
    L121:
        r30 = r63;
        goto L123
    L117:
        r29 = r62;
        goto L119
    L113:
        r28 = r61;
        goto L115
    L109:
        r27 = r60;
        goto L111
    L105:
        r26 = r59;
        goto L107
    L101:
        r25 = r58;
        goto L103
    L97:
        r24 = r57;
        goto L99
    L93:
        r23 = r56;
        goto L95
    L89:
        r22 = r55;
        goto L91
    L85:
        r21 = r54;
        goto L87
    L81:
        r20 = r53;
        goto L83
    L77:
        r19 = r52;
        goto L79
    L73:
        r18 = r51;
        goto L75
    L69:
        r17 = r50;
        goto L71
    L65:
        r16 = r49;
        goto L67
    L61:
        r2 = r48;
        goto L63
    L57:
        r15 = r47;
        goto L59
    L53:
        r14 = r46;
        goto L55
    L49:
        r13 = r45;
        goto L51
    L45:
        r12 = r44;
        goto L47
    L41:
        r11 = r43;
        goto L43
    L37:
        r10 = r42;
        goto L39
    L33:
        r9 = r41;
        goto L35
    L29:
        r8 = r40;
        goto L31
    L25:
        r7 = r39;
        goto L27
    L21:
        r6 = r38;
        goto L23
    L17:
        r5 = r37;
        goto L19
    L13:
        r4 = r36;
        goto L15
    L9:
        r3 = r35;
        goto L11
    L5:
        r1 = r34;
        goto L7
    }
}
