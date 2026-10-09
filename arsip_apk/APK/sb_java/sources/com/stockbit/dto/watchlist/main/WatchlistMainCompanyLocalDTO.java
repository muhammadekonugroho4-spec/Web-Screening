package com.stockbit.dto.watchlist.main;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.primitives.Ints;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b#\n\u0002\u0010\t\n\u0002\bs\b\u0087\b\u0018\u00002\u00020\u0001BÓ\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010/\u001a\u00020\u0010\u0012\b\b\u0002\u00100\u001a\u00020\u0010\u0012\b\b\u0002\u00101\u001a\u00020\u0006\u0012\b\b\u0002\u00102\u001a\u00020\u0010\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u00105\u001a\u00020\u0010\u0012\b\b\u0002\u00106\u001a\u00020\u0010\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u00108\u001a\u00020\u0010\u0012\b\b\u0002\u00109\u001a\u00020\u0010\u0012\b\b\u0002\u0010:\u001a\u00020;¢\u0006\u0004\b<\u0010=J\t\u0010s\u001a\u00020\u0003HÆ\u0003J\t\u0010t\u001a\u00020\u0003HÆ\u0003J\t\u0010u\u001a\u00020\u0006HÆ\u0003J\t\u0010v\u001a\u00020\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010y\u001a\u00020\u0003HÆ\u0003J\t\u0010z\u001a\u00020\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010~\u001a\u00020\u0010HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0006HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0010HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010RJ\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010RJ\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010RJ\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010RJ\u0011\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010RJ\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010RJ\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010RJ\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010RJ\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010RJ\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010RJ\n\u0010\u009c\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0010HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0010HÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010¦\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010§\u0001\u001a\u00020;HÆ\u0003Jè\u0004\u0010¨\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010/\u001a\u00020\u00102\b\b\u0002\u00100\u001a\u00020\u00102\b\b\u0002\u00101\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u00102\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00105\u001a\u00020\u00102\b\b\u0002\u00106\u001a\u00020\u00102\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00108\u001a\u00020\u00102\b\b\u0002\u00109\u001a\u00020\u00102\b\b\u0002\u0010:\u001a\u00020;HÆ\u0001¢\u0006\u0003\u0010©\u0001J\u0016\u0010ª\u0001\u001a\u00020\u00102\t\u0010«\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\u000b\u0010¬\u0001\u001a\u00020\u0006HÖ\u0081\u0004J\u000b\u0010\u00ad\u0001\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010?R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010?R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010?R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010?R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010?R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010?R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010?R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010?R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010?R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010KR\u0016\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010BR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010?R\u0016\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010KR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010?R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010?R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010S\u001a\u0004\bQ\u0010RR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010?R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010S\u001a\u0004\bU\u0010RR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010?R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010S\u001a\u0004\bW\u0010RR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010?R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010S\u001a\u0004\bY\u0010RR\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010S\u001a\u0004\bZ\u0010RR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010?R\u0018\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010?R\u0018\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010?R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010?R\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010?R\u001a\u0010$\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010S\u001a\u0004\b`\u0010RR\u0018\u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010?R\u001a\u0010&\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010S\u001a\u0004\bb\u0010RR\u0018\u0010'\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010?R\u001a\u0010(\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010S\u001a\u0004\bd\u0010RR\u0018\u0010)\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010?R\u001a\u0010*\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010S\u001a\u0004\bf\u0010RR\u0018\u0010+\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010?R\u0018\u0010,\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010?R\u0018\u0010-\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010?R\u001a\u0010.\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010S\u001a\u0004\bj\u0010RR\u0016\u0010/\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010KR\u0016\u00100\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010KR\u0016\u00101\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010BR\u0016\u00102\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010KR\u0018\u00103\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010?R\u0018\u00104\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010?R\u0016\u00105\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010KR\u0016\u00106\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010KR\u0018\u00107\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010?R\u0016\u00108\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010KR\u0016\u00109\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010KR\u0016\u0010:\u001a\u00020;8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010r¨\u0006®\u0001"}, d2 = {"Lcom/stockbit/dto/watchlist/main/WatchlistMainCompanyLocalDTO;", "", Constants.KEY_ID, "", "watchlistGroupId", "sequenceNo", "", "symbol", "symbol2", "symbol3", AppMeasurementSdk.ConditionalUserProperty.NAME, "type", "country", "exchange", NotificationCompat.CATEGORY_STATUS, "isOpen", "", "messageStatus", "iconUrl", "uma", "formattedPrice", "last", "lastPriceRaw", "", "change", "priceChangeRaw", "percent", "percentChangeRaw", "previous", "previousRaw", "prevLastRaw", "volume", Constants.KEY_FREQUENCY, "value", "avgPrice", "bid", "bidRaw", "ask", "askRaw", "iep", "iepRaw", "iev", "ievRaw", "iepPercentageChange", "iepPriceChange", "netForeign", "netForeignRaw", "isShowNetForeign", "isOrderBookLoading", "iepIevTimeLeftSeconds", "tradeable", "notation", "prices", "hasActiveCorpAction", "isShowDayTradeMultiplier", "dayTradeMultiplier", "isTradingLimit", "isPinned", "updatedAt", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZZIZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZJ)V", "getId", "()Ljava/lang/String;", "getWatchlistGroupId", "getSequenceNo", "()I", "getSymbol", "getSymbol2", "getSymbol3", "getName", "getType", "getCountry", "getExchange", "getStatus", "()Z", "getMessageStatus", "getIconUrl", "getUma", "getFormattedPrice", "getLast", "getLastPriceRaw", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getChange", "getPriceChangeRaw", "getPercent", "getPercentChangeRaw", "getPrevious", "getPreviousRaw", "getPrevLastRaw", "getVolume", "getFrequency", "getValue", "getAvgPrice", "getBid", "getBidRaw", "getAsk", "getAskRaw", "getIep", "getIepRaw", "getIev", "getIevRaw", "getIepPercentageChange", "getIepPriceChange", "getNetForeign", "getNetForeignRaw", "getIepIevTimeLeftSeconds", "getTradeable", "getNotation", "getPrices", "getHasActiveCorpAction", "getDayTradeMultiplier", "getUpdatedAt", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZZIZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZJ)Lcom/stockbit/dto/watchlist/main/WatchlistMainCompanyLocalDTO;", "equals", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WatchlistMainCompanyLocalDTO {

    @SerializedName("ask")
    private final String ask;

    @SerializedName("askRaw")
    private final Double askRaw;

    @SerializedName("avgPrice")
    private final String avgPrice;

    @SerializedName("bid")
    private final String bid;

    @SerializedName("bidRaw")
    private final Double bidRaw;

    @SerializedName("change")
    private final String change;

    @SerializedName("country")
    private final String country;

    @SerializedName("dayTradeMultiplier")
    private final String dayTradeMultiplier;

    @SerializedName("exchange")
    private final String exchange;

    @SerializedName("formattedPrice")
    private final String formattedPrice;

    @SerializedName(Constants.KEY_FREQUENCY)
    private final String frequency;

    @SerializedName("hasActiveCorpAction")
    private final boolean hasActiveCorpAction;

    @SerializedName("iconUrl")
    private final String iconUrl;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final String f88718id;

    @SerializedName("iep")
    private final String iep;

    @SerializedName("iepIevTimeLeftSeconds")
    private final int iepIevTimeLeftSeconds;

    @SerializedName("iepPercentageChange")
    private final String iepPercentageChange;

    @SerializedName("iepPriceChange")
    private final String iepPriceChange;

    @SerializedName("iepRaw")
    private final Double iepRaw;

    @SerializedName("iev")
    private final String iev;

    @SerializedName("ievRaw")
    private final Double ievRaw;

    @SerializedName("isOpen")
    private final boolean isOpen;

    @SerializedName("isOrderBookLoading")
    private final boolean isOrderBookLoading;

    @SerializedName("isPinned")
    private final boolean isPinned;

    @SerializedName("isShowDayTradeMultiplier")
    private final boolean isShowDayTradeMultiplier;

    @SerializedName("isShowNetForeign")
    private final boolean isShowNetForeign;

    @SerializedName("isTradingLimit")
    private final boolean isTradingLimit;

    @SerializedName("last")
    private final String last;

    @SerializedName("lastPriceRaw")
    private final Double lastPriceRaw;

    @SerializedName("messageStatus")
    private final int messageStatus;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @SerializedName("netForeign")
    private final String netForeign;

    @SerializedName("netForeignRaw")
    private final Double netForeignRaw;

    @SerializedName("notation")
    private final String notation;

    @SerializedName("percent")
    private final String percent;

    @SerializedName("percentChangeRaw")
    private final Double percentChangeRaw;

    @SerializedName("prevLastRaw")
    private final Double prevLastRaw;

    @SerializedName("previous")
    private final String previous;

    @SerializedName("previousRaw")
    private final Double previousRaw;

    @SerializedName("priceChangeRaw")
    private final Double priceChangeRaw;

    @SerializedName("prices")
    private final String prices;

    @SerializedName("sequenceNo")
    private final int sequenceNo;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;

    @SerializedName("symbol")
    private final String symbol;

    @SerializedName("symbol2")
    private final String symbol2;

    @SerializedName("symbol3")
    private final String symbol3;

    @SerializedName("tradeable")
    private final boolean tradeable;

    @SerializedName("type")
    private final String type;

    @SerializedName("uma")
    private final boolean uma;

    @SerializedName("updatedAt")
    private final long updatedAt;

    @SerializedName("value")
    private final String value;

    @SerializedName("volume")
    private final String volume;

    @SerializedName("watchlistGroupId")
    private final String watchlistGroupId;

    public WatchlistMainCompanyLocalDTO(String r2, String r3, int r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, boolean r13, int r14, String r15, boolean r16, String r17, String r18, Double r19, String r20, Double r21, String r22, Double r23, String r24, Double r25, Double r26, String r27, String r28, String r29, String r30, String r31, Double r32, String r33, Double r34, String r35, Double r36, String r37, Double r38, String r39, String r40, String r41, Double r42, boolean r43, boolean r44, int r45, boolean r46, String r47, String r48, boolean r49, boolean r50, String r51, boolean r52, boolean r53, long r54) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "watchlistGroupId");
        p.l(r5, "symbol");
        p.l(r8, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r9, "type");
        this.f88718id = r2;
        this.watchlistGroupId = r3;
        this.sequenceNo = r4;
        this.symbol = r5;
        this.symbol2 = r6;
        this.symbol3 = r7;
        this.name = r8;
        this.type = r9;
        this.country = r10;
        this.exchange = r11;
        this.status = r12;
        this.isOpen = r13;
        this.messageStatus = r14;
        this.iconUrl = r15;
        this.uma = r16;
        this.formattedPrice = r17;
        this.last = r18;
        this.lastPriceRaw = r19;
        this.change = r20;
        this.priceChangeRaw = r21;
        this.percent = r22;
        this.percentChangeRaw = r23;
        this.previous = r24;
        this.previousRaw = r25;
        this.prevLastRaw = r26;
        this.volume = r27;
        this.frequency = r28;
        this.value = r29;
        this.avgPrice = r30;
        this.bid = r31;
        this.bidRaw = r32;
        this.ask = r33;
        this.askRaw = r34;
        this.iep = r35;
        this.iepRaw = r36;
        this.iev = r37;
        this.ievRaw = r38;
        this.iepPercentageChange = r39;
        this.iepPriceChange = r40;
        this.netForeign = r41;
        this.netForeignRaw = r42;
        this.isShowNetForeign = r43;
        this.isOrderBookLoading = r44;
        this.iepIevTimeLeftSeconds = r45;
        this.tradeable = r46;
        this.notation = r47;
        this.prices = r48;
        this.hasActiveCorpAction = r49;
        this.isShowDayTradeMultiplier = r50;
        this.dayTradeMultiplier = r51;
        this.isTradingLimit = r52;
        this.isPinned = r53;
        this.updatedAt = r54;
    }

    public static /* synthetic */ WatchlistMainCompanyLocalDTO b(WatchlistMainCompanyLocalDTO r23, String r24, String r25, int r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, String r34, boolean r35, int r36, String r37, boolean r38, String r39, String r40, Double r41, String r42, Double r43, String r44, Double r45, String r46, Double r47, Double r48, String r49, String r50, String r51, String r52, String r53, Double r54, String r55, Double r56, String r57, Double r58, String r59, Double r60, String r61, String r62, String r63, Double r64, boolean r65, boolean r66, int r67, boolean r68, String r69, String r70, boolean r71, boolean r72, String r73, boolean r74, boolean r75, long r76, int r78, int r79, Object r80) {
        if ((r78 & 1) == 0) goto L5;
        String r3 = r23.f88718id;
    L7:
        if ((r78 & 2) == 0) goto L9;
        String r4 = r23.watchlistGroupId;
    L11:
        if ((r78 & 4) == 0) goto L13;
        int r5 = r23.sequenceNo;
    L15:
        if ((r78 & 8) == 0) goto L17;
        String r6 = r23.symbol;
    L19:
        if ((r78 & 16) == 0) goto L21;
        String r7 = r23.symbol2;
    L23:
        if ((r78 & 32) == 0) goto L25;
        String r8 = r23.symbol3;
    L27:
        if ((r78 & 64) == 0) goto L29;
        String r9 = r23.name;
    L31:
        if ((r78 & 128) == 0) goto L33;
        String r10 = r23.type;
    L35:
        if ((r78 & 256) == 0) goto L37;
        String r11 = r23.country;
    L39:
        if ((r78 & 512) == 0) goto L41;
        String r12 = r23.exchange;
    L43:
        if ((r78 & 1024) == 0) goto L45;
        String r13 = r23.status;
    L47:
        if ((r78 & 2048) == 0) goto L49;
        boolean r14 = r23.isOpen;
    L51:
        if ((r78 & 4096) == 0) goto L53;
        int r15 = r23.messageStatus;
    L54:
        String r242 = r3;
        if ((r78 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r310 = r23.iconUrl;
    L58:
        String r252 = r310;
        if ((r78 & 16384) == 0) goto L61;
        boolean r311 = r23.uma;
    L63:
        if ((r78 & 32768) == 0) goto L65;
        String r1 = r23.formattedPrice;
    L66:
        String r262 = r1;
        if ((r78 & 65536) == 0) goto L69;
        String r16 = r23.last;
    L70:
        String r272 = r16;
        if ((r78 & 131072) == 0) goto L73;
        Double r17 = r23.lastPriceRaw;
    L74:
        Double r282 = r17;
        if ((r78 & 262144) == 0) goto L77;
        String r18 = r23.change;
    L78:
        String r292 = r18;
        if ((r78 & 524288) == 0) goto L81;
        Double r19 = r23.priceChangeRaw;
    L82:
        Double r302 = r19;
        if ((r78 & 1048576) == 0) goto L85;
        String r110 = r23.percent;
    L86:
        String r312 = r110;
        if ((r78 & 2097152) == 0) goto L89;
        Double r111 = r23.percentChangeRaw;
    L90:
        Double r322 = r111;
        if ((r78 & 4194304) == 0) goto L93;
        String r112 = r23.previous;
    L94:
        String r332 = r112;
        if ((r78 & 8388608) == 0) goto L97;
        Double r113 = r23.previousRaw;
    L98:
        Double r342 = r113;
        if ((r78 & 16777216) == 0) goto L101;
        Double r114 = r23.prevLastRaw;
    L102:
        Double r352 = r114;
        if ((r78 & 33554432) == 0) goto L105;
        String r115 = r23.volume;
    L106:
        String r362 = r115;
        if ((r78 & 67108864) == 0) goto L109;
        String r116 = r23.frequency;
    L110:
        String r372 = r116;
        if ((r78 & 134217728) == 0) goto L113;
        String r117 = r23.value;
    L114:
        String r382 = r117;
        if ((r78 & 268435456) == 0) goto L117;
        String r118 = r23.avgPrice;
    L118:
        String r392 = r118;
        if ((r78 & 536870912) == 0) goto L121;
        String r119 = r23.bid;
    L122:
        String r402 = r119;
        if ((r78 & Ints.MAX_POWER_OF_TWO) == 0) goto L125;
        Double r120 = r23.bidRaw;
    L126:
        Double r412 = r120;
        if ((r78 & Integer.MIN_VALUE) == 0) goto L129;
        String r121 = r23.ask;
    L130:
        String r422 = r121;
        if ((r79 & 1) == 0) goto L133;
        Double r122 = r23.askRaw;
    L134:
        Double r432 = r122;
        if ((r79 & 2) == 0) goto L137;
        String r123 = r23.iep;
    L138:
        String r442 = r123;
        if ((r79 & 4) == 0) goto L141;
        Double r124 = r23.iepRaw;
    L142:
        Double r452 = r124;
        if ((r79 & 8) == 0) goto L145;
        String r125 = r23.iev;
    L146:
        String r462 = r125;
        if ((r79 & 16) == 0) goto L149;
        Double r126 = r23.ievRaw;
    L150:
        Double r472 = r126;
        if ((r79 & 32) == 0) goto L153;
        String r127 = r23.iepPercentageChange;
    L154:
        String r482 = r127;
        if ((r79 & 64) == 0) goto L157;
        String r128 = r23.iepPriceChange;
    L158:
        String r492 = r128;
        if ((r79 & 128) == 0) goto L161;
        String r129 = r23.netForeign;
    L162:
        String r502 = r129;
        if ((r79 & 256) == 0) goto L165;
        Double r130 = r23.netForeignRaw;
    L166:
        Double r512 = r130;
        if ((r79 & 512) == 0) goto L169;
        boolean r131 = r23.isShowNetForeign;
    L170:
        boolean r522 = r131;
        if ((r79 & 1024) == 0) goto L173;
        boolean r132 = r23.isOrderBookLoading;
    L174:
        boolean r532 = r132;
        if ((r79 & 2048) == 0) goto L177;
        int r133 = r23.iepIevTimeLeftSeconds;
    L178:
        int r542 = r133;
        if ((r79 & 4096) == 0) goto L181;
        boolean r134 = r23.tradeable;
    L182:
        boolean r552 = r134;
        if ((r79 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L185;
        String r135 = r23.notation;
    L186:
        String r562 = r135;
        if ((r79 & 16384) == 0) goto L189;
        String r136 = r23.prices;
    L190:
        String r572 = r136;
        if ((r79 & 32768) == 0) goto L193;
        boolean r137 = r23.hasActiveCorpAction;
    L194:
        boolean r582 = r137;
        if ((r79 & 65536) == 0) goto L197;
        boolean r138 = r23.isShowDayTradeMultiplier;
    L198:
        boolean r592 = r138;
        if ((r79 & 131072) == 0) goto L201;
        String r139 = r23.dayTradeMultiplier;
    L202:
        String r602 = r139;
        if ((r79 & 262144) == 0) goto L205;
        boolean r140 = r23.isTradingLimit;
    L206:
        boolean r612 = r140;
        if ((r79 & 524288) == 0) goto L209;
        boolean r141 = r23.isPinned;
    L211:
        if ((r79 & 1048576) == 0) goto L214;
        boolean r622 = r141;
        boolean r762 = r622;
        long r77 = r23.updatedAt;
        String r632 = r492;
        String r642 = r502;
        Double r652 = r512;
        boolean r662 = r522;
        boolean r672 = r532;
        int r682 = r542;
        boolean r692 = r552;
        String r702 = r562;
        String r712 = r572;
        boolean r722 = r582;
        boolean r732 = r592;
        String r742 = r602;
        boolean r752 = r612;
        Double r493 = r352;
        String r503 = r362;
        String r513 = r372;
        String r523 = r382;
        String r533 = r392;
        String r543 = r402;
        Double r553 = r412;
        String r563 = r422;
        Double r573 = r432;
        String r583 = r442;
        Double r593 = r452;
        String r603 = r462;
        Double r613 = r472;
        String r623 = r482;
        boolean r393 = r311;
        String r353 = r13;
        boolean r363 = r14;
        int r373 = r15;
        String r383 = r252;
        String r403 = r262;
        String r413 = r272;
        Double r423 = r282;
        String r433 = r292;
        Double r443 = r302;
        String r453 = r312;
        Double r463 = r322;
        String r473 = r332;
        Double r483 = r342;
        String r263 = r4;
        int r273 = r5;
        String r283 = r6;
        String r293 = r7;
        String r303 = r8;
        String r313 = r9;
        String r323 = r10;
        String r333 = r11;
        String r343 = r12;
    L216:
        return r23.a(r242, r263, r273, r283, r293, r303, r313, r323, r333, r343, r353, r363, r373, r383, r393, r403, r413, r423, r433, r443, r453, r463, r473, r483, r493, r503, r513, r523, r533, r543, r553, r563, r573, r583, r593, r603, r613, r623, r632, r642, r652, r662, r672, r682, r692, r702, r712, r722, r732, r742, r752, r762, r77);
    L214:
        r77 = r76;
        r762 = r141;
        r623 = r482;
        r632 = r492;
        r642 = r502;
        r652 = r512;
        r662 = r522;
        r672 = r532;
        r682 = r542;
        r692 = r552;
        r702 = r562;
        r712 = r572;
        r722 = r582;
        r732 = r592;
        r742 = r602;
        r752 = r612;
        r483 = r342;
        r493 = r352;
        r503 = r362;
        r513 = r372;
        r523 = r382;
        r533 = r392;
        r543 = r402;
        r553 = r412;
        r563 = r422;
        r573 = r432;
        r583 = r442;
        r593 = r452;
        r603 = r462;
        r613 = r472;
        r393 = r311;
        r343 = r12;
        r353 = r13;
        r363 = r14;
        r373 = r15;
        r383 = r252;
        r403 = r262;
        r413 = r272;
        r423 = r282;
        r433 = r292;
        r443 = r302;
        r453 = r312;
        r463 = r322;
        r473 = r332;
        r263 = r4;
        r273 = r5;
        r283 = r6;
        r293 = r7;
        r303 = r8;
        r313 = r9;
        r323 = r10;
        r333 = r11;
        goto L216
    L209:
        r141 = r75;
        goto L211
    L205:
        r140 = r74;
        goto L206
    L201:
        r139 = r73;
        goto L202
    L197:
        r138 = r72;
        goto L198
    L193:
        r137 = r71;
        goto L194
    L189:
        r136 = r70;
        goto L190
    L185:
        r135 = r69;
        goto L186
    L181:
        r134 = r68;
        goto L182
    L177:
        r133 = r67;
        goto L178
    L173:
        r132 = r66;
        goto L174
    L169:
        r131 = r65;
        goto L170
    L165:
        r130 = r64;
        goto L166
    L161:
        r129 = r63;
        goto L162
    L157:
        r128 = r62;
        goto L158
    L153:
        r127 = r61;
        goto L154
    L149:
        r126 = r60;
        goto L150
    L145:
        r125 = r59;
        goto L146
    L141:
        r124 = r58;
        goto L142
    L137:
        r123 = r57;
        goto L138
    L133:
        r122 = r56;
        goto L134
    L129:
        r121 = r55;
        goto L130
    L125:
        r120 = r54;
        goto L126
    L121:
        r119 = r53;
        goto L122
    L117:
        r118 = r52;
        goto L118
    L113:
        r117 = r51;
        goto L114
    L109:
        r116 = r50;
        goto L110
    L105:
        r115 = r49;
        goto L106
    L101:
        r114 = r48;
        goto L102
    L97:
        r113 = r47;
        goto L98
    L93:
        r112 = r46;
        goto L94
    L89:
        r111 = r45;
        goto L90
    L85:
        r110 = r44;
        goto L86
    L81:
        r19 = r43;
        goto L82
    L77:
        r18 = r42;
        goto L78
    L73:
        r17 = r41;
        goto L74
    L69:
        r16 = r40;
        goto L70
    L65:
        r1 = r39;
        goto L66
    L61:
        r311 = r38;
        goto L63
    L57:
        r310 = r37;
        goto L58
    L53:
        r15 = r36;
        goto L54
    L49:
        r14 = r35;
        goto L51
    L45:
        r13 = r34;
        goto L47
    L41:
        r12 = r33;
        goto L43
    L37:
        r11 = r32;
        goto L39
    L33:
        r10 = r31;
        goto L35
    L29:
        r9 = r30;
        goto L31
    L25:
        r8 = r29;
        goto L27
    L21:
        r7 = r28;
        goto L23
    L17:
        r6 = r27;
        goto L19
    L13:
        r5 = r26;
        goto L15
    L9:
        r4 = r25;
        goto L11
    L5:
        r3 = r24;
        goto L7
    }

    public final String A() {
        return this.name;
    }

    public final String B() {
        return this.netForeign;
    }

    public final Double C() {
        return this.netForeignRaw;
    }

    public final String D() {
        return this.notation;
    }

    public final String E() {
        return this.percent;
    }

    public final Double F() {
        return this.percentChangeRaw;
    }

    public final Double G() {
        return this.prevLastRaw;
    }

    public final String H() {
        return this.previous;
    }

    public final Double I() {
        return this.previousRaw;
    }

    public final Double J() {
        return this.priceChangeRaw;
    }

    public final String K() {
        return this.prices;
    }

    public final int L() {
        return this.sequenceNo;
    }

    public final String M() {
        return this.status;
    }

    public final String N() {
        return this.symbol;
    }

    public final String O() {
        return this.symbol2;
    }

    public final String P() {
        return this.symbol3;
    }

    public final boolean Q() {
        return this.tradeable;
    }

    public final String R() {
        return this.type;
    }

    public final boolean S() {
        return this.uma;
    }

    public final long T() {
        return this.updatedAt;
    }

    public final String U() {
        return this.value;
    }

    public final String V() {
        return this.volume;
    }

    public final String W() {
        return this.watchlistGroupId;
    }

    public final boolean X() {
        return this.isOpen;
    }

    public final boolean Y() {
        return this.isOrderBookLoading;
    }

    public final boolean Z() {
        return this.isPinned;
    }

    public final WatchlistMainCompanyLocalDTO a(String r57, String r58, int r59, String r60, String r61, String r62, String r63, String r64, String r65, String r66, String r67, boolean r68, int r69, String r70, boolean r71, String r72, String r73, Double r74, String r75, Double r76, String r77, Double r78, String r79, Double r80, Double r81, String r82, String r83, String r84, String r85, String r86, Double r87, String r88, Double r89, String r90, Double r91, String r92, Double r93, String r94, String r95, String r96, Double r97, boolean r98, boolean r99, int r100, boolean r101, String r102, String r103, boolean r104, boolean r105, String r106, boolean r107, boolean r108, long r109) {
        p.l(r57, Constants.KEY_ID);
        p.l(r58, "watchlistGroupId");
        p.l(r60, "symbol");
        p.l(r63, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r64, "type");
        return new WatchlistMainCompanyLocalDTO(r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109);
    }

    public final boolean a0() {
        return this.isShowDayTradeMultiplier;
    }

    public final boolean b0() {
        return this.isShowNetForeign;
    }

    public final String c() {
        return this.ask;
    }

    public final boolean c0() {
        return this.isTradingLimit;
    }

    public final Double d() {
        return this.askRaw;
    }

    public final String e() {
        return this.avgPrice;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof WatchlistMainCompanyLocalDTO) == true) goto L8;
        return false;
    L8:
        WatchlistMainCompanyLocalDTO r82 = (WatchlistMainCompanyLocalDTO) r8;
        if (p.g(this.f88718id, r82.f88718id) == true) goto L12;
        return false;
    L12:
        if (p.g(this.watchlistGroupId, r82.watchlistGroupId) == true) goto L15;
        return false;
    L15:
        if (this.sequenceNo == r82.sequenceNo) goto L18;
        return false;
    L18:
        if (p.g(this.symbol, r82.symbol) == true) goto L21;
        return false;
    L21:
        if (p.g(this.symbol2, r82.symbol2) == true) goto L24;
        return false;
    L24:
        if (p.g(this.symbol3, r82.symbol3) == true) goto L27;
        return false;
    L27:
        if (p.g(this.name, r82.name) == true) goto L30;
        return false;
    L30:
        if (p.g(this.type, r82.type) == true) goto L33;
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
        if (this.isOpen == r82.isOpen) goto L45;
        return false;
    L45:
        if (this.messageStatus == r82.messageStatus) goto L48;
        return false;
    L48:
        if (p.g(this.iconUrl, r82.iconUrl) == true) goto L51;
        return false;
    L51:
        if (this.uma == r82.uma) goto L54;
        return false;
    L54:
        if (p.g(this.formattedPrice, r82.formattedPrice) == true) goto L57;
        return false;
    L57:
        if (p.g(this.last, r82.last) == true) goto L60;
        return false;
    L60:
        if (p.g(this.lastPriceRaw, r82.lastPriceRaw) == true) goto L63;
        return false;
    L63:
        if (p.g(this.change, r82.change) == true) goto L66;
        return false;
    L66:
        if (p.g(this.priceChangeRaw, r82.priceChangeRaw) == true) goto L69;
        return false;
    L69:
        if (p.g(this.percent, r82.percent) == true) goto L72;
        return false;
    L72:
        if (p.g(this.percentChangeRaw, r82.percentChangeRaw) == true) goto L75;
        return false;
    L75:
        if (p.g(this.previous, r82.previous) == true) goto L78;
        return false;
    L78:
        if (p.g(this.previousRaw, r82.previousRaw) == true) goto L81;
        return false;
    L81:
        if (p.g(this.prevLastRaw, r82.prevLastRaw) == true) goto L84;
        return false;
    L84:
        if (p.g(this.volume, r82.volume) == true) goto L87;
        return false;
    L87:
        if (p.g(this.frequency, r82.frequency) == true) goto L90;
        return false;
    L90:
        if (p.g(this.value, r82.value) == true) goto L93;
        return false;
    L93:
        if (p.g(this.avgPrice, r82.avgPrice) == true) goto L96;
        return false;
    L96:
        if (p.g(this.bid, r82.bid) == true) goto L99;
        return false;
    L99:
        if (p.g(this.bidRaw, r82.bidRaw) == true) goto L102;
        return false;
    L102:
        if (p.g(this.ask, r82.ask) == true) goto L105;
        return false;
    L105:
        if (p.g(this.askRaw, r82.askRaw) == true) goto L108;
        return false;
    L108:
        if (p.g(this.iep, r82.iep) == true) goto L111;
        return false;
    L111:
        if (p.g(this.iepRaw, r82.iepRaw) == true) goto L114;
        return false;
    L114:
        if (p.g(this.iev, r82.iev) == true) goto L117;
        return false;
    L117:
        if (p.g(this.ievRaw, r82.ievRaw) == true) goto L120;
        return false;
    L120:
        if (p.g(this.iepPercentageChange, r82.iepPercentageChange) == true) goto L123;
        return false;
    L123:
        if (p.g(this.iepPriceChange, r82.iepPriceChange) == true) goto L126;
        return false;
    L126:
        if (p.g(this.netForeign, r82.netForeign) == true) goto L129;
        return false;
    L129:
        if (p.g(this.netForeignRaw, r82.netForeignRaw) == true) goto L132;
        return false;
    L132:
        if (this.isShowNetForeign == r82.isShowNetForeign) goto L135;
        return false;
    L135:
        if (this.isOrderBookLoading == r82.isOrderBookLoading) goto L138;
        return false;
    L138:
        if (this.iepIevTimeLeftSeconds == r82.iepIevTimeLeftSeconds) goto L141;
        return false;
    L141:
        if (this.tradeable == r82.tradeable) goto L144;
        return false;
    L144:
        if (p.g(this.notation, r82.notation) == true) goto L147;
        return false;
    L147:
        if (p.g(this.prices, r82.prices) == true) goto L150;
        return false;
    L150:
        if (this.hasActiveCorpAction == r82.hasActiveCorpAction) goto L153;
        return false;
    L153:
        if (this.isShowDayTradeMultiplier == r82.isShowDayTradeMultiplier) goto L156;
        return false;
    L156:
        if (p.g(this.dayTradeMultiplier, r82.dayTradeMultiplier) == true) goto L159;
        return false;
    L159:
        if (this.isTradingLimit == r82.isTradingLimit) goto L162;
        return false;
    L162:
        if (this.isPinned == r82.isPinned) goto L165;
        return false;
    L165:
        if (this.updatedAt == r82.updatedAt) goto L167;
        return false;
    L167:
        return true;
    }

    public final String f() {
        return this.bid;
    }

    public final Double g() {
        return this.bidRaw;
    }

    public final String h() {
        return this.change;
    }

    public int hashCode() {
        int r02 = ((((((this.f88718id.hashCode() * 31) + this.watchlistGroupId.hashCode()) * 31) + Integer.hashCode(this.sequenceNo)) * 31) + this.symbol.hashCode()) * 31;
        String r1 = this.symbol2;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.symbol3;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (((((r03 + r14) * 31) + this.name.hashCode()) * 31) + this.type.hashCode()) * 31;
        String r15 = this.country;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        String r17 = this.exchange;
        if (r17 != null) goto L17;
        int r18 = 0;
    L18:
        int r06 = (r05 + r18) * 31;
        String r19 = this.status;
        if (r19 != null) goto L21;
        int r110 = 0;
    L22:
        int r07 = (((((r06 + r110) * 31) + Boolean.hashCode(this.isOpen)) * 31) + Integer.hashCode(this.messageStatus)) * 31;
        String r111 = this.iconUrl;
        if (r111 != null) goto L25;
        int r112 = 0;
    L26:
        int r08 = (((r07 + r112) * 31) + Boolean.hashCode(this.uma)) * 31;
        String r113 = this.formattedPrice;
        if (r113 != null) goto L29;
        int r114 = 0;
    L30:
        int r09 = (r08 + r114) * 31;
        String r115 = this.last;
        if (r115 != null) goto L33;
        int r116 = 0;
    L34:
        int r010 = (r09 + r116) * 31;
        Double r117 = this.lastPriceRaw;
        if (r117 != null) goto L37;
        int r118 = 0;
    L38:
        int r011 = (r010 + r118) * 31;
        String r119 = this.change;
        if (r119 != null) goto L41;
        int r120 = 0;
    L42:
        int r012 = (r011 + r120) * 31;
        Double r121 = this.priceChangeRaw;
        if (r121 != null) goto L45;
        int r122 = 0;
    L46:
        int r013 = (r012 + r122) * 31;
        String r123 = this.percent;
        if (r123 != null) goto L49;
        int r124 = 0;
    L50:
        int r014 = (r013 + r124) * 31;
        Double r125 = this.percentChangeRaw;
        if (r125 != null) goto L53;
        int r126 = 0;
    L54:
        int r015 = (r014 + r126) * 31;
        String r127 = this.previous;
        if (r127 != null) goto L57;
        int r128 = 0;
    L58:
        int r016 = (r015 + r128) * 31;
        Double r129 = this.previousRaw;
        if (r129 != null) goto L61;
        int r130 = 0;
    L62:
        int r017 = (r016 + r130) * 31;
        Double r131 = this.prevLastRaw;
        if (r131 != null) goto L65;
        int r132 = 0;
    L66:
        int r018 = (r017 + r132) * 31;
        String r133 = this.volume;
        if (r133 != null) goto L69;
        int r134 = 0;
    L70:
        int r019 = (r018 + r134) * 31;
        String r135 = this.frequency;
        if (r135 != null) goto L73;
        int r136 = 0;
    L74:
        int r020 = (r019 + r136) * 31;
        String r137 = this.value;
        if (r137 != null) goto L77;
        int r138 = 0;
    L78:
        int r021 = (r020 + r138) * 31;
        String r139 = this.avgPrice;
        if (r139 != null) goto L81;
        int r140 = 0;
    L82:
        int r022 = (r021 + r140) * 31;
        String r141 = this.bid;
        if (r141 != null) goto L85;
        int r142 = 0;
    L86:
        int r023 = (r022 + r142) * 31;
        Double r143 = this.bidRaw;
        if (r143 != null) goto L89;
        int r144 = 0;
    L90:
        int r024 = (r023 + r144) * 31;
        String r145 = this.ask;
        if (r145 != null) goto L93;
        int r146 = 0;
    L94:
        int r025 = (r024 + r146) * 31;
        Double r147 = this.askRaw;
        if (r147 != null) goto L97;
        int r148 = 0;
    L98:
        int r026 = (r025 + r148) * 31;
        String r149 = this.iep;
        if (r149 != null) goto L101;
        int r150 = 0;
    L102:
        int r027 = (r026 + r150) * 31;
        Double r151 = this.iepRaw;
        if (r151 != null) goto L105;
        int r152 = 0;
    L106:
        int r028 = (r027 + r152) * 31;
        String r153 = this.iev;
        if (r153 != null) goto L109;
        int r154 = 0;
    L110:
        int r029 = (r028 + r154) * 31;
        Double r155 = this.ievRaw;
        if (r155 != null) goto L113;
        int r156 = 0;
    L114:
        int r030 = (r029 + r156) * 31;
        String r157 = this.iepPercentageChange;
        if (r157 != null) goto L117;
        int r158 = 0;
    L118:
        int r031 = (r030 + r158) * 31;
        String r159 = this.iepPriceChange;
        if (r159 != null) goto L121;
        int r160 = 0;
    L122:
        int r032 = (r031 + r160) * 31;
        String r161 = this.netForeign;
        if (r161 != null) goto L125;
        int r162 = 0;
    L126:
        int r033 = (r032 + r162) * 31;
        Double r163 = this.netForeignRaw;
        if (r163 != null) goto L129;
        int r164 = 0;
    L130:
        int r034 = (((((((((r033 + r164) * 31) + Boolean.hashCode(this.isShowNetForeign)) * 31) + Boolean.hashCode(this.isOrderBookLoading)) * 31) + Integer.hashCode(this.iepIevTimeLeftSeconds)) * 31) + Boolean.hashCode(this.tradeable)) * 31;
        String r165 = this.notation;
        if (r165 != null) goto L133;
        int r166 = 0;
    L134:
        int r035 = (r034 + r166) * 31;
        String r167 = this.prices;
        if (r167 != null) goto L137;
        int r168 = 0;
    L138:
        int r036 = (((((r035 + r168) * 31) + Boolean.hashCode(this.hasActiveCorpAction)) * 31) + Boolean.hashCode(this.isShowDayTradeMultiplier)) * 31;
        String r169 = this.dayTradeMultiplier;
        if (r169 == null) goto L143;
        r2 = r169.hashCode();
    L143:
        return ((((((r036 + r2) * 31) + Boolean.hashCode(this.isTradingLimit)) * 31) + Boolean.hashCode(this.isPinned)) * 31) + Long.hashCode(this.updatedAt);
    L137:
        r168 = r167.hashCode();
        goto L138
    L133:
        r166 = r165.hashCode();
        goto L134
    L129:
        r164 = r163.hashCode();
        goto L130
    L125:
        r162 = r161.hashCode();
        goto L126
    L121:
        r160 = r159.hashCode();
        goto L122
    L117:
        r158 = r157.hashCode();
        goto L118
    L113:
        r156 = r155.hashCode();
        goto L114
    L109:
        r154 = r153.hashCode();
        goto L110
    L105:
        r152 = r151.hashCode();
        goto L106
    L101:
        r150 = r149.hashCode();
        goto L102
    L97:
        r148 = r147.hashCode();
        goto L98
    L93:
        r146 = r145.hashCode();
        goto L94
    L89:
        r144 = r143.hashCode();
        goto L90
    L85:
        r142 = r141.hashCode();
        goto L86
    L81:
        r140 = r139.hashCode();
        goto L82
    L77:
        r138 = r137.hashCode();
        goto L78
    L73:
        r136 = r135.hashCode();
        goto L74
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

    public final String i() {
        return this.country;
    }

    public final String j() {
        return this.dayTradeMultiplier;
    }

    public final String k() {
        return this.exchange;
    }

    public final String l() {
        return this.formattedPrice;
    }

    public final String m() {
        return this.frequency;
    }

    public final boolean n() {
        return this.hasActiveCorpAction;
    }

    public final String o() {
        return this.iconUrl;
    }

    public final String p() {
        return this.f88718id;
    }

    public final String q() {
        return this.iep;
    }

    public final int r() {
        return this.iepIevTimeLeftSeconds;
    }

    public final String s() {
        return this.iepPercentageChange;
    }

    public final String t() {
        return this.iepPriceChange;
    }

    public String toString() {
        return "WatchlistMainCompanyLocalDTO(id=" + this.f88718id + ", watchlistGroupId=" + this.watchlistGroupId + ", sequenceNo=" + this.sequenceNo + ", symbol=" + this.symbol + ", symbol2=" + this.symbol2 + ", symbol3=" + this.symbol3 + ", name=" + this.name + ", type=" + this.type + ", country=" + this.country + ", exchange=" + this.exchange + ", status=" + this.status + ", isOpen=" + this.isOpen + ", messageStatus=" + this.messageStatus + ", iconUrl=" + this.iconUrl + ", uma=" + this.uma + ", formattedPrice=" + this.formattedPrice + ", last=" + this.last + ", lastPriceRaw=" + this.lastPriceRaw + ", change=" + this.change + ", priceChangeRaw=" + this.priceChangeRaw + ", percent=" + this.percent + ", percentChangeRaw=" + this.percentChangeRaw + ", previous=" + this.previous + ", previousRaw=" + this.previousRaw + ", prevLastRaw=" + this.prevLastRaw + ", volume=" + this.volume + ", frequency=" + this.frequency + ", value=" + this.value + ", avgPrice=" + this.avgPrice + ", bid=" + this.bid + ", bidRaw=" + this.bidRaw + ", ask=" + this.ask + ", askRaw=" + this.askRaw + ", iep=" + this.iep + ", iepRaw=" + this.iepRaw + ", iev=" + this.iev + ", ievRaw=" + this.ievRaw + ", iepPercentageChange=" + this.iepPercentageChange + ", iepPriceChange=" + this.iepPriceChange + ", netForeign=" + this.netForeign + ", netForeignRaw=" + this.netForeignRaw + ", isShowNetForeign=" + this.isShowNetForeign + ", isOrderBookLoading=" + this.isOrderBookLoading + ", iepIevTimeLeftSeconds=" + this.iepIevTimeLeftSeconds + ", tradeable=" + this.tradeable + ", notation=" + this.notation + ", prices=" + this.prices + ", hasActiveCorpAction=" + this.hasActiveCorpAction + ", isShowDayTradeMultiplier=" + this.isShowDayTradeMultiplier + ", dayTradeMultiplier=" + this.dayTradeMultiplier + ", isTradingLimit=" + this.isTradingLimit + ", isPinned=" + this.isPinned + ", updatedAt=" + this.updatedAt + ")";
    }

    public final Double u() {
        return this.iepRaw;
    }

    public final String v() {
        return this.iev;
    }

    public final Double w() {
        return this.ievRaw;
    }

    public final String x() {
        return this.last;
    }

    public final Double y() {
        return this.lastPriceRaw;
    }

    public final int z() {
        return this.messageStatus;
    }

    public /* synthetic */ WatchlistMainCompanyLocalDTO(String r60, String r61, int r62, String r63, String r64, String r65, String r66, String r67, String r68, String r69, String r70, boolean r71, int r72, String r73, boolean r74, String r75, String r76, Double r77, String r78, Double r79, String r80, Double r81, String r82, Double r83, Double r84, String r85, String r86, String r87, String r88, String r89, Double r90, String r91, Double r92, String r93, Double r94, String r95, Double r96, String r97, String r98, String r99, Double r100, boolean r101, boolean r102, int r103, boolean r104, String r105, String r106, boolean r107, boolean r108, String r109, boolean r110, boolean r111, long r112, int r114, int r115, i r116) {
        if ((r114 & 16) == 0) goto L5;
        String r9 = null;
    L7:
        if ((r114 & 32) == 0) goto L9;
        String r10 = null;
    L11:
        if ((r114 & 256) == 0) goto L13;
        String r13 = null;
    L15:
        if ((r114 & 512) == 0) goto L17;
        String r14 = null;
    L19:
        if ((r114 & 1024) == 0) goto L21;
        String r15 = null;
    L23:
        if ((r114 & 2048) == 0) goto L25;
        boolean r16 = false;
    L27:
        if ((r114 & 4096) == 0) goto L29;
        int r17 = 0;
    L31:
        if ((r114 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L33;
        String r18 = null;
    L35:
        if ((r114 & 16384) == 0) goto L37;
        boolean r19 = false;
    L39:
        if ((r114 & 32768) == 0) goto L41;
        String r20 = null;
    L43:
        if ((r114 & 65536) == 0) goto L45;
        String r21 = null;
    L47:
        if ((r114 & 131072) == 0) goto L49;
        Double r22 = null;
    L51:
        if ((r114 & 262144) == 0) goto L53;
        String r23 = null;
    L55:
        if ((r114 & 524288) == 0) goto L57;
        Double r24 = null;
    L59:
        if ((r114 & 1048576) == 0) goto L61;
        String r25 = null;
    L63:
        if ((2097152 & r114) == 0) goto L65;
        Double r26 = null;
    L67:
        if ((4194304 & r114) == 0) goto L69;
        String r27 = null;
    L71:
        if ((8388608 & r114) == 0) goto L73;
        Double r28 = null;
    L75:
        if ((16777216 & r114) == 0) goto L77;
        Double r29 = null;
    L79:
        if ((33554432 & r114) == 0) goto L81;
        String r30 = null;
    L83:
        if ((67108864 & r114) == 0) goto L85;
        String r31 = null;
    L87:
        if ((134217728 & r114) == 0) goto L89;
        String r32 = null;
    L91:
        if ((268435456 & r114) == 0) goto L93;
        String r33 = null;
    L95:
        if ((536870912 & r114) == 0) goto L97;
        String r34 = null;
    L99:
        if ((1073741824 & r114) == 0) goto L101;
        Double r35 = null;
    L103:
        if ((r114 & Integer.MIN_VALUE) == 0) goto L105;
        String r36 = null;
    L107:
        if ((r115 & 1) == 0) goto L109;
        Double r37 = null;
    L111:
        if ((r115 & 2) == 0) goto L113;
        String r38 = null;
    L115:
        if ((r115 & 4) == 0) goto L117;
        Double r39 = null;
    L119:
        if ((r115 & 8) == 0) goto L121;
        String r40 = null;
    L123:
        if ((r115 & 16) == 0) goto L125;
        Double r41 = null;
    L127:
        if ((r115 & 32) == 0) goto L129;
        String r42 = null;
    L131:
        if ((r115 & 64) == 0) goto L133;
        String r43 = null;
    L135:
        if ((r115 & 128) == 0) goto L137;
        String r44 = null;
    L139:
        if ((r115 & 256) == 0) goto L141;
        Double r45 = null;
    L143:
        if ((r115 & 512) == 0) goto L145;
        boolean r46 = false;
    L147:
        if ((r115 & 1024) == 0) goto L149;
        boolean r47 = false;
    L151:
        if ((r115 & 2048) == 0) goto L153;
        int r48 = 0;
    L155:
        if ((r115 & 4096) == 0) goto L157;
        boolean r49 = false;
    L159:
        if ((r115 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L161;
        String r50 = null;
    L163:
        if ((r115 & 16384) == 0) goto L165;
        String r51 = null;
    L167:
        if ((r115 & 32768) == 0) goto L169;
        boolean r52 = false;
    L171:
        if ((r115 & 65536) == 0) goto L173;
        boolean r53 = false;
    L175:
        if ((r115 & 131072) == 0) goto L177;
        String r54 = null;
    L179:
        if ((r115 & 262144) == 0) goto L181;
        boolean r55 = false;
    L183:
        if ((r115 & 524288) == 0) goto L185;
        boolean r56 = false;
    L187:
        if ((r115 & 1048576) == 0) goto L190;
        long r57 = 0;
    L191:
        this(r60, r61, r62, r63, r9, r10, r66, r67, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57);
        return;
    L190:
        r57 = r112;
        goto L191
    L185:
        r56 = r111;
        goto L187
    L181:
        r55 = r110;
        goto L183
    L177:
        r54 = r109;
        goto L179
    L173:
        r53 = r108;
        goto L175
    L169:
        r52 = r107;
        goto L171
    L165:
        r51 = r106;
        goto L167
    L161:
        r50 = r105;
        goto L163
    L157:
        r49 = r104;
        goto L159
    L153:
        r48 = r103;
        goto L155
    L149:
        r47 = r102;
        goto L151
    L145:
        r46 = r101;
        goto L147
    L141:
        r45 = r100;
        goto L143
    L137:
        r44 = r99;
        goto L139
    L133:
        r43 = r98;
        goto L135
    L129:
        r42 = r97;
        goto L131
    L125:
        r41 = r96;
        goto L127
    L121:
        r40 = r95;
        goto L123
    L117:
        r39 = r94;
        goto L119
    L113:
        r38 = r93;
        goto L115
    L109:
        r37 = r92;
        goto L111
    L105:
        r36 = r91;
        goto L107
    L101:
        r35 = r90;
        goto L103
    L97:
        r34 = r89;
        goto L99
    L93:
        r33 = r88;
        goto L95
    L89:
        r32 = r87;
        goto L91
    L85:
        r31 = r86;
        goto L87
    L81:
        r30 = r85;
        goto L83
    L77:
        r29 = r84;
        goto L79
    L73:
        r28 = r83;
        goto L75
    L69:
        r27 = r82;
        goto L71
    L65:
        r26 = r81;
        goto L67
    L61:
        r25 = r80;
        goto L63
    L57:
        r24 = r79;
        goto L59
    L53:
        r23 = r78;
        goto L55
    L49:
        r22 = r77;
        goto L51
    L45:
        r21 = r76;
        goto L47
    L41:
        r20 = r75;
        goto L43
    L37:
        r19 = r74;
        goto L39
    L33:
        r18 = r73;
        goto L35
    L29:
        r17 = r72;
        goto L31
    L25:
        r16 = r71;
        goto L27
    L21:
        r15 = r70;
        goto L23
    L17:
        r14 = r69;
        goto L19
    L13:
        r13 = r68;
        goto L15
    L9:
        r10 = r65;
        goto L11
    L5:
        r9 = r64;
        goto L7
    }
}
