package com.rakuten.gap.ads.mission_ui.databinding;
import com.rakuten.gap.ads.mission_ui.R;
import com.rakuten.gap.ads.mission_ui.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RakutenrewardUiUnclaimInfoBindingImpl extends RakutenrewardUiUnclaimInfoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(3);
        sIncludes.setIncludes(0, 
            new String[] {"rakutenreward_ui_info_layout", "rakutenreward_ui_error_layout"},
            new int[] {1, 2},
            new int[] {com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_info_layout,
                com.rakuten.gap.ads.mission_ui.R.layout.rakutenreward_ui_error_layout});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RakutenrewardUiUnclaimInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private RakutenrewardUiUnclaimInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiErrorLayoutBinding) bindings[2]
            , (com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiInfoLayoutBinding) bindings[1]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setContainedBinding(this.rakutenrewardErrorMessage);
        setContainedBinding(this.rakutenrewardInfoMessage);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        rakutenrewardInfoMessage.invalidateAll();
        rakutenrewardErrorMessage.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (rakutenrewardInfoMessage.hasPendingBindings()) {
            return true;
        }
        if (rakutenrewardErrorMessage.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.infoText == variableId) {
            setInfoText((java.lang.String) variable);
        }
        else if (BR.errorText == variableId) {
            setErrorText((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setInfoText(@Nullable java.lang.String InfoText) {
        this.mInfoText = InfoText;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.infoText);
        super.requestRebind();
    }
    public void setErrorText(@Nullable java.lang.String ErrorText) {
        this.mErrorText = ErrorText;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.errorText);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        rakutenrewardInfoMessage.setLifecycleOwner(lifecycleOwner);
        rakutenrewardErrorMessage.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeRakutenrewardErrorMessage((com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiErrorLayoutBinding) object, fieldId);
            case 1 :
                return onChangeRakutenrewardInfoMessage((com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiInfoLayoutBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeRakutenrewardErrorMessage(com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiErrorLayoutBinding RakutenrewardErrorMessage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRakutenrewardInfoMessage(com.rakuten.gap.ads.mission_ui.databinding.RakutenrewardUiInfoLayoutBinding RakutenrewardInfoMessage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        java.lang.String infoText = mInfoText;
        java.lang.String errorText = mErrorText;

        if ((dirtyFlags & 0x14L) != 0) {
        }
        if ((dirtyFlags & 0x18L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.rakutenrewardErrorMessage.setErrorText(errorText);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            this.rakutenrewardInfoMessage.setInfoText(infoText);
        }
        executeBindingsOn(rakutenrewardInfoMessage);
        executeBindingsOn(rakutenrewardErrorMessage);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): rakutenrewardErrorMessage
        flag 1 (0x2L): rakutenrewardInfoMessage
        flag 2 (0x3L): infoText
        flag 3 (0x4L): errorText
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}