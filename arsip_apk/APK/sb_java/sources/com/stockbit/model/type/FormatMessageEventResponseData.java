package com.stockbit.model.type;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/stockbit/model/type/FormatMessageEventResponseData;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT_FORMAT_REGULAR", "TEXT_FORMAT_BOLD", "TEXT_FORMAT_ITALIC", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum FormatMessageEventResponseData extends Enum<FormatMessageEventResponseData> {
    public static final a Companion = null;
    public static final FormatMessageEventResponseData TEXT_FORMAT_BOLD = null;
    public static final FormatMessageEventResponseData TEXT_FORMAT_ITALIC = null;
    public static final FormatMessageEventResponseData TEXT_FORMAT_REGULAR = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FormatMessageEventResponseData[] f122177a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122178b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        TEXT_FORMAT_REGULAR = new FormatMessageEventResponseData("TEXT_FORMAT_REGULAR", 0);
        TEXT_FORMAT_BOLD = new FormatMessageEventResponseData("TEXT_FORMAT_BOLD", 1);
        TEXT_FORMAT_ITALIC = new FormatMessageEventResponseData("TEXT_FORMAT_ITALIC", 2);
        FormatMessageEventResponseData[] r02 = a();
        f122177a = r02;
        f122178b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    FormatMessageEventResponseData(String r1, int r2) {
    }

    public static final /* synthetic */ FormatMessageEventResponseData[] a() {
        return new FormatMessageEventResponseData[]{TEXT_FORMAT_REGULAR, TEXT_FORMAT_BOLD, TEXT_FORMAT_ITALIC};
    }

    public static kotlin.enums.a getEntries() {
        return f122178b;
    }

    public static FormatMessageEventResponseData valueOf(String r1) {
        return (FormatMessageEventResponseData) Enum.valueOf(FormatMessageEventResponseData.class, r1);
    }

    public static FormatMessageEventResponseData[] values() {
        return (FormatMessageEventResponseData[]) f122177a.clone();
    }
}
