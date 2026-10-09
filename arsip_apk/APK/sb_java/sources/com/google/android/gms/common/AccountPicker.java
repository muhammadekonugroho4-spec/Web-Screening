package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class AccountPicker {

    public static class AccountChooserOptions {
        private Account zza;
        private boolean zzb;
        private ArrayList zzc;
        private ArrayList zzd;
        private boolean zze;
        private String zzf;
        private Bundle zzg;
        private boolean zzh;
        private int zzi;
        private String zzj;
        private boolean zzk;
        private zza zzl;
        private String zzm;
        private boolean zzn;
        private boolean zzo;

        public static class Builder {
            private Account zza;
            private ArrayList zzb;
            private ArrayList zzc;
            private boolean zzd;
            private String zze;
            private Bundle zzf;

            public Builder() {
                this.zzd = false;
            }

            public AccountChooserOptions build() {
                Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
                Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
                AccountChooserOptions r02 = new AccountChooserOptions();
                AccountChooserOptions.zzj(r02, this.zzc);
                AccountChooserOptions.zzk(r02, this.zzb);
                AccountChooserOptions.zzl(r02, this.zzd);
                AccountChooserOptions.zzm(r02, null);
                AccountChooserOptions.zzp(r02, null);
                AccountChooserOptions.zzq(r02, this.zzf);
                AccountChooserOptions.zzs(r02, this.zza);
                AccountChooserOptions.zzt(r02, false);
                AccountChooserOptions.zzu(r02, false);
                AccountChooserOptions.zzr(r02, null);
                AccountChooserOptions.zzv(r02, 0);
                AccountChooserOptions.zzw(r02, this.zze);
                AccountChooserOptions.zzx(r02, false);
                AccountChooserOptions.zzn(r02, false);
                AccountChooserOptions.zzo(r02, false);
                return r02;
            }

            public Builder setAllowableAccounts(List<Account> r2) {
                if (r2 != null) goto L4;
                ArrayList r22 = null;
            L5:
                this.zzb = r22;
                return this;
            L4:
                r22 = new ArrayList(r2);
                goto L5
            }

            public Builder setAllowableAccountsTypes(List<String> r2) {
                if (r2 != null) goto L4;
                ArrayList r22 = null;
            L5:
                this.zzc = r22;
                return this;
            L4:
                r22 = new ArrayList(r2);
                goto L5
            }

            public Builder setAlwaysShowAccountPicker(boolean r1) {
                this.zzd = r1;
                return this;
            }

            public Builder setOptionsForAddingAccount(Bundle r1) {
                this.zzf = r1;
                return this;
            }

            public Builder setSelectedAccount(Account r1) {
                this.zza = r1;
                return this;
            }

            public Builder setTitleOverrideText(String r1) {
                this.zze = r1;
                return this;
            }
        }

        public AccountChooserOptions() {
        }

        public static /* bridge */ /* synthetic */ boolean zzA(AccountChooserOptions r02) {
            boolean r03 = r02.zzo;
            return false;
        }

        public static /* bridge */ /* synthetic */ boolean zzB(AccountChooserOptions r02) {
            boolean r03 = r02.zzb;
            return false;
        }

        public static /* bridge */ /* synthetic */ boolean zzC(AccountChooserOptions r02) {
            boolean r03 = r02.zzh;
            return false;
        }

        public static /* bridge */ /* synthetic */ boolean zzD(AccountChooserOptions r02) {
            boolean r03 = r02.zzk;
            return false;
        }

        public static /* bridge */ /* synthetic */ int zza(AccountChooserOptions r02) {
            int r03 = r02.zzi;
            return 0;
        }

        public static /* bridge */ /* synthetic */ Account zzb(AccountChooserOptions r02) {
            return r02.zza;
        }

        public static /* bridge */ /* synthetic */ Bundle zzc(AccountChooserOptions r02) {
            return r02.zzg;
        }

        public static /* bridge */ /* synthetic */ zza zzd(AccountChooserOptions r02) {
            zza r03 = r02.zzl;
            return null;
        }

        public static /* bridge */ /* synthetic */ String zze(AccountChooserOptions r02) {
            String r03 = r02.zzj;
            return null;
        }

        public static /* bridge */ /* synthetic */ String zzf(AccountChooserOptions r02) {
            String r03 = r02.zzm;
            return null;
        }

        public static /* bridge */ /* synthetic */ String zzg(AccountChooserOptions r02) {
            return r02.zzf;
        }

        public static /* bridge */ /* synthetic */ ArrayList zzh(AccountChooserOptions r02) {
            return r02.zzd;
        }

        public static /* bridge */ /* synthetic */ ArrayList zzi(AccountChooserOptions r02) {
            return r02.zzc;
        }

        public static /* bridge */ /* synthetic */ void zzj(AccountChooserOptions r02, ArrayList r1) {
            r02.zzd = r1;
        }

        public static /* bridge */ /* synthetic */ void zzk(AccountChooserOptions r02, ArrayList r1) {
            r02.zzc = r1;
        }

        public static /* bridge */ /* synthetic */ void zzl(AccountChooserOptions r02, boolean r1) {
            r02.zze = r1;
        }

        public static /* bridge */ /* synthetic */ void zzm(AccountChooserOptions r02, zza r1) {
            r02.zzl = null;
        }

        public static /* bridge */ /* synthetic */ void zzn(AccountChooserOptions r02, boolean r1) {
            r02.zzn = false;
        }

        public static /* bridge */ /* synthetic */ void zzo(AccountChooserOptions r02, boolean r1) {
            r02.zzo = false;
        }

        public static /* bridge */ /* synthetic */ void zzp(AccountChooserOptions r02, String r1) {
            r02.zzj = null;
        }

        public static /* bridge */ /* synthetic */ void zzq(AccountChooserOptions r02, Bundle r1) {
            r02.zzg = r1;
        }

        public static /* bridge */ /* synthetic */ void zzr(AccountChooserOptions r02, String r1) {
            r02.zzm = null;
        }

        public static /* bridge */ /* synthetic */ void zzs(AccountChooserOptions r02, Account r1) {
            r02.zza = r1;
        }

        public static /* bridge */ /* synthetic */ void zzt(AccountChooserOptions r02, boolean r1) {
            r02.zzb = false;
        }

        public static /* bridge */ /* synthetic */ void zzu(AccountChooserOptions r02, boolean r1) {
            r02.zzh = false;
        }

        public static /* bridge */ /* synthetic */ void zzv(AccountChooserOptions r02, int r1) {
            r02.zzi = 0;
        }

        public static /* bridge */ /* synthetic */ void zzw(AccountChooserOptions r02, String r1) {
            r02.zzf = r1;
        }

        public static /* bridge */ /* synthetic */ void zzx(AccountChooserOptions r02, boolean r1) {
            r02.zzk = false;
        }

        public static /* bridge */ /* synthetic */ boolean zzy(AccountChooserOptions r02) {
            return r02.zze;
        }

        public static /* bridge */ /* synthetic */ boolean zzz(AccountChooserOptions r02) {
            boolean r03 = r02.zzn;
            return false;
        }
    }

    private AccountPicker() {
    }

    @Deprecated
    public static Intent newChooseAccountIntent(Account r3, ArrayList<Account> r4, String[] r5, boolean r6, String r7, String r8, String[] r9, Bundle r10) {
        Intent r02 = new Intent();
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        r02.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        r02.setPackage("com.google.android.gms");
        r02.putExtra(com.huawei.hms.common.AccountPicker.EXTRA_ALLOWABLE_ACCOUNTS_ARRAYLIST, r4);
        r02.putExtra(com.huawei.hms.common.AccountPicker.EXTRA_ALLOWABLE_ACCOUNT_TYPES_STRING_ARRAY, r5);
        r02.putExtra(com.huawei.hms.common.AccountPicker.EXTRA_ADD_ACCOUNT_OPTIONS_BUNDLE, r10);
        r02.putExtra(com.huawei.hms.common.AccountPicker.EXTRA_SELECTED_ACCOUNT, r3);
        r02.putExtra(com.huawei.hms.common.AccountPicker.EXTRA_ALWAYS_PROMPT_FOR_ACCOUNT, r6);
        r02.putExtra(com.huawei.hms.common.AccountPicker.EXTRA_DESCRIPTION_TEXT_OVERRIDE, r7);
        r02.putExtra(com.huawei.hms.common.AccountPicker.EXTRA_ADD_ACCOUNT_AUTH_TOKEN_TYPE_STRING, r8);
        r02.putExtra(com.huawei.hms.common.AccountPicker.EXTRA_ADD_ACCOUNT_REQUIRED_FEATURES_STRING_ARRAY, r9);
        r02.putExtra("setGmsCoreAccount", false);
        r02.putExtra(com.huawei.hms.common.AccountPicker.EXTRA_OVERRIDE_THEME, 0);
        r02.putExtra(com.huawei.hms.common.AccountPicker.EXTRA_OVERRIDE_CUSTOM_THEME, 0);
        r02.putExtra(com.huawei.hms.common.AccountPicker.EXTRA_HOSTED_DOMAIN_FILTER, null);
        return r02;
    }

    public static Intent newChooseAccountIntent(AccountChooserOptions r4) {
        Intent r02 = new Intent();
        AccountChooserOptions.zzD(r4);
        AccountChooserOptions.zze(r4);
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        AccountChooserOptions.zzd(r4);
        Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
        AccountChooserOptions.zzB(r4);
        Preconditions.checkArgument(true, "Making the selected account non-clickable is only supported for the THEME_DAY_NIGHT_GOOGLE_MATERIAL2, THEME_LIGHT_GOOGLE_MATERIAL3, THEME_DARK_GOOGLE_MATERIAL3 or THEME_DAY_NIGHT_GOOGLE_MATERIAL3 themes");
        AccountChooserOptions.zzD(r4);
        r02.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        r02.setPackage("com.google.android.gms");
        r02.putExtra(com.huawei.hms.common.AccountPicker.EXTRA_ALLOWABLE_ACCOUNTS_ARRAYLIST, AccountChooserOptions.zzi(r4));
        if (AccountChooserOptions.zzh(r4) == null) goto L5;
        r02.putExtra(com.huawei.hms.common.AccountPicker.EXTRA_ALLOWABLE_ACCOUNT_TYPES_STRING_ARRAY, (String[]) AccountChooserOptions.zzh(r4).toArray(new String[0]));
    L5:
        r02.putExtra(com.huawei.hms.common.AccountPicker.EXTRA_ADD_ACCOUNT_OPTIONS_BUNDLE, AccountChooserOptions.zzc(r4));
        r02.putExtra(com.huawei.hms.common.AccountPicker.EXTRA_SELECTED_ACCOUNT, AccountChooserOptions.zzb(r4));
        AccountChooserOptions.zzB(r4);
        r02.putExtra("selectedAccountIsNotClickable", false);
        r02.putExtra(com.huawei.hms.common.AccountPicker.EXTRA_ALWAYS_PROMPT_FOR_ACCOUNT, AccountChooserOptions.zzy(r4));
        r02.putExtra(com.huawei.hms.common.AccountPicker.EXTRA_DESCRIPTION_TEXT_OVERRIDE, AccountChooserOptions.zzg(r4));
        AccountChooserOptions.zzC(r4);
        r02.putExtra("setGmsCoreAccount", false);
        AccountChooserOptions.zzf(r4);
        r02.putExtra(com.huawei.hms.common.AccountPicker.EXTRA_REAL_CLIENT_PACKAGE, null);
        AccountChooserOptions.zza(r4);
        r02.putExtra(com.huawei.hms.common.AccountPicker.EXTRA_OVERRIDE_THEME, 0);
        AccountChooserOptions.zzD(r4);
        r02.putExtra(com.huawei.hms.common.AccountPicker.EXTRA_OVERRIDE_CUSTOM_THEME, 0);
        AccountChooserOptions.zze(r4);
        r02.putExtra(com.huawei.hms.common.AccountPicker.EXTRA_HOSTED_DOMAIN_FILTER, null);
        Bundle r1 = new Bundle();
        AccountChooserOptions.zzD(r4);
        AccountChooserOptions.zzd(r4);
        AccountChooserOptions.zzz(r4);
        AccountChooserOptions.zzA(r4);
        if (r1.isEmpty() == true) goto L8;
        r02.putExtra("first_party_options_bundle", r1);
    L8:
        return r02;
    }
}
