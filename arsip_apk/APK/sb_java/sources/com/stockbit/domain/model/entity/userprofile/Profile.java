package com.stockbit.domain.model.entity.userprofile;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.common.primitives.Ints;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\b¹\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bù\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010,\u001a\u00020\u000f\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010.\u001a\u00020\u000f\u0012\b\b\u0002\u0010/\u001a\u00020\u000f\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u00102\u001a\u00020\t\u0012\b\b\u0002\u00103\u001a\u00020\u000f\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000105\u0012\b\b\u0002\u00106\u001a\u00020\u000f\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\b\b\u0002\u00109\u001a\u00020\u000f\u0012\b\b\u0002\u0010:\u001a\u00020\u000f\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010=\u001a\u00020\t\u0012\b\b\u0002\u0010>\u001a\u00020\t¢\u0006\u0004\b?\u0010@J\n\u0010¶\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010·\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010º\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010»\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010NJ\u0011\u0010¼\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010NJ\f\u0010½\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¿\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010À\u0001\u001a\u00020\u000fHÆ\u0003J\f\u0010Á\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Â\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ä\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010Å\u0001\u001a\u00020\u000fHÆ\u0003J\f\u0010Æ\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\n\u0010Ç\u0001\u001a\u00020\u000fHÆ\u0003J\u0011\u0010È\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010NJ\f\u0010É\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ë\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Í\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Î\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ï\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ð\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ò\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ó\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ô\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Õ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ö\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010×\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ø\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ù\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ú\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Û\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010Ü\u0001\u001a\u00020\u000fHÆ\u0003J\u0011\u0010Ý\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010NJ\n\u0010Þ\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010ß\u0001\u001a\u00020\u000fHÆ\u0003J\f\u0010à\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010á\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010â\u0001\u001a\u00020\tHÆ\u0003J\n\u0010ã\u0001\u001a\u00020\u000fHÆ\u0003J\f\u0010ä\u0001\u001a\u0004\u0018\u000105HÆ\u0003J\n\u0010å\u0001\u001a\u00020\u000fHÆ\u0003J\f\u0010æ\u0001\u001a\u0004\u0018\u000108HÆ\u0003J\n\u0010ç\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010è\u0001\u001a\u00020\u000fHÆ\u0003J\u0011\u0010é\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010NJ\f\u0010ê\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010ë\u0001\u001a\u00020\tHÆ\u0003J\n\u0010ì\u0001\u001a\u00020\tHÆ\u0003J\u0086\u0005\u0010í\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010,\u001a\u00020\u000f2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010.\u001a\u00020\u000f2\b\b\u0002\u0010/\u001a\u00020\u000f2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00102\u001a\u00020\t2\b\b\u0002\u00103\u001a\u00020\u000f2\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\b\b\u0002\u00106\u001a\u00020\u000f2\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\b\b\u0002\u00109\u001a\u00020\u000f2\b\b\u0002\u0010:\u001a\u00020\u000f2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010=\u001a\u00020\t2\b\b\u0002\u0010>\u001a\u00020\tHÆ\u0001¢\u0006\u0003\u0010î\u0001J\u0007\u0010ï\u0001\u001a\u00020\u000fJ\u0017\u0010ð\u0001\u001a\u00020\t2\n\u0010ñ\u0001\u001a\u0005\u0018\u00010ò\u0001HÖ\u0083\u0004J\u000b\u0010ó\u0001\u001a\u00020\u000fHÖ\u0081\u0004J\u000b\u0010ô\u0001\u001a\u00020\u0003HÖ\u0081\u0004J\u001b\u0010õ\u0001\u001a\u00030ö\u00012\b\u0010÷\u0001\u001a\u00030ø\u00012\u0007\u0010ù\u0001\u001a\u00020\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010B\"\u0004\bF\u0010DR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010B\"\u0004\bH\u0010DR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010DR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010B\"\u0004\bL\u0010DR\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010Q\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010Q\u001a\u0004\bR\u0010NR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u0010BR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010B\"\u0004\bU\u0010DR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010B\"\u0004\bW\u0010DR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010B\"\u0004\b]\u0010DR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010B\"\u0004\b_\u0010DR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010B\"\u0004\ba\u0010DR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010B\"\u0004\bc\u0010DR\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010Y\"\u0004\be\u0010[R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u001a\u0010\u0017\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010Y\"\u0004\bk\u0010[R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010Q\u001a\u0004\b\u0018\u0010N\"\u0004\bl\u0010PR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010B\"\u0004\bn\u0010DR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010B\"\u0004\bp\u0010DR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010B\"\u0004\br\u0010DR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010B\"\u0004\bt\u0010DR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010B\"\u0004\bv\u0010DR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010B\"\u0004\bx\u0010DR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010B\"\u0004\bz\u0010DR\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010B\"\u0004\b|\u0010DR\u001c\u0010!\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010B\"\u0004\b~\u0010DR\u001d\u0010\"\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010B\"\u0005\b\u0080\u0001\u0010DR\u001e\u0010#\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010B\"\u0005\b\u0082\u0001\u0010DR\u001e\u0010$\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010B\"\u0005\b\u0084\u0001\u0010DR\u001e\u0010%\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010B\"\u0005\b\u0086\u0001\u0010DR\u001e\u0010&\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010B\"\u0005\b\u0088\u0001\u0010DR\u001e\u0010'\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010B\"\u0005\b\u008a\u0001\u0010DR\u001e\u0010(\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010B\"\u0005\b\u008c\u0001\u0010DR\u001e\u0010)\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010B\"\u0005\b\u008e\u0001\u0010DR\u001e\u0010*\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u0010B\"\u0005\b\u0090\u0001\u0010DR\u001e\u0010+\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u0010B\"\u0005\b\u0092\u0001\u0010DR\u001c\u0010,\u001a\u00020\u000fX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u0010Y\"\u0005\b\u0094\u0001\u0010[R \u0010-\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0012\n\u0002\u0010Q\u001a\u0005\b\u0095\u0001\u0010N\"\u0005\b\u0096\u0001\u0010PR\u001c\u0010.\u001a\u00020\u000fX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010Y\"\u0005\b\u0098\u0001\u0010[R\u001c\u0010/\u001a\u00020\u000fX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0001\u0010Y\"\u0005\b\u009a\u0001\u0010[R\u001e\u00100\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009b\u0001\u0010B\"\u0005\b\u009c\u0001\u0010DR\u001e\u00101\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010B\"\u0005\b\u009e\u0001\u0010DR\u001d\u00102\u001a\u00020\tX\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b2\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R\u001c\u00103\u001a\u00020\u000fX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¢\u0001\u0010Y\"\u0005\b£\u0001\u0010[R \u00104\u001a\u0004\u0018\u000105X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R\u001c\u00106\u001a\u00020\u000fX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¨\u0001\u0010Y\"\u0005\b©\u0001\u0010[R \u00107\u001a\u0004\u0018\u000108X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R\u001b\u00109\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b9\u0010Y\"\u0005\b®\u0001\u0010[R\u001c\u0010:\u001a\u00020\u000fX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¯\u0001\u0010Y\"\u0005\b°\u0001\u0010[R\u001f\u0010;\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0011\n\u0002\u0010Q\u001a\u0004\b;\u0010N\"\u0005\b±\u0001\u0010PR\u001e\u0010<\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b²\u0001\u0010B\"\u0005\b³\u0001\u0010DR\u001d\u0010=\u001a\u00020\tX\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b=\u0010\u009f\u0001\"\u0006\b´\u0001\u0010¡\u0001R\u001d\u0010>\u001a\u00020\tX\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b>\u0010\u009f\u0001\"\u0006\bµ\u0001\u0010¡\u0001¨\u0006ú\u0001"}, d2 = {"Lcom/stockbit/domain/model/entity/userprofile/Profile;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", "username", "fullname", "email", "avatar", "official", "", "verified", "exchange", "country", "watchlistId", "password", "", "about", "website", "phone", "gender", "tutorial", "connect", "Lcom/stockbit/domain/model/entity/userprofile/Connect;", "privilege", "isFollow", "activated", "banned", "userBannedUntil", "banReason", "lastLogin", "created", "modified", FirebaseAnalytics.Param.LOCATION, "occupation", "birthday", "address", "hideEmail", "userAttr", "userTrading", "userNewsletter", "facebookId", "facebookAccount", "googleAccount", "googleId", "realTradingAccess", "followed", "trending", "ispro", "proActiveSince", "proExpireAt", "isVerified", "tradingPro", "additional", "Lcom/stockbit/domain/model/entity/userprofile/Additional;", "alert", "supportData", "Lcom/stockbit/domain/model/entity/userprofile/SupportData;", "isBlocked", "indexInResponse", "isSuggestedUser", "reason", "isGoogleAccountLinked", "isFacebookAccountLinked", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/stockbit/domain/model/entity/userprofile/Connect;ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;IILjava/lang/String;Ljava/lang/String;ZILcom/stockbit/domain/model/entity/userprofile/Additional;ILcom/stockbit/domain/model/entity/userprofile/SupportData;IILjava/lang/Boolean;Ljava/lang/String;ZZ)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getUsername", "setUsername", "getFullname", "setFullname", "getEmail", "setEmail", "getAvatar", "setAvatar", "getOfficial", "()Ljava/lang/Boolean;", "setOfficial", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getVerified", "getExchange", "getCountry", "setCountry", "getWatchlistId", "setWatchlistId", "getPassword", "()I", "setPassword", "(I)V", "getAbout", "setAbout", "getWebsite", "setWebsite", "getPhone", "setPhone", "getGender", "setGender", "getTutorial", "setTutorial", "getConnect", "()Lcom/stockbit/domain/model/entity/userprofile/Connect;", "setConnect", "(Lcom/stockbit/domain/model/entity/userprofile/Connect;)V", "getPrivilege", "setPrivilege", "setFollow", "getActivated", "setActivated", "getBanned", "setBanned", "getUserBannedUntil", "setUserBannedUntil", "getBanReason", "setBanReason", "getLastLogin", "setLastLogin", "getCreated", "setCreated", "getModified", "setModified", "getLocation", "setLocation", "getOccupation", "setOccupation", "getBirthday", "setBirthday", "getAddress", "setAddress", "getHideEmail", "setHideEmail", "getUserAttr", "setUserAttr", "getUserTrading", "setUserTrading", "getUserNewsletter", "setUserNewsletter", "getFacebookId", "setFacebookId", "getFacebookAccount", "setFacebookAccount", "getGoogleAccount", "setGoogleAccount", "getGoogleId", "setGoogleId", "getRealTradingAccess", "setRealTradingAccess", "getFollowed", "setFollowed", "getTrending", "setTrending", "getIspro", "setIspro", "getProActiveSince", "setProActiveSince", "getProExpireAt", "setProExpireAt", "()Z", "setVerified", "(Z)V", "getTradingPro", "setTradingPro", "getAdditional", "()Lcom/stockbit/domain/model/entity/userprofile/Additional;", "setAdditional", "(Lcom/stockbit/domain/model/entity/userprofile/Additional;)V", "getAlert", "setAlert", "getSupportData", "()Lcom/stockbit/domain/model/entity/userprofile/SupportData;", "setSupportData", "(Lcom/stockbit/domain/model/entity/userprofile/SupportData;)V", "setBlocked", "getIndexInResponse", "setIndexInResponse", "setSuggestedUser", "getReason", "setReason", "setGoogleAccountLinked", "setFacebookAccountLinked", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/stockbit/domain/model/entity/userprofile/Connect;ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;IILjava/lang/String;Ljava/lang/String;ZILcom/stockbit/domain/model/entity/userprofile/Additional;ILcom/stockbit/domain/model/entity/userprofile/SupportData;IILjava/lang/Boolean;Ljava/lang/String;ZZ)Lcom/stockbit/domain/model/entity/userprofile/Profile;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@e
/* loaded from: classes8.dex */
public final class Profile implements Parcelable {
    public static final Parcelable.Creator<Profile> CREATOR = null;

