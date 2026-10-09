package com.stockbit.domain.model.chat.message.attachment.shared.stream.polling;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003Jz\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010/J\u0014\u00100\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u000102HÖ\u0083\u0004J\n\u00103\u001a\u00020\tHÖ\u0081\u0004J\n\u00104\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017¨\u00065"}, d2 = {"Lcom/stockbit/domain/model/chat/message/attachment/shared/stream/polling/MessageStreamPollingEntity;", "Ljava/io/Serializable;", Constants.KEY_ID, "", "startDate", "", "endDate", "question", "totalVoters", "", "expired", "", "selectedOptionId", "options", "", "Lcom/stockbit/domain/model/chat/message/attachment/shared/stream/polling/MessageStreamOptionEntity;", "isPinned", "messageExpired", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/Integer;Ljava/util/List;ZLjava/lang/String;)V", "getId", "()J", "getStartDate", "()Ljava/lang/String;", "getEndDate", "getQuestion", "getTotalVoters", "()I", "getExpired", "()Z", "getSelectedOptionId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOptions", "()Ljava/util/List;", "getMessageExpired", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", Constants.COPY_TYPE, "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/Integer;Ljava/util/List;ZLjava/lang/String;)Lcom/stockbit/domain/model/chat/message/attachment/shared/stream/polling/MessageStreamPollingEntity;", "equals", "other", "", "hashCode", "toString", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MessageStreamPollingEntity implements Serializable {
    private final String endDate;
    private final boolean expired;

    /* renamed from: id, reason: collision with root package name */
    private final long f81274id;
    private final boolean isPinned;
    private final String messageExpired;
    private final List<MessageStreamOptionEntity> options;
    private final String question;
    private final Integer selectedOptionId;
    private final String startDate;
    private final int totalVoters;

    public MessageStreamPollingEntity(long r2, String r4, String r5, String r6, int r7, boolean r8, Integer r9, List r10, boolean r11, String r12) {
        p.l(r4, "startDate");
        p.l(r5, "endDate");
        p.l(r6, "question");
        p.l(r10, "options");
        p.l(r12, "messageExpired");
        this.f81274id = r2;
        this.startDate = r4;
        this.endDate = r5;
        this.question = r6;
        this.totalVoters = r7;
        this.expired = r8;
        this.selectedOptionId = r9;
        this.options = r10;
        this.isPinned = r11;
        this.messageExpired = r12;
    }

    public final String a() {
        return this.endDate;
    }

    public final boolean b() {
        return this.expired;
    }

    public final long c() {
        return this.f81274id;
    }

    public final String d() {
        return this.messageExpired;
    }

    public final List e() {
        return this.options;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof MessageStreamPollingEntity) == true) goto L8;
        return false;
    L8:
        MessageStreamPollingEntity r82 = (MessageStreamPollingEntity) r8;
        if (this.f81274id == r82.f81274id) goto L12;
        return false;
    L12:
        if (p.g(this.startDate, r82.startDate) == true) goto L15;
        return false;
    L15:
        if (p.g(this.endDate, r82.endDate) == true) goto L18;
        return false;
    L18:
        if (p.g(this.question, r82.question) == true) goto L21;
        return false;
    L21:
        if (this.totalVoters == r82.totalVoters) goto L24;
        return false;
    L24:
        if (this.expired == r82.expired) goto L27;
        return false;
    L27:
        if (p.g(this.selectedOptionId, r82.selectedOptionId) == true) goto L30;
        return false;
    L30:
        if (p.g(this.options, r82.options) == true) goto L33;
        return false;
    L33:
        if (this.isPinned == r82.isPinned) goto L36;
        return false;
    L36:
        if (p.g(this.messageExpired, r82.messageExpired) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.question;
    }

    public final Integer g() {
        return this.selectedOptionId;
    }

    public final String h() {
        return this.startDate;
    }

    public int hashCode() {
        int r02 = ((((((((((Long.hashCode(this.f81274id) * 31) + this.startDate.hashCode()) * 31) + this.endDate.hashCode()) * 31) + this.question.hashCode()) * 31) + Integer.hashCode(this.totalVoters)) * 31) + Boolean.hashCode(this.expired)) * 31;
        Integer r1 = this.selectedOptionId;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((((((r02 + r12) * 31) + this.options.hashCode()) * 31) + Boolean.hashCode(this.isPinned)) * 31) + this.messageExpired.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final int i() {
        return this.totalVoters;
    }

    public final boolean j() {
        return this.isPinned;
    }

    public String toString() {
        return "MessageStreamPollingEntity(id=" + this.f81274id + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", question=" + this.question + ", totalVoters=" + this.totalVoters + ", expired=" + this.expired + ", selectedOptionId=" + this.selectedOptionId + ", options=" + this.options + ", isPinned=" + this.isPinned + ", messageExpired=" + this.messageExpired + ")";
    }
}
