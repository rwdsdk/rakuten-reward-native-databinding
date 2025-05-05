package com.rakuten.gap.ads.mission_ui.databinding;
import com.rakuten.gap.ads.mission_ui.R;
import com.rakuten.gap.ads.mission_ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RakutenrewardUiPointhistoryActivityBindingImpl extends RakutenrewardUiPointhistoryActivityBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(12);
        sIncludes.setIncludes(1, 
            new String[] {"rakutenreward_ui_toolbar"},
            new int[] {4},
            new int[] {com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_toolbar});
        sIncludes.setIncludes(2, 
            new String[] {"rakutenreward_ui_error_layout", "rakutenreward_ui_info_layout"},
            new int[] {5, 6},
            new int[] {com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_error_layout,
                com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_info_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rakutenreward_pointhistory_top_desc, 7);
        sViewsWithIds.put(R.id.rakutenreward_pointhistory_title, 8);
        sViewsWithIds.put(R.id.rakutenreward_pointhistory_pointtitle, 9);
        sViewsWithIds.put(R.id.rakutenreward_pointhistory_desc, 10);
        sViewsWithIds.put(R.id.rakutenreward_pointhistory_history_container, 11);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final com.google.android.material.appbar.AppBarLayout mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @Nullable
    private final com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiErrorLayoutBinding mboundView21;
    @Nullable
    private final com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiInfoLayoutBinding mboundView22;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener rakutenrewardPointhistoryCurrentandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.point.get()
            //         is viewModel.point.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(rakutenrewardPointhistoryCurrent);
            // localize variables for thread safety
            // viewModel.point != null
            boolean viewModelPointJavaLangObjectNull = false;
            // viewModel.point
            androidx.databinding.ObservableField<java.lang.String> viewModelPoint = null;
            // viewModel.point.get()
            java.lang.String viewModelPointGet = null;
            // viewModel
            com.rakuten.gap.ads.mission_ui.viewmodel.PointViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPoint = viewModel.getPoint();

                viewModelPointJavaLangObjectNull = (viewModelPoint) != (null);
                if (viewModelPointJavaLangObjectNull) {




                    viewModelPoint.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public RakutenrewardUiPointhistoryActivityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private RakutenrewardUiPointhistoryActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[10]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiToolbarBinding) bindings[4]
            );
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.appbar.AppBarLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView21 = (com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiErrorLayoutBinding) bindings[5];
        setContainedBinding(this.mboundView21);
        this.mboundView22 = (com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiInfoLayoutBinding) bindings[6];
        setContainedBinding(this.mboundView22);
        this.rakutenrewardPointhistoryCurrent.setTag(null);
        setContainedBinding(this.rakutenrewardToolbar);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
        }
        rakutenrewardToolbar.invalidateAll();
        mboundView21.invalidateAll();
        mboundView22.invalidateAll();
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
        if (mboundView21.hasPendingBindings()) {
            return true;
        }
        if (mboundView22.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.headerTitle == variableId) {
            setHeaderTitle((java.lang.String) variable);
        }
        else if (BR.errorMessage == variableId) {
            setErrorMessage((java.lang.String) variable);
        }
        else if (BR.infoMessage == variableId) {
            setInfoMessage((java.lang.String) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.rakuten.gap.ads.mission_ui.viewmodel.PointViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHeaderTitle(@Nullable java.lang.String HeaderTitle) {
        this.mHeaderTitle = HeaderTitle;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.headerTitle);
        super.requestRebind();
    }
    public void setErrorMessage(@Nullable java.lang.String ErrorMessage) {
        this.mErrorMessage = ErrorMessage;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.errorMessage);
        super.requestRebind();
    }
    public void setInfoMessage(@Nullable java.lang.String InfoMessage) {
        this.mInfoMessage = InfoMessage;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.infoMessage);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.rakuten.gap.ads.mission_ui.viewmodel.PointViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        rakutenrewardToolbar.setLifecycleOwner(lifecycleOwner);
        mboundView21.setLifecycleOwner(lifecycleOwner);
        mboundView22.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeRakutenrewardToolbar((com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiToolbarBinding) object, fieldId);
            case 1 :
                return onChangeViewModelPoint((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelPointHistorySuccess((androidx.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeViewModelPointHistoryInfoVisible((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeRakutenrewardToolbar(com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiToolbarBinding RakutenrewardToolbar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPoint(androidx.databinding.ObservableField<java.lang.String> ViewModelPoint, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPointHistorySuccess(androidx.databinding.ObservableBoolean ViewModelPointHistorySuccess, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPointHistoryInfoVisible(androidx.databinding.ObservableBoolean ViewModelPointHistoryInfoVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        boolean viewModelPointHistorySuccessGet = false;
        java.lang.String headerTitle = mHeaderTitle;
        int viewModelPointHistoryInfoVisibleViewVISIBLEViewGONE = 0;
        java.lang.String viewModelPointGet = null;
        java.lang.String errorMessage = mErrorMessage;
        boolean viewModelPointHistoryInfoVisibleGet = false;
        androidx.databinding.ObservableField<java.lang.String> viewModelPoint = null;
        java.lang.String infoMessage = mInfoMessage;
        androidx.databinding.ObservableBoolean viewModelPointHistorySuccess = null;
        int viewModelPointHistorySuccessViewGONEViewVISIBLE = 0;
        com.rakuten.gap.ads.mission_ui.viewmodel.PointViewModel viewModel = mViewModel;
        androidx.databinding.ObservableBoolean viewModelPointHistoryInfoVisible = null;

        if ((dirtyFlags & 0x110L) != 0) {
        }
        if ((dirtyFlags & 0x120L) != 0) {
        }
        if ((dirtyFlags & 0x140L) != 0) {
        }
        if ((dirtyFlags & 0x18eL) != 0) {


            if ((dirtyFlags & 0x182L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.point
                        viewModelPoint = viewModel.getPoint();
                    }
                    updateRegistration(1, viewModelPoint);


                    if (viewModelPoint != null) {
                        // read viewModel.point.get()
                        viewModelPointGet = viewModelPoint.get();
                    }
            }
            if ((dirtyFlags & 0x184L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.pointHistorySuccess
                        viewModelPointHistorySuccess = viewModel.getPointHistorySuccess();
                    }
                    updateRegistration(2, viewModelPointHistorySuccess);


                    if (viewModelPointHistorySuccess != null) {
                        // read viewModel.pointHistorySuccess.get()
                        viewModelPointHistorySuccessGet = viewModelPointHistorySuccess.get();
                    }
                if((dirtyFlags & 0x184L) != 0) {
                    if(viewModelPointHistorySuccessGet) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read viewModel.pointHistorySuccess.get() ? View.GONE : View.VISIBLE
                    viewModelPointHistorySuccessViewGONEViewVISIBLE = ((viewModelPointHistorySuccessGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x188L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.pointHistoryInfoVisible
                        viewModelPointHistoryInfoVisible = viewModel.getPointHistoryInfoVisible();
                    }
                    updateRegistration(3, viewModelPointHistoryInfoVisible);


                    if (viewModelPointHistoryInfoVisible != null) {
                        // read viewModel.pointHistoryInfoVisible.get()
                        viewModelPointHistoryInfoVisibleGet = viewModelPointHistoryInfoVisible.get();
                    }
                if((dirtyFlags & 0x188L) != 0) {
                    if(viewModelPointHistoryInfoVisibleGet) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read viewModel.pointHistoryInfoVisible.get() ? View.VISIBLE : View.GONE
                    viewModelPointHistoryInfoVisibleViewVISIBLEViewGONE = ((viewModelPointHistoryInfoVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            this.mboundView21.getRoot().setVisibility(viewModelPointHistorySuccessViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x120L) != 0) {
            // api target 1

            this.mboundView21.setErrorText(errorMessage);
        }
        if ((dirtyFlags & 0x188L) != 0) {
            // api target 1

            this.mboundView22.getRoot().setVisibility(viewModelPointHistoryInfoVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x140L) != 0) {
            // api target 1

            this.mboundView22.setInfoText(infoMessage);
        }
        if ((dirtyFlags & 0x182L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.rakutenrewardPointhistoryCurrent, viewModelPointGet);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.rakutenrewardPointhistoryCurrent, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, rakutenrewardPointhistoryCurrentandroidTextAttrChanged);
            this.rakutenrewardToolbar.setToolbarLeftIcon(androidx.appcompat.content.res.AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.rakutenreward_ic_arrow_left));
        }
        if ((dirtyFlags & 0x110L) != 0) {
            // api target 1

            this.rakutenrewardToolbar.setToolbarText(headerTitle);
        }
        executeBindingsOn(rakutenrewardToolbar);
        executeBindingsOn(mboundView21);
        executeBindingsOn(mboundView22);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): rakutenrewardToolbar
        flag 1 (0x2L): viewModel.point
        flag 2 (0x3L): viewModel.pointHistorySuccess
        flag 3 (0x4L): viewModel.pointHistoryInfoVisible
        flag 4 (0x5L): headerTitle
        flag 5 (0x6L): errorMessage
        flag 6 (0x7L): infoMessage
        flag 7 (0x8L): viewModel
        flag 8 (0x9L): null
        flag 9 (0xaL): viewModel.pointHistoryInfoVisible.get() ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.pointHistoryInfoVisible.get() ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewModel.pointHistorySuccess.get() ? View.GONE : View.VISIBLE
        flag 12 (0xdL): viewModel.pointHistorySuccess.get() ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}