    /* renamed from: A, reason: collision with root package name */
    public String f83725A;

    /* renamed from: B, reason: collision with root package name */
    public String f83726B;

    /* renamed from: C, reason: collision with root package name */
    public String f83727C;

    /* renamed from: D, reason: collision with root package name */
    public String f83728D;

    /* renamed from: E, reason: collision with root package name */
    public String f83729E;

    /* renamed from: F, reason: collision with root package name */
    public String f83730F;

    /* renamed from: G, reason: collision with root package name */
    public String f83731G;

    /* renamed from: H, reason: collision with root package name */
    public String f83732H;

    /* renamed from: I, reason: collision with root package name */
    public String f83733I;

    /* renamed from: J, reason: collision with root package name */
    public String f83734J;

    /* renamed from: K, reason: collision with root package name */
    public String f83735K;

    /* renamed from: L, reason: collision with root package name */
    public String f83736L;

    /* renamed from: M, reason: collision with root package name */
    public int f83737M;

    /* renamed from: N, reason: collision with root package name */
    public Boolean f83738N;

    /* renamed from: O, reason: collision with root package name */
    public int f83739O;

    /* renamed from: P, reason: collision with root package name */
    public int f83740P;

    /* renamed from: Q, reason: collision with root package name */
    public String f83741Q;

