package com.stockbit.usecase.chat.model.type;

import com.iab.digitalidentity.sdk.core.model.GoPayPlusCameraConfigKt;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/stockbit/usecase/chat/model/type/ChatStreamVoteType;", "", "value", "", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getType", "AGREE", "DISAGREE", "Companion", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum ChatStreamVoteType extends Enum<ChatStreamVoteType> {
    public static final ChatStreamVoteType AGREE = null;
    public static final a Companion = null;
    public static final ChatStreamVoteType DISAGREE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ChatStreamVoteType[] f155709a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f155710b = null;
    private final String type;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        AGREE = new ChatStreamVoteType("AGREE", 0, GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A, "Agree");
        DISAGREE = new ChatStreamVoteType("DISAGREE", 1, "0", "Disagree");
        ChatStreamVoteType[] r02 = a();
        f155709a = r02;
        f155710b = b.a(r02);
        Companion = new a(null);
    }

    ChatStreamVoteType(String r1, int r2, String r3, String r4) {
        this.value = r3;
        this.type = r4;
    }

    public static final /* synthetic */ ChatStreamVoteType[] a() {
        return new ChatStreamVoteType[]{AGREE, DISAGREE};
    }

    public static kotlin.enums.a getEntries() {
        return f155710b;
    }

    public static ChatStreamVoteType valueOf(String r1) {
        return (ChatStreamVoteType) Enum.valueOf(ChatStreamVoteType.class, r1);
    }

    public static ChatStreamVoteType[] values() {
        return (ChatStreamVoteType[]) f155709a.clone();
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }
}
