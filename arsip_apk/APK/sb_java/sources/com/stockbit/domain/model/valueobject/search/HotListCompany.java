package com.stockbit.domain.model.valueobject.search;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.primitives.Ints;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import com.stockbit.model.entity.Notation;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0003\b\u009b\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0005\u0012\b\b\u0002\u0010#\u001a\u00020\u0005\u0012\b\b\u0002\u0010$\u001a\u00020\u0005\u0012\b\b\u0002\u0010%\u001a\u00020\u0005\u0012\b\b\u0002\u0010&\u001a\u00020\u0012\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010*\u001a\u00020)\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010-\u001a\u00020\u0005\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u00103\u001a\u0016\u0012\u0004\u0012\u000205\u0018\u000104j\n\u0012\u0004\u0012\u000205\u0018\u0001`6¢\u0006\u0004\b7\u00108J\f\u0010£\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010§\u0001\u001a\u00020\tHÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¯\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010WJ\f\u0010°\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010±\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010²\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010µ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¶\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010WJ\f\u0010·\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¹\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010WJ\u0011\u0010º\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010WJ\n\u0010»\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010¼\u0001\u001a\u0004\u0018\u00010 HÆ\u0003J\f\u0010½\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010¾\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¿\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010À\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010Á\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010Â\u0001\u001a\u00020\u0012HÆ\u0003J\f\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010Ä\u0001\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0003\u0010\u0087\u0001J\n\u0010Å\u0001\u001a\u00020)HÆ\u0003J\u0012\u0010Æ\u0001\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0003\u0010\u0087\u0001J\u0011\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010WJ\n\u0010È\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010É\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010Ê\u0001\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0003\u0010\u0087\u0001J\f\u0010Ë\u0001\u001a\u0004\u0018\u000101HÆ\u0003J\f\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001e\u0010Í\u0001\u001a\u0016\u0012\u0004\u0012\u000205\u0018\u000104j\n\u0012\u0004\u0012\u000205\u0018\u0001`6HÆ\u0003J\u0092\u0004\u0010Î\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\u00122\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010*\u001a\u00020)2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010-\u001a\u00020\u00052\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010)2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u00103\u001a\u0016\u0012\u0004\u0012\u000205\u0018\u000104j\n\u0012\u0004\u0012\u000205\u0018\u0001`6HÆ\u0001¢\u0006\u0003\u0010Ï\u0001J\u0017\u0010Ð\u0001\u001a\u00020\u00052\n\u0010Ñ\u0001\u001a\u0005\u0018\u00010Ò\u0001HÖ\u0083\u0004J\u000b\u0010Ó\u0001\u001a\u00020\u0012HÖ\u0081\u0004J\u000b\u0010Ô\u0001\u001a\u00020\u0003HÖ\u0081\u0004R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010=\"\u0004\b>\u0010?R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010:\"\u0004\bA\u0010<R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010:\"\u0004\bC\u0010<R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010:\"\u0004\bI\u0010<R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010:\"\u0004\bK\u0010<R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010:\"\u0004\bM\u0010<R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010:\"\u0004\bO\u0010<R \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010:\"\u0004\bQ\u0010<R \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010:\"\u0004\bS\u0010<R \u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010:\"\u0004\bU\u0010<R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010Z\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR \u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010:\"\u0004\b\\\u0010<R \u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010:\"\u0004\b^\u0010<R \u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010:\"\u0004\b`\u0010<R \u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010:\"\u0004\bb\u0010<R \u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010:\"\u0004\bd\u0010<R \u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010:\"\u0004\bf\u0010<R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010Z\u001a\u0004\bg\u0010W\"\u0004\bh\u0010YR \u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010:\"\u0004\bj\u0010<R \u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010:\"\u0004\bl\u0010<R\"\u0010\u001c\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010Z\u001a\u0004\bm\u0010W\"\u0004\bn\u0010YR\"\u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010Z\u001a\u0004\bo\u0010W\"\u0004\bp\u0010YR\u001e\u0010\u001e\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010=\"\u0004\br\u0010?R \u0010\u001f\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR \u0010!\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010:\"\u0004\bx\u0010<R\u001e\u0010\"\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010=\"\u0004\bz\u0010?R\u001e\u0010#\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010=\"\u0004\b|\u0010?R\u001e\u0010$\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010=\"\u0004\b~\u0010?R\u001e\u0010%\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010=\"\u0004\b\u007f\u0010?R\"\u0010&\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\"\u0010'\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010:\"\u0005\b\u0085\u0001\u0010<R'\u0010(\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\"\u0010*\u001a\u00020)8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R'\u0010+\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b\u008f\u0001\u0010\u0087\u0001\"\u0006\b\u0090\u0001\u0010\u0089\u0001R$\u0010,\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010Z\u001a\u0005\b\u0091\u0001\u0010W\"\u0005\b\u0092\u0001\u0010YR \u0010-\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u0010=\"\u0005\b\u0094\u0001\u0010?R\"\u0010.\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u0010:\"\u0005\b\u0096\u0001\u0010<R'\u0010/\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b\u0097\u0001\u0010\u0087\u0001\"\u0006\b\u0098\u0001\u0010\u0089\u0001R$\u00100\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R\"\u00102\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010:\"\u0005\b\u009e\u0001\u0010<R6\u00103\u001a\u0016\u0012\u0004\u0012\u000205\u0018\u000104j\n\u0012\u0004\u0012\u000205\u0018\u0001`68\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001¨\u0006Õ\u0001"}, d2 = {"Lcom/stockbit/domain/model/valueobject/search/HotListCompany;", "Ljava/io/Serializable;", Constants.KEY_ID, "", "isHeaderItem", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "sectorid", "companyid", "", "last", "formattedPrice", "change", "country", "exchange", NotificationCompat.CATEGORY_STATUS, "type", "tradeable", "", "percent", "previous", "symbol", "symbol_2", "userid", "username", "official", "fullname", "avatar", "followed", "alert", "uma", "corpAction", "Lcom/stockbit/domain/model/valueobject/search/CorpAction;", "iconUrl", "wsHasUma", "wsHasNotasiKhusus", "wsHasCorpAction", "isOpen", "messageStatus", "lastPrice", "prevLast", "", "priceChange", "percentChange", "alertPrevValue", "hasNotation", "companySymbol", "lastPriceDouble", "formattedLastPrice", "", "formattedPercentage", "notations", "Ljava/util/ArrayList;", "Lcom/stockbit/model/entity/Notation;", "Lkotlin/collections/ArrayList;", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLcom/stockbit/domain/model/valueobject/search/CorpAction;Ljava/lang/String;ZZZZILjava/lang/String;Ljava/lang/Double;DLjava/lang/Double;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/Double;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/util/ArrayList;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "()Z", "setHeaderItem", "(Z)V", "getName", "setName", "getSectorid", "setSectorid", "getCompanyid", "()J", "setCompanyid", "(J)V", "getLast", "setLast", "getFormattedPrice", "setFormattedPrice", "getChange", "setChange", "getCountry", "setCountry", "getExchange", "setExchange", "getStatus", "setStatus", "getType", "setType", "getTradeable", "()Ljava/lang/Integer;", "setTradeable", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPercent", "setPercent", "getPrevious", "setPrevious", "getSymbol", "setSymbol", "getSymbol_2", "setSymbol_2", "getUserid", "setUserid", "getUsername", "setUsername", "getOfficial", "setOfficial", "getFullname", "setFullname", "getAvatar", "setAvatar", "getFollowed", "setFollowed", "getAlert", "setAlert", "getUma", "setUma", "getCorpAction", "()Lcom/stockbit/domain/model/valueobject/search/CorpAction;", "setCorpAction", "(Lcom/stockbit/domain/model/valueobject/search/CorpAction;)V", "getIconUrl", "setIconUrl", "getWsHasUma", "setWsHasUma", "getWsHasNotasiKhusus", "setWsHasNotasiKhusus", "getWsHasCorpAction", "setWsHasCorpAction", "setOpen", "getMessageStatus", "()I", "setMessageStatus", "(I)V", "getLastPrice", "setLastPrice", "getPrevLast", "()Ljava/lang/Double;", "setPrevLast", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getPriceChange", "()D", "setPriceChange", "(D)V", "getPercentChange", "setPercentChange", "getAlertPrevValue", "setAlertPrevValue", "getHasNotation", "setHasNotation", "getCompanySymbol", "setCompanySymbol", "getLastPriceDouble", "setLastPriceDouble", "getFormattedLastPrice", "()Ljava/lang/CharSequence;", "setFormattedLastPrice", "(Ljava/lang/CharSequence;)V", "getFormattedPercentage", "setFormattedPercentage", "getNotations", "()Ljava/util/ArrayList;", "setNotations", "(Ljava/util/ArrayList;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", Constants.COPY_TYPE, "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLcom/stockbit/domain/model/valueobject/search/CorpAction;Ljava/lang/String;ZZZZILjava/lang/String;Ljava/lang/Double;DLjava/lang/Double;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/Double;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/util/ArrayList;)Lcom/stockbit/domain/model/valueobject/search/HotListCompany;", "equals", "other", "", "hashCode", "toString", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HotListCompany implements Serializable {

    @SerializedName("alert")
    private Integer alert;

    @SerializedName("alertPrevValue")
    private Integer alertPrevValue;

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("change")
    private String change;

    @SerializedName("company_symbol")
    private String companySymbol;

    @SerializedName(alternate = {"company_id"}, value = "companyid")
    private long companyid;

    @SerializedName("corp_action")
    private CorpAction corpAction;

    @SerializedName("country")
    private String country;

    @SerializedName("exchange")
    private String exchange;

    @SerializedName("followed")
    private Integer followed;

    @SerializedName("formatted_last_price")
    private CharSequence formattedLastPrice;

    @SerializedName("formatted_percentage")
    private String formattedPercentage;

    @SerializedName("formatted_price")
    private String formattedPrice;

    @SerializedName("fullname")
    private String fullname;

    @SerializedName("has_notation")
    private boolean hasNotation;

    @SerializedName("icon_url")
    private String iconUrl;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private String f86934id;

    @SerializedName("isHeaderItem")
    private boolean isHeaderItem;

    @SerializedName("isOpen")
    private boolean isOpen;

    @SerializedName("last")
    private String last;

    @SerializedName("lastPrice")
    private String lastPrice;

    @SerializedName("last_price_double")
    private Double lastPriceDouble;

    @SerializedName("messageStatus")
    private int messageStatus;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private String name;

    @SerializedName("notation")
    private ArrayList<Notation> notations;

    @SerializedName("official")
    private Integer official;

    @SerializedName(alternate = {"percentage"}, value = "percent")
    private String percent;

    @SerializedName("percentChange")
    private Double percentChange;

    @SerializedName("prevLast")
    private Double prevLast;

    @SerializedName("previous")
    private String previous;

    @SerializedName("priceChange")
    private double priceChange;

    @SerializedName("sectorid")
    private String sectorid;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private String status;

    @SerializedName("symbol")
    private String symbol;

    @SerializedName("symbol_2")
    private String symbol_2;

    @SerializedName("tradeable")
    private Integer tradeable;

    @SerializedName("type")
    private String type;

    @SerializedName("uma")
    private boolean uma;

    @SerializedName("userid")
    private String userid;

    @SerializedName("username")
    private String username;

    @SerializedName("wsHasCorpAction")
    private boolean wsHasCorpAction;

    @SerializedName("wsHasNotasiKhusus")
    private boolean wsHasNotasiKhusus;

    @SerializedName("wsHasUma")
    private boolean wsHasUma;

    public HotListCompany() {
        String r1 = null;
        boolean r2 = false;
        String r3 = null;
        String r4 = null;
        long r5 = 0;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        String r12 = null;
        String r13 = null;
        Integer r14 = null;
        String r15 = null;
        String r16 = null;
        String r17 = null;
        String r18 = null;
        String r19 = null;
        String r20 = null;
        Integer r21 = null;
        String r22 = null;
        String r23 = null;
        Integer r24 = null;
        Integer r25 = null;
        boolean r26 = false;
        CorpAction r27 = null;
        String r28 = null;
        boolean r29 = false;
        boolean r30 = false;
        boolean r31 = false;
        boolean r32 = false;
        int r33 = 0;
        String r34 = null;
        Double r35 = null;
        double r36 = 0.0d;
        Double r38 = null;
        Integer r39 = null;
        boolean r40 = false;
        String r41 = null;
        Double r42 = null;
        CharSequence r43 = null;
        String r44 = null;
        ArrayList r45 = null;
        int r46 = -1;
        this(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r39, r40, r41, r42, r43, r44, r45, r46, 2047, null);
    }

    public final void A(String r1) {
        this.formattedPercentage = r1;
    }

    public final void B(String r1) {
        this.lastPrice = r1;
    }

    public final void C(Double r1) {
        this.lastPriceDouble = r1;
    }

    public final void D(Double r1) {
        this.percentChange = r1;
    }

    public final void E(Double r1) {
        this.prevLast = r1;
    }

    public final void F(double r1) {
        this.priceChange = r1;
    }

    public final String a() {
        return this.change;
    }

    public final String b() {
        return this.companySymbol;
    }

    public final CorpAction c() {
        return this.corpAction;
    }

    public final String d() {
        return this.country;
    }

    public final CharSequence e() {
        return this.formattedLastPrice;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof HotListCompany) == true) goto L8;
        return false;
    L8:
        HotListCompany r82 = (HotListCompany) r8;
        if (p.g(this.f86934id, r82.f86934id) == true) goto L12;
        return false;
    L12:
        if (this.isHeaderItem == r82.isHeaderItem) goto L15;
        return false;
    L15:
        if (p.g(this.name, r82.name) == true) goto L18;
        return false;
    L18:
        if (p.g(this.sectorid, r82.sectorid) == true) goto L21;
        return false;
    L21:
        if (this.companyid == r82.companyid) goto L24;
        return false;
    L24:
        if (p.g(this.last, r82.last) == true) goto L27;
        return false;
    L27:
        if (p.g(this.formattedPrice, r82.formattedPrice) == true) goto L30;
        return false;
    L30:
        if (p.g(this.change, r82.change) == true) goto L33;
        return false;
    L33:
        if (p.g(this.country, r82.country) == true) goto L36;
        return false;
    L36:
        if (p.g(this.exchange, r82.exchange) == true) goto L39;
        return false;
    L39:
        if (p.g(this.status, r82.status) == true) goto L42;
        return false;
    L42:
        if (p.g(this.type, r82.type) == true) goto L45;
        return false;
    L45:
        if (p.g(this.tradeable, r82.tradeable) == true) goto L48;
        return false;
    L48:
        if (p.g(this.percent, r82.percent) == true) goto L51;
        return false;
    L51:
        if (p.g(this.previous, r82.previous) == true) goto L54;
        return false;
    L54:
        if (p.g(this.symbol, r82.symbol) == true) goto L57;
        return false;
    L57:
        if (p.g(this.symbol_2, r82.symbol_2) == true) goto L60;
        return false;
    L60:
        if (p.g(this.userid, r82.userid) == true) goto L63;
        return false;
    L63:
        if (p.g(this.username, r82.username) == true) goto L66;
        return false;
    L66:
        if (p.g(this.official, r82.official) == true) goto L69;
        return false;
    L69:
        if (p.g(this.fullname, r82.fullname) == true) goto L72;
        return false;
    L72:
        if (p.g(this.avatar, r82.avatar) == true) goto L75;
        return false;
    L75:
        if (p.g(this.followed, r82.followed) == true) goto L78;
        return false;
    L78:
        if (p.g(this.alert, r82.alert) == true) goto L81;
        return false;
    L81:
        if (this.uma == r82.uma) goto L84;
        return false;
    L84:
        if (p.g(this.corpAction, r82.corpAction) == true) goto L87;
        return false;
    L87:
        if (p.g(this.iconUrl, r82.iconUrl) == true) goto L90;
        return false;
    L90:
        if (this.wsHasUma == r82.wsHasUma) goto L93;
        return false;
    L93:
        if (this.wsHasNotasiKhusus == r82.wsHasNotasiKhusus) goto L96;
        return false;
    L96:
        if (this.wsHasCorpAction == r82.wsHasCorpAction) goto L99;
        return false;
    L99:
        if (this.isOpen == r82.isOpen) goto L102;
        return false;
    L102:
        if (this.messageStatus == r82.messageStatus) goto L105;
        return false;
    L105:
        if (p.g(this.lastPrice, r82.lastPrice) == true) goto L108;
        return false;
    L108:
        if (p.g(this.prevLast, r82.prevLast) == true) goto L111;
        return false;
    L111:
        if (Double.compare(this.priceChange, r82.priceChange) == 0) goto L114;
        return false;
    L114:
        if (p.g(this.percentChange, r82.percentChange) == true) goto L117;
        return false;
    L117:
        if (p.g(this.alertPrevValue, r82.alertPrevValue) == true) goto L120;
        return false;
    L120:
        if (this.hasNotation == r82.hasNotation) goto L123;
        return false;
    L123:
        if (p.g(this.companySymbol, r82.companySymbol) == true) goto L126;
        return false;
    L126:
        if (p.g(this.lastPriceDouble, r82.lastPriceDouble) == true) goto L129;
        return false;
    L129:
        if (p.g(this.formattedLastPrice, r82.formattedLastPrice) == true) goto L132;
        return false;
    L132:
        if (p.g(this.formattedPercentage, r82.formattedPercentage) == true) goto L135;
        return false;
    L135:
        if (p.g(this.notations, r82.notations) == true) goto L137;
        return false;
    L137:
        return true;
    }

    public final String f() {
        return this.formattedPercentage;
    }

    public final boolean g() {
        return this.hasNotation;
    }

    public final String h() {
        return this.iconUrl;
    }

    public int hashCode() {
        String r02 = this.f86934id;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = ((r03 * 31) + Boolean.hashCode(this.isHeaderItem)) * 31;
        String r2 = this.name;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.sectorid;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (((r05 + r24) * 31) + Long.hashCode(this.companyid)) * 31;
        String r25 = this.last;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.formattedPrice;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.change;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.country;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.exchange;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.status;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.type;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        Integer r219 = this.tradeable;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        String r221 = this.percent;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (r014 + r222) * 31;
        String r223 = this.previous;
        if (r223 != null) goto L53;
        int r224 = 0;
    L54:
        int r016 = (r015 + r224) * 31;
        String r225 = this.symbol;
        if (r225 != null) goto L57;
        int r226 = 0;
    L58:
        int r017 = (r016 + r226) * 31;
        String r227 = this.symbol_2;
        if (r227 != null) goto L61;
        int r228 = 0;
    L62:
        int r018 = (r017 + r228) * 31;
        String r229 = this.userid;
        if (r229 != null) goto L65;
        int r230 = 0;
    L66:
        int r019 = (r018 + r230) * 31;
        String r231 = this.username;
        if (r231 != null) goto L69;
        int r232 = 0;
    L70:
        int r020 = (r019 + r232) * 31;
        Integer r233 = this.official;
        if (r233 != null) goto L73;
        int r234 = 0;
    L74:
        int r021 = (r020 + r234) * 31;
        String r235 = this.fullname;
        if (r235 != null) goto L77;
        int r236 = 0;
    L78:
        int r022 = (r021 + r236) * 31;
        String r237 = this.avatar;
        if (r237 != null) goto L81;
        int r238 = 0;
    L82:
        int r023 = (r022 + r238) * 31;
        Integer r239 = this.followed;
        if (r239 != null) goto L85;
        int r240 = 0;
    L86:
        int r024 = (r023 + r240) * 31;
        Integer r241 = this.alert;
        if (r241 != null) goto L89;
        int r242 = 0;
    L90:
        int r025 = (((r024 + r242) * 31) + Boolean.hashCode(this.uma)) * 31;
        CorpAction r243 = this.corpAction;
        if (r243 != null) goto L93;
        int r244 = 0;
    L94:
        int r026 = (r025 + r244) * 31;
        String r245 = this.iconUrl;
        if (r245 != null) goto L97;
        int r246 = 0;
    L98:
        int r027 = (((((((((((r026 + r246) * 31) + Boolean.hashCode(this.wsHasUma)) * 31) + Boolean.hashCode(this.wsHasNotasiKhusus)) * 31) + Boolean.hashCode(this.wsHasCorpAction)) * 31) + Boolean.hashCode(this.isOpen)) * 31) + Integer.hashCode(this.messageStatus)) * 31;
        String r247 = this.lastPrice;
        if (r247 != null) goto L101;
        int r248 = 0;
    L102:
        int r028 = (r027 + r248) * 31;
        Double r249 = this.prevLast;
        if (r249 != null) goto L105;
        int r250 = 0;
    L106:
        int r029 = (((r028 + r250) * 31) + Double.hashCode(this.priceChange)) * 31;
        Double r251 = this.percentChange;
        if (r251 != null) goto L109;
        int r252 = 0;
    L110:
        int r030 = (r029 + r252) * 31;
        Integer r253 = this.alertPrevValue;
        if (r253 != null) goto L113;
        int r254 = 0;
    L114:
        int r031 = (((r030 + r254) * 31) + Boolean.hashCode(this.hasNotation)) * 31;
        String r255 = this.companySymbol;
        if (r255 != null) goto L117;
        int r256 = 0;
    L118:
        int r032 = (r031 + r256) * 31;
        Double r257 = this.lastPriceDouble;
        if (r257 != null) goto L121;
        int r258 = 0;
    L122:
        int r033 = (r032 + r258) * 31;
        CharSequence r259 = this.formattedLastPrice;
        if (r259 != null) goto L125;
        int r260 = 0;
    L126:
        int r034 = (r033 + r260) * 31;
        String r261 = this.formattedPercentage;
        if (r261 != null) goto L129;
        int r262 = 0;
    L130:
        int r035 = (r034 + r262) * 31;
        ArrayList<Notation> r263 = this.notations;
        if (r263 == null) goto L135;
        r1 = r263.hashCode();
    L135:
        return r035 + r1;
    L129:
        r262 = r261.hashCode();
        goto L130
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
        return this.f86934id;
    }

    public final String j() {
        return this.last;
    }

    public final String k() {
        return this.lastPrice;
    }

    public final Double m() {
        return this.lastPriceDouble;
    }

    public final String o() {
        return this.name;
    }

    public final ArrayList p() {
        return this.notations;
    }

    public final String q() {
        return this.percent;
    }

    public final Double r() {
        return this.percentChange;
    }

    public final double s() {
        return this.priceChange;
    }

    public final String t() {
        return this.sectorid;
    }

    public String toString() {
        return "HotListCompany(id=" + this.f86934id + ", isHeaderItem=" + this.isHeaderItem + ", name=" + this.name + ", sectorid=" + this.sectorid + ", companyid=" + this.companyid + ", last=" + this.last + ", formattedPrice=" + this.formattedPrice + ", change=" + this.change + ", country=" + this.country + ", exchange=" + this.exchange + ", status=" + this.status + ", type=" + this.type + ", tradeable=" + this.tradeable + ", percent=" + this.percent + ", previous=" + this.previous + ", symbol=" + this.symbol + ", symbol_2=" + this.symbol_2 + ", userid=" + this.userid + ", username=" + this.username + ", official=" + this.official + ", fullname=" + this.fullname + ", avatar=" + this.avatar + ", followed=" + this.followed + ", alert=" + this.alert + ", uma=" + this.uma + ", corpAction=" + this.corpAction + ", iconUrl=" + this.iconUrl + ", wsHasUma=" + this.wsHasUma + ", wsHasNotasiKhusus=" + this.wsHasNotasiKhusus + ", wsHasCorpAction=" + this.wsHasCorpAction + ", isOpen=" + this.isOpen + ", messageStatus=" + this.messageStatus + ", lastPrice=" + this.lastPrice + ", prevLast=" + this.prevLast + ", priceChange=" + this.priceChange + ", percentChange=" + this.percentChange + ", alertPrevValue=" + this.alertPrevValue + ", hasNotation=" + this.hasNotation + ", companySymbol=" + this.companySymbol + ", lastPriceDouble=" + this.lastPriceDouble + ", formattedLastPrice=" + this.formattedLastPrice + ", formattedPercentage=" + this.formattedPercentage + ", notations=" + this.notations + ')';
    }

    public final String u() {
        return this.symbol;
    }

    public final String v() {
        return this.symbol_2;
    }

    public final String w() {
        return this.type;
    }

    public final boolean x() {
        return this.uma;
    }

    public final boolean y() {
        return this.isHeaderItem;
    }

    public final void z(CharSequence r1) {
        this.formattedLastPrice = r1;
    }

    public HotListCompany(String r1, boolean r2, String r3, String r4, long r5, String r7, String r8, String r9, String r10, String r11, String r12, String r13, Integer r14, String r15, String r16, String r17, String r18, String r19, String r20, Integer r21, String r22, String r23, Integer r24, Integer r25, boolean r26, CorpAction r27, String r28, boolean r29, boolean r30, boolean r31, boolean r32, int r33, String r34, Double r35, double r36, Double r38, Integer r39, boolean r40, String r41, Double r42, CharSequence r43, String r44, ArrayList<Notation> r45) {
        this.f86934id = r1;
        this.isHeaderItem = r2;
        this.name = r3;
        this.sectorid = r4;
        this.companyid = r5;
        this.last = r7;
        this.formattedPrice = r8;
        this.change = r9;
        this.country = r10;
        this.exchange = r11;
        this.status = r12;
        this.type = r13;
        this.tradeable = r14;
        this.percent = r15;
        this.previous = r16;
        this.symbol = r17;
        this.symbol_2 = r18;
        this.userid = r19;
        this.username = r20;
        this.official = r21;
        this.fullname = r22;
        this.avatar = r23;
        this.followed = r24;
        this.alert = r25;
        this.uma = r26;
        this.corpAction = r27;
        this.iconUrl = r28;
        this.wsHasUma = r29;
        this.wsHasNotasiKhusus = r30;
        this.wsHasCorpAction = r31;
        this.isOpen = r32;
        this.messageStatus = r33;
        this.lastPrice = r34;
        this.prevLast = r35;
        this.priceChange = r36;
        this.percentChange = r38;
        this.alertPrevValue = r39;
        this.hasNotation = r40;
        this.companySymbol = r41;
        this.lastPriceDouble = r42;
        this.formattedLastPrice = r43;
        this.formattedPercentage = r44;
        this.notations = r45;
    }

    public /* synthetic */ HotListCompany(String r44, boolean r45, String r46, String r47, long r48, String r50, String r51, String r52, String r53, String r54, String r55, String r56, Integer r57, String r58, String r59, String r60, String r61, String r62, String r63, Integer r64, String r65, String r66, Integer r67, Integer r68, boolean r69, CorpAction r70, String r71, boolean r72, boolean r73, boolean r74, boolean r75, int r76, String r77, Double r78, double r79, Double r81, Integer r82, boolean r83, String r84, Double r85, CharSequence r86, String r87, ArrayList r88, int r89, int r90, i r91) {
        if ((r89 & 1) == 0) goto L5;
        String r2 = null;
    L7:
        if ((r89 & 2) == 0) goto L9;
        boolean r4 = false;
    L11:
        if ((r89 & 4) == 0) goto L13;
        String r6 = null;
    L15:
        if ((r89 & 8) == 0) goto L17;
        String r7 = null;
    L19:
        if ((r89 & 16) == 0) goto L21;
        long r8 = 0;
    L23:
        if ((r89 & 32) == 0) goto L25;
        String r10 = null;
    L27:
        if ((r89 & 64) == 0) goto L29;
        String r11 = null;
    L31:
        if ((r89 & 128) == 0) goto L33;
        String r12 = null;
    L35:
        if ((r89 & 256) == 0) goto L37;
        String r13 = null;
    L39:
        if ((r89 & 512) == 0) goto L41;
        String r14 = null;
    L43:
        if ((r89 & 1024) == 0) goto L45;
        String r15 = null;
    L47:
        if ((r89 & 2048) == 0) goto L49;
        String r3 = null;
    L51:
        if ((r89 & 4096) == 0) goto L53;
        Integer r5 = 0;
    L54:
        String r16 = r2;
        if ((r89 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r22 = null;
    L58:
        String r452 = r22;
        if ((r89 & 16384) == 0) goto L61;
        String r23 = null;
    L63:
        if ((r89 & 32768) == 0) goto L65;
        String r17 = null;
    L67:
        if ((r89 & 65536) == 0) goto L69;
        String r18 = null;
    L71:
        if ((r89 & 131072) == 0) goto L73;
        String r19 = null;
    L75:
        if ((r89 & 262144) == 0) goto L77;
        String r20 = null;
    L79:
        if ((r89 & 524288) == 0) goto L81;
        Integer r21 = null;
    L83:
        if ((r89 & 1048576) == 0) goto L85;
        String r222 = null;
    L87:
        if ((r89 & 2097152) == 0) goto L89;
        String r232 = null;
    L91:
        if ((r89 & 4194304) == 0) goto L93;
        Integer r24 = null;
    L95:
        if ((r89 & 8388608) == 0) goto L97;
        Integer r25 = null;
    L99:
        if ((r89 & 16777216) == 0) goto L101;
        boolean r26 = false;
    L103:
        if ((r89 & 33554432) == 0) goto L105;
        CorpAction r27 = null;
    L107:
        if ((r89 & 67108864) == 0) goto L109;
        String r28 = null;
    L111:
        if ((r89 & 134217728) == 0) goto L113;
        boolean r29 = false;
    L115:
        if ((r89 & 268435456) == 0) goto L117;
        boolean r30 = false;
    L119:
        if ((r89 & 536870912) == 0) goto L121;
        boolean r31 = false;
    L123:
        if ((r89 & Ints.MAX_POWER_OF_TWO) == 0) goto L125;
        boolean r32 = false;
    L127:
        if ((r89 & Integer.MIN_VALUE) == 0) goto L129;
        int r02 = 0;
    L131:
        if ((r90 & 1) == 0) goto L133;
        String r33 = null;
    L135:
        if ((r90 & 2) == 0) goto L137;
        Double r34 = null;
    L139:
        if ((r90 & 4) == 0) goto L141;
        double r38 = 0.0d;
    L143:
        if ((r90 & 8) == 0) goto L145;
        Double r35 = null;
    L147:
        if ((r90 & 16) == 0) goto L149;
        Integer r40 = null;
    L151:
        if ((r90 & 32) == 0) goto L153;
        boolean r41 = false;
    L155:
        if ((r90 & 64) == 0) goto L157;
        String r42 = null;
    L158:
        int r442 = r02;
        if ((r90 & 128) == 0) goto L161;
        Double r03 = Double.valueOf(0.0d);
    L162:
        Double r462 = r03;
        if ((r90 & 256) == 0) goto L165;
        CharSequence r04 = null;
    L166:
        CharSequence r472 = r04;
        if ((r90 & 512) == 0) goto L169;
        String r05 = null;
    L171:
        if ((r90 & 1024) == 0) goto L174;
        ArrayList r892 = null;
    L175:
        this(r16, r4, r6, r7, r8, r10, r11, r12, r13, r14, r15, r3, r5, r452, r23, r17, r18, r19, r20, r21, r222, r232, r24, r25, r26, r27, r28, r29, r30, r31, r32, r442, r33, r34, r38, r35, r40, r41, r42, r462, r472, r05, r892);
        return;
    L174:
        r892 = r88;
        goto L175
    L169:
        r05 = r87;
        goto L171
    L165:
        r04 = r86;
        goto L166
    L161:
        r03 = r85;
        goto L162
    L157:
        r42 = r84;
        goto L158
    L153:
        r41 = r83;
        goto L155
    L149:
        r40 = r82;
        goto L151
    L145:
        r35 = r81;
        goto L147
    L141:
        r38 = r79;
        goto L143
    L137:
        r34 = r78;
        goto L139
    L133:
        r33 = r77;
        goto L135
    L129:
        r02 = r76;
        goto L131
    L125:
        r32 = r75;
        goto L127
    L121:
        r31 = r74;
        goto L123
    L117:
        r30 = r73;
        goto L119
    L113:
        r29 = r72;
        goto L115
    L109:
        r28 = r71;
        goto L111
    L105:
        r27 = r70;
        goto L107
    L101:
        r26 = r69;
        goto L103
    L97:
        r25 = r68;
        goto L99
    L93:
        r24 = r67;
        goto L95
    L89:
        r232 = r66;
        goto L91
    L85:
        r222 = r65;
        goto L87
    L81:
        r21 = r64;
        goto L83
    L77:
        r20 = r63;
        goto L79
    L73:
        r19 = r62;
        goto L75
    L69:
        r18 = r61;
        goto L71
    L65:
        r17 = r60;
        goto L67
    L61:
        r23 = r59;
        goto L63
    L57:
        r22 = r58;
        goto L58
    L53:
        r5 = r57;
        goto L54
    L49:
        r3 = r56;
        goto L51
    L45:
        r15 = r55;
        goto L47
    L41:
        r14 = r54;
        goto L43
    L37:
        r13 = r53;
        goto L39
    L33:
        r12 = r52;
        goto L35
    L29:
        r11 = r51;
        goto L31
    L25:
        r10 = r50;
        goto L27
    L21:
        r8 = r48;
        goto L23
    L17:
        r7 = r47;
        goto L19
    L13:
        r6 = r46;
        goto L15
    L9:
        r4 = r45;
        goto L11
    L5:
        r2 = r44;
        goto L7
    }
}
