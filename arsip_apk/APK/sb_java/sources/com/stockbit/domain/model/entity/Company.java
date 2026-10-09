package com.stockbit.domain.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.stockbit.company.CompanyEntryPoint;
import com.stockbit.domain.model.entity.securities.CorpAction;
import com.stockbit.domain.model.valueobject.Sentiment;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC11777v;

@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0003\b\u0083\u0001\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B½\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u001c\b\u0002\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\b\u0012\b\b\u0002\u0010$\u001a\u00020\b\u0012\b\b\u0002\u0010%\u001a\u00020\u0003\u0012\b\b\u0002\u0010&\u001a\u00020\b\u0012\b\b\u0002\u0010'\u001a\u00020\u0003\u0012\b\b\u0002\u0010(\u001a\u00020\u0018\u0012\b\b\u0002\u0010)\u001a\u00020*\u0012\b\b\u0002\u0010+\u001a\u00020,\u0012\b\b\u0002\u0010-\u001a\u00020.\u0012\b\b\u0002\u0010/\u001a\u00020,\u0012\b\b\u0002\u00100\u001a\u00020,\u0012\b\b\u0002\u00101\u001a\u00020.\u0012\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\u000303¢\u0006\u0004\b4\u00105J\u000b\u0010\u008c\u0001\u001a\u00020\u0003H\u0096\u0080\u0004J\n\u0010\u008d\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0091\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0094\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u001e\u0010\u0095\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000fHÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u001e\u0010\u009a\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u000fHÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010^J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\bHÆ\u0003J\n\u0010¦\u0001\u001a\u00020\bHÆ\u0003J\n\u0010§\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¨\u0001\u001a\u00020\bHÆ\u0003J\n\u0010©\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ª\u0001\u001a\u00020\u0018HÆ\u0003J\n\u0010«\u0001\u001a\u00020*HÆ\u0003J\n\u0010¬\u0001\u001a\u00020,HÆ\u0003J\n\u0010\u00ad\u0001\u001a\u00020.HÆ\u0003J\n\u0010®\u0001\u001a\u00020,HÆ\u0003J\n\u0010¯\u0001\u001a\u00020,HÆ\u0003J\n\u0010°\u0001\u001a\u00020.HÆ\u0003J\u0010\u0010±\u0001\u001a\b\u0012\u0004\u0012\u00020\u000303HÆ\u0003JÐ\u0003\u0010²\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u001c\b\u0002\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00182\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020,2\b\b\u0002\u00100\u001a\u00020,2\b\b\u0002\u00101\u001a\u00020.2\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\u000303HÆ\u0001¢\u0006\u0003\u0010³\u0001J\u0007\u0010´\u0001\u001a\u00020\u0018J\u0017\u0010µ\u0001\u001a\u00020\b2\n\u0010¶\u0001\u001a\u0005\u0018\u00010·\u0001HÖ\u0083\u0004J\u000b\u0010¸\u0001\u001a\u00020\u0018HÖ\u0081\u0004J\u001b\u0010¹\u0001\u001a\u00030º\u00012\b\u0010»\u0001\u001a\u00030¼\u00012\u0007\u0010½\u0001\u001a\u00020\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u00107\"\u0004\b;\u00109R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u00107\"\u0004\b=\u00109R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00107\"\u0004\b?\u00109R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010D\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u00107\"\u0004\bF\u00109R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u00107\"\u0004\bH\u00109R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010D\u001a\u0004\bI\u0010A\"\u0004\bJ\u0010CR.\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u00107\"\u0004\bP\u00109R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u00107\"\u0004\bR\u00109R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u00107\"\u0004\bT\u00109R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR.\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010L\"\u0004\bZ\u0010NR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u00107\"\u0004\b\\\u00109R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010a\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u00107\"\u0004\bc\u00109R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u00107\"\u0004\bi\u00109R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u00107\"\u0004\bk\u00109R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bn\u00107R\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bo\u00107R\u0011\u0010\"\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bp\u00107R\u0011\u0010#\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010qR\u0011\u0010$\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010qR\u0011\u0010%\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\br\u00107R\u0011\u0010&\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010qR\u0011\u0010'\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bs\u00107R\u0011\u0010(\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u001a\u0010)\u001a\u00020*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u001a\u0010+\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001c\u0010-\u001a\u00020.X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001c\u0010/\u001a\u00020,X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010{\"\u0005\b\u0083\u0001\u0010}R\u001c\u00100\u001a\u00020,X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010{\"\u0005\b\u0085\u0001\u0010}R\u001d\u00101\u001a\u00020.X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0086\u0001\u0010\u007f\"\u0006\b\u0087\u0001\u0010\u0081\u0001R$\u00102\u001a\b\u0012\u0004\u0012\u00020\u000303X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006¾\u0001"}, d2 = {"Lcom/stockbit/domain/model/entity/Company;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", "symbol", AppMeasurementSdk.ConditionalUserProperty.NAME, CompanyEntryPoint.EXTRA_DESC, "isexist", "", "type", "symbol_2", "uma", "notation", "Ljava/util/ArrayList;", "Lcom/stockbit/model/entity/Notation;", "Lkotlin/collections/ArrayList;", "country", FirebaseAnalytics.Param.PRICE, "change", "orderbook", "Lcom/stockbit/domain/model/entity/CompanyOrderbook;", "indexes", "tradeType", "tradeable", "", "percentage", "corpAction", "Lcom/stockbit/domain/model/entity/securities/CorpAction;", "formattedPrice", "iconUrl", "sentiment", "Lcom/stockbit/domain/model/valueobject/Sentiment;", "exchange", "previousPrice", "dayTradeMultiplier", "isShowDayTradeMultiplier", "isTradingLimit", "tradingLimitHaircut", "isMarginTrading", "marginTradingHaircut", "marginTradingHaircutRaw", "sellPrice", "Ljava/math/BigDecimal;", "totalPrice", "", "changeDouble", "", "lastPriceFormated", "lastChangeFormated", "lastPriceDouble", "listBadgeText", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/domain/model/entity/CompanyOrderbook;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/stockbit/domain/model/entity/securities/CorpAction;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/domain/model/valueobject/Sentiment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZLjava/lang/String;ILjava/math/BigDecimal;Ljava/lang/CharSequence;DLjava/lang/CharSequence;Ljava/lang/CharSequence;DLjava/util/List;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getSymbol", "setSymbol", "getName", "setName", "getDesc", "setDesc", "getIsexist", "()Ljava/lang/Boolean;", "setIsexist", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getType", "setType", "getSymbol_2", "setSymbol_2", "getUma", "setUma", "getNotation", "()Ljava/util/ArrayList;", "setNotation", "(Ljava/util/ArrayList;)V", "getCountry", "setCountry", "getPrice", "setPrice", "getChange", "setChange", "getOrderbook", "()Lcom/stockbit/domain/model/entity/CompanyOrderbook;", "setOrderbook", "(Lcom/stockbit/domain/model/entity/CompanyOrderbook;)V", "getIndexes", "setIndexes", "getTradeType", "setTradeType", "getTradeable", "()Ljava/lang/Integer;", "setTradeable", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPercentage", "setPercentage", "getCorpAction", "()Lcom/stockbit/domain/model/entity/securities/CorpAction;", "setCorpAction", "(Lcom/stockbit/domain/model/entity/securities/CorpAction;)V", "getFormattedPrice", "setFormattedPrice", "getIconUrl", "setIconUrl", "getSentiment", "()Lcom/stockbit/domain/model/valueobject/Sentiment;", "getExchange", "getPreviousPrice", "getDayTradeMultiplier", "()Z", "getTradingLimitHaircut", "getMarginTradingHaircut", "getMarginTradingHaircutRaw", "()I", "getSellPrice", "()Ljava/math/BigDecimal;", "setSellPrice", "(Ljava/math/BigDecimal;)V", "getTotalPrice", "()Ljava/lang/CharSequence;", "setTotalPrice", "(Ljava/lang/CharSequence;)V", "getChangeDouble", "()D", "setChangeDouble", "(D)V", "getLastPriceFormated", "setLastPriceFormated", "getLastChangeFormated", "setLastChangeFormated", "getLastPriceDouble", "setLastPriceDouble", "getListBadgeText", "()Ljava/util/List;", "setListBadgeText", "(Ljava/util/List;)V", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/domain/model/entity/CompanyOrderbook;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/stockbit/domain/model/entity/securities/CorpAction;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/domain/model/valueobject/Sentiment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZLjava/lang/String;ILjava/math/BigDecimal;Ljava/lang/CharSequence;DLjava/lang/CharSequence;Ljava/lang/CharSequence;DLjava/util/List;)Lcom/stockbit/domain/model/entity/Company;", "describeContents", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Company implements Parcelable {
    public static final Parcelable.Creator<Company> CREATOR = null;

    /* renamed from: A, reason: collision with root package name */
    public final String f82275A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f82276B;

    /* renamed from: C, reason: collision with root package name */
    public final String f82277C;

    /* renamed from: D, reason: collision with root package name */
    public final int f82278D;

    /* renamed from: E, reason: collision with root package name */
    public BigDecimal f82279E;

    /* renamed from: F, reason: collision with root package name */
    public CharSequence f82280F;

    /* renamed from: G, reason: collision with root package name */
    public double f82281G;

    /* renamed from: H, reason: collision with root package name */
    public CharSequence f82282H;

    /* renamed from: I, reason: collision with root package name */
    public CharSequence f82283I;

    /* renamed from: J, reason: collision with root package name */
    public double f82284J;

    /* renamed from: K, reason: collision with root package name */
    public List f82285K;

    /* renamed from: a, reason: collision with root package name */
    public String f82286a;

    /* renamed from: b, reason: collision with root package name */
    public String f82287b;

    /* renamed from: c, reason: collision with root package name */
    public String f82288c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f82289e;

    /* renamed from: f, reason: collision with root package name */
    public String f82290f;

    /* renamed from: g, reason: collision with root package name */
    public String f82291g;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f82292h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f82293i;

    /* renamed from: j, reason: collision with root package name */
    public String f82294j;

    /* renamed from: k, reason: collision with root package name */
    public String f82295k;

    /* renamed from: l, reason: collision with root package name */
    public String f82296l;

    /* renamed from: m, reason: collision with root package name */
    public CompanyOrderbook f82297m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f82298n;

    /* renamed from: o, reason: collision with root package name */
    public String f82299o;

    /* renamed from: p, reason: collision with root package name */
    public Integer f82300p;

    /* renamed from: q, reason: collision with root package name */
    public String f82301q;

    /* renamed from: r, reason: collision with root package name */
    public CorpAction f82302r;

    /* renamed from: s, reason: collision with root package name */
    public String f82303s;

    /* renamed from: t, reason: collision with root package name */
    public String f82304t;

    /* renamed from: u, reason: collision with root package name */
    public final Sentiment f82305u;

    /* renamed from: v, reason: collision with root package name */
    public final String f82306v;

    /* renamed from: w, reason: collision with root package name */
    public final String f82307w;

    /* renamed from: x, reason: collision with root package name */
    public final String f82308x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f82309y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f82310z;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v0, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v3 */
        /* JADX WARN: Type inference failed for: r18v3, types: [java.lang.Integer] */
        public final Company a(Parcel r44) {
            kotlin.jvm.internal.p.l(r44, "parcel");
            String r3 = r44.readString();
            String r4 = r44.readString();
            String r5 = r44.readString();
            String r6 = r44.readString();
            if (r44.readInt() != 0) goto L6;
            Boolean r1 = null;
            Boolean r9 = null;
        L10:
            String r8 = r44.readString();
            Boolean r10 = r9;
            String r92 = r44.readString();
            if (r44.readInt() != 0) goto L14;
            Boolean r11 = r10;
        L19:
            if (r44.readInt() != 0) goto L21;
            ?? r13 = r10;
        L24:
            String r12 = r44.readString();
            Boolean r102 = r11;
            ArrayList r112 = r13;
            String r132 = r44.readString();
            Object r15 = r10;
            String r14 = r44.readString();
            if (r44.readInt() != 0) goto L27;
            Object r2 = r15;
        L28:
            CompanyOrderbook r22 = (CompanyOrderbook) r2;
            ArrayList<String> r16 = r44.createStringArrayList();
            String r17 = r44.readString();
            if (r44.readInt() != 0) goto L31;
            Object r19 = r15;
        L32:
            String r20 = r44.readString();
            if (r44.readInt() != 0) goto L35;
            Object r7 = r15;
        L36:
            CorpAction r72 = (CorpAction) r7;
            String r21 = r44.readString();
            String r222 = r44.readString();
            if (r44.readInt() == 0) goto L40;
            r15 = Sentiment.CREATOR.createFromParcel(r44);
        L40:
            Sentiment r152 = (Sentiment) r15;
            String r24 = r44.readString();
            String r25 = r44.readString();
            String r26 = r44.readString();
            if (r44.readInt() == 0) goto L43;
            boolean r27 = true;
        L45:
            if (r44.readInt() == 0) goto L47;
            boolean r28 = true;
        L48:
            String r29 = r44.readString();
            if (r44.readInt() == 0) goto L51;
            boolean r30 = true;
        L52:
            String r31 = r44.readString();
            int r32 = r44.readInt();
            BigDecimal r33 = (BigDecimal) r44.readSerializable();
            Boolean r18 = r1;
            Parcelable.Creator r110 = TextUtils.CHAR_SEQUENCE_CREATOR;
            return new Company(r3, r4, r5, r6, r18, r8, r92, r102, r112, r12, r132, r14, r22, r16, r17, r19, r20, r72, r21, r222, r152, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, (CharSequence) r110.createFromParcel(r44), r44.readDouble(), (CharSequence) r110.createFromParcel(r44), (CharSequence) r110.createFromParcel(r44), r44.readDouble(), r44.createStringArrayList());
        L51:
            r30 = false;
            goto L52
        L47:
            r28 = false;
            goto L48
        L43:
            r27 = false;
            goto L45
        L35:
            r7 = CorpAction.CREATOR.createFromParcel(r44);
            goto L36
        L31:
            r19 = Integer.valueOf(r44.readInt());
            goto L32
        L27:
            r2 = CompanyOrderbook.CREATOR.createFromParcel(r44);
            goto L28
        L21:
            int r122 = r44.readInt();
            r13 = new ArrayList(r122);
            int r142 = 0;
        L22:
            if (r142 == r122) goto L24;
            r13.add(r44.readParcelable(Company.class.getClassLoader()));
            r142 = r142 + 1;
            goto L22
        L14:
            if (r44.readInt() == 0) goto L16;
            boolean r113 = true;
        L17:
            r11 = Boolean.valueOf(r113);
            goto L19
        L16:
            r113 = false;
            goto L17
        L6:
            if (r44.readInt() == 0) goto L8;
            boolean r111 = true;
        L9:
            r1 = Boolean.valueOf(r111);
            r9 = null;
            goto L10
        L8:
            r111 = false;
            goto L9
        }

        public final Company[] b(int r1) {
            return new Company[r1];
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

    public Company(String r14, String r15, String r16, String r17, Boolean r18, String r19, String r20, Boolean r21, ArrayList r22, String r23, String r24, String r25, CompanyOrderbook r26, ArrayList r27, String r28, Integer r29, String r30, CorpAction r31, String r32, String r33, Sentiment r34, String r35, String r36, String r37, boolean r38, boolean r39, String r40, boolean r41, String r42, int r43, BigDecimal r44, CharSequence r45, double r46, CharSequence r48, CharSequence r49, double r50, List r52) {
        kotlin.jvm.internal.p.l(r14, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r15, "symbol");
        kotlin.jvm.internal.p.l(r16, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r17, CompanyEntryPoint.EXTRA_DESC);
        kotlin.jvm.internal.p.l(r36, "previousPrice");
        kotlin.jvm.internal.p.l(r37, "dayTradeMultiplier");
        kotlin.jvm.internal.p.l(r40, "tradingLimitHaircut");
        kotlin.jvm.internal.p.l(r42, "marginTradingHaircut");
        kotlin.jvm.internal.p.l(r44, "sellPrice");
        kotlin.jvm.internal.p.l(r45, "totalPrice");
        kotlin.jvm.internal.p.l(r48, "lastPriceFormated");
        kotlin.jvm.internal.p.l(r49, "lastChangeFormated");
        kotlin.jvm.internal.p.l(r52, "listBadgeText");
        this.f82286a = r14;
        this.f82287b = r15;
        this.f82288c = r16;
        this.d = r17;
        this.f82289e = r18;
        this.f82290f = r19;
        this.f82291g = r20;
        this.f82292h = r21;
        this.f82293i = r22;
        this.f82294j = r23;
        this.f82295k = r24;
        this.f82296l = r25;
        this.f82297m = r26;
        this.f82298n = r27;
        this.f82299o = r28;
        this.f82300p = r29;
        this.f82301q = r30;
        this.f82302r = r31;
        this.f82303s = r32;
        this.f82304t = r33;
        this.f82305u = r34;
        this.f82306v = r35;
        this.f82307w = r36;
        this.f82308x = r37;
        this.f82309y = r38;
        this.f82310z = r39;
        this.f82275A = r40;
        this.f82276B = r41;
        this.f82277C = r42;
        this.f82278D = r43;
        this.f82279E = r44;
        this.f82280F = r45;
        this.f82281G = r46;
        this.f82282H = r48;
        this.f82283I = r49;
        this.f82284J = r50;
        this.f82285K = r52;
    }

    public final String A() {
        return this.f82275A;
    }

    public final String B() {
        return this.f82290f;
    }

    public final Boolean C() {
        return this.f82292h;
    }

    public final boolean D() {
        return this.f82276B;
    }

    public final boolean E() {
        return this.f82309y;
    }

    public final boolean F() {
        return this.f82310z;
    }

    public final String a() {
        return this.f82296l;
    }

    public final double b() {
        return this.f82281G;
    }

    public final CorpAction c() {
        return this.f82302r;
    }

    public final String d() {
        return this.f82294j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f82308x;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof Company) == true) goto L8;
        return false;
    L8:
        Company r82 = (Company) r8;
        if (kotlin.jvm.internal.p.g(this.f82286a, r82.f82286a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82287b, r82.f82287b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f82288c, r82.f82288c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f82289e, r82.f82289e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f82290f, r82.f82290f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f82291g, r82.f82291g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f82292h, r82.f82292h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f82293i, r82.f82293i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f82294j, r82.f82294j) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f82295k, r82.f82295k) == true) goto L42;
        return false;
    L42:
        if (kotlin.jvm.internal.p.g(this.f82296l, r82.f82296l) == true) goto L45;
        return false;
    L45:
        if (kotlin.jvm.internal.p.g(this.f82297m, r82.f82297m) == true) goto L48;
        return false;
    L48:
        if (kotlin.jvm.internal.p.g(this.f82298n, r82.f82298n) == true) goto L51;
        return false;
    L51:
        if (kotlin.jvm.internal.p.g(this.f82299o, r82.f82299o) == true) goto L54;
        return false;
    L54:
        if (kotlin.jvm.internal.p.g(this.f82300p, r82.f82300p) == true) goto L57;
        return false;
    L57:
        if (kotlin.jvm.internal.p.g(this.f82301q, r82.f82301q) == true) goto L60;
        return false;
    L60:
        if (kotlin.jvm.internal.p.g(this.f82302r, r82.f82302r) == true) goto L63;
        return false;
    L63:
        if (kotlin.jvm.internal.p.g(this.f82303s, r82.f82303s) == true) goto L66;
        return false;
    L66:
        if (kotlin.jvm.internal.p.g(this.f82304t, r82.f82304t) == true) goto L69;
        return false;
    L69:
        if (kotlin.jvm.internal.p.g(this.f82305u, r82.f82305u) == true) goto L72;
        return false;
    L72:
        if (kotlin.jvm.internal.p.g(this.f82306v, r82.f82306v) == true) goto L75;
        return false;
    L75:
        if (kotlin.jvm.internal.p.g(this.f82307w, r82.f82307w) == true) goto L78;
        return false;
    L78:
        if (kotlin.jvm.internal.p.g(this.f82308x, r82.f82308x) == true) goto L81;
        return false;
    L81:
        if (this.f82309y == r82.f82309y) goto L84;
        return false;
    L84:
        if (this.f82310z == r82.f82310z) goto L87;
        return false;
    L87:
        if (kotlin.jvm.internal.p.g(this.f82275A, r82.f82275A) == true) goto L90;
        return false;
    L90:
        if (this.f82276B == r82.f82276B) goto L93;
        return false;
    L93:
        if (kotlin.jvm.internal.p.g(this.f82277C, r82.f82277C) == true) goto L96;
        return false;
    L96:
        if (this.f82278D == r82.f82278D) goto L99;
        return false;
    L99:
        if (kotlin.jvm.internal.p.g(this.f82279E, r82.f82279E) == true) goto L102;
        return false;
    L102:
        if (kotlin.jvm.internal.p.g(this.f82280F, r82.f82280F) == true) goto L105;
        return false;
    L105:
        if (Double.compare(this.f82281G, r82.f82281G) == 0) goto L108;
        return false;
    L108:
        if (kotlin.jvm.internal.p.g(this.f82282H, r82.f82282H) == true) goto L111;
        return false;
    L111:
        if (kotlin.jvm.internal.p.g(this.f82283I, r82.f82283I) == true) goto L114;
        return false;
    L114:
        if (Double.compare(this.f82284J, r82.f82284J) == 0) goto L117;
        return false;
    L117:
        if (kotlin.jvm.internal.p.g(this.f82285K, r82.f82285K) == true) goto L119;
        return false;
    L119:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.f82304t;
    }

    public final String h() {
        return this.f82286a;
    }

    public int hashCode() {
        int r02 = ((((((this.f82286a.hashCode() * 31) + this.f82287b.hashCode()) * 31) + this.f82288c.hashCode()) * 31) + this.d.hashCode()) * 31;
        Boolean r1 = this.f82289e;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f82290f;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.f82291g;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        Boolean r17 = this.f82292h;
        if (r17 != null) goto L17;
        int r18 = 0;
    L18:
        int r06 = (r05 + r18) * 31;
        ArrayList r19 = this.f82293i;
        if (r19 != null) goto L21;
        int r110 = 0;
    L22:
        int r07 = (r06 + r110) * 31;
        String r111 = this.f82294j;
        if (r111 != null) goto L25;
        int r112 = 0;
    L26:
        int r08 = (r07 + r112) * 31;
        String r113 = this.f82295k;
        if (r113 != null) goto L29;
        int r114 = 0;
    L30:
        int r09 = (r08 + r114) * 31;
        String r115 = this.f82296l;
        if (r115 != null) goto L33;
        int r116 = 0;
    L34:
        int r010 = (r09 + r116) * 31;
        CompanyOrderbook r117 = this.f82297m;
        if (r117 != null) goto L37;
        int r118 = 0;
    L38:
        int r011 = (r010 + r118) * 31;
        ArrayList r119 = this.f82298n;
        if (r119 != null) goto L41;
        int r120 = 0;
    L42:
        int r012 = (r011 + r120) * 31;
        String r121 = this.f82299o;
        if (r121 != null) goto L45;
        int r122 = 0;
    L46:
        int r013 = (r012 + r122) * 31;
        Integer r123 = this.f82300p;
        if (r123 != null) goto L49;
        int r124 = 0;
    L50:
        int r014 = (r013 + r124) * 31;
        String r125 = this.f82301q;
        if (r125 != null) goto L53;
        int r126 = 0;
    L54:
        int r015 = (r014 + r126) * 31;
        CorpAction r127 = this.f82302r;
        if (r127 != null) goto L57;
        int r128 = 0;
    L58:
        int r016 = (r015 + r128) * 31;
        String r129 = this.f82303s;
        if (r129 != null) goto L61;
        int r130 = 0;
    L62:
        int r017 = (r016 + r130) * 31;
        String r131 = this.f82304t;
        if (r131 != null) goto L65;
        int r132 = 0;
    L66:
        int r018 = (r017 + r132) * 31;
        Sentiment r133 = this.f82305u;
        if (r133 != null) goto L69;
        int r134 = 0;
    L70:
        int r019 = (r018 + r134) * 31;
        String r135 = this.f82306v;
        if (r135 == null) goto L75;
        r2 = r135.hashCode();
    L75:
        return ((((((((((((((((((((((((((((((r019 + r2) * 31) + this.f82307w.hashCode()) * 31) + this.f82308x.hashCode()) * 31) + Boolean.hashCode(this.f82309y)) * 31) + Boolean.hashCode(this.f82310z)) * 31) + this.f82275A.hashCode()) * 31) + Boolean.hashCode(this.f82276B)) * 31) + this.f82277C.hashCode()) * 31) + Integer.hashCode(this.f82278D)) * 31) + this.f82279E.hashCode()) * 31) + this.f82280F.hashCode()) * 31) + Double.hashCode(this.f82281G)) * 31) + this.f82282H.hashCode()) * 31) + this.f82283I.hashCode()) * 31) + Double.hashCode(this.f82284J)) * 31) + this.f82285K.hashCode();
    L69:
        r134 = r133.hashCode();
        goto L70
    L65:
        r132 = r131.hashCode();
        goto L66
    L61:
        r130 = r129.hashCode();
        goto L62
    L57:
        r128 = r127.hashCode();
        goto L58
    L53:
        r126 = r125.hashCode();
        goto L54
    L49:
        r124 = r123.hashCode();
        goto L50
    L45:
        r122 = r121.hashCode();
        goto L46
    L41:
        r120 = r119.hashCode();
        goto L42
    L37:
        r118 = r117.hashCode();
        goto L38
    L33:
        r116 = r115.hashCode();
        goto L34
    L29:
        r114 = r113.hashCode();
        goto L30
    L25:
        r112 = r111.hashCode();
        goto L26
    L21:
        r110 = r19.hashCode();
        goto L22
    L17:
        r18 = r17.hashCode();
        goto L18
    L13:
        r16 = r15.hashCode();
        goto L14
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final ArrayList i() {
        return this.f82298n;
    }

    public final Boolean j() {
        return this.f82289e;
    }

    public final CharSequence k() {
        return this.f82283I;
    }

    public final double l() {
        return this.f82284J;
    }

    public final CharSequence m() {
        return this.f82282H;
    }

    public final List n() {
        return this.f82285K;
    }

    public final String o() {
        return this.f82277C;
    }

    public final int p() {
        return this.f82278D;
    }

    public final String q() {
        return this.f82288c;
    }

    public final ArrayList r() {
        return this.f82293i;
    }

    public final CompanyOrderbook s() {
        return this.f82297m;
    }

    public final String t() {
        return this.f82301q;
    }

    public String toString() {
        return this.f82288c;
    }

    public final String u() {
        return this.f82307w;
    }

    public final String v() {
        return this.f82295k;
    }

    public final String w() {
        return this.f82287b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        kotlin.jvm.internal.p.l(r5, "dest");
        r5.writeString(this.f82286a);
        r5.writeString(this.f82287b);
        r5.writeString(this.f82288c);
        r5.writeString(this.d);
        Boolean r02 = this.f82289e;
        if (r02 != null) goto L5;
        r5.writeInt(0);
    L6:
        r5.writeString(this.f82290f);
        r5.writeString(this.f82291g);
        Boolean r03 = this.f82292h;
        if (r03 != null) goto L9;
        r5.writeInt(0);
    L10:
        ArrayList r04 = this.f82293i;
        if (r04 != null) goto L13;
        r5.writeInt(0);
    L17:
        r5.writeString(this.f82294j);
        r5.writeString(this.f82295k);
        r5.writeString(this.f82296l);
        CompanyOrderbook r05 = this.f82297m;
        if (r05 != null) goto L20;
        r5.writeInt(0);
    L21:
        r5.writeStringList(this.f82298n);
        r5.writeString(this.f82299o);
        Integer r06 = this.f82300p;
        if (r06 != null) goto L24;
        r5.writeInt(0);
    L25:
        r5.writeString(this.f82301q);
        CorpAction r07 = this.f82302r;
        if (r07 != null) goto L28;
        r5.writeInt(0);
    L29:
        r5.writeString(this.f82303s);
        r5.writeString(this.f82304t);
        Sentiment r08 = this.f82305u;
        if (r08 != null) goto L32;
        r5.writeInt(0);
    L33:
        r5.writeString(this.f82306v);
        r5.writeString(this.f82307w);
        r5.writeString(this.f82308x);
        r5.writeInt(this.f82309y ? 1 : 0);
        r5.writeInt(this.f82310z ? 1 : 0);
        r5.writeString(this.f82275A);
        r5.writeInt(this.f82276B ? 1 : 0);
        r5.writeString(this.f82277C);
        r5.writeInt(this.f82278D);
        r5.writeSerializable(this.f82279E);
        TextUtils.writeToParcel(this.f82280F, r5, r6);
        r5.writeDouble(this.f82281G);
        TextUtils.writeToParcel(this.f82282H, r5, r6);
        TextUtils.writeToParcel(this.f82283I, r5, r6);
        r5.writeDouble(this.f82284J);
        r5.writeStringList(this.f82285K);
        return;
    L32:
        r5.writeInt(1);
        r08.writeToParcel(r5, r6);
        goto L33
    L28:
        r5.writeInt(1);
        r07.writeToParcel(r5, r6);
        goto L29
    L24:
        r5.writeInt(1);
        r5.writeInt(r06.intValue());
        goto L25
    L20:
        r5.writeInt(1);
        r05.writeToParcel(r5, r6);
        goto L21
    L13:
        r5.writeInt(1);
        r5.writeInt(r04.size());
        Iterator r09 = r04.iterator();
    L15:
        if (r09.hasNext() == false) goto L17;
        r5.writeParcelable((Parcelable) r09.next(), r6);
        goto L15
    L9:
        r5.writeInt(1);
        r5.writeInt(r03.booleanValue() ? 1 : 0);
        goto L10
    L5:
        r5.writeInt(1);
        r5.writeInt(r02.booleanValue() ? 1 : 0);
        goto L6
    }

    public final String x() {
        return this.f82291g;
    }

    public final String y() {
        return this.f82299o;
    }

    public final Integer z() {
        return this.f82300p;
    }

    public /* synthetic */ Company(String r44, String r45, String r46, String r47, Boolean r48, String r49, String r50, Boolean r51, ArrayList r52, String r53, String r54, String r55, CompanyOrderbook r56, ArrayList r57, String r58, Integer r59, String r60, CorpAction r61, String r62, String r63, Sentiment r64, String r65, String r66, String r67, boolean r68, boolean r69, String r70, boolean r71, String r72, int r73, BigDecimal r74, CharSequence r75, double r76, CharSequence r78, CharSequence r79, double r80, List r82, int r83, int r84, kotlin.jvm.internal.i r85) {
        if ((r83 & 32) == 0) goto L5;
        String r9 = null;
    L7:
        if ((r83 & 64) == 0) goto L9;
        String r10 = null;
    L11:
        if ((r83 & 128) == 0) goto L13;
        Boolean r11 = null;
    L15:
        if ((r83 & 256) == 0) goto L17;
        ArrayList r12 = null;
    L19:
        if ((r83 & 512) == 0) goto L21;
        String r13 = null;
    L23:
        if ((r83 & 1024) == 0) goto L25;
        String r14 = null;
    L27:
        if ((r83 & 2048) == 0) goto L29;
        String r15 = null;
    L31:
        if ((r83 & 4096) == 0) goto L33;
        CompanyOrderbook r16 = null;
    L35:
        if ((r83 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L37;
        ArrayList r17 = new ArrayList();
    L39:
        if ((r83 & 16384) == 0) goto L41;
        String r18 = null;
    L43:
        if ((32768 & r83) == 0) goto L45;
        Integer r19 = 0;
    L47:
        if ((65536 & r83) == 0) goto L49;
        String r20 = null;
    L51:
        if ((131072 & r83) == 0) goto L53;
        CorpAction r21 = null;
    L55:
        if ((262144 & r83) == 0) goto L57;
        String r22 = null;
    L59:
        if ((524288 & r83) == 0) goto L61;
        String r23 = null;
    L63:
        if ((1048576 & r83) == 0) goto L65;
        Sentiment r24 = null;
    L67:
        if ((2097152 & r83) == 0) goto L69;
        String r25 = null;
    L71:
        if ((4194304 & r83) == 0) goto L73;
        String r26 = "";
    L75:
        if ((8388608 & r83) == 0) goto L77;
        String r27 = "";
    L79:
        if ((16777216 & r83) == 0) goto L81;
        boolean r28 = false;
    L83:
        if ((33554432 & r83) == 0) goto L85;
        boolean r29 = false;
    L87:
        if ((67108864 & r83) == 0) goto L89;
        String r30 = "";
    L91:
        if ((134217728 & r83) == 0) goto L93;
        boolean r31 = false;
    L95:
        if ((268435456 & r83) == 0) goto L97;
        String r32 = "";
    L99:
        if ((536870912 & r83) == 0) goto L101;
        int r33 = 0;
    L103:
        if ((1073741824 & r83) == 0) goto L105;
        BigDecimal r1 = BigDecimal.ZERO;
        kotlin.jvm.internal.p.k(r1, "ZERO");
        BigDecimal r34 = r1;
    L107:
        if ((r83 & Integer.MIN_VALUE) == 0) goto L109;
        CharSequence r35 = "";
    L111:
        if ((r84 & 1) == 0) goto L113;
        double r36 = 0.0d;
    L115:
        if ((r84 & 2) == 0) goto L117;
        CharSequence r38 = "";
    L119:
        if ((r84 & 4) == 0) goto L121;
        CharSequence r39 = "";
    L123:
        if ((r84 & 8) == 0) goto L125;
        double r40 = 0.0d;
    L127:
        if ((r84 & 16) == 0) goto L130;
        List r42 = AbstractC11777v.o();
    L131:
        this(r44, r45, r46, r47, r48, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r39, r40, r42);
        return;
    L130:
        r42 = r82;
        goto L131
    L125:
        r40 = r80;
        goto L127
    L121:
        r39 = r79;
        goto L123
    L117:
        r38 = r78;
        goto L119
    L113:
        r36 = r76;
        goto L115
    L109:
        r35 = r75;
        goto L111
    L105:
        r34 = r74;
        goto L107
    L101:
        r33 = r73;
        goto L103
    L97:
        r32 = r72;
        goto L99
    L93:
        r31 = r71;
        goto L95
    L89:
        r30 = r70;
        goto L91
    L85:
        r29 = r69;
        goto L87
    L81:
        r28 = r68;
        goto L83
    L77:
        r27 = r67;
        goto L79
    L73:
        r26 = r66;
        goto L75
    L69:
        r25 = r65;
        goto L71
    L65:
        r24 = r64;
        goto L67
    L61:
        r23 = r63;
        goto L63
    L57:
        r22 = r62;
        goto L59
    L53:
        r21 = r61;
        goto L55
    L49:
        r20 = r60;
        goto L51
    L45:
        r19 = r59;
        goto L47
    L41:
        r18 = r58;
        goto L43
    L37:
        r17 = r57;
        goto L39
    L33:
        r16 = r56;
        goto L35
    L29:
        r15 = r55;
        goto L31
    L25:
        r14 = r54;
        goto L27
    L21:
        r13 = r53;
        goto L23
    L17:
        r12 = r52;
        goto L19
    L13:
        r11 = r51;
        goto L15
    L9:
        r10 = r50;
        goto L11
    L5:
        r9 = r49;
        goto L7
    }
}