    /* renamed from: R, reason: collision with root package name */
    public String f83742R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f83743S;

    /* renamed from: T, reason: collision with root package name */
    public int f83744T;

    /* renamed from: U, reason: collision with root package name */
    public Additional f83745U;

    /* renamed from: V, reason: collision with root package name */
    public int f83746V;

    /* renamed from: W, reason: collision with root package name */
    public SupportData f83747W;

    /* renamed from: X, reason: collision with root package name */
    public int f83748X;

    /* renamed from: Y, reason: collision with root package name */
    public int f83749Y;

    /* renamed from: Z, reason: collision with root package name */
    public Boolean f83750Z;

    /* renamed from: a, reason: collision with root package name */
    public String f83751a;

    /* renamed from: a0, reason: collision with root package name */
    public String f83752a0;

    /* renamed from: b, reason: collision with root package name */
    public String f83753b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f83754b0;

    /* renamed from: c, reason: collision with root package name */
    public String f83755c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f83756c0;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f83757e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f83758f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f83759g;

    /* renamed from: h, reason: collision with root package name */
    public final String f83760h;

    /* renamed from: i, reason: collision with root package name */
    public String f83761i;

    /* renamed from: j, reason: collision with root package name */
    public String f83762j;

    /* renamed from: k, reason: collision with root package name */
    public int f83763k;

    /* renamed from: l, reason: collision with root package name */
    public String f83764l;

    /* renamed from: m, reason: collision with root package name */
    public String f83765m;

    /* renamed from: n, reason: collision with root package name */
    public String f83766n;

    /* renamed from: o, reason: collision with root package name */
    public String f83767o;

    /* renamed from: p, reason: collision with root package name */
    public int f83768p;

    /* renamed from: q, reason: collision with root package name */
    public Connect f83769q;

    /* renamed from: r, reason: collision with root package name */
    public int f83770r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f83771s;

    /* renamed from: t, reason: collision with root package name */
    public String f83772t;

    /* renamed from: u, reason: collision with root package name */
    public String f83773u;

    /* renamed from: v, reason: collision with root package name */
    public String f83774v;

    /* renamed from: w, reason: collision with root package name */
    public String f83775w;

    /* renamed from: x, reason: collision with root package name */
    public String f83776x;

    /* renamed from: y, reason: collision with root package name */
    public String f83777y;

    /* renamed from: z, reason: collision with root package name */
    public String f83778z;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final Profile a(Parcel r59) {
            p.l(r59, "parcel");
            String r3 = r59.readString();
            String r4 = r59.readString();
            String r5 = r59.readString();
            String r6 = r59.readString();
            String r7 = r59.readString();
            if (r59.readInt() != 0) goto L6;
            Boolean r1 = null;
        L11:
            if (r59.readInt() != 0) goto L14;
            Boolean r11 = null;
            Boolean r12 = null;
        L18:
            String r10 = r59.readString();
            Boolean r9 = r11;
            String r112 = r59.readString();
            Boolean r14 = r12;
            String r122 = r59.readString();
            int r13 = r59.readInt();
            String r142 = r59.readString();
            String r15 = r59.readString();
            String r16 = r59.readString();
            String r17 = r59.readString();
            int r18 = r59.readInt();
            if (r59.readInt() != 0) goto L21;
            Object r8 = r14;
        L22:
            Connect r82 = (Connect) r8;
            int r20 = r59.readInt();
            if (r59.readInt() != 0) goto L26;
            Boolean r23 = r14;
            Boolean r24 = r23;
            Boolean r232 = r23;
        L30:
            String r22 = r59.readString();
            Boolean r21 = r232;
            String r233 = r59.readString();
            Boolean r26 = r24;
            String r242 = r59.readString();
            String r25 = r59.readString();
            String r262 = r59.readString();
            String r27 = r59.readString();
            String r28 = r59.readString();
            String r29 = r59.readString();
            String r30 = r59.readString();
            String r31 = r59.readString();
            String r32 = r59.readString();
            String r33 = r59.readString();
            String r34 = r59.readString();
            String r35 = r59.readString();
            String r36 = r59.readString();
            String r37 = r59.readString();
            String r38 = r59.readString();
            String r39 = r59.readString();
            String r40 = r59.readString();
            int r41 = r59.readInt();
            if (r59.readInt() != 0) goto L35;
            Boolean r44 = r26;
        L39:
            int r43 = r59.readInt();
            Boolean r42 = r44;
            int r442 = r59.readInt();
            boolean r47 = false;
            String r45 = r59.readString();
            String r46 = r59.readString();
            if (r59.readInt() == 0) goto L43;
            boolean r49 = false;
            r47 = true;
        L44:
            int r48 = r59.readInt();
            if (r59.readInt() != 0) goto L47;
            Boolean r51 = r1;
            Object r19 = r26;
        L48:
            Additional r110 = (Additional) r19;
            int r50 = r59.readInt();
            if (r59.readInt() != 0) goto L51;
            Additional r53 = r110;
            Object r111 = r26;
        L52:
            SupportData r113 = (SupportData) r111;
            Boolean r54 = r26;
            int r52 = r59.readInt();
            boolean r55 = r49;
            Additional r492 = r53;
            int r532 = r59.readInt();
            if (r59.readInt() != 0) goto L56;
        L54:
            boolean r56 = r55;
            String r552 = r59.readString();
            if (r59.readInt() == 0) goto L63;
            boolean r57 = r56;
            r56 = true;
        L65:
            if (r59.readInt() == 0) goto L68;
            r57 = true;
        L68:
            return new Profile(r3, r4, r5, r6, r7, r51, r9, r10, r112, r122, r13, r142, r15, r16, r17, r18, r82, r20, r21, r22, r233, r242, r25, r262, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r442, r45, r46, r47, r48, r492, r50, r113, r52, r532, r54, r552, r56, r57);
        L63:
            r57 = r56;
            goto L65
        L56:
            if (r59.readInt() == 0) goto L58;
            boolean r542 = true;
        L59:
            r54 = Boolean.valueOf(r542);
            goto L54
        L58:
            r542 = r55;
            goto L59
        L51:
            r53 = r110;
            r111 = SupportData.CREATOR.createFromParcel(r59);
            goto L52
        L47:
            r51 = r1;
            r19 = Additional.CREATOR.createFromParcel(r59);
            goto L48
        L43:
            r49 = false;
            goto L44
        L35:
            if (r59.readInt() == 0) goto L37;
            boolean r443 = true;
        L38:
            r44 = Boolean.valueOf(r443);
            goto L39
        L37:
            r443 = false;
            goto L38
        L26:
            if (r59.readInt() == 0) goto L28;
            boolean r234 = true;
        L29:
            r24 = r14;
            r232 = Boolean.valueOf(r234);
            goto L30
        L28:
            r234 = false;
            goto L29
        L21:
            r8 = Connect.CREATOR.createFromParcel(r59);
            goto L22
        L14:
            if (r59.readInt() == 0) goto L16;
            boolean r114 = true;
        L17:
            r11 = Boolean.valueOf(r114);
            r12 = null;
            goto L18
        L16:
            r114 = false;
            goto L17
        L6:
            if (r59.readInt() == 0) goto L8;
            boolean r115 = true;
        L9:
            r1 = Boolean.valueOf(r115);
            goto L11
        L8:
            r115 = false;
            goto L9
        }

