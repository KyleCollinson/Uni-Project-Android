package com.example.pokemonhelper;

import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.example.pokemonhelper.databinding.ActivityCounterBindingImpl;
import com.example.pokemonhelper.databinding.ActivityInputBindingImpl;
import com.example.pokemonhelper.databinding.ActivityLoginBindingImpl;
import com.example.pokemonhelper.databinding.ActivityMainBindingImpl;
import com.example.pokemonhelper.databinding.ActivityPokemonBindingImpl;
import com.example.pokemonhelper.databinding.ActivityRegisterBindingImpl;
import com.example.pokemonhelper.databinding.DialogChooseLevelBindingImpl;
import com.example.pokemonhelper.databinding.DialogChooseMethodBindingImpl;
import com.example.pokemonhelper.databinding.DialogChoosePokemonBindingImpl;
import com.example.pokemonhelper.databinding.RecyclercardBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYCOUNTER = 1;

  private static final int LAYOUT_ACTIVITYINPUT = 2;

  private static final int LAYOUT_ACTIVITYLOGIN = 3;

  private static final int LAYOUT_ACTIVITYMAIN = 4;

  private static final int LAYOUT_ACTIVITYPOKEMON = 5;

  private static final int LAYOUT_ACTIVITYREGISTER = 6;

  private static final int LAYOUT_DIALOGCHOOSELEVEL = 7;

  private static final int LAYOUT_DIALOGCHOOSEMETHOD = 8;

  private static final int LAYOUT_DIALOGCHOOSEPOKEMON = 9;

  private static final int LAYOUT_RECYCLERCARD = 10;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(10);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.pokemonhelper.R.layout.activity_counter, LAYOUT_ACTIVITYCOUNTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.pokemonhelper.R.layout.activity_input, LAYOUT_ACTIVITYINPUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.pokemonhelper.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.pokemonhelper.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.pokemonhelper.R.layout.activity_pokemon, LAYOUT_ACTIVITYPOKEMON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.pokemonhelper.R.layout.activity_register, LAYOUT_ACTIVITYREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.pokemonhelper.R.layout.dialog_choose_level, LAYOUT_DIALOGCHOOSELEVEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.pokemonhelper.R.layout.dialog_choose_method, LAYOUT_DIALOGCHOOSEMETHOD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.pokemonhelper.R.layout.dialog_choose_pokemon, LAYOUT_DIALOGCHOOSEPOKEMON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.pokemonhelper.R.layout.recyclercard, LAYOUT_RECYCLERCARD);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYCOUNTER: {
          if ("layout/activity_counter_0".equals(tag)) {
            return new ActivityCounterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_counter is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYINPUT: {
          if ("layout/activity_input_0".equals(tag)) {
            return new ActivityInputBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_input is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPOKEMON: {
          if ("layout/activity_pokemon_0".equals(tag)) {
            return new ActivityPokemonBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_pokemon is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYREGISTER: {
          if ("layout/activity_register_0".equals(tag)) {
            return new ActivityRegisterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_register is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGCHOOSELEVEL: {
          if ("layout/dialog_choose_level_0".equals(tag)) {
            return new DialogChooseLevelBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_choose_level is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGCHOOSEMETHOD: {
          if ("layout/dialog_choose_method_0".equals(tag)) {
            return new DialogChooseMethodBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_choose_method is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGCHOOSEPOKEMON: {
          if ("layout/dialog_choose_pokemon_0".equals(tag)) {
            return new DialogChoosePokemonBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_choose_pokemon is invalid. Received: " + tag);
        }
        case  LAYOUT_RECYCLERCARD: {
          if ("layout/recyclercard_0".equals(tag)) {
            return new RecyclercardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recyclercard is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(18);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "moveArray");
      sKeys.put(2, "iPokemon");
      sKeys.put(3, "iInputActivity");
      sKeys.put(4, "pokemon");
      sKeys.put(5, "method");
      sKeys.put(6, "level");
      sKeys.put(7, "counter");
      sKeys.put(8, "poke");
      sKeys.put(9, "setTestInt");
      sKeys.put(10, "move_array");
      sKeys.put(11, "iMethod");
      sKeys.put(12, "move1");
      sKeys.put(13, "move2");
      sKeys.put(14, "move3");
      sKeys.put(15, "odds");
      sKeys.put(16, "move4");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(10);

    static {
      sKeys.put("layout/activity_counter_0", com.example.pokemonhelper.R.layout.activity_counter);
      sKeys.put("layout/activity_input_0", com.example.pokemonhelper.R.layout.activity_input);
      sKeys.put("layout/activity_login_0", com.example.pokemonhelper.R.layout.activity_login);
      sKeys.put("layout/activity_main_0", com.example.pokemonhelper.R.layout.activity_main);
      sKeys.put("layout/activity_pokemon_0", com.example.pokemonhelper.R.layout.activity_pokemon);
      sKeys.put("layout/activity_register_0", com.example.pokemonhelper.R.layout.activity_register);
      sKeys.put("layout/dialog_choose_level_0", com.example.pokemonhelper.R.layout.dialog_choose_level);
      sKeys.put("layout/dialog_choose_method_0", com.example.pokemonhelper.R.layout.dialog_choose_method);
      sKeys.put("layout/dialog_choose_pokemon_0", com.example.pokemonhelper.R.layout.dialog_choose_pokemon);
      sKeys.put("layout/recyclercard_0", com.example.pokemonhelper.R.layout.recyclercard);
    }
  }
}
