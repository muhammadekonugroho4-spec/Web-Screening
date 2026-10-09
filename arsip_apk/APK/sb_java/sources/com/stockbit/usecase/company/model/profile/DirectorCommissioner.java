package com.stockbit.usecase.company.model.profile;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stockbit/usecase/company/model/profile/DirectorCommissioner;", "", "<init>", "(Ljava/lang/String;I)V", "DIRECTOR_PRESIDENT", "DIRECTOR_VICE_PRESIDENT", "DIRECTOR", "COMMISSIONER_PRESIDENT", "COMMISSIONER_VICE_PRESIDENT", "COMMISSIONER", "INDEPENDENT_COMMISSIONER_PRESIDENT", "INDEPENDENT_COMMISSIONER_VICE_PRESIDENT", "INDEPENDENT_COMMISSIONER", "usecase-company"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum DirectorCommissioner extends Enum<DirectorCommissioner> {
    public static final DirectorCommissioner COMMISSIONER = null;
    public static final DirectorCommissioner COMMISSIONER_PRESIDENT = null;
    public static final DirectorCommissioner COMMISSIONER_VICE_PRESIDENT = null;
    public static final DirectorCommissioner DIRECTOR = null;
    public static final DirectorCommissioner DIRECTOR_PRESIDENT = null;
    public static final DirectorCommissioner DIRECTOR_VICE_PRESIDENT = null;
    public static final DirectorCommissioner INDEPENDENT_COMMISSIONER = null;
    public static final DirectorCommissioner INDEPENDENT_COMMISSIONER_PRESIDENT = null;
    public static final DirectorCommissioner INDEPENDENT_COMMISSIONER_VICE_PRESIDENT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DirectorCommissioner[] f156469a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f156470b = null;

    static {
        DIRECTOR_PRESIDENT = new DirectorCommissioner("DIRECTOR_PRESIDENT", 0);
        DIRECTOR_VICE_PRESIDENT = new DirectorCommissioner("DIRECTOR_VICE_PRESIDENT", 1);
        DIRECTOR = new DirectorCommissioner("DIRECTOR", 2);
        COMMISSIONER_PRESIDENT = new DirectorCommissioner("COMMISSIONER_PRESIDENT", 3);
        COMMISSIONER_VICE_PRESIDENT = new DirectorCommissioner("COMMISSIONER_VICE_PRESIDENT", 4);
        COMMISSIONER = new DirectorCommissioner("COMMISSIONER", 5);
        INDEPENDENT_COMMISSIONER_PRESIDENT = new DirectorCommissioner("INDEPENDENT_COMMISSIONER_PRESIDENT", 6);
        INDEPENDENT_COMMISSIONER_VICE_PRESIDENT = new DirectorCommissioner("INDEPENDENT_COMMISSIONER_VICE_PRESIDENT", 7);
        INDEPENDENT_COMMISSIONER = new DirectorCommissioner("INDEPENDENT_COMMISSIONER", 8);
        DirectorCommissioner[] r02 = a();
        f156469a = r02;
        f156470b = kotlin.enums.b.a(r02);
    }

    DirectorCommissioner(String r1, int r2) {
    }

    public static final /* synthetic */ DirectorCommissioner[] a() {
        return new DirectorCommissioner[]{DIRECTOR_PRESIDENT, DIRECTOR_VICE_PRESIDENT, DIRECTOR, COMMISSIONER_PRESIDENT, COMMISSIONER_VICE_PRESIDENT, COMMISSIONER, INDEPENDENT_COMMISSIONER_PRESIDENT, INDEPENDENT_COMMISSIONER_VICE_PRESIDENT, INDEPENDENT_COMMISSIONER};
    }

    public static kotlin.enums.a getEntries() {
        return f156470b;
    }

    public static DirectorCommissioner valueOf(String r1) {
        return (DirectorCommissioner) Enum.valueOf(DirectorCommissioner.class, r1);
    }

    public static DirectorCommissioner[] values() {
        return (DirectorCommissioner[]) f156469a.clone();
    }
}
