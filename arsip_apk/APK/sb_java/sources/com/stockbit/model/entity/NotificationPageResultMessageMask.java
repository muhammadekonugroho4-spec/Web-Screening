package com.stockbit.model.entity;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/model/entity/NotificationPageResultMessageMask;", "", Constants.KEY_KEY, "", "payload", "Lcom/stockbit/model/entity/NotificationPageResultMessageMask$Payload;", "<init>", "(Ljava/lang/String;Lcom/stockbit/model/entity/NotificationPageResultMessageMask$Payload;)V", "getKey", "()Ljava/lang/String;", "getPayload", "()Lcom/stockbit/model/entity/NotificationPageResultMessageMask$Payload;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Payload", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NotificationPageResultMessageMask {

    @SerializedName(Constants.KEY_KEY)
    private final String key;

    @SerializedName("payload")
    private final Payload payload;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003JR\u0010\"\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010#J\u0014\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010'\u001a\u00020\u0004HÖ\u0081\u0004J\n\u0010(\u001a\u00020\u0007HÖ\u0081\u0004R(\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R \u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018¨\u0006)"}, d2 = {"Lcom/stockbit/model/entity/NotificationPageResultMessageMask$Payload;", "", "actors", "", "", Constants.KEY_ID, "tag", "", Constants.KEY_TEXT, "type", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActors", "()Ljava/util/List;", "setActors", "(Ljava/util/List;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "getText", "setText", "getType", "setType", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stockbit/model/entity/NotificationPageResultMessageMask$Payload;", "equals", "", "other", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Payload {

        @SerializedName("actors")
        private List<Integer> actors;

        /* renamed from: id, reason: collision with root package name */
        @SerializedName(Constants.KEY_ID)
        private Integer f122028id;

        @SerializedName("tag")
        private String tag;

        @SerializedName(Constants.KEY_TEXT)
        private String text;

        @SerializedName("type")
        private String type;

        public Payload(List<Integer> r1, Integer r2, String r3, String r4, String r5) {
            this.actors = r1;
            this.f122028id = r2;
            this.tag = r3;
            this.text = r4;
            this.type = r5;
        }

        public final String a() {
            return this.tag;
        }

        public final String b() {
            return this.text;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Payload) == true) goto L8;
            return false;
        L8:
            Payload r52 = (Payload) r5;
            if (p.g(this.actors, r52.actors) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f122028id, r52.f122028id) == true) goto L15;
            return false;
        L15:
            if (p.g(this.tag, r52.tag) == true) goto L18;
            return false;
        L18:
            if (p.g(this.text, r52.text) == true) goto L21;
            return false;
        L21:
            if (p.g(this.type, r52.type) == true) goto L23;
            return false;
        L23:
            return true;
        }

        public int hashCode() {
            List<Integer> r02 = this.actors;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            Integer r2 = this.f122028id;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            String r23 = this.tag;
            if (r23 != null) goto L13;
            int r24 = 0;
        L14:
            int r06 = (r05 + r24) * 31;
            String r25 = this.text;
            if (r25 != null) goto L17;
            int r26 = 0;
        L18:
            int r07 = (r06 + r26) * 31;
            String r27 = this.type;
            if (r27 == null) goto L23;
            r1 = r27.hashCode();
        L23:
            return r07 + r1;
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
            return "Payload(actors=" + this.actors + ", id=" + this.f122028id + ", tag=" + this.tag + ", text=" + this.text + ", type=" + this.type + ')';
        }
    }

    public NotificationPageResultMessageMask(String r2, Payload r3) {
        p.l(r3, "payload");
        this.key = r2;
        this.payload = r3;
    }

    public final String a() {
        return this.key;
    }

    public final Payload b() {
        return this.payload;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof NotificationPageResultMessageMask) == true) goto L8;
        return false;
    L8:
        NotificationPageResultMessageMask r52 = (NotificationPageResultMessageMask) r5;
        if (p.g(this.key, r52.key) == true) goto L12;
        return false;
    L12:
        if (p.g(this.payload, r52.payload) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.key;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + this.payload.hashCode();
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "NotificationPageResultMessageMask(key=" + this.key + ", payload=" + this.payload + ')';
    }
}
