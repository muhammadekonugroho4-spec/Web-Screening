package com.stockbit.domain.model.type.securities;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/domain/model/type/securities/ActionConfirmationType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ON_FINISH", "ON_REFRESH_PARENT_LAYOUT", "ON_CLOSE_DIALOG", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum ActionConfirmationType extends Enum<ActionConfirmationType> {
    public static final a Companion = null;
    public static final ActionConfirmationType ON_CLOSE_DIALOG = null;
    public static final ActionConfirmationType ON_FINISH = null;
    public static final ActionConfirmationType ON_REFRESH_PARENT_LAYOUT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ActionConfirmationType[] f86412a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86413b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        ON_FINISH = new ActionConfirmationType("ON_FINISH", 0, "ON_FINISH");
        ON_REFRESH_PARENT_LAYOUT = new ActionConfirmationType("ON_REFRESH_PARENT_LAYOUT", 1, "ON_REFRESH_PARENT_LAYOUT");
        ON_CLOSE_DIALOG = new ActionConfirmationType("ON_CLOSE_DIALOG", 2, "ON_CLOSE_DIALOG");
        ActionConfirmationType[] r02 = a();
        f86412a = r02;
        f86413b = b.a(r02);
        Companion = new a(null);
    }

    ActionConfirmationType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ ActionConfirmationType[] a() {
        return new ActionConfirmationType[]{ON_FINISH, ON_REFRESH_PARENT_LAYOUT, ON_CLOSE_DIALOG};
    }

    public static kotlin.enums.a getEntries() {
        return f86413b;
    }

    public static ActionConfirmationType valueOf(String r1) {
        return (ActionConfirmationType) Enum.valueOf(ActionConfirmationType.class, r1);
    }

    public static ActionConfirmationType[] values() {
        return (ActionConfirmationType[]) f86412a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
