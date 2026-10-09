package com.stockbit.remote.models.request;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/stockbit/remote/models/request/CommandRequest;", "", "stock", "", "value", "item", "operator", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStock", "()Ljava/lang/String;", "setStock", "(Ljava/lang/String;)V", "getValue", "setValue", "getItem", "setItem", "getOperator", "setOperator", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CommandRequest {

    @SerializedName("item")
    private String item;

    @SerializedName("operator")
    private String operator;

    @SerializedName("stock")
    private String stock;

    @SerializedName("value")
    private String value;

    public CommandRequest(String r2, String r3, String r4, String r5) {
        p.l(r2, "stock");
        p.l(r3, "value");
        p.l(r4, "item");
        p.l(r5, "operator");
        this.stock = r2;
        this.value = r3;
        this.item = r4;
        this.operator = r5;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CommandRequest) == true) goto L8;
        return false;
    L8:
        CommandRequest r52 = (CommandRequest) r5;
        if (p.g(this.stock, r52.stock) == true) goto L12;
        return false;
    L12:
        if (p.g(this.value, r52.value) == true) goto L15;
        return false;
    L15:
        if (p.g(this.item, r52.item) == true) goto L18;
        return false;
    L18:
        if (p.g(this.operator, r52.operator) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.stock.hashCode() * 31) + this.value.hashCode()) * 31) + this.item.hashCode()) * 31) + this.operator.hashCode();
    }

    public String toString() {
        return "CommandRequest(stock=" + this.stock + ", value=" + this.value + ", item=" + this.item + ", operator=" + this.operator + ')';
    }
}
