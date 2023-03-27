package com.rakuten.gap.ads.mission_ui.databinding;
import com.rakuten.gap.ads.mission_ui.R;
import com.rakuten.gap.ads.mission_ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RakutenrewardUiPointhistoryInfoFragmentBindingImpl extends RakutenrewardUiPointhistoryInfoFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rakutenreward_infomessage_infologo, 1);
        sViewsWithIds.put(R.id.rakutenreward_infomessage_message, 2);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RakutenrewardUiPointhistoryInfoFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private RakutenrewardUiPointhistoryInfoFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.LinearLayout) bindings[0]
            );
        this.rakutenrewardInfomessageRoot.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.parentViewModel == variableId) {
            setParentViewModel((com.rakuten.gap.ads.mission_ui.viewmodel.PointViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setParentViewModel(@Nullable com.rakuten.gap.ads.mission_ui.viewmodel.PointViewModel ParentViewModel) {
        this.mParentViewModel = ParentViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.parentViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeParentViewModelPointHistoryInfoVisible((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeParentViewModelPointHistoryInfoVisible(androidx.databinding.ObservableBoolean ParentViewModelPointHistoryInfoVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        boolean parentViewModelPointHistoryInfoVisibleGet = false;
        com.rakuten.gap.ads.mission_ui.viewmodel.PointViewModel parentViewModel = mParentViewModel;
        androidx.databinding.ObservableBoolean parentViewModelPointHistoryInfoVisible = null;
        int parentViewModelPointHistoryInfoVisibleViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x7L) != 0) {



                if (parentViewModel != null) {
                    // read parentViewModel.pointHistoryInfoVisible
                    parentViewModelPointHistoryInfoVisible = parentViewModel.getPointHistoryInfoVisible();
                }
                updateRegistration(0, parentViewModelPointHistoryInfoVisible);


                if (parentViewModelPointHistoryInfoVisible != null) {
                    // read parentViewModel.pointHistoryInfoVisible.get()
                    parentViewModelPointHistoryInfoVisibleGet = parentViewModelPointHistoryInfoVisible.get();
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(parentViewModelPointHistoryInfoVisibleGet) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read parentViewModel.pointHistoryInfoVisible.get() ? View.VISIBLE : View.GONE
                parentViewModelPointHistoryInfoVisibleViewVISIBLEViewGONE = ((parentViewModelPointHistoryInfoVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.rakutenrewardInfomessageRoot.setVisibility(parentViewModelPointHistoryInfoVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): parentViewModel.pointHistoryInfoVisible
        flag 1 (0x2L): parentViewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): parentViewModel.pointHistoryInfoVisible.get() ? View.VISIBLE : View.GONE
        flag 4 (0x5L): parentViewModel.pointHistoryInfoVisible.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}