package com.example.pokemonhelper.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.example.pokemonhelper.models.Pokemon;
import java.lang.Deprecated;
import java.lang.Object;
import java.util.ArrayList;

public abstract class ActivityCounterBinding extends ViewDataBinding {
  @NonNull
  public final ImageView PicPoke;

  @NonNull
  public final ImageView PicSPoke;

  @NonNull
  public final Button back;

  @NonNull
  public final Button caught;

  @NonNull
  public final Button countdown;

  @NonNull
  public final TextView counterText;

  @NonNull
  public final Button countup;

  @NonNull
  public final TextView margin;

  @NonNull
  public final TextView marginB;

  @NonNull
  public final TextView marginT;

  @NonNull
  public final TextView marginTLeft;

  @NonNull
  public final TextView move1;

  @NonNull
  public final TextView move2;

  @NonNull
  public final TextView move3;

  @NonNull
  public final TextView move4;

  @NonNull
  public final RelativeLayout movebox;

  @NonNull
  public final TextView odds;

  @NonNull
  public final TextView txtTitle;

  @Bindable
  protected int mSetTestInt;

  @Bindable
  protected int mOdds;

  @Bindable
  protected String mMove1;

  @Bindable
  protected String mMove2;

  @Bindable
  protected String mMove3;

  @Bindable
  protected String mMove4;

  @Bindable
  protected ArrayList mMoveArray;

  @Bindable
  protected Pokemon mPokemon;

  @Bindable
  protected int mCounter;

  protected ActivityCounterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView PicPoke, ImageView PicSPoke, Button back, Button caught, Button countdown,
      TextView counterText, Button countup, TextView margin, TextView marginB, TextView marginT,
      TextView marginTLeft, TextView move1, TextView move2, TextView move3, TextView move4,
      RelativeLayout movebox, TextView odds, TextView txtTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.PicPoke = PicPoke;
    this.PicSPoke = PicSPoke;
    this.back = back;
    this.caught = caught;
    this.countdown = countdown;
    this.counterText = counterText;
    this.countup = countup;
    this.margin = margin;
    this.marginB = marginB;
    this.marginT = marginT;
    this.marginTLeft = marginTLeft;
    this.move1 = move1;
    this.move2 = move2;
    this.move3 = move3;
    this.move4 = move4;
    this.movebox = movebox;
    this.odds = odds;
    this.txtTitle = txtTitle;
  }

  public abstract void setSetTestInt(int setTestInt);

  public int getSetTestInt() {
    return mSetTestInt;
  }

  public abstract void setOdds(int odds);

  public int getOdds() {
    return mOdds;
  }

  public abstract void setMove1(@Nullable String move1);

  @Nullable
  public String getMove1() {
    return mMove1;
  }

  public abstract void setMove2(@Nullable String move2);

  @Nullable
  public String getMove2() {
    return mMove2;
  }

  public abstract void setMove3(@Nullable String move3);

  @Nullable
  public String getMove3() {
    return mMove3;
  }

  public abstract void setMove4(@Nullable String move4);

  @Nullable
  public String getMove4() {
    return mMove4;
  }

  public abstract void setMoveArray(@Nullable ArrayList move_array);

  @Nullable
  public ArrayList getMoveArray() {
    return mMoveArray;
  }

  public abstract void setPokemon(@Nullable Pokemon pokemon);

  @Nullable
  public Pokemon getPokemon() {
    return mPokemon;
  }

  public abstract void setCounter(int counter);

  public int getCounter() {
    return mCounter;
  }

  @NonNull
  public static ActivityCounterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_counter, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCounterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityCounterBinding>inflateInternal(inflater, com.example.pokemonhelper.R.layout.activity_counter, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCounterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_counter, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCounterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityCounterBinding>inflateInternal(inflater, com.example.pokemonhelper.R.layout.activity_counter, null, false, component);
  }

  public static ActivityCounterBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityCounterBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityCounterBinding)bind(component, view, com.example.pokemonhelper.R.layout.activity_counter);
  }
}
