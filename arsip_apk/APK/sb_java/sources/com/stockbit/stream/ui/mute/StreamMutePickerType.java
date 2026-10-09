package com.stockbit.stream.ui.mute;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/stream/ui/mute/StreamMutePickerType;", "", "<init>", "(Ljava/lang/String;I)V", "MUTE_TYPE", "MUTE_REASON", "MUTE_DURATION", "stream_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum StreamMutePickerType extends Enum<StreamMutePickerType> {
    public static final StreamMutePickerType MUTE_DURATION = null;
    public static final StreamMutePickerType MUTE_REASON = null;
    public static final StreamMutePickerType MUTE_TYPE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StreamMutePickerType[] f144294a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f144295b = null;

    static {
        MUTE_TYPE = new StreamMutePickerType("MUTE_TYPE", 0);
        MUTE_REASON = new StreamMutePickerType("MUTE_REASON", 1);
        MUTE_DURATION = new StreamMutePickerType("MUTE_DURATION", 2);
        StreamMutePickerType[] r02 = a();
        f144294a = r02;
        f144295b = kotlin.enums.b.a(r02);
    }

    StreamMutePickerType(String r1, int r2) {
    }

    public static final /* synthetic */ StreamMutePickerType[] a() {
        return new StreamMutePickerType[]{MUTE_TYPE, MUTE_REASON, MUTE_DURATION};
    }

    public static kotlin.enums.a getEntries() {
        return f144295b;
    }

    public static StreamMutePickerType valueOf(String r1) {
        return (StreamMutePickerType) Enum.valueOf(StreamMutePickerType.class, r1);
    }

    public static StreamMutePickerType[] values() {
        return (StreamMutePickerType[]) f144294a.clone();
    }
}
