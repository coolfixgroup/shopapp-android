package com.client.shop.ui.account.di

import com.client.shop.ui.account.contract.*
import com.domain.interactor.account.*
import com.domain.validator.FieldValidator
import dagger.Module
import dagger.Provides

@Module
open class AuthModule {

    @Provides
    open fun provideSignUpPresenter(formValidator: FieldValidator, signUpUseCase: SignUpUseCase): SignUpPresenter {
        return SignUpPresenter(formValidator, signUpUseCase)
    }

    @Provides
    open fun provideSignInPresenter(
        formValidator: FieldValidator,
        signInUseCase: SignInUseCase
    ): SignInPresenter {
        return SignInPresenter(formValidator, signInUseCase)
    }

    @Provides
    open fun provideAuthPresenter(sessionCheckUseCase: SessionCheckUseCase, signOutUseCase: SignOutUseCase,
                                  shopInfoUseCase: ShopInfoUseCase, getCustomerUseCase: GetCustomerUseCase): AccountPresenter {
        return AccountPresenter(sessionCheckUseCase, signOutUseCase, shopInfoUseCase, getCustomerUseCase)
    }

    @Provides
    open fun provideForgotPasswordPresenter(forgotPasswordUseCase: ForgotPasswordUseCase): ForgotPasswordPresenter {
        return ForgotPasswordPresenter(forgotPasswordUseCase)
    }

    @Provides
    open fun providePersonalInfoPresenter(customerUseCase: GetCustomerUseCase,
                                          editCustomerUseCase: EditCustomerUseCase): PersonalInfoPresenter {
        return PersonalInfoPresenter(customerUseCase, editCustomerUseCase)
    }

    @Provides
    open fun provideChangePasswordPresenter(validator: FieldValidator, changePasswordUseCase: ChangePasswordUseCase): ChangePasswordPresenter {
        return ChangePasswordPresenter(validator, changePasswordUseCase)
    }

    @Provides
    open fun provideAccountSettingsPresenter(customerUseCase: GetCustomerUseCase,
                                             updateAccountSettingsUseCase: UpdateAccountSettingsUseCase): AccountSettingsPresenter {
        return AccountSettingsPresenter(customerUseCase, updateAccountSettingsUseCase)
    }
}