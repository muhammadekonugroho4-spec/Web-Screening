package com.stockbit.domain.model.entity.securities;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.common.primitives.Ints;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\bx\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u001c\b\u0002\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u001f\u0012\b\b\u0002\u0010$\u001a\u00020\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010&\u001a\u00020\u001f\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\b\b\u0002\u0010)\u001a\u00020\u0016\u0012\b\b\u0002\u0010*\u001a\u00020\u0016\u0012\b\b\u0002\u0010+\u001a\u00020\u0016\u0012\b\b\u0002\u0010,\u001a\u00020\u0016\u0012\b\b\u0002\u0010-\u001a\u00020\u0016¢\u0006\u0004\b.\u0010/J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010IJ\u001e\u0010\u0086\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u0014HÆ\u0003J\u0011\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010NJ\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010IJ\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u001fHÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u001fHÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u001fHÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u001fHÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010(HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0016HÆ\u0003Jª\u0003\u0010\u009c\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u001c\b\u0002\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00162\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u001f2\b\b\u0002\u0010$\u001a\u00020\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010&\u001a\u00020\u001f2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010)\u001a\u00020\u00162\b\b\u0002\u0010*\u001a\u00020\u00162\b\b\u0002\u0010+\u001a\u00020\u00162\b\b\u0002\u0010,\u001a\u00020\u00162\b\b\u0002\u0010-\u001a\u00020\u0016HÆ\u0001¢\u0006\u0003\u0010\u009d\u0001J\u0007\u0010\u009e\u0001\u001a\u00020\u0010J\u0017\u0010\u009f\u0001\u001a\u00020\u00162\n\u0010 \u0001\u001a\u0005\u0018\u00010¡\u0001HÖ\u0083\u0004J\u000b\u0010¢\u0001\u001a\u00020\u0010HÖ\u0081\u0004J\u000b\u0010£\u0001\u001a\u00020\u0003HÖ\u0081\u0004J\u001b\u0010¤\u0001\u001a\u00030¥\u00012\b\u0010¦\u0001\u001a\u00030§\u00012\u0007\u0010¨\u0001\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00101\"\u0004\b4\u00105R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00101\"\u0004\b7\u00105R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00101\"\u0004\b9\u00105R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u00101\"\u0004\b;\u00105R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u00101\"\u0004\b=\u00105R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00101\"\u0004\b?\u00105R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00101\"\u0004\bA\u00105R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u00101\"\u0004\bC\u00105R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u00101\"\u0004\bE\u00105R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u00101\"\u0004\bG\u00105R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010J\u001a\u0004\bH\u0010IR%\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u0014¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010O\u001a\u0004\bM\u0010NR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010J\u001a\u0004\bR\u0010IR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u00101R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u00101\"\u0004\bU\u00105R\u001a\u0010\u001c\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001a\u0010\u001d\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u00101\"\u0004\b[\u00105R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001a\u0010 \u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010]\"\u0004\ba\u0010_R\u001a\u0010!\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u00101\"\u0004\bc\u00105R\u001a\u0010\"\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u00101\"\u0004\be\u00105R\u001a\u0010#\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010]\"\u0004\bg\u0010_R\u001a\u0010$\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u00101\"\u0004\bi\u00105R\u001c\u0010%\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u00101\"\u0004\bk\u00105R\u001a\u0010&\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010]\"\u0004\bm\u0010_R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001a\u0010)\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010W\"\u0004\br\u0010YR\u001a\u0010*\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010W\"\u0004\bs\u0010YR\u001a\u0010+\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010W\"\u0004\bt\u0010YR\u001a\u0010,\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010W\"\u0004\bv\u0010YR\u001a\u0010-\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010W\"\u0004\bx\u0010Y¨\u0006©\u0001"}, d2 = {"Lcom/stockbit/domain/model/entity/securities/TradingPortfolioResult;", "Landroid/os/Parcelable;", "symbol", "", "availableLot", "balanceLot", "availableShare", "balanceShare", "total", "priceAverage", "priceAverageFee", "priceLatest", "unrealisedMarketvalue", "unrealisedProfitloss", "unrealisedGain", "exerciseData", "", "notation", "Ljava/util/ArrayList;", "Lcom/stockbit/model/entity/Notation;", "Lkotlin/collections/ArrayList;", "uma", "", "corpAction", "Lcom/stockbit/domain/model/entity/securities/CorpAction;", "allowOrder", "exerciseType", "stockOnHand", "haveAutoSell", "totalFormated", "unrealisedProfitlossDouble", "", "unrealisedGainPercentage", "profitLossFormated", "gainFormated", "unrealisedMarketvalueDouble", "investedFormated", "type", "investedDouble", "tradeType", "Lcom/stockbit/domain/model/entity/securities/DomainPortfolioType;", "isFRBonds", "isSharia", "isShariaUser", "canBuy", "canSell", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/lang/Boolean;Lcom/stockbit/domain/model/entity/securities/CorpAction;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;DDLjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;DLcom/stockbit/domain/model/entity/securities/DomainPortfolioType;ZZZZZ)V", "getSymbol", "()Ljava/lang/String;", "getAvailableLot", "getBalanceLot", "setBalanceLot", "(Ljava/lang/String;)V", "getAvailableShare", "setAvailableShare", "getBalanceShare", "setBalanceShare", "getTotal", "setTotal", "getPriceAverage", "setPriceAverage", "getPriceAverageFee", "setPriceAverageFee", "getPriceLatest", "setPriceLatest", "getUnrealisedMarketvalue", "setUnrealisedMarketvalue", "getUnrealisedProfitloss", "setUnrealisedProfitloss", "getUnrealisedGain", "setUnrealisedGain", "getExerciseData", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNotation", "()Ljava/util/ArrayList;", "getUma", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCorpAction", "()Lcom/stockbit/domain/model/entity/securities/CorpAction;", "getAllowOrder", "getExerciseType", "getStockOnHand", "setStockOnHand", "getHaveAutoSell", "()Z", "setHaveAutoSell", "(Z)V", "getTotalFormated", "setTotalFormated", "getUnrealisedProfitlossDouble", "()D", "setUnrealisedProfitlossDouble", "(D)V", "getUnrealisedGainPercentage", "setUnrealisedGainPercentage", "getProfitLossFormated", "setProfitLossFormated", "getGainFormated", "setGainFormated", "getUnrealisedMarketvalueDouble", "setUnrealisedMarketvalueDouble", "getInvestedFormated", "setInvestedFormated", "getType", "setType", "getInvestedDouble", "setInvestedDouble", "getTradeType", "()Lcom/stockbit/domain/model/entity/securities/DomainPortfolioType;", "setTradeType", "(Lcom/stockbit/domain/model/entity/securities/DomainPortfolioType;)V", "setFRBonds", "setSharia", "setShariaUser", "getCanBuy", "setCanBuy", "getCanSell", "setCanSell", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/lang/Boolean;Lcom/stockbit/domain/model/entity/securities/CorpAction;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;DDLjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;DLcom/stockbit/domain/model/entity/securities/DomainPortfolioType;ZZZZZ)Lcom/stockbit/domain/model/entity/securities/TradingPortfolioResult;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TradingPortfolioResult implements Parcelable {
    public static final Parcelable.Creator<TradingPortfolioResult> CREATOR = null;

    /* renamed from: A, reason: collision with root package name */
    public String f83367A;

    /* renamed from: B, reason: collision with root package name */
    public String f83368B;

    /* renamed from: C, reason: collision with root package name */
    public double f83369C;

    /* renamed from: D, reason: collision with root package name */
    public DomainPortfolioType f83370D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f83371E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f83372F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f83373G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f83374H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f83375I;

    /* renamed from: a, reason: collision with root package name */
    public final String f83376a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83377b;

    /* renamed from: c, reason: collision with root package name */
    public String f83378c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f83379e;

    /* renamed from: f, reason: collision with root package name */
    public String f83380f;

    /* renamed from: g, reason: collision with root package name */
    public String f83381g;

    /* renamed from: h, reason: collision with root package name */
    public String f83382h;

    /* renamed from: i, reason: collision with root package name */
    public String f83383i;

    /* renamed from: j, reason: collision with root package name */
    public String f83384j;

    /* renamed from: k, reason: collision with root package name */
    public String f83385k;

    /* renamed from: l, reason: collision with root package name */
    public String f83386l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f83387m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f83388n;

    /* renamed from: o, reason: collision with root package name */
    public final Boolean f83389o;

    /* renamed from: p, reason: collision with root package name */
    public final CorpAction f83390p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f83391q;

    /* renamed from: r, reason: collision with root package name */
    public final String f83392r;

    /* renamed from: s, reason: collision with root package name */
    public String f83393s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f83394t;

    /* renamed from: u, reason: collision with root package name */
    public String f83395u;

    /* renamed from: v, reason: collision with root package name */
    public double f83396v;

    /* renamed from: w, reason: collision with root package name */
    public double f83397w;

    /* renamed from: x, reason: collision with root package name */
    public String f83398x;

    /* renamed from: y, reason: collision with root package name */
    public String f83399y;

    /* renamed from: z, reason: collision with root package name */
    public double f83400z;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final TradingPortfolioResult a(Parcel r43) {
            kotlin.jvm.internal.p.l(r43, "parcel");
            String r3 = r43.readString();
            String r4 = r43.readString();
            String r5 = r43.readString();
            String r6 = r43.readString();
            String r7 = r43.readString();
            String r8 = r43.readString();
            String r9 = r43.readString();
            String r10 = r43.readString();
            String r11 = r43.readString();
            String r12 = r43.readString();
            String r13 = r43.readString();
            String r14 = r43.readString();
            if (r43.readInt() != 0) goto L5;
            Integer r15 = null;
        L7:
            if (r43.readInt() != 0) goto L9;
            String r18 = r3;
            ArrayList r2 = null;
        L13:
            if (r43.readInt() != 0) goto L16;
            Boolean r1 = null;
        L21:
            if (r43.readInt() != 0) goto L23;
            CorpAction r32 = null;
        L24:
            CorpAction r33 = r32;
            if (r43.readInt() != 0) goto L27;
            Integer r20 = null;
        L28:
            String r21 = r43.readString();
            Integer r19 = r20;
            boolean r22 = true;
            String r212 = r43.readString();
            if (r43.readInt() == 0) goto L31;
            boolean r23 = true;
        L32:
            String r24 = r43.readString();
            boolean r26 = r23;
            double r242 = r43.readDouble();
            double r262 = r43.readDouble();
            String r28 = r43.readString();
            String r29 = r43.readString();
            double r30 = r43.readDouble();
            String r322 = r43.readString();
            String r332 = r43.readString();
            double r34 = r43.readDouble();
            if (r43.readInt() != 0) goto L35;
            DomainPortfolioType r17 = null;
        L37:
            if (r43.readInt() == 0) goto L39;
            boolean r37 = r26;
        L41:
            if (r43.readInt() == 0) goto L43;
            boolean r38 = r26;
        L45:
            if (r43.readInt() == 0) goto L47;
            boolean r39 = r26;
        L49:
            if (r43.readInt() == 0) goto L51;
            boolean r40 = r26;
        L53:
            if (r43.readInt() == 0) goto L56;
            boolean r41 = r26;
        L58:
            return new TradingPortfolioResult(r18, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r1, r33, r19, r21, r212, r22, r24, r242, r262, r28, r29, r30, r322, r332, r34, r17, r37, r38, r39, r40, r41);
        L56:
            r41 = false;
            goto L58
        L51:
            r40 = false;
            goto L53
        L47:
            r39 = false;
            goto L49
        L43:
            r38 = false;
            goto L45
        L39:
            r37 = false;
            goto L41
        L35:
            r17 = DomainPortfolioType.valueOf(r43.readString());
            goto L37
        L31:
            r23 = true;
            r22 = false;
            goto L32
        L27:
            r20 = Integer.valueOf(r43.readInt());
            goto L28
        L23:
            r32 = CorpAction.CREATOR.createFromParcel(r43);
            goto L24
        L16:
            if (r43.readInt() == 0) goto L18;
            boolean r16 = true;
        L19:
            r1 = Boolean.valueOf(r16);
            goto L21
        L18:
            r16 = false;
            goto L19
        L9:
            int r110 = r43.readInt();
            r2 = new ArrayList(r110);
            r18 = r3;
            int r35 = 0;
        L10:
            if (r35 == r110) goto L13;
            r2.add(r43.readParcelable(TradingPortfolioResult.class.getClassLoader()));
            r35 = r35 + 1;
            r110 = r110;
            goto L10
        L5:
            r15 = Integer.valueOf(r43.readInt());
            goto L7
        }

        public final TradingPortfolioResult[] b(int r1) {
            return new TradingPortfolioResult[r1];
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

    public TradingPortfolioResult(String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, String r14, String r15, String r16, String r17, Integer r18, ArrayList r19, Boolean r20, CorpAction r21, Integer r22, String r23, String r24, boolean r25, String r26, double r27, double r29, String r31, String r32, double r33, String r35, String r36, double r37, DomainPortfolioType r39, boolean r40, boolean r41, boolean r42, boolean r43, boolean r44) {
        kotlin.jvm.internal.p.l(r26, "totalFormated");
        kotlin.jvm.internal.p.l(r31, "profitLossFormated");
        kotlin.jvm.internal.p.l(r32, "gainFormated");
        kotlin.jvm.internal.p.l(r35, "investedFormated");
        this.f83376a = r6;
        this.f83377b = r7;
        this.f83378c = r8;
        this.d = r9;
        this.f83379e = r10;
        this.f83380f = r11;
        this.f83381g = r12;
        this.f83382h = r13;
        this.f83383i = r14;
        this.f83384j = r15;
        this.f83385k = r16;
        this.f83386l = r17;
        this.f83387m = r18;
        this.f83388n = r19;
        this.f83389o = r20;
        this.f83390p = r21;
        this.f83391q = r22;
        this.f83392r = r23;
        this.f83393s = r24;
        this.f83394t = r25;
        this.f83395u = r26;
        this.f83396v = r27;
        this.f83397w = r29;
        this.f83398x = r31;
        this.f83399y = r32;
        this.f83400z = r33;
        this.f83367A = r35;
        this.f83368B = r36;
        this.f83369C = r37;
        this.f83370D = r39;
        this.f83371E = r40;
        this.f83372F = r41;
        this.f83373G = r42;
        this.f83374H = r43;
        this.f83375I = r44;
    }

    public static /* synthetic */ TradingPortfolioResult b(TradingPortfolioResult r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, Integer r30, ArrayList r31, Boolean r32, CorpAction r33, Integer r34, String r35, String r36, boolean r37, String r38, double r39, double r41, String r43, String r44, double r45, String r47, String r48, double r49, DomainPortfolioType r51, boolean r52, boolean r53, boolean r54, boolean r55, boolean r56, int r57, int r58, Object r59) {
        if ((r57 & 1) == 0) goto L5;
        String r2 = r17.f83376a;
    L7:
        if ((r57 & 2) == 0) goto L9;
        String r3 = r17.f83377b;
    L11:
        if ((r57 & 4) == 0) goto L13;
        String r4 = r17.f83378c;
    L15:
        if ((r57 & 8) == 0) goto L17;
        String r5 = r17.d;
    L19:
        if ((r57 & 16) == 0) goto L21;
        String r6 = r17.f83379e;
    L23:
        if ((r57 & 32) == 0) goto L25;
        String r7 = r17.f83380f;
    L27:
        if ((r57 & 64) == 0) goto L29;
        String r8 = r17.f83381g;
    L31:
        if ((r57 & 128) == 0) goto L33;
        String r9 = r17.f83382h;
    L35:
        if ((r57 & 256) == 0) goto L37;
        String r10 = r17.f83383i;
    L39:
        if ((r57 & 512) == 0) goto L41;
        String r11 = r17.f83384j;
    L43:
        if ((r57 & 1024) == 0) goto L45;
        String r12 = r17.f83385k;
    L47:
        if ((r57 & 2048) == 0) goto L49;
        String r13 = r17.f83386l;
    L51:
        if ((r57 & 4096) == 0) goto L53;
        Integer r14 = r17.f83387m;
    L55:
        if ((r57 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        ArrayList r15 = r17.f83388n;
    L58:
        String r182 = r2;
        if ((r57 & 16384) == 0) goto L61;
        Boolean r210 = r17.f83389o;
    L63:
        if ((r57 & 32768) == 0) goto L65;
        CorpAction r1 = r17.f83390p;
    L66:
        CorpAction r192 = r1;
        if ((r57 & 65536) == 0) goto L69;
        Integer r16 = r17.f83391q;
    L70:
        Integer r202 = r16;
        if ((r57 & 131072) == 0) goto L73;
        String r110 = r17.f83392r;
    L74:
        String r212 = r110;
        if ((r57 & 262144) == 0) goto L77;
        String r111 = r17.f83393s;
    L78:
        String r222 = r111;
        if ((r57 & 524288) == 0) goto L81;
        boolean r112 = r17.f83394t;
    L82:
        boolean r232 = r112;
        if ((r57 & 1048576) == 0) goto L85;
        String r113 = r17.f83395u;
    L86:
        String r252 = r113;
        Boolean r242 = r210;
        if ((r57 & 2097152) == 0) goto L89;
        double r114 = r17.f83396v;
    L90:
        double r262 = r114;
        if ((r57 & 4194304) == 0) goto L93;
        double r115 = r17.f83397w;
    L94:
        double r282 = r115;
        if ((r57 & 8388608) == 0) goto L97;
        String r116 = r17.f83398x;
    L99:
        if ((r57 & 16777216) == 0) goto L101;
        String r211 = r17.f83399y;
    L102:
        String r302 = r116;
        String r312 = r211;
        if ((r57 & 33554432) == 0) goto L105;
        double r117 = r17.f83400z;
    L106:
        double r322 = r117;
        if ((r57 & 67108864) == 0) goto L109;
        String r118 = r17.f83367A;
    L111:
        if ((r57 & 134217728) == 0) goto L113;
        String r213 = r17.f83368B;
    L114:
        String r342 = r118;
        String r352 = r213;
        if ((r57 & 268435456) == 0) goto L117;
        double r119 = r17.f83369C;
    L118:
        double r362 = r119;
        if ((r57 & 536870912) == 0) goto L121;
        DomainPortfolioType r120 = r17.f83370D;
    L123:
        if ((r57 & Ints.MAX_POWER_OF_TWO) == 0) goto L125;
        boolean r214 = r17.f83371E;
    L126:
        DomainPortfolioType r382 = r120;
        if ((r57 & Integer.MIN_VALUE) == 0) goto L129;
        boolean r121 = r17.f83372F;
    L130:
        boolean r392 = r121;
        if ((r58 & 1) == 0) goto L133;
        boolean r122 = r17.f83373G;
    L134:
        boolean r40 = r122;
        if ((r58 & 2) == 0) goto L137;
        boolean r123 = r17.f83374H;
    L139:
        if ((r58 & 4) == 0) goto L142;
        boolean r412 = r123;
        boolean r562 = r412;
        boolean r572 = r17.f83375I;
    L144:
        return r17.a(r182, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r242, r192, r202, r212, r222, r232, r252, r262, r282, r302, r312, r322, r342, r352, r362, r382, r214, r392, r40, r562, r572);
    L142:
        r572 = r56;
        r562 = r123;
        goto L144
    L137:
        r123 = r55;
        goto L139
    L133:
        r122 = r54;
        goto L134
    L129:
        r121 = r53;
        goto L130
    L125:
        r214 = r52;
        goto L126
    L121:
        r120 = r51;
        goto L123
    L117:
        r119 = r49;
        goto L118
    L113:
        r213 = r48;
        goto L114
    L109:
        r118 = r47;
        goto L111
    L105:
        r117 = r45;
        goto L106
    L101:
        r211 = r44;
        goto L102
    L97:
        r116 = r43;
        goto L99
    L93:
        r115 = r41;
        goto L94
    L89:
        r114 = r39;
        goto L90
    L85:
        r113 = r38;
        goto L86
    L81:
        r112 = r37;
        goto L82
    L77:
        r111 = r36;
        goto L78
    L73:
        r110 = r35;
        goto L74
    L69:
        r16 = r34;
        goto L70
    L65:
        r1 = r33;
        goto L66
    L61:
        r210 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L58
    L53:
        r14 = r30;
        goto L55
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
    }

    public final String A() {
        return this.f83384j;
    }

    public final double B() {
        return this.f83400z;
    }

    public final String C() {
        return this.f83385k;
    }

    public final boolean D() {
        return this.f83371E;
    }

    public final boolean E() {
        return this.f83372F;
    }

    public final TradingPortfolioResult a(String r42, String r43, String r44, String r45, String r46, String r47, String r48, String r49, String r50, String r51, String r52, String r53, Integer r54, ArrayList r55, Boolean r56, CorpAction r57, Integer r58, String r59, String r60, boolean r61, String r62, double r63, double r65, String r67, String r68, double r69, String r71, String r72, double r73, DomainPortfolioType r75, boolean r76, boolean r77, boolean r78, boolean r79, boolean r80) {
        kotlin.jvm.internal.p.l(r62, "totalFormated");
        kotlin.jvm.internal.p.l(r67, "profitLossFormated");
        kotlin.jvm.internal.p.l(r68, "gainFormated");
        kotlin.jvm.internal.p.l(r71, "investedFormated");
        return new TradingPortfolioResult(r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r65, r67, r68, r69, r71, r72, r73, r75, r76, r77, r78, r79, r80);
    }

    public final Integer c() {
        return this.f83391q;
    }

    public final String d() {
        return this.f83377b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof TradingPortfolioResult) == true) goto L8;
        return false;
    L8:
        TradingPortfolioResult r82 = (TradingPortfolioResult) r8;
        if (kotlin.jvm.internal.p.g(this.f83376a, r82.f83376a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f83377b, r82.f83377b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f83378c, r82.f83378c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f83379e, r82.f83379e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f83380f, r82.f83380f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f83381g, r82.f83381g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f83382h, r82.f83382h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f83383i, r82.f83383i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f83384j, r82.f83384j) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f83385k, r82.f83385k) == true) goto L42;
        return false;
    L42:
        if (kotlin.jvm.internal.p.g(this.f83386l, r82.f83386l) == true) goto L45;
        return false;
    L45:
        if (kotlin.jvm.internal.p.g(this.f83387m, r82.f83387m) == true) goto L48;
        return false;
    L48:
        if (kotlin.jvm.internal.p.g(this.f83388n, r82.f83388n) == true) goto L51;
        return false;
    L51:
        if (kotlin.jvm.internal.p.g(this.f83389o, r82.f83389o) == true) goto L54;
        return false;
    L54:
        if (kotlin.jvm.internal.p.g(this.f83390p, r82.f83390p) == true) goto L57;
        return false;
    L57:
        if (kotlin.jvm.internal.p.g(this.f83391q, r82.f83391q) == true) goto L60;
        return false;
    L60:
        if (kotlin.jvm.internal.p.g(this.f83392r, r82.f83392r) == true) goto L63;
        return false;
    L63:
        if (kotlin.jvm.internal.p.g(this.f83393s, r82.f83393s) == true) goto L66;
        return false;
    L66:
        if (this.f83394t == r82.f83394t) goto L69;
        return false;
    L69:
        if (kotlin.jvm.internal.p.g(this.f83395u, r82.f83395u) == true) goto L72;
        return false;
    L72:
        if (Double.compare(this.f83396v, r82.f83396v) == 0) goto L75;
        return false;
    L75:
        if (Double.compare(this.f83397w, r82.f83397w) == 0) goto L78;
        return false;
    L78:
        if (kotlin.jvm.internal.p.g(this.f83398x, r82.f83398x) == true) goto L81;
        return false;
    L81:
        if (kotlin.jvm.internal.p.g(this.f83399y, r82.f83399y) == true) goto L84;
        return false;
    L84:
        if (Double.compare(this.f83400z, r82.f83400z) == 0) goto L87;
        return false;
    L87:
        if (kotlin.jvm.internal.p.g(this.f83367A, r82.f83367A) == true) goto L90;
        return false;
    L90:
        if (kotlin.jvm.internal.p.g(this.f83368B, r82.f83368B) == true) goto L93;
        return false;
    L93:
        if (Double.compare(this.f83369C, r82.f83369C) == 0) goto L96;
        return false;
    L96:
        if (this.f83370D == r82.f83370D) goto L99;
        return false;
    L99:
        if (this.f83371E == r82.f83371E) goto L102;
        return false;
    L102:
        if (this.f83372F == r82.f83372F) goto L105;
        return false;
    L105:
        if (this.f83373G == r82.f83373G) goto L108;
        return false;
    L108:
        if (this.f83374H == r82.f83374H) goto L111;
        return false;
    L111:
        if (this.f83375I == r82.f83375I) goto L113;
        return false;
    L113:
        return true;
    }

    public final String f() {
        return this.f83378c;
    }

    public final String g() {
        return this.f83379e;
    }

    public final boolean h() {
        return this.f83374H;
    }

    public int hashCode() {
        String r02 = this.f83376a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f83377b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f83378c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f83379e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f83380f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f83381g;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.f83382h;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.f83383i;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.f83384j;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.f83385k;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        String r221 = this.f83386l;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (r014 + r222) * 31;
        Integer r223 = this.f83387m;
        if (r223 != null) goto L53;
        int r224 = 0;
    L54:
        int r016 = (r015 + r224) * 31;
        ArrayList r225 = this.f83388n;
        if (r225 != null) goto L57;
        int r226 = 0;
    L58:
        int r017 = (r016 + r226) * 31;
        Boolean r227 = this.f83389o;
        if (r227 != null) goto L61;
        int r228 = 0;
    L62:
        int r018 = (r017 + r228) * 31;
        CorpAction r229 = this.f83390p;
        if (r229 != null) goto L65;
        int r230 = 0;
    L66:
        int r019 = (r018 + r230) * 31;
        Integer r231 = this.f83391q;
        if (r231 != null) goto L69;
        int r232 = 0;
    L70:
        int r020 = (r019 + r232) * 31;
        String r233 = this.f83392r;
        if (r233 != null) goto L73;
        int r234 = 0;
    L74:
        int r021 = (r020 + r234) * 31;
        String r235 = this.f83393s;
        if (r235 != null) goto L77;
        int r236 = 0;
    L78:
        int r022 = (((((((((((((((((r021 + r236) * 31) + Boolean.hashCode(this.f83394t)) * 31) + this.f83395u.hashCode()) * 31) + Double.hashCode(this.f83396v)) * 31) + Double.hashCode(this.f83397w)) * 31) + this.f83398x.hashCode()) * 31) + this.f83399y.hashCode()) * 31) + Double.hashCode(this.f83400z)) * 31) + this.f83367A.hashCode()) * 31;
        String r237 = this.f83368B;
        if (r237 != null) goto L81;
        int r238 = 0;
    L82:
        int r023 = (((r022 + r238) * 31) + Double.hashCode(this.f83369C)) * 31;
        DomainPortfolioType r239 = this.f83370D;
        if (r239 == null) goto L87;
        r1 = r239.hashCode();
    L87:
        return ((((((((((r023 + r1) * 31) + Boolean.hashCode(this.f83371E)) * 31) + Boolean.hashCode(this.f83372F)) * 31) + Boolean.hashCode(this.f83373G)) * 31) + Boolean.hashCode(this.f83374H)) * 31) + Boolean.hashCode(this.f83375I);
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

    public final CorpAction i() {
        return this.f83390p;
    }

    public final Integer j() {
        return this.f83387m;
    }

    public final String k() {
        return this.f83392r;
    }

    public final String l() {
        return this.f83399y;
    }

    public final boolean m() {
        return this.f83394t;
    }

    public final String n() {
        return this.f83367A;
    }

    public final ArrayList o() {
        return this.f83388n;
    }

    public final String p() {
        return this.f83381g;
    }

    public final String q() {
        return this.f83382h;
    }

    public final String r() {
        return this.f83383i;
    }

    public final String s() {
        return this.f83393s;
    }

    public final String t() {
        return this.f83376a;
    }

    public String toString() {
        return "TradingPortfolioResult(symbol=" + this.f83376a + ", availableLot=" + this.f83377b + ", balanceLot=" + this.f83378c + ", availableShare=" + this.d + ", balanceShare=" + this.f83379e + ", total=" + this.f83380f + ", priceAverage=" + this.f83381g + ", priceAverageFee=" + this.f83382h + ", priceLatest=" + this.f83383i + ", unrealisedMarketvalue=" + this.f83384j + ", unrealisedProfitloss=" + this.f83385k + ", unrealisedGain=" + this.f83386l + ", exerciseData=" + this.f83387m + ", notation=" + this.f83388n + ", uma=" + this.f83389o + ", corpAction=" + this.f83390p + ", allowOrder=" + this.f83391q + ", exerciseType=" + this.f83392r + ", stockOnHand=" + this.f83393s + ", haveAutoSell=" + this.f83394t + ", totalFormated=" + this.f83395u + ", unrealisedProfitlossDouble=" + this.f83396v + ", unrealisedGainPercentage=" + this.f83397w + ", profitLossFormated=" + this.f83398x + ", gainFormated=" + this.f83399y + ", unrealisedMarketvalueDouble=" + this.f83400z + ", investedFormated=" + this.f83367A + ", type=" + this.f83368B + ", investedDouble=" + this.f83369C + ", tradeType=" + this.f83370D + ", isFRBonds=" + this.f83371E + ", isSharia=" + this.f83372F + ", isShariaUser=" + this.f83373G + ", canBuy=" + this.f83374H + ", canSell=" + this.f83375I + ')';
    }

    public final String u() {
        return this.f83380f;
    }

    public final DomainPortfolioType v() {
        return this.f83370D;
    }

    public final String w() {
        return this.f83368B;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r6, int r7) {
        kotlin.jvm.internal.p.l(r6, "dest");
        r6.writeString(this.f83376a);
        r6.writeString(this.f83377b);
        r6.writeString(this.f83378c);
        r6.writeString(this.d);
        r6.writeString(this.f83379e);
        r6.writeString(this.f83380f);
        r6.writeString(this.f83381g);
        r6.writeString(this.f83382h);
        r6.writeString(this.f83383i);
        r6.writeString(this.f83384j);
        r6.writeString(this.f83385k);
        r6.writeString(this.f83386l);
        Integer r02 = this.f83387m;
        if (r02 != null) goto L5;
        r6.writeInt(0);
    L6:
        ArrayList r03 = this.f83388n;
        if (r03 != null) goto L9;
        r6.writeInt(0);
    L13:
        Boolean r04 = this.f83389o;
        if (r04 != null) goto L16;
        r6.writeInt(0);
    L17:
        CorpAction r05 = this.f83390p;
        if (r05 != null) goto L20;
        r6.writeInt(0);
    L21:
        Integer r72 = this.f83391q;
        if (r72 != null) goto L24;
        r6.writeInt(0);
    L25:
        r6.writeString(this.f83392r);
        r6.writeString(this.f83393s);
        r6.writeInt(this.f83394t ? 1 : 0);
        r6.writeString(this.f83395u);
        r6.writeDouble(this.f83396v);
        r6.writeDouble(this.f83397w);
        r6.writeString(this.f83398x);
        r6.writeString(this.f83399y);
        r6.writeDouble(this.f83400z);
        r6.writeString(this.f83367A);
        r6.writeString(this.f83368B);
        r6.writeDouble(this.f83369C);
        DomainPortfolioType r73 = this.f83370D;
        if (r73 != null) goto L28;
        r6.writeInt(0);
    L29:
        r6.writeInt(this.f83371E ? 1 : 0);
        r6.writeInt(this.f83372F ? 1 : 0);
        r6.writeInt(this.f83373G ? 1 : 0);
        r6.writeInt(this.f83374H ? 1 : 0);
        r6.writeInt(this.f83375I ? 1 : 0);
        return;
    L28:
        r6.writeInt(1);
        r6.writeString(r73.name());
        goto L29
    L24:
        r6.writeInt(1);
        r6.writeInt(r72.intValue());
        goto L25
    L20:
        r6.writeInt(1);
        r05.writeToParcel(r6, r7);
        goto L21
    L16:
        r6.writeInt(1);
        r6.writeInt(r04.booleanValue() ? 1 : 0);
        goto L17
    L9:
        r6.writeInt(1);
        r6.writeInt(r03.size());
        Iterator r06 = r03.iterator();
    L11:
        if (r06.hasNext() == false) goto L13;
        r6.writeParcelable((Parcelable) r06.next(), r7);
        goto L11
    L5:
        r6.writeInt(1);
        r6.writeInt(r02.intValue());
        goto L6
    }

    public final Boolean x() {
        return this.f83389o;
    }

    public final String y() {
        return this.f83386l;
    }

    public final double z() {
        return this.f83397w;
    }

    public /* synthetic */ TradingPortfolioResult(String r40, String r41, String r42, String r43, String r44, String r45, String r46, String r47, String r48, String r49, String r50, String r51, Integer r52, ArrayList r53, Boolean r54, CorpAction r55, Integer r56, String r57, String r58, boolean r59, String r60, double r61, double r63, String r65, String r66, double r67, String r69, String r70, double r71, DomainPortfolioType r73, boolean r74, boolean r75, boolean r76, boolean r77, boolean r78, int r79, int r80, kotlin.jvm.internal.i r81) {
        if ((r79 & 1) == 0) goto L5;
        String r1 = null;
    L7:
        if ((r79 & 2) == 0) goto L9;
        String r3 = null;
    L11:
        if ((r79 & 4) == 0) goto L13;
        String r4 = null;
    L15:
        if ((r79 & 8) == 0) goto L17;
        String r5 = null;
    L19:
        if ((r79 & 16) == 0) goto L21;
        String r6 = null;
    L23:
        if ((r79 & 32) == 0) goto L25;
        String r7 = null;
    L27:
        if ((r79 & 64) == 0) goto L29;
        String r8 = null;
    L31:
        if ((r79 & 128) == 0) goto L33;
        String r9 = null;
    L35:
        if ((r79 & 256) == 0) goto L37;
        String r10 = null;
    L39:
        if ((r79 & 512) == 0) goto L41;
        String r11 = null;
    L43:
        if ((r79 & 1024) == 0) goto L45;
        String r12 = null;
    L47:
        if ((r79 & 2048) == 0) goto L49;
        String r13 = null;
    L51:
        if ((r79 & 4096) == 0) goto L53;
        Integer r14 = 0;
    L55:
        if ((r79 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        ArrayList r2 = null;
    L59:
        if ((r79 & 16384) == 0) goto L61;
        Boolean r15 = null;
    L63:
        if ((r79 & 32768) == 0) goto L65;
        CorpAction r16 = null;
    L66:
        boolean r18 = true;
        if ((r79 & 65536) == 0) goto L69;
        Integer r17 = 1;
    L71:
        if ((r79 & 131072) == 0) goto L73;
        String r19 = "";
    L75:
        if ((r79 & 262144) == 0) goto L77;
        String r20 = null;
    L79:
        if ((r79 & 524288) != 0) goto L82;
        r18 = r59;
    L82:
        String r22 = "0";
        if ((r79 & 1048576) == 0) goto L85;
        String r21 = "0";
    L86:
        double r24 = 0.0d;
        if ((r79 & 2097152) == 0) goto L89;
        double r26 = 0.0d;
    L91:
        if ((r79 & 4194304) == 0) goto L93;
        double r28 = 0.0d;
    L95:
        if ((r79 & 8388608) == 0) goto L97;
        String r23 = "0";
    L99:
        if ((r79 & 16777216) == 0) goto L101;
        String r30 = "0";
    L103:
        if ((r79 & 33554432) == 0) goto L105;
        double r31 = 0.0d;
    L107:
        if ((r79 & 67108864) != 0) goto L111;
        r22 = r69;
    L111:
        if ((r79 & 134217728) == 0) goto L113;
        String r33 = null;
    L115:
        if ((r79 & 268435456) != 0) goto L119;
        r24 = r71;
    L119:
        if ((r79 & 536870912) == 0) goto L121;
        DomainPortfolioType r34 = null;
    L123:
        if ((r79 & Ints.MAX_POWER_OF_TWO) == 0) goto L125;
        boolean r35 = false;
    L127:
        if ((r79 & Integer.MIN_VALUE) == 0) goto L129;
        boolean r02 = false;
    L131:
        if ((r80 & 1) == 0) goto L133;
        boolean r36 = false;
    L135:
        if ((r80 & 2) == 0) goto L137;
        boolean r37 = false;
    L139:
        if ((r80 & 4) == 0) goto L142;
        boolean r792 = false;
    L143:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r2, r15, r16, r17, r19, r20, r18, r21, r26, r28, r23, r30, r31, r22, r33, r24, r34, r35, r02, r36, r37, r792);
        return;
    L142:
        r792 = r78;
        goto L143
    L137:
        r37 = r77;
        goto L139
    L133:
        r36 = r76;
        goto L135
    L129:
        r02 = r75;
        goto L131
    L125:
        r35 = r74;
        goto L127
    L121:
        r34 = r73;
        goto L123
    L113:
        r33 = r70;
        goto L115
    L105:
        r31 = r67;
        goto L107
    L101:
        r30 = r66;
        goto L103
    L97:
        r23 = r65;
        goto L99
    L93:
        r28 = r63;
        goto L95
    L89:
        r26 = r61;
        goto L91
    L85:
        r21 = r60;
        goto L86
    L77:
        r20 = r58;
        goto L79
    L73:
        r19 = r57;
        goto L75
    L69:
        r17 = r56;
        goto L71
    L65:
        r16 = r55;
        goto L66
    L61:
        r15 = r54;
        goto L63
    L57:
        r2 = r53;
        goto L59
    L53:
        r14 = r52;
        goto L55
    L49:
        r13 = r51;
        goto L51
    L45:
        r12 = r50;
        goto L47
    L41:
        r11 = r49;
        goto L43
    L37:
        r10 = r48;
        goto L39
    L33:
        r9 = r47;
        goto L35
    L29:
        r8 = r46;
        goto L31
    L25:
        r7 = r45;
        goto L27
    L21:
        r6 = r44;
        goto L23
    L17:
        r5 = r43;
        goto L19
    L13:
        r4 = r42;
        goto L15
    L9:
        r3 = r41;
        goto L11
    L5:
        r1 = r40;
        goto L7
    }
}
