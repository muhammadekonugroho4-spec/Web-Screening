package y0;

import B.C1955i;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.textfield.TextInputLayout;
import com.iab.digitalidentity.sdk.core.model.LocalisedMessage;
import com.iab.digitalidentity.sdk.core.model.OneKycMotherMaidenNameValidation;
import com.iab.digitalidentity.sdk.core.network.model.UnifiedKycResponse$Answer;
import com.iab.digitalidentity.sdk.core.network.model.UnifiedKycResponse$Choice;
import com.iab.digitalidentity.sdk.core.network.model.UnifiedKycResponse$SlikFormAnswer;
import com.iab.digitalidentity.sdk.slikform.OneKycSlikFormActivity;
import com.iab.digitalidentity.ui.commonviews.KycSdkFullScreenLoader;
import i0.AbstractC11475J;
import i0.AbstractC11492p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Lambda;

/* renamed from: y0.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12316l extends Lambda implements kotlin.jvm.functions.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OneKycSlikFormActivity f184604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1955i f184605b;

    public C12316l(OneKycSlikFormActivity r1, C1955i r2) {
        this.f184604a = r1;
        this.f184605b = r2;
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        if (this.f184604a.f40554S.length() > 2) goto L6;
        this.f184605b.f239g.setError(this.f184604a.getString(com.iab.digitalidentity.j.f39953y));
    L35:
        return kotlin.w.f180450a;
    L6:
        if (((C12305a) ((t0.E) this.f184604a.f184189A.getValue())).m3(this.f184604a.f40554S) == false) goto L8;
        String r02 = ((C12305a) ((t0.E) this.f184604a.f184189A.getValue())).f184582p;
        this.f184605b.f239g.setError(this.f184604a.getString(com.iab.digitalidentity.j.f39951x, new Object[]{r02}));
        goto L35
    L8:
        C12305a r03 = (C12305a) ((t0.E) this.f184604a.f184189A.getValue());
        String r1 = this.f184604a.f40554S;
        r03.getClass();
        kotlin.jvm.internal.p.l(r1, AppMeasurementSdk.ConditionalUserProperty.NAME);
        ((H.l) ((H.c) r03.f184574h.getValue())).getClass();
        AbstractC11492p.a("BlackListingValidation fetched from Default", "KycPlusRemoteConfig");
        Object[] r4 = 0;
        Object[] r42 = 0;
        Object[] r43 = 0;
        Object[] r44 = 0;
        Object[] r45 = 0;
        int r5 = 3;
        String r3 = new OneKycMotherMaidenNameValidation(null, 0 == true ? 1 : 0, r5, 0 == true ? 1 : 0).getValidationRegex();
        if (r3 != null) goto L36;
        r3 = "";
    L36:
        Pattern.compile(r3);     // Catch: Exception -> L13
    L15:
        if (Pattern.matches(r3, r1) == true) goto L25;
        TextInputLayout r12 = this.f184605b.f239g;
        C12305a r32 = (C12305a) ((t0.E) this.f184604a.f184189A.getValue());
        OneKycSlikFormActivity r6 = this.f184604a;
        r32.getClass();
        kotlin.jvm.internal.p.l(r6, "context");
        ((H.l) ((H.c) r32.f184574h.getValue())).getClass();
        AbstractC11492p.a("BlackListingValidation fetched from Default", "KycPlusRemoteConfig");
        LocalisedMessage r04 = new OneKycMotherMaidenNameValidation(r45 == true ? 1 : 0, r44 == true ? 1 : 0, r5, r43 == true ? 1 : 0).getMessage();
        if (kotlin.jvm.internal.p.g(AbstractC11475J.d(r6), Constants.KEY_ID) == false) goto L19;
        String r05 = r04.getId();
    L20:
        if (r05 != null) goto L22;
    L23:
        r05 = r6.getString(com.iab.digitalidentity.j.f39955z);
        kotlin.jvm.internal.p.k(r05, "context.getString(R.stri…aiden_name_invalid_error)");
    L24:
        r12.setError(r05);
        goto L35
    L22:
        if (kotlin.text.B.x0(r05) == false) goto L24;
    L19:
        r05 = r04.getEn();
        goto L20
    L25:
        OneKycSlikFormActivity r06 = this.f184604a;
        ((C12305a) ((t0.E) r06.f184189A.getValue())).k3(T.l.f1211j);
        KycSdkFullScreenLoader r13 = ((B.I) r06.f40546K.getValue()).f141c;
        kotlin.jvm.internal.p.k(r13, "binding.loaderContainer");
        kotlin.jvm.internal.p.l(r13, "<this>");
        r13.setVisibility(0);
        HashMap r14 = new HashMap();
        Iterator r2 = r06.f40549N.entrySet().iterator();
    L27:
        if (r2.hasNext() == false) goto L33;
        Map.Entry r33 = (Map.Entry) r2.next();
        Object r52 = r33.getKey();
        if (kotlin.jvm.internal.p.g(r33.getKey(), "mother_maiden_name") == false) goto L31;
        final String r62 = r06.f40554S;
        Object r34 = new UnifiedKycResponse$Answer(r62);
    L32:
        r14.put(r52, r34);
        goto L27
    L31:
        final String r35 = ((UnifiedKycResponse$Choice) ((C12305a) ((t0.E) r06.f184189A.getValue())).j3((String) r33.getKey()).get(((Number) r33.getValue()).intValue())).b();
        r34 = new UnifiedKycResponse$Answer(r35);
        goto L32
    L33:
        C12305a r07 = (C12305a) ((t0.E) r06.f184189A.getValue());
        Object[] r46 = r42 == true ? 1 : 0;
        r07.l3(new UnifiedKycResponse$SlikFormAnswer(r46, r14, 1, r4 == true ? 1 : 0));
    L13:
        r3 = "^[ A-Za-z-]*$";
        goto L15
    }
}
