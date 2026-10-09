package com.stockbit.domain.model.trusteddevice;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/stockbit/domain/model/trusteddevice/PromptResultStatusEntity;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "APPROVED", "REJECTED", "CANCELED", "EXPIRED", "WAITING", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum PromptResultStatusEntity extends Enum<PromptResultStatusEntity> {
    public static final PromptResultStatusEntity APPROVED = null;
    public static final PromptResultStatusEntity CANCELED = null;
    public static final a Companion = null;
    public static final PromptResultStatusEntity EXPIRED = null;
    public static final PromptResultStatusEntity REJECTED = null;
    public static final PromptResultStatusEntity WAITING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PromptResultStatusEntity[] f86112a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86113b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final PromptResultStatusEntity a(String r4) {
            p.l(r4, "value");
            if (r4.length() == 0) goto L5;
            Iterator<E> r02 = PromptResultStatusEntity.getEntries().iterator();
        L8:
            if (r02.hasNext() == false) goto L12;
            Object r1 = r02.next();
            if (p.g(((PromptResultStatusEntity) r1).getValue(), r4) == false) goto L8;
        L13:
            PromptResultStatusEntity r12 = (PromptResultStatusEntity) r1;
            if (r12 == null) goto L16;
            return r12;
        L16:
            return PromptResultStatusEntity.WAITING;
        L12:
            r1 = null;
            goto L13
        L5:
            return PromptResultStatusEntity.WAITING;
        }

        public a() {
        }
    }

    static {
        APPROVED = new PromptResultStatusEntity("APPROVED", 0, "PROMPT_STATUS_APPROVED");
        REJECTED = new PromptResultStatusEntity("REJECTED", 1, "PROMPT_STATUS_REJECTED");
        CANCELED = new PromptResultStatusEntity("CANCELED", 2, "PROMPT_STATUS_CANCELED");
        EXPIRED = new PromptResultStatusEntity("EXPIRED", 3, "PROMPT_STATUS_EXPIRED");
        WAITING = new PromptResultStatusEntity("WAITING", 4, "PROMPT_STATUS_UNSPECIFIED");
        PromptResultStatusEntity[] r02 = a();
        f86112a = r02;
        f86113b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    PromptResultStatusEntity(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ PromptResultStatusEntity[] a() {
        return new PromptResultStatusEntity[]{APPROVED, REJECTED, CANCELED, EXPIRED, WAITING};
    }

    public static kotlin.enums.a getEntries() {
        return f86113b;
    }

    public static PromptResultStatusEntity valueOf(String r1) {
        return (PromptResultStatusEntity) Enum.valueOf(PromptResultStatusEntity.class, r1);
    }

    public static PromptResultStatusEntity[] values() {
        return (PromptResultStatusEntity[]) f86112a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
