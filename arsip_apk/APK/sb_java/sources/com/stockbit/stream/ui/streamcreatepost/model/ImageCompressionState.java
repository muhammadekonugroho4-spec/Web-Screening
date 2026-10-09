package com.stockbit.stream.ui.streamcreatepost.model;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/stream/ui/streamcreatepost/model/ImageCompressionState;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "COMPRESSING", "COMPRESSED", "ERROR", "stream_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum ImageCompressionState extends Enum<ImageCompressionState> {
    public static final ImageCompressionState COMPRESSED = null;
    public static final ImageCompressionState COMPRESSING = null;
    public static final ImageCompressionState ERROR = null;
    public static final ImageCompressionState IDLE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ImageCompressionState[] f145142a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f145143b = null;

    static {
        IDLE = new ImageCompressionState("IDLE", 0);
        COMPRESSING = new ImageCompressionState("COMPRESSING", 1);
        COMPRESSED = new ImageCompressionState("COMPRESSED", 2);
        ERROR = new ImageCompressionState("ERROR", 3);
        ImageCompressionState[] r02 = a();
        f145142a = r02;
        f145143b = b.a(r02);
    }

    ImageCompressionState(String r1, int r2) {
    }

    public static final /* synthetic */ ImageCompressionState[] a() {
        return new ImageCompressionState[]{IDLE, COMPRESSING, COMPRESSED, ERROR};
    }

    public static kotlin.enums.a getEntries() {
        return f145143b;
    }

    public static ImageCompressionState valueOf(String r1) {
        return (ImageCompressionState) Enum.valueOf(ImageCompressionState.class, r1);
    }

    public static ImageCompressionState[] values() {
        return (ImageCompressionState[]) f145142a.clone();
    }
}
