package com.stockbit.domain.model.company.research;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class CompanyResearchEntity {

    /* renamed from: a, reason: collision with root package name */
    public final String f81846a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81847b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f81848c;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/stockbit/domain/model/company/research/CompanyResearchEntity$CompanyLinkEntity;", "", "ref", "Lcom/stockbit/domain/model/company/research/CompanyResearchEntity$CompanyRefEntity;", "type", "", "<init>", "(Lcom/stockbit/domain/model/company/research/CompanyResearchEntity$CompanyRefEntity;Ljava/lang/String;)V", "getRef", "()Lcom/stockbit/domain/model/company/research/CompanyResearchEntity$CompanyRefEntity;", "setRef", "(Lcom/stockbit/domain/model/company/research/CompanyResearchEntity$CompanyRefEntity;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CompanyLinkEntity {

        @SerializedName("ref")
        private CompanyRefEntity ref;

        @SerializedName("type")
        private String type;

        /* JADX WARN: Multi-variable type inference failed */
        public CompanyLinkEntity() {
            Object[] r02 = 0 == true ? 1 : 0;
            this(null, r02, 3, 0 == true ? 1 : 0);
        }

        public final CompanyRefEntity a() {
            return this.ref;
        }

        public final String b() {
            return this.type;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof CompanyLinkEntity) == true) goto L8;
            return false;
        L8:
            CompanyLinkEntity r52 = (CompanyLinkEntity) r5;
            if (p.g(this.ref, r52.ref) == true) goto L12;
            return false;
        L12:
            if (p.g(this.type, r52.type) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            CompanyRefEntity r02 = this.ref;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.type;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "CompanyLinkEntity(ref=" + this.ref + ", type=" + this.type + ")";
        }

        public CompanyLinkEntity(CompanyRefEntity r1, String r2) {
            this.ref = r1;
            this.type = r2;
        }

        public /* synthetic */ CompanyLinkEntity(CompanyRefEntity r2, String r3, int r4, i r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = null;
        L8:
            this(r2, r3);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/stockbit/domain/model/company/research/CompanyResearchEntity$CompanyPropertyEntity;", "", "link", "Lcom/stockbit/domain/model/company/research/CompanyResearchEntity$CompanyLinkEntity;", Constants.KEY_TEXT, "", "<init>", "(Lcom/stockbit/domain/model/company/research/CompanyResearchEntity$CompanyLinkEntity;Ljava/lang/String;)V", "getLink", "()Lcom/stockbit/domain/model/company/research/CompanyResearchEntity$CompanyLinkEntity;", "setLink", "(Lcom/stockbit/domain/model/company/research/CompanyResearchEntity$CompanyLinkEntity;)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CompanyPropertyEntity {

        @SerializedName("link")
        private CompanyLinkEntity link;

        @SerializedName(Constants.KEY_TEXT)
        private String text;

        /* JADX WARN: Multi-variable type inference failed */
        public CompanyPropertyEntity() {
            Object[] r02 = 0 == true ? 1 : 0;
            this(null, r02, 3, 0 == true ? 1 : 0);
        }

        public final CompanyLinkEntity a() {
            return this.link;
        }

        public final String b() {
            return this.text;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof CompanyPropertyEntity) == true) goto L8;
            return false;
        L8:
            CompanyPropertyEntity r52 = (CompanyPropertyEntity) r5;
            if (p.g(this.link, r52.link) == true) goto L12;
            return false;
        L12:
            if (p.g(this.text, r52.text) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            CompanyLinkEntity r02 = this.link;
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
            return "CompanyPropertyEntity(link=" + this.link + ", text=" + this.text + ")";
        }

        public CompanyPropertyEntity(CompanyLinkEntity r1, String r2) {
            this.link = r1;
            this.text = r2;
        }

        public /* synthetic */ CompanyPropertyEntity(CompanyLinkEntity r2, String r3, int r4, i r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = null;
        L8:
            this(r2, r3);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/stockbit/domain/model/company/research/CompanyResearchEntity$CompanyRefEntity;", "", "symbol", "", "url", "username", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getUrl", "setUrl", "getUsername", "setUsername", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CompanyRefEntity {

        @SerializedName("symbol")
        private String symbol;

        @SerializedName("url")
        private String url;

        @SerializedName("username")
        private String username;

        public CompanyRefEntity(String r1, String r2, String r3) {
            this.symbol = r1;
            this.url = r2;
            this.username = r3;
        }

        public final String a() {
            return this.symbol;
        }

        public final String b() {
            return this.url;
        }

        public final String c() {
            return this.username;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof CompanyRefEntity) == true) goto L8;
            return false;
        L8:
            CompanyRefEntity r52 = (CompanyRefEntity) r5;
            if (p.g(this.symbol, r52.symbol) == true) goto L12;
            return false;
        L12:
            if (p.g(this.url, r52.url) == true) goto L15;
            return false;
        L15:
            if (p.g(this.username, r52.username) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            String r02 = this.symbol;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.url;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            String r23 = this.username;
            if (r23 == null) goto L15;
            r1 = r23.hashCode();
        L15:
            return r05 + r1;
        L9:
            r22 = r2.hashCode();
            goto L10
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "CompanyRefEntity(symbol=" + this.symbol + ", url=" + this.url + ", username=" + this.username + ")";
        }
    }

    public CompanyResearchEntity(String r2, String r3, HashMap r4) {
        p.l(r2, "symbol");
        p.l(r3, "content");
        p.l(r4, "masks");
        this.f81846a = r2;
        this.f81847b = r3;
        this.f81848c = r4;
    }

    public final String a() {
        return this.f81847b;
    }

    public final HashMap b() {
        return this.f81848c;
    }

    public final String c() {
        return this.f81846a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CompanyResearchEntity) == true) goto L8;
        return false;
    L8:
        CompanyResearchEntity r52 = (CompanyResearchEntity) r5;
        if (p.g(this.f81846a, r52.f81846a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81847b, r52.f81847b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81848c, r52.f81848c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f81846a.hashCode() * 31) + this.f81847b.hashCode()) * 31) + this.f81848c.hashCode();
    }

    public String toString() {
        return "CompanyResearchEntity(symbol=" + this.f81846a + ", content=" + this.f81847b + ", masks=" + this.f81848c + ")";
    }
}
