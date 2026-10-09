package com.iab.digitalidentity.sdk.core.network.model;

import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR6\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$SlikFormAnswer", "", "", "flow", "Ljava/util/HashMap;", "Lcom/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$Answer;", "Lkotlin/collections/HashMap;", "answers", "<init>", "(Ljava/lang/String;Ljava/util/HashMap;)V", "Ljava/lang/String;", "getFlow", "()Ljava/lang/String;", "Ljava/util/HashMap;", "getAnswers", "()Ljava/util/HashMap;", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnifiedKycResponse$SlikFormAnswer {

    @SerializedName("answers")
    private final HashMap<String, UnifiedKycResponse$Answer> answers;

    @SerializedName("flow")
    private final String flow;

    public UnifiedKycResponse$SlikFormAnswer(String r2, HashMap<String, UnifiedKycResponse$Answer> r3) {
        p.l(r2, "flow");
        p.l(r3, "answers");
        this.flow = r2;
        this.answers = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UnifiedKycResponse$SlikFormAnswer) == true) goto L8;
        return false;
    L8:
        UnifiedKycResponse$SlikFormAnswer r52 = (UnifiedKycResponse$SlikFormAnswer) r5;
        if (p.g(this.flow, r52.flow) == true) goto L12;
        return false;
    L12:
        if (p.g(this.answers, r52.answers) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r02 = this.flow.hashCode() * 31;
        return this.answers.hashCode() + r02;
    }

    public final String toString() {
        return "SlikFormAnswer(flow=" + this.flow + ", answers=" + this.answers + ")";
    }

    public /* synthetic */ UnifiedKycResponse$SlikFormAnswer(String r1, HashMap r2, int r3, i r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = "POST_UPLOAD";
    L5:
        this(r1, r2);
    }
}
