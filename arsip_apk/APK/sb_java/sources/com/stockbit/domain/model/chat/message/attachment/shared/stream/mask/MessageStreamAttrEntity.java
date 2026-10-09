package com.stockbit.domain.model.chat.message.attachment.shared.stream.mask;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0083\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006&"}, d2 = {"Lcom/stockbit/domain/model/chat/message/attachment/shared/stream/mask/MessageStreamAttrEntity;", "Ljava/io/Serializable;", "href", "", "dataCompany", "className", FirebaseAnalytics.Param.METHOD, "trigger", "postSubmitCallback", "preSubmitCallback", "target", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHref", "()Ljava/lang/String;", "getDataCompany", "getClassName", "getMethod", "getTrigger", "getPostSubmitCallback", "getPreSubmitCallback", "getTarget", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MessageStreamAttrEntity implements Serializable {
    private final String className;
    private final String dataCompany;
    private final String href;
    private final String method;
    private final String postSubmitCallback;
    private final String preSubmitCallback;
    private final String target;
    private final String trigger;

    public MessageStreamAttrEntity(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8) {
        this.href = r1;
        this.dataCompany = r2;
        this.className = r3;
        this.method = r4;
        this.trigger = r5;
        this.postSubmitCallback = r6;
        this.preSubmitCallback = r7;
        this.target = r8;
    }

    public final String a() {
        return this.className;
    }

    public final String b() {
        return this.dataCompany;
    }

    public final String c() {
        return this.href;
    }

    public final String d() {
        return this.target;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MessageStreamAttrEntity) == true) goto L8;
        return false;
    L8:
        MessageStreamAttrEntity r52 = (MessageStreamAttrEntity) r5;
        if (p.g(this.href, r52.href) == true) goto L12;
        return false;
    L12:
        if (p.g(this.dataCompany, r52.dataCompany) == true) goto L15;
        return false;
    L15:
        if (p.g(this.className, r52.className) == true) goto L18;
        return false;
    L18:
        if (p.g(this.method, r52.method) == true) goto L21;
        return false;
    L21:
        if (p.g(this.trigger, r52.trigger) == true) goto L24;
        return false;
    L24:
        if (p.g(this.postSubmitCallback, r52.postSubmitCallback) == true) goto L27;
        return false;
    L27:
        if (p.g(this.preSubmitCallback, r52.preSubmitCallback) == true) goto L30;
        return false;
    L30:
        if (p.g(this.target, r52.target) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public int hashCode() {
        String r02 = this.href;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.dataCompany;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.className;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.method;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.trigger;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.postSubmitCallback;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.preSubmitCallback;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.target;
        if (r213 == null) goto L35;
        r1 = r213.hashCode();
    L35:
        return r010 + r1;
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

    public String toString() {
        return "MessageStreamAttrEntity(href=" + this.href + ", dataCompany=" + this.dataCompany + ", className=" + this.className + ", method=" + this.method + ", trigger=" + this.trigger + ", postSubmitCallback=" + this.postSubmitCallback + ", preSubmitCallback=" + this.preSubmitCallback + ", target=" + this.target + ")";
    }
}