        public final Profile[] b(int r1) {
            return new Profile[r1];
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

    public Profile(String r2, String r3, String r4, String r5, String r6, Boolean r7, Boolean r8, String r9, String r10, String r11, int r12, String r13, String r14, String r15, String r16, int r17, Connect r18, int r19, Boolean r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, String r34, String r35, String r36, String r37, String r38, String r39, int r40, Boolean r41, int r42, int r43, String r44, String r45, boolean r46, int r47, Additional r48, int r49, SupportData r50, int r51, int r52, Boolean r53, String r54, boolean r55, boolean r56) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "username");
        this.f83751a = r2;
        this.f83753b = r3;
        this.f83755c = r4;
        this.d = r5;
        this.f83757e = r6;
        this.f83758f = r7;
        this.f83759g = r8;
        this.f83760h = r9;
        this.f83761i = r10;
        this.f83762j = r11;
        this.f83763k = r12;
        this.f83764l = r13;
        this.f83765m = r14;
        this.f83766n = r15;
        this.f83767o = r16;
        this.f83768p = r17;
        this.f83769q = r18;
        this.f83770r = r19;
        this.f83771s = r20;
        this.f83772t = r21;
        this.f83773u = r22;
        this.f83774v = r23;
        this.f83775w = r24;
        this.f83776x = r25;
        this.f83777y = r26;
        this.f83778z = r27;
        this.f83725A = r28;
        this.f83726B = r29;
        this.f83727C = r30;
        this.f83728D = r31;
        this.f83729E = r32;
        this.f83730F = r33;
        this.f83731G = r34;
        this.f83732H = r35;
        this.f83733I = r36;
        this.f83734J = r37;
        this.f83735K = r38;
        this.f83736L = r39;
        this.f83737M = r40;
        this.f83738N = r41;
        this.f83739O = r42;
        this.f83740P = r43;
        this.f83741Q = r44;
        this.f83742R = r45;
        this.f83743S = r46;
        this.f83744T = r47;
        this.f83745U = r48;
        this.f83746V = r49;
        this.f83747W = r50;
        this.f83748X = r51;
        this.f83749Y = r52;
        this.f83750Z = r53;
        this.f83752a0 = r54;
        this.f83754b0 = r55;
        this.f83756c0 = r56;
    }

    public final String a() {
        return this.f83757e;
    }

    public final String b() {
        return this.f83761i;
    }

    public final String c() {
        return this.f83777y;
    }

    public final String d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.f83738N;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Profile) == true) goto L8;
        return false;
    L8:
        Profile r52 = (Profile) r5;
        if (p.g(this.f83751a, r52.f83751a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f83753b, r52.f83753b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f83755c, r52.f83755c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f83757e, r52.f83757e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f83758f, r52.f83758f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f83759g, r52.f83759g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f83760h, r52.f83760h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f83761i, r52.f83761i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f83762j, r52.f83762j) == true) goto L39;
        return false;
    L39:
        if (this.f83763k == r52.f83763k) goto L42;
        return false;
    L42:
        if (p.g(this.f83764l, r52.f83764l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f83765m, r52.f83765m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f83766n, r52.f83766n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f83767o, r52.f83767o) == true) goto L54;
        return false;
    L54:
        if (this.f83768p == r52.f83768p) goto L57;
        return false;
    L57:
        if (p.g(this.f83769q, r52.f83769q) == true) goto L60;
        return false;
    L60:
        if (this.f83770r == r52.f83770r) goto L63;
        return false;
    L63:
        if (p.g(this.f83771s, r52.f83771s) == true) goto L66;
        return false;
    L66:
        if (p.g(this.f83772t, r52.f83772t) == true) goto L69;
        return false;
    L69:
        if (p.g(this.f83773u, r52.f83773u) == true) goto L72;
        return false;
    L72:
        if (p.g(this.f83774v, r52.f83774v) == true) goto L75;
        return false;
    L75:
        if (p.g(this.f83775w, r52.f83775w) == true) goto L78;
        return false;
    L78:
        if (p.g(this.f83776x, r52.f83776x) == true) goto L81;
        return false;
    L81:
        if (p.g(this.f83777y, r52.f83777y) == true) goto L84;
        return false;
    L84:
        if (p.g(this.f83778z, r52.f83778z) == true) goto L87;
        return false;
    L87:
        if (p.g(this.f83725A, r52.f83725A) == true) goto L90;
        return false;
    L90:
        if (p.g(this.f83726B, r52.f83726B) == true) goto L93;
        return false;
    L93:
        if (p.g(this.f83727C, r52.f83727C) == true) goto L96;
        return false;
    L96:
        if (p.g(this.f83728D, r52.f83728D) == true) goto L99;
        return false;
    L99:
        if (p.g(this.f83729E, r52.f83729E) == true) goto L102;
        return false;
    L102:
        if (p.g(this.f83730F, r52.f83730F) == true) goto L105;
        return false;
    L105:
        if (p.g(this.f83731G, r52.f83731G) == true) goto L108;
        return false;
    L108:
        if (p.g(this.f83732H, r52.f83732H) == true) goto L111;
        return false;
    L111:
        if (p.g(this.f83733I, r52.f83733I) == true) goto L114;
        return false;
    L114:
        if (p.g(this.f83734J, r52.f83734J) == true) goto L117;
        return false;
    L117:
        if (p.g(this.f83735K, r52.f83735K) == true) goto L120;
        return false;
    L120:
        if (p.g(this.f83736L, r52.f83736L) == true) goto L123;
        return false;
    L123:
        if (this.f83737M == r52.f83737M) goto L126;
        return false;
    L126:
        if (p.g(this.f83738N, r52.f83738N) == true) goto L129;
        return false;
    L129:
        if (this.f83739O == r52.f83739O) goto L132;
        return false;
    L132:
        if (this.f83740P == r52.f83740P) goto L135;
        return false;
    L135:
        if (p.g(this.f83741Q, r52.f83741Q) == true) goto L138;
        return false;
    L138:
        if (p.g(this.f83742R, r52.f83742R) == true) goto L141;
        return false;
    L141:
        if (this.f83743S == r52.f83743S) goto L144;
        return false;
    L144:
        if (this.f83744T == r52.f83744T) goto L147;
        return false;
    L147:
        if (p.g(this.f83745U, r52.f83745U) == true) goto L150;
        return false;
    L150:
        if (this.f83746V == r52.f83746V) goto L153;
        return false;
    L153:
        if (p.g(this.f83747W, r52.f83747W) == true) goto L156;
        return false;
    L156:
        if (this.f83748X == r52.f83748X) goto L159;
        return false;
    L159:
        if (this.f83749Y == r52.f83749Y) goto L162;
        return false;
    L162:
        if (p.g(this.f83750Z, r52.f83750Z) == true) goto L165;
        return false;
    L165:
        if (p.g(this.f83752a0, r52.f83752a0) == true) goto L168;
        return false;
    L168:
        if (this.f83754b0 == r52.f83754b0) goto L171;
        return false;
    L171:
        if (this.f83756c0 == r52.f83756c0) goto L173;
        return false;
    L173:
        return true;
    }

    public final String f() {
        return this.f83755c;
    }

    public final String g() {
        return this.f83751a;
    }

    public final String getUsername() {
        return this.f83753b;
    }

    public final int h() {
        return this.f83740P;
    }

    public int hashCode() {
        int r02 = ((this.f83751a.hashCode() * 31) + this.f83753b.hashCode()) * 31;
        String r1 = this.f83755c;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.d;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.f83757e;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        Boolean r17 = this.f83758f;
        if (r17 != null) goto L17;
        int r18 = 0;
    L18:
        int r06 = (r05 + r18) * 31;
        Boolean r19 = this.f83759g;
        if (r19 != null) goto L21;
        int r110 = 0;
    L22:
        int r07 = (r06 + r110) * 31;
        String r111 = this.f83760h;
        if (r111 != null) goto L25;
        int r112 = 0;
    L26:
        int r08 = (r07 + r112) * 31;
        String r113 = this.f83761i;
        if (r113 != null) goto L29;
        int r114 = 0;
    L30:
        int r09 = (r08 + r114) * 31;
        String r115 = this.f83762j;
        if (r115 != null) goto L33;
        int r116 = 0;
    L34:
        int r010 = (((r09 + r116) * 31) + Integer.hashCode(this.f83763k)) * 31;
        String r117 = this.f83764l;
        if (r117 != null) goto L37;
        int r118 = 0;
    L38:
        int r011 = (r010 + r118) * 31;
        String r119 = this.f83765m;
        if (r119 != null) goto L41;
        int r120 = 0;
    L42:
        int r012 = (r011 + r120) * 31;
        String r121 = this.f83766n;
        if (r121 != null) goto L45;
        int r122 = 0;
    L46:
        int r013 = (r012 + r122) * 31;
        String r123 = this.f83767o;
        if (r123 != null) goto L49;
        int r124 = 0;
    L50:
        int r014 = (((r013 + r124) * 31) + Integer.hashCode(this.f83768p)) * 31;
        Connect r125 = this.f83769q;
        if (r125 != null) goto L53;
        int r126 = 0;
    L54:
        int r015 = (((r014 + r126) * 31) + Integer.hashCode(this.f83770r)) * 31;
        Boolean r127 = this.f83771s;
        if (r127 != null) goto L57;
        int r128 = 0;
    L58:
        int r016 = (r015 + r128) * 31;
        String r129 = this.f83772t;
        if (r129 != null) goto L61;
        int r130 = 0;
    L62:
        int r017 = (r016 + r130) * 31;
        String r131 = this.f83773u;
        if (r131 != null) goto L65;
        int r132 = 0;
    L66:
        int r018 = (r017 + r132) * 31;
        String r133 = this.f83774v;
        if (r133 != null) goto L69;
        int r134 = 0;
    L70:
        int r019 = (r018 + r134) * 31;
        String r135 = this.f83775w;
        if (r135 != null) goto L73;
        int r136 = 0;
    L74:
        int r020 = (r019 + r136) * 31;
        String r137 = this.f83776x;
        if (r137 != null) goto L77;
        int r138 = 0;
    L78:
        int r021 = (r020 + r138) * 31;
        String r139 = this.f83777y;
        if (r139 != null) goto L81;
        int r140 = 0;
    L82:
        int r022 = (r021 + r140) * 31;
        String r141 = this.f83778z;
        if (r141 != null) goto L85;
        int r142 = 0;
    L86:
        int r023 = (r022 + r142) * 31;
        String r143 = this.f83725A;
        if (r143 != null) goto L89;
        int r144 = 0;
    L90:
        int r024 = (r023 + r144) * 31;
        String r145 = this.f83726B;
        if (r145 != null) goto L93;
        int r146 = 0;
    L94:
        int r025 = (r024 + r146) * 31;
        String r147 = this.f83727C;
        if (r147 != null) goto L97;
        int r148 = 0;
    L98:
        int r026 = (r025 + r148) * 31;
        String r149 = this.f83728D;
        if (r149 != null) goto L101;
        int r150 = 0;
    L102:
        int r027 = (r026 + r150) * 31;
        String r151 = this.f83729E;
        if (r151 != null) goto L105;
        int r152 = 0;
    L106:
        int r028 = (r027 + r152) * 31;
        String r153 = this.f83730F;
        if (r153 != null) goto L109;
        int r154 = 0;
    L110:
        int r029 = (r028 + r154) * 31;
        String r155 = this.f83731G;
        if (r155 != null) goto L113;
        int r156 = 0;
    L114:
        int r030 = (r029 + r156) * 31;
        String r157 = this.f83732H;
        if (r157 != null) goto L117;
        int r158 = 0;
    L118:
        int r031 = (r030 + r158) * 31;
        String r159 = this.f83733I;
        if (r159 != null) goto L121;
        int r160 = 0;
    L122:
        int r032 = (r031 + r160) * 31;
        String r161 = this.f83734J;
        if (r161 != null) goto L125;
        int r162 = 0;
    L126:
        int r033 = (r032 + r162) * 31;
        String r163 = this.f83735K;
        if (r163 != null) goto L129;
        int r164 = 0;
    L130:
        int r034 = (r033 + r164) * 31;
        String r165 = this.f83736L;
        if (r165 != null) goto L133;
        int r166 = 0;
    L134:
        int r035 = (((r034 + r166) * 31) + Integer.hashCode(this.f83737M)) * 31;
        Boolean r167 = this.f83738N;
        if (r167 != null) goto L137;
        int r168 = 0;
    L138:
        int r036 = (((((r035 + r168) * 31) + Integer.hashCode(this.f83739O)) * 31) + Integer.hashCode(this.f83740P)) * 31;
        String r169 = this.f83741Q;
        if (r169 != null) goto L141;
        int r170 = 0;
    L142:
        int r037 = (r036 + r170) * 31;
        String r171 = this.f83742R;
        if (r171 != null) goto L145;
        int r172 = 0;
    L146:
        int r038 = (((((r037 + r172) * 31) + Boolean.hashCode(this.f83743S)) * 31) + Integer.hashCode(this.f83744T)) * 31;
        Additional r173 = this.f83745U;
        if (r173 != null) goto L149;
        int r174 = 0;
    L150:
        int r039 = (((r038 + r174) * 31) + Integer.hashCode(this.f83746V)) * 31;
        SupportData r175 = this.f83747W;
        if (r175 != null) goto L153;
        int r176 = 0;
    L154:
        int r040 = (((((r039 + r176) * 31) + Integer.hashCode(this.f83748X)) * 31) + Integer.hashCode(this.f83749Y)) * 31;
        Boolean r177 = this.f83750Z;
        if (r177 != null) goto L157;
        int r178 = 0;
    L158:
        int r041 = (r040 + r178) * 31;
        String r179 = this.f83752a0;
        if (r179 == null) goto L163;
        r2 = r179.hashCode();
    L163:
        return ((((r041 + r2) * 31) + Boolean.hashCode(this.f83754b0)) * 31) + Boolean.hashCode(this.f83756c0);
    L157:
        r178 = r177.hashCode();
        goto L158
    L153:
        r176 = r175.hashCode();
        goto L154
    L149:
        r174 = r173.hashCode();
        goto L150
    L145:
        r172 = r171.hashCode();
        goto L146
    L141:
        r170 = r169.hashCode();
        goto L142
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
        return this.f83776x;
    }

    public final String j() {
        return this.f83766n;
    }

    public final int k() {
        return this.f83770r;
    }

    public final String l() {
        return this.f83741Q;
    }

    public final String m() {
        return this.f83742R;
    }

    public final boolean n() {
        return this.f83743S;
    }

    public final void o(Boolean r1) {
        this.f83738N = r1;
    }

    public String toString() {
        return "Profile(id=" + this.f83751a + ", username=" + this.f83753b + ", fullname=" + this.f83755c + ", email=" + this.d + ", avatar=" + this.f83757e + ", official=" + this.f83758f + ", verified=" + this.f83759g + ", exchange=" + this.f83760h + ", country=" + this.f83761i + ", watchlistId=" + this.f83762j + ", password=" + this.f83763k + ", about=" + this.f83764l + ", website=" + this.f83765m + ", phone=" + this.f83766n + ", gender=" + this.f83767o + ", tutorial=" + this.f83768p + ", connect=" + this.f83769q + ", privilege=" + this.f83770r + ", isFollow=" + this.f83771s + ", activated=" + this.f83772t + ", banned=" + this.f83773u + ", userBannedUntil=" + this.f83774v + ", banReason=" + this.f83775w + ", lastLogin=" + this.f83776x + ", created=" + this.f83777y + ", modified=" + this.f83778z + ", location=" + this.f83725A + ", occupation=" + this.f83726B + ", birthday=" + this.f83727C + ", address=" + this.f83728D + ", hideEmail=" + this.f83729E + ", userAttr=" + this.f83730F + ", userTrading=" + this.f83731G + ", userNewsletter=" + this.f83732H + ", facebookId=" + this.f83733I + ", facebookAccount=" + this.f83734J + ", googleAccount=" + this.f83735K + ", googleId=" + this.f83736L + ", realTradingAccess=" + this.f83737M + ", followed=" + this.f83738N + ", trending=" + this.f83739O + ", ispro=" + this.f83740P + ", proActiveSince=" + this.f83741Q + ", proExpireAt=" + this.f83742R + ", isVerified=" + this.f83743S + ", tradingPro=" + this.f83744T + ", additional=" + this.f83745U + ", alert=" + this.f83746V + ", supportData=" + this.f83747W + ", isBlocked=" + this.f83748X + ", indexInResponse=" + this.f83749Y + ", isSuggestedUser=" + this.f83750Z + ", reason=" + this.f83752a0 + ", isGoogleAccountLinked=" + this.f83754b0 + ", isFacebookAccountLinked=" + this.f83756c0 + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        p.l(r4, "dest");
        r4.writeString(this.f83751a);
        r4.writeString(this.f83753b);
        r4.writeString(this.f83755c);
        r4.writeString(this.d);
        r4.writeString(this.f83757e);
        Boolean r02 = this.f83758f;
        if (r02 != null) goto L5;
        r4.writeInt(0);
    L6:
        Boolean r03 = this.f83759g;
        if (r03 != null) goto L9;
        r4.writeInt(0);
    L10:
        r4.writeString(this.f83760h);
        r4.writeString(this.f83761i);
        r4.writeString(this.f83762j);
        r4.writeInt(this.f83763k);
        r4.writeString(this.f83764l);
        r4.writeString(this.f83765m);
        r4.writeString(this.f83766n);
        r4.writeString(this.f83767o);
        r4.writeInt(this.f83768p);
        Connect r04 = this.f83769q;
        if (r04 != null) goto L13;
        r4.writeInt(0);
    L14:
        r4.writeInt(this.f83770r);
        Boolean r05 = this.f83771s;
        if (r05 != null) goto L17;
        r4.writeInt(0);
    L18:
        r4.writeString(this.f83772t);
        r4.writeString(this.f83773u);
        r4.writeString(this.f83774v);
        r4.writeString(this.f83775w);
        r4.writeString(this.f83776x);
        r4.writeString(this.f83777y);
        r4.writeString(this.f83778z);
        r4.writeString(this.f83725A);
        r4.writeString(this.f83726B);
        r4.writeString(this.f83727C);
        r4.writeString(this.f83728D);
        r4.writeString(this.f83729E);
        r4.writeString(this.f83730F);
        r4.writeString(this.f83731G);
        r4.writeString(this.f83732H);
        r4.writeString(this.f83733I);
        r4.writeString(this.f83734J);
        r4.writeString(this.f83735K);
        r4.writeString(this.f83736L);
        r4.writeInt(this.f83737M);
        Boolean r06 = this.f83738N;
        if (r06 != null) goto L21;
        r4.writeInt(0);
    L22:
        r4.writeInt(this.f83739O);
        r4.writeInt(this.f83740P);
        r4.writeString(this.f83741Q);
        r4.writeString(this.f83742R);
        r4.writeInt(this.f83743S ? 1 : 0);
        r4.writeInt(this.f83744T);
        Additional r07 = this.f83745U;
        if (r07 != null) goto L25;
        r4.writeInt(0);
    L26:
        r4.writeInt(this.f83746V);
        SupportData r08 = this.f83747W;
        if (r08 != null) goto L29;
        r4.writeInt(0);
    L30:
        r4.writeInt(this.f83748X);
        r4.writeInt(this.f83749Y);
        Boolean r52 = this.f83750Z;
        if (r52 != null) goto L33;
        r4.writeInt(0);
    L34:
        r4.writeString(this.f83752a0);
        r4.writeInt(this.f83754b0 ? 1 : 0);
        r4.writeInt(this.f83756c0 ? 1 : 0);
        return;
    L33:
        r4.writeInt(1);
        r4.writeInt(r52.booleanValue() ? 1 : 0);
        goto L34
    L29:
        r4.writeInt(1);
        r08.writeToParcel(r4, r5);
        goto L30
    L25:
        r4.writeInt(1);
        r07.writeToParcel(r4, r5);
        goto L26
    L21:
        r4.writeInt(1);
        r4.writeInt(r06.booleanValue() ? 1 : 0);
        goto L22
    L17:
        r4.writeInt(1);
        r4.writeInt(r05.booleanValue() ? 1 : 0);
        goto L18
    L13:
        r4.writeInt(1);
        r04.writeToParcel(r4, r5);
        goto L14
    L9:
        r4.writeInt(1);
        r4.writeInt(r03.booleanValue() ? 1 : 0);
        goto L10
    L5:
        r4.writeInt(1);
        r4.writeInt(r02.booleanValue() ? 1 : 0);
        goto L6
    }

    public /* synthetic */ Profile(String r48, String r49, String r50, String r51, String r52, Boolean r53, Boolean r54, String r55, String r56, String r57, int r58, String r59, String r60, String r61, String r62, int r63, Connect r64, int r65, Boolean r66, String r67, String r68, String r69, String r70, String r71, String r72, String r73, String r74, String r75, String r76, String r77, String r78, String r79, String r80, String r81, String r82, String r83, String r84, String r85, int r86, Boolean r87, int r88, int r89, String r90, String r91, boolean r92, int r93, Additional r94, int r95, SupportData r96, int r97, int r98, Boolean r99, String r100, boolean r101, boolean r102, int r103, int r104, i r105) {
        if ((r103 & 4) == 0) goto L5;
        String r2 = null;
    L7:
        if ((r103 & 8) == 0) goto L9;
        String r4 = null;
    L11:
        if ((r103 & 16) == 0) goto L13;
        String r5 = null;
    L15:
        if ((r103 & 32) == 0) goto L17;
        Boolean r6 = null;
    L19:
        if ((r103 & 64) == 0) goto L21;
        Boolean r7 = null;
    L23:
        if ((r103 & 128) == 0) goto L25;
        String r8 = null;
    L27:
        if ((r103 & 256) == 0) goto L29;
        String r9 = null;
    L31:
        if ((r103 & 512) == 0) goto L33;
        String r10 = null;
    L35:
        if ((r103 & 1024) == 0) goto L37;
        int r11 = 0;
    L39:
        if ((r103 & 2048) == 0) goto L41;
        String r13 = null;
    L43:
        if ((r103 & 4096) == 0) goto L45;
        String r14 = null;
    L47:
        if ((r103 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L49;
        String r15 = null;
    L51:
        if ((r103 & 16384) == 0) goto L53;
        String r3 = null;
    L55:
        if ((r103 & 32768) == 0) goto L57;
        int r17 = 0;
    L59:
        if ((r103 & 65536) == 0) goto L61;
        Connect r19 = null;
    L63:
        if ((r103 & 131072) == 0) goto L65;
        int r21 = 0;
    L67:
        if ((r103 & 262144) == 0) goto L69;
        Boolean r23 = Boolean.FALSE;
    L71:
        if ((r103 & 524288) == 0) goto L73;
        String r25 = null;
    L75:
        if ((r103 & 1048576) == 0) goto L77;
        String r27 = null;
    L79:
        if ((r103 & 2097152) == 0) goto L81;
        String r29 = null;
    L83:
        if ((r103 & 4194304) == 0) goto L85;
        String r30 = null;
    L87:
        if ((r103 & 8388608) == 0) goto L89;
        String r31 = null;
    L91:
        if ((r103 & 16777216) == 0) goto L93;
        String r32 = null;
    L95:
        if ((r103 & 33554432) == 0) goto L97;
        String r33 = null;
    L99:
        if ((r103 & 67108864) == 0) goto L101;
        String r34 = null;
    L103:
        if ((r103 & 134217728) == 0) goto L105;
        String r35 = null;
    L107:
        if ((r103 & 268435456) == 0) goto L109;
        String r36 = null;
    L111:
        if ((r103 & 536870912) == 0) goto L113;
        String r37 = null;
    L115:
        if ((r103 & Ints.MAX_POWER_OF_TWO) == 0) goto L117;
        String r38 = null;
    L119:
        if ((r103 & Integer.MIN_VALUE) == 0) goto L121;
        String r02 = null;
    L123:
        if ((r104 & 1) == 0) goto L125;
        String r39 = null;
    L127:
        if ((r104 & 2) == 0) goto L129;
        String r40 = null;
    L131:
        if ((r104 & 4) == 0) goto L133;
        String r41 = null;
    L135:
        if ((r104 & 8) == 0) goto L137;
        String r42 = null;
    L139:
        if ((r104 & 16) == 0) goto L141;
        String r43 = null;
    L143:
        if ((r104 & 32) == 0) goto L145;
        String r44 = null;
    L147:
        if ((r104 & 64) == 0) goto L149;
        int r45 = 0;
    L151:
        if ((r104 & 128) == 0) goto L153;
        Boolean r12 = Boolean.FALSE;
    L154:
        String r512 = r02;
        if ((r104 & 256) == 0) goto L157;
        int r03 = 0;
    L158:
        int r522 = r03;
        if ((r104 & 512) == 0) goto L161;
        int r04 = 0;
    L162:
        int r532 = r04;
        if ((r104 & 1024) == 0) goto L165;
        String r05 = null;
    L166:
        String r542 = r05;
        if ((r104 & 2048) == 0) goto L169;
        String r06 = null;
    L170:
        String r552 = r06;
        if ((r104 & 4096) == 0) goto L173;
        boolean r07 = false;
    L174:
        boolean r562 = r07;
        if ((r104 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L177;
        int r08 = 0;
    L178:
        int r572 = r08;
        if ((r104 & 16384) == 0) goto L181;
        Additional r09 = null;
    L183:
        if ((r104 & 32768) == 0) goto L185;
        int r16 = 0;
    L187:
        if ((r104 & 65536) == 0) goto L189;
        SupportData r18 = null;
    L191:
        if ((r104 & 131072) == 0) goto L193;
        int r20 = 0;
    L195:
        if ((r104 & 262144) == 0) goto L197;
        int r22 = 0;
    L199:
        if ((r104 & 524288) == 0) goto L201;
        Boolean r24 = Boolean.FALSE;
    L203:
        if ((r104 & 1048576) == 0) goto L205;
        String r26 = "";
    L207:
        if ((r104 & 2097152) == 0) goto L209;
        boolean r28 = false;
    L211:
        if ((r104 & 4194304) == 0) goto L214;
        boolean r1052 = false;
    L215:
        this(r48, r49, r2, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r3, r17, r19, r21, r23, r25, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r512, r39, r40, r41, r42, r43, r44, r45, r12, r522, r532, r542, r552, r562, r572, r09, r16, r18, r20, r22, r24, r26, r28, r1052);
        return;
    L214:
        r1052 = r102;
        goto L215
    L209:
        r28 = r101;
        goto L211
    L205:
        r26 = r100;
        goto L207
    L201:
        r24 = r99;
        goto L203
    L197:
        r22 = r98;
        goto L199
    L193:
        r20 = r97;
        goto L195
    L189:
        r18 = r96;
        goto L191
    L185:
        r16 = r95;
        goto L187
    L181:
        r09 = r94;
        goto L183
    L177:
        r08 = r93;
        goto L178
    L173:
        r07 = r92;
        goto L174
    L169:
        r06 = r91;
        goto L170
    L165:
        r05 = r90;
        goto L166
    L161:
        r04 = r89;
        goto L162
    L157:
        r03 = r88;
        goto L158
    L153:
        r12 = r87;
        goto L154
    L149:
        r45 = r86;
        goto L151
    L145:
        r44 = r85;
        goto L147
    L141:
        r43 = r84;
        goto L143
    L137:
        r42 = r83;
        goto L139
    L133:
        r41 = r82;
        goto L135
    L129:
        r40 = r81;
        goto L131
    L125:
        r39 = r80;
        goto L127
    L121:
        r02 = r79;
        goto L123
    L117:
        r38 = r78;
        goto L119
    L113:
        r37 = r77;
        goto L115
    L109:
        r36 = r76;
        goto L111
    L105:
        r35 = r75;
        goto L107
    L101:
        r34 = r74;
        goto L103
    L97:
        r33 = r73;
        goto L99
    L93:
        r32 = r72;
        goto L95
    L89:
        r31 = r71;
        goto L91
    L85:
        r30 = r70;
        goto L87
    L81:
        r29 = r69;
        goto L83
    L77:
        r27 = r68;
        goto L79
    L73:
        r25 = r67;
        goto L75
    L69:
        r23 = r66;
        goto L71
    L65:
        r21 = r65;
        goto L67
    L61:
        r19 = r64;
        goto L63
    L57:
        r17 = r63;
        goto L59
    L53:
        r3 = r62;
        goto L55
    L49:
        r15 = r61;
        goto L51
    L45:
        r14 = r60;
        goto L47
    L41:
        r13 = r59;
        goto L43
    L37:
        r11 = r58;
        goto L39
    L33:
        r10 = r57;
        goto L35
    L29:
        r9 = r56;
        goto L31
    L25:
        r8 = r55;
        goto L27
    L21:
        r7 = r54;
        goto L23
    L17:
        r6 = r53;
        goto L19
    L13:
        r5 = r52;
        goto L15
    L9:
        r4 = r51;
        goto L11
    L5:
        r2 = r50;
        goto L7
    }
}
