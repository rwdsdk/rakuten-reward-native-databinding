package com.rakuten.gap.ads.mission_ui.databinding;
import com.rakuten.gap.ads.mission_ui.R;
import com.rakuten.gap.ads.mission_ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RakutenrewardUiPointExchangeActivityBindingImpl extends RakutenrewardUiPointExchangeActivityBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(16);
        sIncludes.setIncludes(0, 
            new String[] {"rakutenreward_ui_toolbar", "rakutenreward_ui_point_exchange_loading"},
            new int[] {5, 7},
            new int[] {com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_toolbar,
                com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_point_exchange_loading});
        sIncludes.setIncludes(1, 
            new String[] {"rakutenreward_ui_error_layout"},
            new int[] {6},
            new int[] {com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_error_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rakutenreward_current_point_label, 8);
        sViewsWithIds.put(R.id.rakutenreward_btn_clear, 9);
        sViewsWithIds.put(R.id.rakutenreward_input_label, 10);
        sViewsWithIds.put(R.id.rakutenreward_error_message, 11);
        sViewsWithIds.put(R.id.rakutenreward_btn_plus_ten, 12);
        sViewsWithIds.put(R.id.rakutenreward_btn_plus_thousand, 13);
        sViewsWithIds.put(R.id.rakutenreward_btn_plus_hundred, 14);
        sViewsWithIds.put(R.id.rakutenreward_btn_submit, 15);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @Nullable
    private final com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiErrorLayoutBinding mboundView11;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RakutenrewardUiPointExchangeActivityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private RakutenrewardUiPointExchangeActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (androidx.appcompat.widget.AppCompatButton) bindings[15]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[10]
            , (com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiPointExchangeLoadingBinding) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiToolbarBinding) bindings[5]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiErrorLayoutBinding) bindings[6];
        setContainedBinding(this.mboundView11);
        this.mboundView2 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        setContainedBinding(this.rakutenrewardPointExchangeLoading);
        this.rakutenrewardPointExchangePoints.setTag(null);
        setContainedBinding(this.rakutenrewardToolbar);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        rakutenrewardToolbar.invalidateAll();
        mboundView11.invalidateAll();
        rakutenrewardPointExchangeLoading.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (rakutenrewardToolbar.hasPendingBindings()) {
            return true;
        }
        if (mboundView11.hasPendingBindings()) {
            return true;
        }
        if (rakutenrewardPointExchangeLoading.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.rakuten.gap.ads.mission_ui.viewmodel.PointExchangeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.rakuten.gap.ads.mission_ui.viewmodel.PointExchangeViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        rakutenrewardToolbar.setLifecycleOwner(lifecycleOwner);
        mboundView11.setLifecycleOwner(lifecycleOwner);
        rakutenrewardPointExchangeLoading.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelActionpoint((androidx.databinding.ObservableLong) object, fieldId);
            case 1 :
                return onChangeRakutenrewardToolbar((com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiToolbarBinding) object, fieldId);
            case 2 :
                return onChangeRakutenrewardPointExchangeLoading((com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiPointExchangeLoadingBinding) object, fieldId);
            case 3 :
                return onChangeViewModelActionPointError((androidx.databinding.ObservableBoolean) object, fieldId);
            case 4 :
                return onChangeViewModelPoint((androidx.databinding.ObservableLong) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelActionpoint(androidx.databinding.ObservableLong ViewModelActionpoint, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRakutenrewardToolbar(com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiToolbarBinding RakutenrewardToolbar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRakutenrewardPointExchangeLoading(com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiPointExchangeLoadingBinding RakutenrewardPointExchangeLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelActionPointError(androidx.databinding.ObservableBoolean ViewModelActionPointError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPoint(androidx.databinding.ObservableLong ViewModelPoint, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String rakutenrewardPointExchangePointsAndroidStringRakutenrewardsdkPointexchagneExchangeActionpointViewModelPoint = null;
        int viewModelActionPointErrorViewGONEViewVISIBLE = 0;
        androidx.databinding.ObservableLong viewModelActionpoint = null;
        java.lang.String mboundView3AndroidStringRakutenrewardsdkPointexchagneExchangeActionpointViewModelActionpoint = null;
        long viewModelPointGet = 0;
        int viewModelActionPointErrorViewVISIBLEViewGONE = 0;
        long viewModelActionpointGet = 0;
        androidx.databinding.ObservableBoolean viewModelActionPointError = null;
        androidx.databinding.ObservableLong viewModelPoint = null;
        com.rakuten.gap.ads.mission_ui.viewmodel.PointExchangeViewModel viewModel = mViewModel;
        boolean viewModelActionPointErrorGet = false;

        if ((dirtyFlags & 0x79L) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.actionpoint
                        viewModelActionpoint = viewModel.getActionpoint();
                    }
                    updateRegistration(0, viewModelActionpoint);


                    if (viewModelActionpoint != null) {
                        // read viewModel.actionpoint.get()
                        viewModelActionpointGet = viewModelActionpoint.get();
                    }


                    // read @android:string/rakutenrewardsdk_pointexchagne_exchange_actionpoint
                    mboundView3AndroidStringRakutenrewardsdkPointexchagneExchangeActionpointViewModelActionpoint = mboundView3.getResources().getString(R.string.rakutenrewardsdk_pointexchagne_exchange_actionpoint, viewModelActionpointGet);
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.actionPointError
                        viewModelActionPointError = viewModel.getActionPointError();
                    }
                    updateRegistration(3, viewModelActionPointError);


                    if (viewModelActionPointError != null) {
                        // read viewModel.actionPointError.get()
                        viewModelActionPointErrorGet = viewModelActionPointError.get();
                    }
                if((dirtyFlags & 0x68L) != 0) {
                    if(viewModelActionPointErrorGet) {
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read viewModel.actionPointError.get() ? View.GONE : View.VISIBLE
                    viewModelActionPointErrorViewGONEViewVISIBLE = ((viewModelActionPointErrorGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read viewModel.actionPointError.get() ? View.VISIBLE : View.GONE
                    viewModelActionPointErrorViewVISIBLEViewGONE = ((viewModelActionPointErrorGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.point
                        viewModelPoint = viewModel.getPoint();
                    }
                    updateRegistration(4, viewModelPoint);


                    if (viewModelPoint != null) {
                        // read viewModel.point.get()
                        viewModelPointGet = viewModelPoint.get();
                    }


                    // read @android:string/rakutenrewardsdk_pointexchagne_exchange_actionpoint
                    rakutenrewardPointExchangePointsAndroidStringRakutenrewardsdkPointexchagneExchangeActionpointViewModelPoint = rakutenrewardPointExchangePoints.getResources().getString(R.string.rakutenrewardsdk_pointexchagne_exchange_actionpoint, viewModelPointGet);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            this.mboundView11.getRoot().setVisibility(viewModelActionPointErrorViewVISIBLEViewGONE);
            this.mboundView2.setVisibility(viewModelActionPointErrorViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.mboundView11.setErrorText(getRoot().getResources().getString(R.string.rakutenrewardsdk_pointexchange_exchange_actionpoint_error));
            this.rakutenrewardToolbar.setToolbarLeftIcon(androidx.appcompat.content.res.AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.rakutenreward_ic_arrow_left));
            this.rakutenrewardToolbar.setToolbarText(getRoot().getResources().getString(R.string.rakutenreawrdsdk_morelist_pointexchange));
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, mboundView3AndroidStringRakutenrewardsdkPointexchagneExchangeActionpointViewModelActionpoint);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.rakutenrewardPointExchangePoints, rakutenrewardPointExchangePointsAndroidStringRakutenrewardsdkPointexchagneExchangeActionpointViewModelPoint);
        }
        executeBindingsOn(rakutenrewardToolbar);
        executeBindingsOn(mboundView11);
        executeBindingsOn(rakutenrewardPointExchangeLoading);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.actionpoint
        flag 1 (0x2L): rakutenrewardToolbar
        flag 2 (0x3L): rakutenrewardPointExchangeLoading
        flag 3 (0x4L): viewModel.actionPointError
        flag 4 (0x5L): viewModel.point
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): viewModel.actionPointError.get() ? View.GONE : View.VISIBLE
        flag 8 (0x9L): viewModel.actionPointError.get() ? View.GONE : View.VISIBLE
        flag 9 (0xaL): viewModel.actionPointError.get() ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.actionPointError.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}