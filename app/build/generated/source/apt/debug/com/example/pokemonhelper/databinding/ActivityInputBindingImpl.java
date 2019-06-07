package com.example.pokemonhelper.databinding;
import com.example.pokemonhelper.R;
import com.example.pokemonhelper.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityInputBindingImpl extends ActivityInputBinding implements com.example.pokemonhelper.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.margin, 7);
        sViewsWithIds.put(R.id.txtTitle, 8);
        sViewsWithIds.put(R.id.marginT, 9);
        sViewsWithIds.put(R.id.marginM, 10);
        sViewsWithIds.put(R.id.marginMethod, 11);
        sViewsWithIds.put(R.id.hunt, 12);
        sViewsWithIds.put(R.id.marginB, 13);
        sViewsWithIds.put(R.id.updateButton, 14);
        sViewsWithIds.put(R.id.back, 15);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityInputBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ActivityInputBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[15]
            , (android.widget.Button) bindings[12]
            , (android.widget.TextView) bindings[4]
            , (android.widget.RelativeLayout) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[6]
            , (android.widget.RelativeLayout) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.RelativeLayout) bindings[1]
            , (android.widget.TextView) bindings[8]
            , (android.widget.Button) bindings[14]
            );
        this.level.setTag(null);
        this.levelbox.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.method.setTag(null);
        this.methodbox.setTag(null);
        this.poke.setTag(null);
        this.pokemonbox.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.example.pokemonhelper.generated.callback.OnClickListener(this, 2);
        mCallback3 = new com.example.pokemonhelper.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.example.pokemonhelper.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        if (BR.iPokemon == variableId) {
            setIPokemon((com.example.pokemonhelper.IPokemon) variable);
        }
        else if (BR.iMethod == variableId) {
            setIMethod((com.example.pokemonhelper.IMethod) variable);
        }
        else if (BR.method == variableId) {
            setMethod((java.lang.String) variable);
        }
        else if (BR.iInputActivity == variableId) {
            setIInputActivity((com.example.pokemonhelper.IInputActivity) variable);
        }
        else if (BR.pokemon == variableId) {
            setPokemon((java.lang.String) variable);
        }
        else if (BR.level == variableId) {
            setLevel((int) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIPokemon(@Nullable com.example.pokemonhelper.IPokemon IPokemon) {
        this.mIPokemon = IPokemon;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.iPokemon);
        super.requestRebind();
    }
    public void setIMethod(@Nullable com.example.pokemonhelper.IMethod IMethod) {
        this.mIMethod = IMethod;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.iMethod);
        super.requestRebind();
    }
    public void setMethod(@Nullable java.lang.String Method) {
        this.mMethod = Method;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.method);
        super.requestRebind();
    }
    public void setIInputActivity(@Nullable com.example.pokemonhelper.IInputActivity IInputActivity) {
        this.mIInputActivity = IInputActivity;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.iInputActivity);
        super.requestRebind();
    }
    public void setPokemon(@Nullable java.lang.String Pokemon) {
        this.mPokemon = Pokemon;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.pokemon);
        super.requestRebind();
    }
    public void setLevel(int Level) {
        this.mLevel = Level;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.level);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.example.pokemonhelper.IPokemon iPokemon = mIPokemon;
        java.lang.String stringUtilGetLevelStringLevel = null;
        com.example.pokemonhelper.IMethod iMethod = mIMethod;
        java.lang.String Method1 = mMethod;
        com.example.pokemonhelper.IInputActivity iInputActivity = mIInputActivity;
        java.lang.String pokemon = mPokemon;
        int Level1 = mLevel;

        if ((dirtyFlags & 0x44L) != 0) {
        }
        if ((dirtyFlags & 0x50L) != 0) {
        }
        if ((dirtyFlags & 0x60L) != 0) {



                // read StringUtil.getLevelString(level)
                stringUtilGetLevelStringLevel = com.example.pokemonhelper.Util.StringUtil.getLevelString(Level1);
        }
        // batch finished
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.level, stringUtilGetLevelStringLevel);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.levelbox.setOnClickListener(mCallback2);
            this.methodbox.setOnClickListener(mCallback3);
            this.pokemonbox.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x44L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.method, Method1);
        }
        if ((dirtyFlags & 0x50L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.poke, pokemon);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // iInputActivity != null
                boolean iInputActivityJavaLangObjectNull = false;
                // iInputActivity
                com.example.pokemonhelper.IInputActivity iInputActivity = mIInputActivity;



                iInputActivityJavaLangObjectNull = (iInputActivity) != (null);
                if (iInputActivityJavaLangObjectNull) {


                    iInputActivity.inflateLevelDialog();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // iMethod != null
                boolean iMethodJavaLangObjectNull = false;
                // iMethod
                com.example.pokemonhelper.IMethod iMethod = mIMethod;



                iMethodJavaLangObjectNull = (iMethod) != (null);
                if (iMethodJavaLangObjectNull) {


                    iMethod.inflateMethodDialog();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // iPokemon
                com.example.pokemonhelper.IPokemon iPokemon = mIPokemon;
                // iPokemon != null
                boolean iPokemonJavaLangObjectNull = false;



                iPokemonJavaLangObjectNull = (iPokemon) != (null);
                if (iPokemonJavaLangObjectNull) {


                    iPokemon.inflatePokemonDialog();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): iPokemon
        flag 1 (0x2L): iMethod
        flag 2 (0x3L): method
        flag 3 (0x4L): iInputActivity
        flag 4 (0x5L): pokemon
        flag 5 (0x6L): level
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}