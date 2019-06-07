package com.example.pokemonhelper.databinding;
import com.example.pokemonhelper.R;
import com.example.pokemonhelper.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCounterBindingImpl extends ActivityCounterBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.marginTLeft, 10);
        sViewsWithIds.put(R.id.caught, 11);
        sViewsWithIds.put(R.id.margin, 12);
        sViewsWithIds.put(R.id.marginT, 13);
        sViewsWithIds.put(R.id.countdown, 14);
        sViewsWithIds.put(R.id.countup, 15);
        sViewsWithIds.put(R.id.movebox, 16);
        sViewsWithIds.put(R.id.marginB, 17);
        sViewsWithIds.put(R.id.back, 18);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCounterBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private ActivityCounterBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.Button) bindings[18]
            , (android.widget.Button) bindings[11]
            , (android.widget.Button) bindings[14]
            , (android.widget.TextView) bindings[2]
            , (android.widget.Button) bindings[15]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.RelativeLayout) bindings[16]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            );
        this.PicPoke.setTag(null);
        this.PicSPoke.setTag(null);
        this.counterText.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.move1.setTag(null);
        this.move2.setTag(null);
        this.move3.setTag(null);
        this.move4.setTag(null);
        this.odds.setTag(null);
        this.txtTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
        if (BR.move1 == variableId) {
            setMove1((java.lang.String) variable);
        }
        else if (BR.move3 == variableId) {
            setMove3((java.lang.String) variable);
        }
        else if (BR.counter == variableId) {
            setCounter((int) variable);
        }
        else if (BR.setTestInt == variableId) {
            setSetTestInt((int) variable);
        }
        else if (BR.move2 == variableId) {
            setMove2((java.lang.String) variable);
        }
        else if (BR.move4 == variableId) {
            setMove4((java.lang.String) variable);
        }
        else if (BR.move_array == variableId) {
            setMoveArray((java.util.ArrayList) variable);
        }
        else if (BR.pokemon == variableId) {
            setPokemon((com.example.pokemonhelper.models.Pokemon) variable);
        }
        else if (BR.odds == variableId) {
            setOdds((int) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMove1(@Nullable java.lang.String Move1) {
        this.mMove1 = Move1;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.move1);
        super.requestRebind();
    }
    public void setMove3(@Nullable java.lang.String Move3) {
        this.mMove3 = Move3;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.move3);
        super.requestRebind();
    }
    public void setCounter(int Counter) {
        this.mCounter = Counter;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.counter);
        super.requestRebind();
    }
    public void setSetTestInt(int SetTestInt) {
        this.mSetTestInt = SetTestInt;
    }
    public void setMove2(@Nullable java.lang.String Move2) {
        this.mMove2 = Move2;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.move2);
        super.requestRebind();
    }
    public void setMove4(@Nullable java.lang.String Move4) {
        this.mMove4 = Move4;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.move4);
        super.requestRebind();
    }
    public void setMoveArray(@Nullable java.util.ArrayList MoveArray) {
        this.mMoveArray = MoveArray;
    }
    public void setPokemon(@Nullable com.example.pokemonhelper.models.Pokemon Pokemon) {
        this.mPokemon = Pokemon;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.pokemon);
        super.requestRebind();
    }
    public void setOdds(int Odds) {
        this.mOdds = Odds;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.odds);
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
        java.lang.String Move11 = mMove1;
        java.lang.String Move31 = mMove3;
        int pokemonShinyimage = 0;
        int counter = mCounter;
        java.lang.String pokemonPokename = null;
        java.lang.String stringUtilConvertIntToStringOdds = null;
        int pokemonImage = 0;
        java.lang.String Move21 = mMove2;
        java.lang.String Move41 = mMove4;
        java.lang.String stringUtilGetCounterStringCounter = null;
        com.example.pokemonhelper.models.Pokemon pokemon = mPokemon;
        int Odds1 = mOdds;

        if ((dirtyFlags & 0x201L) != 0) {
        }
        if ((dirtyFlags & 0x202L) != 0) {
        }
        if ((dirtyFlags & 0x204L) != 0) {



                // read StringUtil.getCounterString(counter)
                stringUtilGetCounterStringCounter = com.example.pokemonhelper.Util.StringUtil.getCounterString(counter);
        }
        if ((dirtyFlags & 0x210L) != 0) {
        }
        if ((dirtyFlags & 0x220L) != 0) {
        }
        if ((dirtyFlags & 0x280L) != 0) {



                if (pokemon != null) {
                    // read pokemon.Shinyimage
                    pokemonShinyimage = pokemon.getShinyimage();
                    // read pokemon.pokename
                    pokemonPokename = pokemon.getPokename();
                    // read pokemon.image
                    pokemonImage = pokemon.getImage();
                }
        }
        if ((dirtyFlags & 0x300L) != 0) {



                // read StringUtil.convertIntToString(odds)
                stringUtilConvertIntToStringOdds = com.example.pokemonhelper.Util.StringUtil.convertIntToString(Odds1);
        }
        // batch finished
        if ((dirtyFlags & 0x280L) != 0) {
            // api target 1

            com.example.pokemonhelper.databinding.GlideBindingAdapters.setImage(this.PicPoke, pokemonImage);
            com.example.pokemonhelper.databinding.GlideBindingAdapters.setShinyimage(this.PicSPoke, pokemonShinyimage);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.txtTitle, pokemonPokename);
        }
        if ((dirtyFlags & 0x204L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.counterText, stringUtilGetCounterStringCounter);
        }
        if ((dirtyFlags & 0x201L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.move1, Move11);
        }
        if ((dirtyFlags & 0x210L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.move2, Move21);
        }
        if ((dirtyFlags & 0x202L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.move3, Move31);
        }
        if ((dirtyFlags & 0x220L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.move4, Move41);
        }
        if ((dirtyFlags & 0x300L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.odds, stringUtilConvertIntToStringOdds);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): move1
        flag 1 (0x2L): move3
        flag 2 (0x3L): counter
        flag 3 (0x4L): setTestInt
        flag 4 (0x5L): move2
        flag 5 (0x6L): move4
        flag 6 (0x7L): move_array
        flag 7 (0x8L): pokemon
        flag 8 (0x9L): odds
        flag 9 (0xaL): null
    flag mapping end*/
    //end
}