package com.stockbit.model.entity.chat;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012,\b\u0002\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003j\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000e\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003j\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u0006HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003JC\u0010\u0010\u001a\u00020\u00002,\b\u0002\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003j\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0004HÖ\u0081\u0004R:\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003j\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/stockbit/model/entity/chat/MaskedTextMessageResponseData;", "", "masks", "Ljava/util/HashMap;", "", "Lcom/stockbit/model/entity/chat/MaskedTextMessageFormatResponseData;", "Lkotlin/collections/HashMap;", Constants.KEY_TEXT, "<init>", "(Ljava/util/HashMap;Ljava/lang/String;)V", "getMasks", "()Ljava/util/HashMap;", "getText", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MaskedTextMessageResponseData {

    @SerializedName("masks")
    private final HashMap<String, Object> masks;

    @SerializedName(Constants.KEY_TEXT)
    private final String text;

    /* JADX WARN: Multi-variable type inference failed */
    public MaskedTextMessageResponseData() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MaskedTextMessageResponseData) == true) goto L8;
        return false;
    L8:
        MaskedTextMessageResponseData r52 = (MaskedTextMessageResponseData) r5;
        if (p.g(this.masks, r52.masks) == true) goto L12;
        return false;
    L12:
        if (p.g(this.text, r52.text) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        HashMap<String, Object> r02 = this.masks;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.text;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "MaskedTextMessageResponseData(masks=" + this.masks + ", text=" + this.text + ')';
    }

    public MaskedTextMessageResponseData(HashMap<String, Object> r1, String r2) {
        this.masks = r1;
        this.text = r2;
    }

    public /* synthetic */ MaskedTextMessageResponseData(HashMap r2, String r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r2, r3);
    }
}
